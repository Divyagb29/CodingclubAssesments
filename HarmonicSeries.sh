#!/bin/bash -x

echo "Printing Harmonic series : "
i=1
for (( j = 1; j < 15; j++ ))
do
	echo -e $i"/"$j "+\c "  
done
