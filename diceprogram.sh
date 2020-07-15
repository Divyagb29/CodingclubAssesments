#!/bin/bash -x
echo "adding two dice"
d1=$((1 + RANDOM % 6 ))
echo $d1
d2=$(( 1 + RANDOM % 6 ))
echo  $d2
total=$(( $d1+$d2 ))
echo "addtion of 2 random dice is : $total"
