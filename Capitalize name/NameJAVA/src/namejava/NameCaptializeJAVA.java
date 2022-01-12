package namejava;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author jiwook kim
 */
public class NameCaptializeJAVA {

//computation to make properly capitalized name. 
 public static String ConvertPropername(String realname) {
    boolean jiwook=false; 
    
      /* if jiwook is false(false will show up in the bottom of the code, 
         this false means that there is a space bettern letters or it is the first word)
         Since there is a space or first letter, change it to the uppercase. 
         */
    
    
     char [] x= realname.toLowerCase().toCharArray();//set the real name to all lowercase, and make it to array consists of characters. 
     for (int i = 0; i < x.length; i++) {
         
       
         
         
//if the variable is true then the first if statement will not operate.
         
         if (jiwook==false&& Character.isLetter(x[i])){
            x[i] =Character.toUpperCase(x[i]);
            jiwook=true;
            
     }
         
         else if(Character.isWhitespace(x[i])) { 
             
          jiwook=false;//this false will make it to operate the first if statement.-> which is to make next letter capitalized.
          //with .iswhitespace method, it determines whether the specific char value is space tab or new line. 
         
}         
         
}
       return String.valueOf(x);
}
 
 
 public static void main(String[] args) {
    Scanner A=new Scanner(System.in); 
    String name=A.nextLine();
    System.out.println("Enter the name");
    System.out.println(ConvertPropername(name));//call out the method, and print out 
    
    }
}




 
