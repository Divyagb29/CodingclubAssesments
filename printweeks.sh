#!/bin/bash -x
sunday=1
monday=2
tuesday=3
wednesday=4
thursday=5
friday=6
saturday=7
	echo "enter an number to get week : "
read num
if [ $num -eq 1 ]
then
	echo "sunday"
elif [ $num -eq 2 ]
then
	echo "monday"
elif [ $num -eq 3 ]
then
        echo "tuesday"
elif [ $num -eq 4 ]
then
        echo "wednesday"
elif [ $num -eq 5 ]
then
        echo "thursday"
elif [ $num -eq 6 ]
then
        echo "friday"
elif [ $num -eq 7 ]
then
        echo "saturday"
else
 	echo "entered number is invalid"

fi
