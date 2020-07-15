#!/bin/bash -x

	echo "enter a number : "
read num
if [ $num -eq 10 ]
then
	echo "Ten"
elif [ $num -eq 100 ]
then
	echo "Hundred"
elif [ $num -eq 1000 ]
then
	echo "Thousend"
else
	echo "invalid number"
fi
