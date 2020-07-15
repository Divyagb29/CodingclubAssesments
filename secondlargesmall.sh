#!/bin/bash -x

declare random
for i in {1..10}; do
random[i]=$((RANDOM%900 +100))
done
echo ${random[@]}" "
readarray -t sorted < <(for a in "${random[@]}"; do echo "$a"; done | sort)
echo ${sorted[@]}" "
echo ${sorted[1]}
n=${!array[@]}
echo ${sorted[$((n-2))]}

