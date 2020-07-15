#!/bin/bash -x

	echo "enter a number"
read num
case $num in
	10)
	echo "ten"
	;;
	100)
	echo "hundered"
	;;
	1000)
	echo "thousend"
	;;
*)
 	echo "enterd number is invalid"
esac
