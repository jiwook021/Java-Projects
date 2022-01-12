package seceretphrase;
import java.util.*;
import java.util.Scanner;

/**
 * @author jiwook kim
 */
public class SeceretPhrase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //set all the boolean variables to false. later if one finds the letter, correspoding boolean value will turn true. 
        
    boolean First=false; 
    boolean Second=false; 
    boolean Third=false; 
    boolean Fourth=false; 
    boolean Fifth=false; 
    boolean Sixth=false;
    
    String finalword="Circuit with transistors";//word to find  
    
    StringBuilder finalword1=new StringBuilder ("C*r*uit *ith tr*n*ist*rs");//word that is given
    System.out.println("----------Hangman Game----------");//title
    System.out.println("\n"+finalword1);//print out initial given word
    Scanner A=new Scanner(System.in); 
    
    for (int x=0; x<6; x++){
        System.out.println("\nGuess a letter");//question
        char y=A.next().charAt(0);//character that is entered saved as y 
        if (!(First)&&(y=='i'))//if(first is false and valued entered is i) 
        {
            int placement=finalword.indexOf("i"); //index of where word to find which is 1, set this value to variable placement. 
            
            finalword1.setCharAt(placement,'i');//the index which is 1, put i on final world1 index 1. 
            First=true;//turn boolean value to true
            
            System.out.println("Phrase: "+finalword1);//print out current finalword variable. 
        }
        //same with if statements but with different letters. 
        
        else if (!(Second)&&(y=='c')) 
            { 
            int placement=finalword.indexOf("c"); 
            
            finalword1.setCharAt(placement,'c');
            Second=true;
            System.out.println(finalword1);
        }
            else if (!(Third)&&(y=='w'))
            {
            int placement=finalword.indexOf("w"); 
            
            finalword1.setCharAt(placement,'w');
            Third=true;
            System.out.println(finalword1);
        }
        else if (!(Fourth)&&(y=='a'))
            {
            int placement=finalword.indexOf("a"); 
            
            finalword1.setCharAt(placement,'a');
            Fourth=true;
            System.out.println(finalword1);
        }
        else if (!(Fifth)&&(y=='s'))
            {
            int placement=finalword.indexOf("s"); 
            
            finalword1.setCharAt(placement,'s');
            Fifth=true;
            System.out.println(finalword1);
        }
        else if (!(Sixth)&&(y=='o'))
            {
            int placement=finalword.indexOf("o"); 
            
            finalword1.setCharAt(placement,'o');
            Sixth=true;
            System.out.println(finalword1);
        }
        
        else 
        {
            System.out.println("Wrong letter");
        --x;//since x can get only 6, and user have to find 6 letter, when one write wrong letter, set that x to x-1. 
        }
        
    }
        System.out.println("\nThe word: "+finalword+"\n\nGood job! End game");
    }
}
 