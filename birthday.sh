#! /bin/bash
for i in {1..50}
do
	year=$((RANDOM%2 + 92))
	month=$((RANDOM%12 +1))
	name=person$i
	person[$name]=$month"/"$year
	echo ${person[$name]}
done
	echo ${person[person32]}

	y1=92
	y2=93
for i in {1..50}
do
	name=person$i
for i in {1..12} 
do
	date=$i"/"$y1
	p=${person[name]} 

if [[ $p == $date ]]
then
	echo $name
fi
done
done

