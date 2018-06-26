// Define a grammar called model
grammar Model;
@header{
package dartagnan;
import dartagnan.wmm.*;
import java.util.List;
import java.util.ArrayList;
}
@parser::members
{
ArrayList<Relation> children = new ArrayList<Relation>();
}
mcm returns [Wmm value]: {$value =  new Wmm();}  
MCMNAME? (ax1=axiom {$value.addAxiom($ax1.value);} | r1=reldef {$value.addRel($r1.value);})+ 
;

axiom returns [Axiom value]: 'acyclic' m1=fancyrel  {$value =  new Acyclic($m1.value);} ('as' NAME)?| 'irreflexive' m1=fancyrel {$value =  new Irreflexive($m1.value);}('as' NAME)?;

reldef returns [Relation value]:
('let' | 'and') ('rec')? n=NAME '=' m1=fancyrel {$value =$m1.value; $value.setName($n.text);};

fancyrel returns [Relation value]:
m1=relation {$value =$m1.value;} ('|' m2=relation {$value =new RelUnion($value, $m2.value);} )*
| m1=relation {$value =$m1.value;} ('&' m2=relation {$value =new RelInterSect($value, $m2.value);} )*
| m1=relation {$value =$m1.value;} (';' m2=relation { $value = new RelComposition($value, $m2.value);} )*
| s1=setToRelRelation {$value = $s1.value; }
;

relation returns [Relation value]:
| b1=base {$value =$b1.value;}
| s1=setRelation {$value =$s1.value;}
| '(' ( m1=relation '|' {$value =$m1.value;}) ( m2=relation '|' {$value =new RelUnion($value, $m2.value);} )* m3=relation ')'{$value =new RelUnion($value, $m3.value);} 
| '(' m1=relation '\\' m2=relation ')' {$value =new RelMinus($m1.value, $m2.value);}
| '(' m1=relation '&' m2=relation ')' {$value =new RelInterSect($m1.value, $m2.value);}
| '(' ( m1=relation ';' {$value =$m1.value;}) ( m2=relation ';' {System.out.println("relComposition 2"); $value =new RelComposition($value, $m2.value);} )* m3=relation ')'{System.out.println("relComposition 3"); $value =new RelComposition($value, $m3.value);}
| m1=relation'+' {$value =new RelTrans($m1.value);}
| m1=relation'*' {$value =new RelTransRef($m1.value);}
;

setRelation returns [Relation value]:
s1 = eventType ('*')? s2 = eventType {$value=new RelSetToSet($s1.value, $s2.value);};

relToSetRelation returns [Relation value]:
r = fancyrel ';' s = eventType {$value = new RelRelToSet($r.value, $s.value); children.add($value); };

setToRelRelation returns [Relation value]:
s = eventType (';' r = relToSetRelation)+ {
    Relation child = children.remove(0);
    while(!children.isEmpty()){
       child = new RelComposition(child, children.remove(0));
    }
    $value = new RelSetToRel($s.value, child);
    children.clear();
};

base returns [Relation value]: 
PO {$value=new BasicRelation("po");}
| POLOC {$value=new BasicRelation("poloc");}
| RFE {$value=new BasicRelation("rfe");}
| RFI {$value=new BasicRelation("rfi");}
| RF {$value=new BasicRelation("rf");}
| FR {$value=new BasicRelation("fr");}
| FRI {$value=new BasicRelation("fri");}
| FRE {$value=new BasicRelation("fre");}
| CO {$value=new BasicRelation("co");}
| COE {$value=new BasicRelation("coe");}
| COI {$value=new BasicRelation("coi");}
| AD {$value=new BasicRelation("po");}
| IDD {$value=new BasicRelation("idd");}
| ISH {$value=new BasicRelation("ish");}
| CD {$value=new BasicRelation("cd");}
| STHD {$value=new BasicRelation("sthd");}
| SLOC {$value=new BasicRelation("sloc");}
| MFENCE {$value=new BasicRelation("mfence");}
| CTRLISYNC {$value=new BasicRelation("ctrlisync");}
| LWSYNC {$value=new BasicRelation("lwsync");}
| ISYNC {$value=new BasicRelation("isync");}
| SYNC {$value=new BasicRelation("sync");}
| CTRLDIREKT {$value=new BasicRelation("ctrlDirect");}
| CTRLISB {$value=new BasicRelation("ctrlisb");}
| CTRL {$value=new BasicRelation("ctrl");}
| ISB {$value=new BasicRelation("isb");}
| ADDR {$value=new EmptyRel();}
| DATA {$value=new RelInterSect(new RelLocTrans(new BasicRelation("idd")), new RelSetToSet("R", "W"));}
| n=NAME {$value=new RelDummy($n.text);}
| EMPTY {$value=new EmptyRel();}
| ID {$value=new BasicRelation("id");}
;

eventType returns [String value]
    :   'toid(' t = EVENT_TYPE ')' {$value = $t.text; }
    |   '[' t = EVENT_TYPE ']' {$value = $t.text; }
    |   t = EVENT_TYPE {$value = $t.text; }
    |   'toid(' t2 = atomics ')' {$value = $t2.value;}
    |   '[' t2 = atomics ']' {$value = $t2.value;}
    |   t2 = atomics {$value = $t2.value;}
    ;

atomics returns [String value]
    :   a1 = sc {$value = $a1.value; }
    |   a2 = relAqc {$value = $a2.value; }
    |   a3 = release {$value = $a3.value; }
    |   a4 = acquire {$value = $a4.value; }
    |   a5 = cons {$value = $a5.value; }
    |   a6 = relaxed {$value = $a6.value; }
    |   a7 = nonAtomic {$value = $a7.value; }
    ;

sc returns [String value]:
v=SC {$value = "_sc";};

relAqc returns [String value]:
v=REL_ACQ {$value = "_rel_acq";};

release returns [String value]:
v=RELEASE {$value = "_rel";};

acquire returns [String value]:
v=ACQUIRE {$value = "_acq";};

cons returns [String value]:
v=CONSUME {$value = "_con";};

relaxed returns [String value]:
v=RELAXED {$value = "_rx";};

nonAtomic returns [String value]:
v=NON_ATOMIC {$value = "_na";};

PO : 'po' ;
POLOC : 'po-loc' ;
RFE : 'rfe' ;
RFI : 'rfi' ;
RF : 'rf' ;
FR : 'fr' ;
FRE : 'fre' ;
FRI : 'fri' ;
CO : 'co' ;
COE : 'coe' ;
COI : 'coi' ;
AD : 'ad' ;
IDD : 'idd' ;
ISH : 'ish' ;
CD : 'cd' ;
STHD : 'sthd' ;
SLOC : 'sloc' ;
MFENCE : 'mfence' ;
LWSYNC : 'lwsync' ;
CTRLISYNC : 'ctrlisync' ;
ISYNC : 'isync' ;
SYNC : 'sync' ;
CTRLDIREKT : 'ctrlDirect';
CTRLISB : 'ctrlisb';
CTRL : 'ctrl';
ISB : 'isb' ;
ADDR : 'addr' ;
DATA : 'data' ;
ID : 'id' ;
EMPTY : '0' ;

// Event types
EVENT_TYPE : RMW | LKW | ATOMIC | READ | WRITE | INIT | MEMORY;
RMW :       'RMW';
LKW :       'LKW';
ATOMIC :    'A';
READ :      'R';
WRITE :     'W';
INIT :      'I';
MEMORY :    'M';


// Atomics
SC
    :   'SC'
    |   '_sc'
    |   'seq_cst'
    ;

REL_ACQ
    :   'REL_AQC'
    ;

RELEASE
    :   'REL'
    |   '_rel'
    ;

ACQUIRE
    :   'ACQ'
    |   '_acq'
    |   'Acquire'
    ;

CONSUME
    :   'CON'
    ;

RELAXED
    :   'RX'
    |   '_rx'
    ;

NON_ATOMIC
    :   'NA'
    |   '_na'
    ;

NAME : [a-z0-9\-]+ ;        // match lower-case identifiers
MCMNAME : [A-Za-z0-9]+ ;        // match lower-case identifiers
WS : [ \t\n\r]+ -> skip ; // skip spaces, tabs, newlines
ENDE : EOF -> skip ;
ML_COMMENT  : '(*' .*? '*)' -> skip ;
INCLUDE  : 'include "' .*? '"' -> skip ; //skip include refs
MODELNAME  : '"' .*? '"' -> skip ; //skip names
