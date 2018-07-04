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
    boolean createDummy = false;
}

mcm returns [Wmm value]
    :   (NAME)? (definition)+ EOF {
            $value =  wmm;
        }
    ;

definition
    :   axiomDefinition
    |   letDefinition
    |   letRecDefinition
    ;

// TODO: Add negations of these axioms
axiomDefinition returns [Axiom value]
    :   'acyclic' { createDummy = false; } e = expression {
            if(!($e.value instanceof Relation)){
                throw new RuntimeException("Invalid syntax at " + $e.text);
            }
            wmm.addAxiom(new Acyclic((Relation)$e.value));
        } ('as' NAME)?
    |   'irreflexive' { createDummy = false; } e = expression {
            if(!($e.value instanceof Relation)){
                throw new RuntimeException("Invalid syntax at " + $e.text);
            }
            wmm.addAxiom(new Irreflexive((Relation)$e.value));
        }('as' NAME)?
    |   'empty' { createDummy = false; } e = expression {
            // TODO: Implementation (relation and filter)
            //throw new RuntimeException("Not implemented");
            System.out.println("empty is not implemented");
        } ('as' NAME)?
    ;

letDefinition
    :   'let' { createDummy = false; } n = NAME '=' e = expression {
            if($e.value instanceof Relation){
                ((Relation)$e.value).setName($n.text);
                wmm.addRelation((Relation)$e.value);
            } else if ($e.value instanceof FilterInterface){
                ((Relation)$e.value).setName($n.text);
                wmm.addFilter((FilterInterface)$e.value);
            } else {
                throw new RuntimeException("Invalid definition of " + $n.text);
            }
        }
    ;

letRecDefinition
    :   ('let rec' | 'and') { createDummy = true; } n = NAME '=' e = expression {
            if($e.value instanceof Relation){
                ((Relation)$e.value).setName($n.text);
                wmm.addRelation((Relation)$e.value);
            } else {
                throw new RuntimeException("Invalid definition of " + $n.text);
            }
        }
    ;

expression returns [Object value]
    :   n = NAME {
            $value = wmm.getRelation($n.text);
            if($value == null){
                $value = wmm.getFilter($n.text);
                if($value == null && createDummy){
                    $value = new RelDummy($n.text);
                }
            }
        }
    |   ('toid(' e = expression ')' | '[' e = expression ']'){
            if(!($e.value instanceof FilterInterface)){
                throw new RuntimeException("Invalid syntax at " + $e.text);
            }
            $value = new RelFromSet((FilterInterface)$e.value);
        }
    |   '(' e = expression ')' {
            $value = $e.value;
        }
    |   e1 = expression ('*')? e2 = expression {
            if(!($e1.value instanceof FilterInterface) || !($e2.value instanceof FilterInterface)){
                throw new RuntimeException("Invalid syntax at " + $e1.text + " " + $e2.text);
            }
            $value = new RelCartesian((FilterInterface)$e1.value, (FilterInterface)$e2.value);
        }
    |   e = expression '*' {
            if(!($e.value instanceof Relation)){
                throw new RuntimeException("Invalid syntax at " + $e.text);
            }
            $value = new RelTransRef((Relation)$e.value);
        }
    |   e = expression '+' {
            if(!($e.value instanceof Relation)){
                throw new RuntimeException("Invalid syntax at " + $e.text);
            }
            $value = new RelTrans((Relation)$e.value);
        }
    |   e = expression '?' {
            // TODO: Implementation
            //throw new RuntimeException("Not implemented");
            System.out.println("? is not implemented");
        }
    |   e = expression ('^')? '-1' {
            if(!($e.value instanceof Relation)){
                throw new RuntimeException("Invalid syntax at " + $e.text);
            }
            $value = new RelInverse((Relation)$e.value);
        }
    |   '~' e = expression {
            // TODO: Implementation (relation and filter)
            //throw new RuntimeException("Not implemented");
            System.out.println("~ is not implemented");
        }
    |   e1 = expression ';' e2 = expression {
            if(!($e1.value instanceof Relation) || !($e2.value instanceof Relation)){
                throw new RuntimeException("Invalid syntax at " + $e1.text + " " + $e2.text);
            }
            $value = new RelComposition((Relation)$e1.value, (Relation)$e2.value);
        }
    |   e1 = expression '|' e2 = expression {
            if($e1.value instanceof Relation && $e2.value instanceof Relation){
                $value = new RelUnion((Relation)$e1.value, (Relation)$e2.value);
            } else if($e1.value instanceof FilterInterface && $e2.value instanceof FilterInterface){
                $value = new FilterUnion((FilterInterface)$e1.value, (FilterInterface)$e2.value);
            } else {
                throw new RuntimeException("Invalid syntax at " + $e1.text + " " + $e2.text);
            }
        }
    |   e1 = expression '\\' e2 = expression {
            if($e1.value instanceof Relation && $e2.value instanceof Relation){
                $value = new RelMinus((Relation)$e1.value, (Relation)$e2.value);
            } else if($e1.value instanceof FilterInterface && $e2.value instanceof FilterInterface){
                $value = new FilterMinus((FilterInterface)$e1.value, (FilterInterface)$e2.value);
            } else {
                throw new RuntimeException("Invalid syntax at " + $e1.text + " " + $e2.text);
            }
        }
    |   e1 = expression '&' e2 = expression {
            if($e1.value instanceof Relation && $e2.value instanceof Relation){
                $value = new RelIntersection((Relation)$e1.value, (Relation)$e2.value);
            } else if($e1.value instanceof FilterInterface && $e2.value instanceof FilterInterface){
                $value = new FilterIntersection((FilterInterface)$e1.value, (FilterInterface)$e2.value);
            } else {
                throw new RuntimeException("Invalid syntax at " + $e1.text + " " + $e2.text);
            }
        }
    ;

NAME
    : [A-Za-z0-9\-]+
    ;

WS
    :   [ \t\n\r]+
        -> skip
    ;

BLOCK_COMMENT
    :   '(*' .*? '*)'
        -> skip
    ;

INCLUDE
    :   'include "' .*? '"'
        -> skip
    ;

MODELNAME
    :   '"' .*? '"'
        -> skip
    ;
