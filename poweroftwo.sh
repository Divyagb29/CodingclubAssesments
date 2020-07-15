#!/bin/bash

 echo -n "Enter number : "
read n
echo -n "Enter Power of Number:- "
read p
tmp=$p
power=1
while [ $p -gt 0 ]
  do
    power=$(echo "$power * $n" |bc)
    p=$(echo "$p - 1" |bc)
done
echo "$n power $tmp is $power"

