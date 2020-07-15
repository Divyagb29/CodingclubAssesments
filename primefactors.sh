echo "Enter the number to check prime or not and factorise for the prime number"
read num
i=2
count=0
while [ $i -lt $num ]
do
   k=`expr $num % $i`
   if [ $k -eq 0 ]
   then
       count=1
   fi
   i=`expr $i + 1`
done
if [ $count -eq 0 ]
then
   echo "Number is prime"
   factorial=1
   for(( i=1; i<=num; i++ ))
   do
	factorial=$[ $factorial * $i ]
   done
   echo "the factorial of a prime number is $factorial"
else
   echo "Number is not prime"
fi


