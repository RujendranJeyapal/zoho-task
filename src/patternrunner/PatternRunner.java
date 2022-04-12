package patternrunner;
import patternlogic.*;
import java.util.*;
import task4.*;

public class PatternRunner
{


static public int getRowSize()
{ 

                      Scanner input=new Scanner(System.in);
                      int row=0;
                      System.out.println("Enter the row or column size");
                      try
                      {
                      row=input.nextInt();
                      }    
                      catch(Exception ex)
                      {
                      System.out.println("Enter the Number Only..!");
                      }
                      
                      return row;
                      
                       
}

public static void main(String[] args)
{
                 Scanner input=new Scanner(System.in);
                 PatternLogic callLogic=new PatternLogic();
                 
                 int questionNo=0;
                 
                 System.out.println("Enter the Question Number");
                 try
                 {
                 questionNo=input.nextInt();
                 input.nextLine();
                 }
                 catch(Exception ex)
                 {
                 System.out.println("Please Enter the Question Number Only!");
                 }
                 
                 switch(questionNo)
                 {
                 
                 case 1:
                 
                      int row1=getRowSize();             
                      callLogic.printPyramid(row1);
                      break;
                      
                      
                case 2:
                     
                     int row2=getRowSize();
                     callLogic.printRightTriangle(row2);    
                     break;
                     
                 case 3:
                    
                     int row3=getRowSize();
                     callLogic.printLeftTriangle(row3);    
                     break;
                 
                case 4:
                     
                     int row4=getRowSize();
                     callLogic.printDiamondPattern(row4);    
                     break;
                     
                case 5:
                     
                     int row5=getRowSize();
                     callLogic.printRightPascal(row5);   
                     break;   
                     
                     
                case 6:
                     
                     int row6=getRowSize();
                     callLogic.printSandGlass(row6);   
                     break; 
                     
                     
                case 7:
                     
                     int row7=getRowSize();
                     callLogic.printTriangle(row7);   
                     break;        
                     
                     
                 case 8:
                     
                     int row8=getRowSize();
                     callLogic.printDiamond(row8);   
                     break;    
                     
                     
                     
                 case 9:
                 
                    int row9=getRowSize();
                    callLogic.simpleNumber(row9);
                    break;  
                    
                    
                 case 10:
                 
                    int row10=getRowSize();
                    callLogic.pascalTriangle(row10);
                    break; 
                    
                    
                 case 11:
                 
                    int row11=getRowSize();
                    callLogic.numberDiamond(row11);
                    break;       
                    
                    
                 case 12:
                 
                    int row12=getRowSize();
                    callLogic.printZ(row12);
                    break;  
                    
                    
                 case 13:
                     
                    int row13=getRowSize();
                    int col=getRowSize();
                    callLogic.printXO(row13,col);
                    break;
                    
                    
                 case 14:
                 
                      System.out.println("Enter the number");
                      try
                      {
                      int size=input.nextInt();
                      callLogic.printSpiral(size);
                      }    
                      catch(Exception ex)
                      {
                      System.out.println("Enter the Number Only..!");
                      }
                      break;
                      
                 case 15:
                          
                      int row15=getRowSize();
                      callLogic.spiralNumber(row15);
                      break;    
                      
                 case 16:
                     try
                     {
                     System.out.println("Enter the String");
                     String inputString=input.nextLine();
                     callLogic.getOutput(inputString);
                     }
                     catch(CustomException ex)
                     {
                          System.out.println(ex.getMessage());
                     }     
                     break;
                     
                 case 17:
                 
                     int row17=getRowSize();
                     callLogic.getSequence(row17);
                     break;                       
                        
                 }


}

}
