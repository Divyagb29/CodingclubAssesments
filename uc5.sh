#!bin/bash -x

isfulltime=2
ispartime=1
emprateperhr=20
totalsalary=0
numwrkingdays=20
for (( day=1; day<=$numwrkingdays; day++ ))
do
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
done

