/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeWage;


public class UC1
{
    public static void method()
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
    public static void main(String ag[])
    {
         UC1.method();
    }
}
