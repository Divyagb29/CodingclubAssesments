/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeWage;

public class UC3
{
    public static void method()
    {
        int isfulltime  = 2;
        int ispartime = 1;
        int emprateperhr =20;
        int emphrs=0;
        int empwage=0;
        double empCheck = Math.floor(Math.random()*10)%2;
        if(empCheck == isfulltime)
        {
            emphrs=8;
        }
        else if(empCheck == ispartime)
        {
             emphrs=4;
        }
        else
        {
            emphrs=0;
        }
        empwage = emphrs*emprateperhr;
        System.out.println("Emp Wage : "+empwage);
        }
        public static void main(String ag[])
        {
             UC3.method();
        }
}
