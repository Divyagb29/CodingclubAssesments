/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeWage;

public class UC6 
{
   public static final int isfulltime  = 2;
   public static final int ispartime = 1;
   public static final int emprateperhr =20;
   public static final int numofworkingdays =2;
   public static final int maxhrsinamonth =10;
   public static void method()
   {
       int emphrs=0;
    int empwage=0;
    int numofworkingdays=2;
    int totalEmpWage=0;
    int totalwrkingdays=0;
     int totalemphrs=0;       
    while(totalemphrs <= maxhrsinamonth && totalwrkingdays < numofworkingdays )
    {
        totalwrkingdays++;
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
        totalemphrs += emphrs;
        System.out.println("Emp Wage : "+empwage);
    }
    int totalEmpWage1 = totalemphrs * emprateperhr;
    System.out.println("total emp wage : "+totalEmpWage1);
   }
   public static void main(String ag[])
   {     
       UC6.method();
   }
}
