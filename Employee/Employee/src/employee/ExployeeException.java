/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author kim.jiwo
 * 
 */
  class EmployeeException extends Exception
        {
int ErrNum;
EmployeeMessages em=new EmployeeMessages();
                
//EmployeeException constructor initializes variable ErrNum to num. 
EmployeeException(int num)

{
ErrNum=num;
}

 //toString returns a string
public String toString()
{
return("ERROR : "+em.errmsg(ErrNum));
}
}
