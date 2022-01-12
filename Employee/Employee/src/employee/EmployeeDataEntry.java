/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author kim.jiwo
 */
 import java.util.Scanner;
import java.io.*;
        
class EmployeeDataEntry
        {
 
public static void main(String args[])
{
//Variable 
  String stringnum,stringpay;
  int EmployeeNumber,Payrate,flag=0;
  Scanner in=new Scanner(System.in);
                     
 try
 {
 
 System.out.print("Enter Employee Number : ");
 stringnum=in.nextLine();
 
 if(!stringnum.matches("[0-9]+"))
 
     throw new EmployeeException(0);

 else
  {
  EmployeeNumber=Integer.parseInt(stringnum);
  if(EmployeeNumber>9999)
 throw new EmployeeException(1);
 else if(EmployeeNumber<1000)
 throw new EmployeeException(2);
 }
 //Prompt the user to enter employee number
System.out.print("Enter Hourly Pay : ");
stringpay=in.nextLine();
//If pay not a number, throw exception number 3

if(!stringpay.matches("[0-9]+"))
 throw new EmployeeException(3);
 else
 {
 
     Payrate=Integer.parseInt(stringpay);
 //If hourpay is less than $9 throw exception number 4
 if(Payrate<9)
 throw new EmployeeException(4);
 //If hourpay is greater than $25 throw exception number 5
 else if(Payrate>25)
 throw new EmployeeException(5);
 else
     flag=1;
}
}

 catch(EmployeeException ep)
{
System.out.println(ep);
}
//If flag is 1,valid 
if(flag==1)
System.out.println("Valid employee data");
}
}