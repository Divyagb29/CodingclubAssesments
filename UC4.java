/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeWage;


public class UC4
{
    public static final int isfulltime  = 2;
    public static final int ispartime = 1;
    public static final int emprateperhr =20;
    public static void method()
    {
        int emphrs=0;
        int empwage=0;
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
        System.out.println("Emp Wage : "+empwage);
    }
    public static void main(String ag[])
    {
        UC4.method();
    }
}
