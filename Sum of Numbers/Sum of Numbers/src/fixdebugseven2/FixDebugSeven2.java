package fixdebugseven2;

// Program prompts user to enter a series of integers
// separated by spaces
// Program converts them to numbers and sums them
// Jiwook Kim.

import java.util.*;
public class FixDebugSeven2
        
{
    
   public static void main(String[] args)
   {
      String str;
      int x;
      int length;
      int start = 0;
      int num;
      int lastSpace = -1;
      int sum = 0;
      String partStr;
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a series of integers separated by spaces >> ");
      str = in.nextLine();
      length = str.length();//find length of the string 
      
      for(x = 0; x < length; ++x)//index of last character is length -1, so it is x < length 
      {
         if(str.charAt(x) ==' ')//char is ' '.
         {
             partStr = str.substring(lastSpace + 1,x);     
             num = Integer.parseInt(partStr);
             System.out.print("  " + num +"  +");
             sum = sum + num;//add up the sum by that number 
             lastSpace = x;//this is for finding the location of the index 
          } 
               }
   
      partStr = str.substring(lastSpace + 1, length);
      num = Integer.parseInt(partStr);
      System.out.println(" " + num);
      sum += num;
      System.out.println("--------------------------------------------" +
         "\nThe sum of the integers: " + sum);//prints out sum. 
   }
}
