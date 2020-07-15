#!/bin/bash -x
	echo "enter size : "
read s
i=1;
min=0
max=0
	echo "enter the number"
while [ $i -le $s ]
do
	read num
if [ $i -eq 1 ]
then
	max=$num
	min=$num
elif [ $num -gt $max ]
then
	max=$num
elif [ $num -le $min ]
then
	min=$num
fi
	i=$(( i + 1 ))
done
	echo $max "maximum number"
	echo $min "minimum number"
