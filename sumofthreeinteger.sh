#!/bin/bash -x

echo "enter a 3 integer numbers"
read arr
sum=0
for i in ${arr[@]}
do
sum=`expr $sum + $i`
done

if [[ $sum -eq 0 ]]
then
	echo "sum is equals to zero"
else
	echo "sum is not equals to zero"
fi
	echo $sum
