
#!/bin/bash -x

n=4
p=4
tmp=$p
power=1
while [ $p -gt 0 ]
  do
    power=$(echo "$power * $n" |bc)
    p=$(echo "$p - 1" |bc)
done
echo "$n power $tmp is $power"



