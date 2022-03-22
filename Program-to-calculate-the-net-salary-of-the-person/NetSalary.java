/*
    Program to calculate the net salary of an employee by entering the basic pay of the employee
    and HRA,TA,DA percentage of the employee.
*/
import java.util.*;
public class NetSalary
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        double Basic_pay,Hra,Hra_percent,Ta,Ta_percent,Da,Da_percent,Net_salary;
        String name;
        System.out.print("Enter the name of the employee :");
        name=in.nextLine();
        System.out.print("Enter the basic pay of the employee :");
        Basic_pay=in.nextDouble();
        System.out.print("Enter the HRA percentage :");
        Hra_percent=in.nextDouble();
        System.out.print("Enter the TA percentage :");
        Ta_percent=in.nextDouble();
        System.out.print("Enter the DA percentage :");
        Da_percent=in.nextDouble();
        Hra=(Hra_percent*Basic_pay)/100;
        Ta=(Ta_percent*Basic_pay)/100;
        Da=(Da_percent*Basic_pay)/100;
        Net_salary=Basic_pay+Hra+Ta+Da;
        System.out.println("The name of the employee is "+name);
        System.out.println("Net salary of the employee is = "+Net_salary+" rupees .");
    }
}
