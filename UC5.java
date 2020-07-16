package EmployeeWage;


public class UC5
{
    public static final int isfulltime  = 2;
    public static final int ispartime = 1;
    public static final int emprateperhr =20;
    public static final int numofworkingdays =2;
    public static void method()
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
    public static void main(String ag[])
    {
        UC5.method();
    }
}
