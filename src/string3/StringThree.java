package string3;
import string3logic.*;
import java.util.*;
import task4.CustomException;
import utility.*;


public class StringThree
{

    public static void main(String[] args)
    {
    
    Scanner input=new Scanner(System.in);
    
    StringThreeLogic callLogic=new StringThreeLogic();
     int questionNo=0;
    
     System.out.println("Enter the Question Number");
     try
     {
     questionNo=input.nextInt();
     }
     catch(Exception ex)
     {
     System.out.println("Please Enter the Question Number Only...!");
     }
     
    input.nextLine();
    
    switch(questionNo)
    {
    
         case 1:
         
              try
              {
              System.out.println("Enter the First String");
              String firstString=input.nextLine();
              System.out.println("Enter the second String");
              String secondString=input.nextLine();
              System.out.println(callLogic.checkRotation(firstString,secondString));
              }
              catch(CustomException ex)
              {
                     System.out.println(ex.getMessage());
              }
              
              break;
              
              
         case 2:
              
              try
              {
              System.out.println("Howmany Strings you want");
              int count=input.nextInt();
              input.nextLine();
              String inputString[]=new String[count];
              
              for(int i=0;i<count;i++)
              {
                   inputString[i]=input.nextLine();
              }
              
              System.out.println(callLogic.togetCommonFragments(inputString));
              }
              catch(CustomException ex)
              {
                     System.out.println(ex.getMessage());
              }
              catch(Exception ex)
              {
              
                     System.out.println("Please Enter Number Only");
              }
              
              break;
              
             
              
         case 3:
         
              try
              {
              System.out.println("Enter the first String");
              String firstString=input.nextLine();
              System.out.println("Enter the second String");    
              String secondString=input.nextLine();
              System.out.println(callLogic.toPrintNotMatchPair(firstString,secondString)); 
              }
              catch(CustomException ex)
              {
                     System.out.println(ex.getMessage());
              }
              break;
              
              
         case 4:
         
              try
              { 
              System.out.println("Enter a String");
              String inputString=input.nextLine();         
              System.out.println(callLogic.getUniqueCharacter(inputString));  
              }     
              catch(CustomException ex)
              {
                     System.out.println(ex.getMessage());
              }
              break;     
              
              
         case 5:
         
              try
              {
              System.out.println("Enter a String");
              String inputString=input.nextLine();
              System.out.println(callLogic.toEncodeString(inputString));
              }     
              catch(CustomException ex)
              {
                     System.out.println(ex.getMessage());
              }
              break;         
              
         case 6:
             try
             {
             System.out.println("Enter a String");
             String inputString=input.nextLine();
             System.out.println(callLogic.removePalindrome(inputString));
             } 
             catch(CustomException ex)
             {
                    System.out.println(ex.getMessage());
             }
             break;    
                 
                 
         case 7:
           
            try
            {
            System.out.println("Enter the First String");
            String firstString=input.nextLine();
            System.out.println("Enter the second String");
            String secondString=input.nextLine();   
            System.out.println(callLogic.checkMagicString(firstString,secondString));     
            }
            catch(CustomException ex)
            {
                    System.out.println(ex.getMessage());
            }
            break;    
            
            
         case 8:
         
            try
            {
            System.out.println("Enter the number");
            int number=input.nextInt(); 
            System.out.println(callLogic.toConvertNumtoWords(number));
            }
            catch(Exception ex)
            {
                    System.out.println("Please Enter Number Only..");
            }  
            
            
            
         case 9:
         
           try
           {
           System.out.println("Enter the String(UPPERCASE only)");
           String inputString=input.nextLine();
           System.out.println(callLogic.toCheckBalance(inputString));
           }   
           catch(CustomException ex)
           {
                   System.out.println(ex.getMessage());
           }
           break;  
           
           
         case 10:
           
           try
           {
           System.out.println("Enter the String");
           String inputString=input.nextLine();
           System.out.println(callLogic.printDictionaryOrder(inputString));
           }   
           catch(CustomException ex)
           {
                   System.out.println(ex.getMessage());
           }
           break;  
           
           
           
           
             
    }
    
    
    
    
    }

}
