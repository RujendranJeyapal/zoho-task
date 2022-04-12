package task2;
import logicallayer.StringBuilderLogic;
import task4.*;
import java.util.Scanner;
public class StringBuilderRunner
{


public StringBuilder createBuilderWithSymbol(String firstString,String symbol)throws MistakeOccuredException,Exception
{
   Scanner input=new Scanner(System.in);
   StringBuilderLogic logicLayerObject=new StringBuilderLogic();

    
    System.out.println("Howmany Strings you want after First String");
    int count=input.nextInt(); 
    input.nextLine();   
    StringBuilder builder=logicLayerObject.createBuilder(firstString);
    String arrayString[]=new String[count];
    System.out.println("Please Enter the Strings");
    for(int i=0;i<count;i++)
    {
    arrayString[i]=input.nextLine();
    }
    logicLayerObject.separateString(builder,arrayString,symbol);
    return builder;
   
}


public static void main(String[] args)
{
StringBuilderLogic logicLayerObject=new StringBuilderLogic();
 StringBuilder emptyString=new StringBuilder();
  StringBuilderRunner RunnerObject=new StringBuilderRunner();
Scanner input=new Scanner(System.in);
int questionNo=0;
try
{
System.out.println("Enter the Question number");
questionNo=input.nextInt();
}
catch(Exception error)
{
System.out.println("Please enter a Question Number..!");
}
input.nextLine();

switch(questionNo)
{
case 1: 
    try
    {   
    emptyString =logicLayerObject.createBuild();  
    System.out.println(logicLayerObject.stringBuilderLength(emptyString));
    System.out.println("Enter a String");
    String firstString=input.next();
    System.out.println(logicLayerObject.appendWith(emptyString,firstString));
    System.out.println(logicLayerObject.stringBuilderLength(emptyString));
    }
    catch(MistakeOccuredException error)
    {
    System.out.println(error.getMessage());
    }
   break;
   
   
case 2:
    try
    {
    System.out.println("Enter a String");
    String inputString2=input.nextLine();
    System.out.println("Enter a space or any Symbol between Strings");
    String symbol2=input.nextLine();
    StringBuilder builder2=RunnerObject.createBuilderWithSymbol(inputString2,symbol2);
    System.out.println(builder2);
    System.out.println(logicLayerObject.stringBuilderLength(builder2));
    }   
    catch(MistakeOccuredException error)
    {
    System.out.println(error.getMessage());
    } 
    catch(Exception ex)
    {
     System.out.println("Please Enter a number");
    }   
    break;  
    
    
    
case 3:
    try
    {
    System.out.println("Enter a First String");
    String inputString3=input.nextLine();
    System.out.println("Enter a space or any Symbol between Strings");
    String symbol3=input.nextLine();
    StringBuilder builder4=RunnerObject.createBuilderWithSymbol(inputString3,symbol3);
    System.out.println(builder4);
    System.out.println(logicLayerObject.stringBuilderLength(builder4));
    System.out.println("Enter a insert String");
    String insertString=input.nextLine();
    StringBuilder builderAfterInsert=logicLayerObject.insertNewString(builder4,inputString3,insertString,symbol3);
    System.out.println(builderAfterInsert);  
    System.out.println(logicLayerObject.stringBuilderLength(builderAfterInsert));
    }
     catch(MistakeOccuredException error)
    {
    System.out.println(error.getMessage());
    }
    
    catch(Exception ex)
    {
      System.out.println("Please Enter a number");
    }   
    break;
    
    
case 4:
    try
    {
    System.out.println("Enter a first String");
    String inputString4=input.nextLine(); 
    System.out.println("Enter a space or any Symbol between Strings");
    String symbol4=input.nextLine();
    StringBuilder builder6=RunnerObject.createBuilderWithSymbol(inputString4,symbol4);
    System.out.println(builder6);
    System.out.println(logicLayerObject.stringBuilderLength(builder6));
    StringBuilder builderAfterDelete=logicLayerObject.deleteString(inputString4,builder6);
    System.out.println(builderAfterDelete);
    System.out.println(logicLayerObject.stringBuilderLength(builderAfterDelete));
    }
    catch(MistakeOccuredException error)
    {
    System.out.println(error.getMessage());
    }
    
    catch(Exception ex)
    {
    System.out.println("Please Enter a number");
    }   
    break;
    
case 5:
     try
     {
     System.out.println("Enter a First String"); 
     String inputString5=input.nextLine();
     System.out.println("Enter a space or any Symbol between Strings");
     String symbol5=input.nextLine();
     StringBuilder builder8=RunnerObject.createBuilderWithSymbol(inputString5,symbol5);
     System.out.println(builder8);
     System.out.println(logicLayerObject.stringBuilderLength(builder8));
     System.out.println("Enter a replacing letter");
     char replacingLetter=input.next().charAt(0);
     StringBuilder builderAfterReplace=logicLayerObject.replaceString(builder8,symbol5.charAt(0),replacingLetter);
     System.out.println(builderAfterReplace);
     System.out.println(logicLayerObject.stringBuilderLength(builderAfterReplace));
     }
      catch(MistakeOccuredException error)
     {
     System.out.println(error.getMessage());
     } 
     
     catch(Exception ex)
     {
     System.out.println("Please Enter a number");
     }  
    break;    
    
case 6:
     try
     {
     System.out.println("Enter a First String"); 
     String inputString6=input.nextLine();
     System.out.println("Enter a space or any Symbol between Strings");
     String symbol6=input.nextLine();
     StringBuilder builder10=RunnerObject.createBuilderWithSymbol(inputString6,symbol6);
     System.out.println(builder10);
     System.out.println(logicLayerObject.stringBuilderLength(builder10));
     StringBuilder reverseBuilder=logicLayerObject.reverseString(builder10);
     System.out.println(reverseBuilder);
     System.out.println(logicLayerObject.stringBuilderLength(builder10));
     }     
     catch(MistakeOccuredException error)
     {
     System.out.println(error.getMessage());
     }

     catch(Exception ex)
     {
      System.out.println("Please Enter a number");
     }
     break;
case 7:
     System.out.println("Enter a String");
     String name7=input.nextLine();
     try
     {
     System.out.println("Enter a starting position");
     int startingPosition=input.nextInt();
     System.out.println("Enter a ending Position");
     int endingPosition=input.nextInt(); 
     StringBuilder startingBuilder=logicLayerObject.createBuilder(name7);    
     System.out.println(logicLayerObject.stringBuilderLength(startingBuilder));
     StringBuilder deleteBuilder=logicLayerObject.deleteCharacter(startingBuilder,startingPosition-1,endingPosition);
     System.out.println(deleteBuilder);
     System.out.println(logicLayerObject.stringBuilderLength(deleteBuilder));   
     }
     catch(MistakeOccuredException error)
     {
     System.out.println(error.getMessage());
     }
     
     catch(Exception ex)
     {
     System.out.println("Please Enter a number");
     } 
     break;

   
case 8:
     System.out.println("Enter a String");
     String name8=input.nextLine();
     try
     {
     System.out.println("Enter a starting position");
     int startPosition=input.nextInt();
     System.out.println("Enter a ending Position");
     int endPosition=input.nextInt();
     input.nextLine();
     System.out.println("Enter a Replace String");
     String replaceString=input.nextLine();
     StringBuilder normalBuilder=logicLayerObject.createBuilder(name8);
     System.out.println(logicLayerObject.stringBuilderLength(normalBuilder));
     StringBuilder modifyBuilder=logicLayerObject.replaceCharacter(normalBuilder,startPosition-1,endPosition,replaceString);
     System.out.println(modifyBuilder);
     System.out.println(logicLayerObject.stringBuilderLength(modifyBuilder));  
     }
     catch(MistakeOccuredException error)
     {
     System.out.println(error.getMessage());
     }
     
     catch(Exception ex)
     {
     System.out.println("Please enter a number");
     }

     break;
    
    
case 9:
     try
     {
     System.out.println("Enter a First String"); 
     String inputString9=input.nextLine();
     System.out.println("Enter a space or any Symbol between Strings");
     String symbol9=input.nextLine();
     StringBuilder builderWithSymbol=RunnerObject.createBuilderWithSymbol(inputString9,symbol9);
     System.out.println(builderWithSymbol);
     System.out.println("Size:"+logicLayerObject.stringBuilderLength(builderWithSymbol));
     int position=logicLayerObject.toFindStartingSymbol(builderWithSymbol,symbol9);
     System.out.println("First index:"+position);
     
     }
     catch(MistakeOccuredException error)
     {
     System.out.println(error.getMessage());
     }
     catch(Exception ex)
     {
      System.out.println("Please Enter a number");
     }
    break;
    
case 10:
     try
     {
     System.out.println("Enter a First String"); 
     String inputString10=input.nextLine();
     System.out.println("Enter a space or any Symbol between Strings");
     String symbol10=input.nextLine();
     StringBuilder builderWithSymbol1=RunnerObject.createBuilderWithSymbol(inputString10,symbol10);
     System.out.println(builderWithSymbol1);
     System.out.println("Size:"+logicLayerObject.stringBuilderLength(builderWithSymbol1));  
     int position1=logicLayerObject.toFindLastSymbol(builderWithSymbol1,symbol10);
     System.out.println("Last index :"+position1);
     }
     catch(MistakeOccuredException error)
     {
      System.out.println(error.getMessage());
     }
   
     catch(Exception ex)
     {
      System.out.println("Please Enter a number");
     }
     break;  
     
     default:
     System.out.println("Invalid Input...!");    
    
}
}
}
