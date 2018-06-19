#!/bin/sh

export LD_LIBRARY_PATH="./import/"
export DYLD_LIBRARY_PATH="./import/"

export CLASSPATH=./import/antlr-4.7-complete.jar:./import/commons-io-2.5.jar:./import/com.microsoft.z3.jar:./import/commons-cli-1.4.jar:./bin/

mkdir -p bin

java -jar import/antlr-4.7-complete.jar Litmus.g4 -o target/generated-sources/antlr4/dartagnan/

java -jar import/antlr-4.7-complete.jar Porthos.g4 -o target/generated-sources/antlr4/dartagnan/

java -jar import/antlr-4.7-complete.jar LitmusPPC.g4 -visitor -o target/generated-sources/antlr4/dartagnan/

javac src/dartagnan/Dartagnan.java src/dartagnan/expression/AConst.java src/dartagnan/expression/AExpr.java src/dartagnan/expression/Assert.java src/dartagnan/expression/Atom.java src/dartagnan/expression/BConst.java src/dartagnan/expression/BExpr.java src/dartagnan/program/Barrier.java src/dartagnan/program/Event.java src/dartagnan/program/HighLocation.java src/dartagnan/program/If.java src/dartagnan/program/Init.java src/dartagnan/program/Isb.java src/dartagnan/program/Ish.java src/dartagnan/program/Isync.java src/dartagnan/program/Load.java src/dartagnan/program/Local.java src/dartagnan/program/Location.java src/dartagnan/program/Lwsync.java src/dartagnan/program/MemEvent.java src/dartagnan/program/Mfence.java src/dartagnan/program/OptLwsync.java src/dartagnan/program/OptSync.java src/dartagnan/program/Program.java src/dartagnan/program/Read.java src/dartagnan/program/Register.java src/dartagnan/program/Seq.java src/dartagnan/program/Skip.java src/dartagnan/program/Store.java src/dartagnan/program/Sync.java src/dartagnan/program/Thread.java src/dartagnan/program/While.java src/dartagnan/program/Write.java src/dartagnan/utils/Encodings.java src/dartagnan/utils/GraphViz.java src/dartagnan/utils/LastModMap.java src/dartagnan/utils/MapSSA.java src/dartagnan/utils/Pair.java src/dartagnan/utils/Utils.java src/dartagnan/wmm/Alpha.java src/dartagnan/wmm/ARM.java src/dartagnan/wmm/Domain.java src/dartagnan/wmm/EncodingsCAT.java src/dartagnan/wmm/Power.java src/dartagnan/wmm/PSO.java src/dartagnan/wmm/RMO.java src/dartagnan/wmm/SC.java src/dartagnan/wmm/TSO.java src/porthos/Porthos.java target/generated-sources/antlr4/dartagnan/LitmusBaseListener.java target/generated-sources/antlr4/dartagnan/LitmusLexer.java target/generated-sources/antlr4/dartagnan/LitmusListener.java target/generated-sources/antlr4/dartagnan/LitmusParser.java target/generated-sources/antlr4/dartagnan/PorthosBaseListener.java target/generated-sources/antlr4/dartagnan/PorthosLexer.java target/generated-sources/antlr4/dartagnan/PorthosListener.java target/generated-sources/antlr4/dartagnan/PorthosParser.java -d bin
