for file in litmus/PPC/*.litmus;
do
   java dartagnan/Dartagnan -t arm -i $file > ./dart_arm.out
   dart=$(grep -e 'not' dart_arm.out | wc -l)
   herd7 -model cat/arm.cat $file > ./herd_arm.out
   herd=$(grep -e 'Never' herd_arm.out | wc -l)
   rm dart_arm.out
   rm herd_arm.out
   if [ $dart != $herd ]
   then
      echo $file
      break
   fi
done


