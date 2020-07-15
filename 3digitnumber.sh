#!/bin/bash -x

declare -A 
	echo "enter the limit number : "
        read n
for (( i=1; i<=n; i++ ))
do
	random="${RANDOM:0:3}"
	echo ${random[@]}

	biggest=${random[0]}
	smallest=${random[0]}

	for i in ${random[@]}
	do
            if [[ $i -gt $biggest ]]
	    then
	       biggest="$i"
	    fi

	    if [[ $i -lt $smallest ]]
	    then
	       smallest="$i"
	    fi
            echo "second smallest number is : $smallest"
            echo "second largest number is : $biggest"
        done
done
