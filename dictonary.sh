#! /bin/bash

for i in {1..6}
do
	dice[$i]=0
done
	echo ${dice[@]}
	w=0
	count=0
while [[ $w -eq '0' ]]
do
	echo ${dice[@]}
	r=$((RANDOM%6 + 1))
	n=${dice[$r]}
	n=$((n+1))
	dice[$r]=$n
if [[ $n -eq '10' ]] 
then
break
fi
	((count++))
done
	echo ${dice[@]}
	min=0 
	max=0


for i in ${dice[@]}
do
	(( $i > max || max == 0)) && max=$i
	(( $i < min || min == 0)) && min=$i
done
	echo $max $min hey
for i in {0..10}
do
if [[ ${dice[$i]} -eq $max ]]
then
	echo "$i face has more repetation"
fi

if [[ ${dice[$i]} -eq $min ]]
then
	echo "$i face has less repetation"
fi

done
