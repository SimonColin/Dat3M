#!/bin/bash

LOG=result.log

echo "[" > $LOG

for i in `seq $1 $2`;
do
	echo "Test i=$i"
	./bench.sh "-i ../Dekker.pts -unroll $i -t tso" >> $LOG
	echo ", " >> $LOG
done
echo "{}" >> $LOG
echo "]" >> $LOG
