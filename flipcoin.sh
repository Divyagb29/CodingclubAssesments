#!/bin/bash -x

head=1
tail=0  
random=$((RANDOM % 2))
headwins=0
tailwins=0
while [ $headwins -lt 12 || $tailwins -lt 12 ]
do
if [ $random -eq 0 ]
then
     headwins=headwins+1
else
     tailwins=tailwins+1
fi
done

if [ $headwins -eq 11 ]
then 
	echo "head wins"
elif [ $taiwins -eq 11 ]
then
	echo " tail wins"
fi

