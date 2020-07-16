#!bin/bash -x

isfulltime=2
ispartime=1
emprateperhr=20
empcheck=$((RANDOM%2))
 case $empcheck in 
      $isfulltime)
         emphrs=8
	;;
      $ispartime)
	 emphrs=4
	;;
 *)
	emphrs=0
        ;;
esac
        salary=$(( $emphrs * $emprateperhr ))
        echo $salary


