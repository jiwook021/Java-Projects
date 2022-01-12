/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meanmedian2;

import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author kim.jiwo
 */
public class MeanMedian2 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
    Scanner x=new Scanner(System.in);
   //variables  
   int sum=0;
   int listnum = 0;
   double mean;
   double median; 
   int index=0;
   int position;
   int answer = 0;
   
   
    System.out.println("Find mean and median of integers");
    System.out.println("----------------------------------------");
    System.out.println("\nEnter the number of integers.(Number of integers that are entered shoud not exceed 20)");
   
   //try and exception to find whether the value entered is integer or not.
    try{
   answer=x.nextInt();
}
   catch(Exception a){
   System.out.println("Value should be only integers");      
   System.exit(0);
}
    
    
 //Checking if answer exceeds value of 20   
    if (answer<=20&& answer>0){
      listnum=answer;   
  }
    else{
      System.out.println("\nNumbers of Integers cannot exceed 20");
      System.exit(0);
    }
    
    int[]Numbers= new int[listnum];//list num is the value user entered for the number of integers 
    
    for(index=0;index<Numbers.length;index++){
    
    position=index+1;
    
   System.out.print("Enter integer at position: "+position+"\n");//Question
   
   
   //try and cath to check whether the value entered is integers. 
   
   try{
   Numbers[index]=x.nextInt();
}
   catch(Exception a){
   System.out.println("Value should be only integers");      
   System.exit(0);
}
   
        sum+=Numbers[index];
    }//end of for statement. 
    
    System.out.println("\nIntegers entered: ");//question for following printouts. 
    
    for (int i=0;i<Numbers.length;i++){
        System.out.print(Numbers[i]+"  ");//prints number entered
    }//end of for statement 
    
    //computing mean
    mean=sum/Numbers.length;
    
    //computing median 
    Arrays.sort(Numbers);//Sort the number entered.
    
    if (Numbers.length/2==0){
        median=Numbers[Numbers.length/2]/2+Numbers[(Numbers.length-1)/2]/2;
        //if the number.length is even, the median is the numeric average of the values in the two middle positions in sorted order 
    }
    else {
        median=Numbers[(Numbers.length-1)/2]; 
        //if the number.length is odd, the median is the middle position in the sorted order.
    }
            
    
    
    System.out.println("\n\nIntegers in sorted order: ");
    
   
        for (int y=0;y<Numbers.length;y++){
        System.out.print(Numbers[y]+"  ");//prints out values of the sorted order
    }

    
    System.out.println("\n\nMean: "+String.format("%.2f",mean));//prints out mean
    System.out.println("Median: "+String.format("%.2f",median));//prints out median 
    
}
}
