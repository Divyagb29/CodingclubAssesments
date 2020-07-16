/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeWage;

public class EmployeeWageUC5 {
    
   public static final int isfulltime  = 2;
   public static final int ispartime = 1;
   public static final int emprateperhr =20;
   public static final int numofworkingdays =2;
public static void main(String ag[])
{
    int emphrs=0;
    int empwage=0;
    int totalEmpWage=0;
    for(int day=0;day<numofworkingdays;day++)
    {
        int empCheck = (int) (Math.floor(Math.random()*10)%2);
        switch(empCheck)
        {
            case isfulltime:
                emphrs=8;
                break;
            case ispartime:
                emphrs=4;
                break; 
            default:
                emphrs=0;         
        }
        empwage = emphrs*emprateperhr;
        totalEmpWage += empwage;
        System.out.println("Emp Wage : "+empwage);
    }
    System.out.println("total emp wage : "+totalEmpWage);
}
}

