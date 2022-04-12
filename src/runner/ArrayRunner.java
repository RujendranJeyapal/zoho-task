package runner;
import java.util.*;
import logic.*;

public class ArrayRunner
{
public static void main(String[] args)
{

ArrayLogic callLogic=new ArrayLogic();
Scanner input=new Scanner(System.in);
int questionNo=0;

System.out.println("Enter the Question Number");
try
{
questionNo=input.nextInt();
input.nextLine();
}
catch(Exception ex)
{
System.out.println("Please Enter the Question Number Only");
}

switch(questionNo)
{
     case 1:
        
        
         try
         {           
         System.out.println("Enter the ArraySize");
         int size=input.nextInt();
         int numbers[]=new int[size];
         for(int i=0;i<size;i++)
         {
              numbers[i]=input.nextInt();
         }
         
            int output[]=callLogic.rotateClockWise(numbers,size);
            
            
            for(int i=0;i<size;i++)
            {
                     System.out.print(output[i]+" ");
            }
         }
         catch(Exception ex)
         {
             System.out.println("Please Enter the Number Only");
         }
         
         break;
         
         
     case 2:
     
         try
         {
         System.out.println("Enter the ArraySize");
         int size=input.nextInt();
         int numbers[]=new int[size];
         for(int i=0;i<size;i++)
         {
              numbers[i]=input.nextInt();
         }
            
         Map<Integer,Integer> output=callLogic.getCounts(numbers,size);
         
         
         for(Integer key:output.keySet())
         {
                   System.out.println(key+"-"+output.get(key));
         } 
         }  
         catch(Exception ex)
         {
             System.out.println("Please Enter the Number Only");
         }
         break;
         
         
         
      case 3:
         try
         {
         System.out.println("Enter the ArraySize");
         int size=input.nextInt();
         int numbers[]=new int[size];
         for(int i=0;i<size;i++)
         {
              numbers[i]=input.nextInt();
         }
            
         callLogic.getMinimum(numbers,size);  
         }
         catch(Exception ex)
         {
             System.out.println("Please Enter the Number Only");
         }
         
         break;    
         
}



}


}
