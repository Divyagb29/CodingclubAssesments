
package EmployeeWage;

public class EmployeeWageUC1 {
public static void main(String ag[])
{
    int isfulltime  = 1;
    double empCheck = Math.floor(Math.random()*10)%2;
    if(empCheck == isfulltime)
    {
        System.out.println("employee is present");
    }
    else
    {
        System.out.println("employee is absent");
    }
}
}
