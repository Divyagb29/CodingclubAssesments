#!/bin/bash -x

head=1
tail=0
for ((count=1; count<12; count++))
do
randomval=$(( RANDOM%2 ))
echo "$randomval"
if [ $randomval -eq 1 ]
then
	echo "head"
else
	echo "tail"
fi
done
