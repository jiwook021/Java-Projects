/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 * @author kim.jiwo
 */
 class EmployeeMessages
        {
                
       private String[] msg= new String[]
        {
        "Employee Number is not numeric",
        "Employee Number is more than 9999",
        "Employee Number is less than 1000",
        "Hourly Pay is not numeric",
        "Hourly Pay is less than $9",
        "Hourly Pay is greater than $25"
};
                        
//Function errmsg takes an integer parameter and returns a String
public String errmsg(int a)
{

return msg[a];
}
}