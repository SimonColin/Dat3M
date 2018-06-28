// Define a grammar called model
grammar Model;
@header{
package dartagnan;
import dartagnan.wmm.*;
import dartagnan.program.event.filter.*;
import java.util.List;
import java.util.ArrayList;
}
@parser::members
{
Wmm wmm = new Wmm();
}
mcm returns [Wmm value]: {$value =  wmm;}
    MCMNAME?
        (   ax1=axiom {$value.addAxiom($ax1.value);}
        |   f1=filterdef {$value.addFilter($f1.value);}
        |   r1=reldef {$value.addRelation($r1.value);}
        )+
        EOF
    ;

axiom returns [Axiom value]
    :   'acyclic' m1=fancyrel  {$value =  new Acyclic($m1.value);} ('as' NAME)?
    |   'irreflexive' m1=fancyrel {$value =  new Irreflexive($m1.value);}('as' NAME)?
    ;

reldef returns [Relation value]:
('let' | 'and') ('rec')? n=NAME '=' m1=fancyrel {$value =$m1.value; $value.setName($n.text);};

filterdef returns [FilterInterface value]:
'let' n=NAME '=' s1=eventFilter {$value = $s1.filter; $value.setName($n.text); };


fancyrel returns [Relation value] locals [Object object]
: m1=identifier {$object = $m1.value; } ('|' m2=identifier {
        if($value == null){
            $value =new RelUnion((Relation)$object, (Relation)$m2.value);
        } else {
            $value =new RelUnion($value, (Relation)$m2.value);
        }})*

| m1=identifier {$object = $m1.value; } ('&' m2=identifier{
        if($value == null){
            $value =new RelInterSect((Relation)$object, (Relation)$m2.value);
        } else {
            $value =new RelInterSect($value, (Relation)$m2.value);
        }})*

| m1=identifier {$object = $m1.value; } ('\\' m2=identifier{
        if($value == null){
            $value =new RelMinus((Relation)$object, (Relation)$m2.value);
        } else {
            $value =new RelMinus($value, (Relation)$m2.value);
        }})*

| m1=identifier (';' m2=identifier
    {
        if($value == null){
        if($m1.value instanceof Relation){
            if($m2.value instanceof Relation){
                $value = new RelComposition((Relation)$m1.value, (Relation)$m2.value);
            } else {
                $value = new RelRelToSet((Relation)$m1.value, (FilterInterface)$m2.value);
            }
        } else {
            if($m2.value instanceof Relation){
                $value = new RelSetToRel((FilterInterface)$m1.value, (Relation)$m2.value);
            } else {
                throw new RuntimeException("Invalid syntax");
            }
        }
        } else {
            if($m2.value instanceof Relation){
                $value = new RelComposition($value, (Relation)$m2.value);
            } else {
                $value = new RelRelToSet($value, (FilterInterface)$m2.value);
            }
        }
    } )*
;

identifier returns [Object value]
    :   r = relation {$value = $r.value;}
    |   f = eventFilter {$value = $f.filter;}
    |   s = NAME {
            $value = wmm.getRelation($s.text);
            if($value == null){
                $value = wmm.getFilter($s.text);
                if($value == null){
                    throw new RuntimeException("Uninitialised identifier " + $s.text);
                }
            }
        }
    ;

relation returns [Relation value]:
| b1=base {$value =$b1.value;}
| s1=filterRelation {$value =$s1.value;}
| m1=relation'+' {$value =new RelTrans($m1.value);}
| m1=relation'*' {$value =new RelTransRef($m1.value);}
| '(' r1=fancyrel ')' {$value = $r1.value; }
;

filterRelation returns [Relation value]:
s1 = eventFilter ('*')? s2 = eventFilter {$value=new RelSetToSet($s1.filter, $s2.filter);};

eventFilter returns [FilterInterface filter] locals [FilterIntersection fi, FilterUnion fu]
    :   f1 = eventFilter '&' f2 = eventFilter {
        if($f1.filter instanceof FilterIntersection){
            $fi = (FilterIntersection)$f1.filter;
        } else {
            $fi = new FilterIntersection();
            $fi.addFilter($f1.filter);
        }
        $fi.addFilter($f2.filter);
        $filter = $fi;
    }
    |   f1 = eventFilter '|' f2 = eventFilter {
            if($f1.filter instanceof FilterUnion){
                $fu = (FilterUnion)$f1.filter;
            } else {
                $fu = new FilterUnion();
                $fu.addFilter($f1.filter);
            }
            $fu.addFilter($f2.filter);
            $filter = $fu;
        }
    |   f1 = eventFilter '\\' f2 = eventFilter {
            $filter = new FilterDifference($f1.filter, $f2.filter);
        }
    |   '(' f1 = eventFilter ')' {$filter = $f1.filter; }
    |   f3 = basicEventFilter {$filter = $f3.filter; }
    ;

basicEventFilter returns [FilterInterface filter]
    :   'toid(' t = EVENT_TYPE ')' {$filter = new FilterBasic($t.text); }
    |   '[' t = EVENT_TYPE ']' {$filter = new FilterBasic($t.text); }
    |   t = EVENT_TYPE {$filter = new FilterBasic($t.text); }
    |   'toid(' t2 = atomics ')' {$filter = new FilterBasic($t2.text);}
    |   '[' t2 = atomics ']' {$filter = new FilterBasic($t2.text);}
    |   t2 = atomics {$filter = new FilterBasic($t2.text);}
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
| DATA {$value=new RelInterSect(new RelLocTrans(new BasicRelation("idd")), new RelSetToSet(new FilterBasic("R"), new FilterBasic("W")));}
| EMPTY {$value=new EmptyRel();}
| ID {$value=new BasicRelation("id");}
;

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
EVENT_TYPE : RMW | LKW | ATOMIC | READ | WRITE | INIT | MEMORY | FENCE;
RMW :       'RMW';
LKW :       'LKW';
ATOMIC :    'A';
READ :      'R';
WRITE :     'W';
INIT :      'I';
MEMORY :    'M';
FENCE :     'F';


// Atomics
SC
    :   'SC'
    |   '_sc'
    |   'seq_cst'
    ;

REL_ACQ
    :   'REL_ACQ'
    |   'ACQ_REL'
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
