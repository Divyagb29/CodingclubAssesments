#!/bin/bash -x

count=0
for i in {1..100};
do 
if [[ $((i%11)) -eq '0' ]];
then
array[((count++))]=$i
echo $i
fi
done
