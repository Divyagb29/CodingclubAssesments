#!/bin/bash -x

	echo "enter the a b c values"
read a
read b
read c
	val1=$((a+b*c))
       	echo $val1
	val2=$((c+a/b))
        echo $val2
  	val3=$((c+a/b))
        echo $val3
	val4=$((a*b+c))
        echo $val4
	val5=$((a%b+c))
        echo $val5

