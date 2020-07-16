#!bin/bash -x

ispresent=1
emprateperhr=20
randomcheck=$((RANDOM%2))
if [ $ispresent -eq $randomcheck ]
then
        emphrs=8
else
	emphrs=4
fi
        salary=$(( $emphrs * $emprateperhr ))
        echo $salary


