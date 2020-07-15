#!/bin/bas -x
echo "Enter the lower limit,greater than 1"
read lower

echo "Enter the upper limit"
read higher

count=0
j=2
for ((i=$lower; i<=$higher; i++))
do 
num=$i
while [ $j -lt $num ]
do
   k=`expr $num % $j`
   if [ $k -eq 0 ]
   then
       count=1
   fi
   i=`expr $i + 1`
if [ $count -eq 0 ]
then
        echo "$num =  prime number"
	break
  else
	echo "$num = not prime number"	
fi     
done
done
