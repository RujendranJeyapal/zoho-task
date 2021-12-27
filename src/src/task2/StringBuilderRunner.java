package task2;
import logicallayer.StringBuilderLogic;
import java.util.Scanner;
public class StringBuilderRunner
{
public static void main(String[] args)
{
StringBuilderLogic logicLayerObject=new StringBuilderLogic();
 StringBuilder emptyString=new StringBuilder();
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
    catch(Exception error)
    {
    System.out.println(error.getMessage());
    }
   break;
   
   
case 2:
    
    System.out.println("Enter a String");
    String secondString=input.next();
    
    try
    {
    
    
    StringBuilder name2=logicLayerObject.createBuilder(secondString);
    System.out.println(logicLayerObject.stringBuilderLength(name2));
    System.out.println("Howmany Strings you want...");
    int number=input.nextInt();
    input.nextLine();
    System.out.println("Please Enter the Strings");
    
    
    String arrayString[]=new String[number];
    for(int i=0;i<number;i++)
    {
    arrayString[i]=input.nextLine();
    }
    System.out.println("Enter a space or any symbol");
    String symbol=input.nextLine();
    System.out.println(logicLayerObject.separateString(name2,arrayString,symbol));
    System.out.println(logicLayerObject.stringBuilderLength(name2));
    }
    
     catch(Exception error)
    {
    System.out.println(error.getMessage());
    }   
    break;
    
    
case 3:
    System.out.println("Enter a First String");
    String inputString1=input.nextLine();
    try
    {
    System.out.println("Howmany Strings you want after First String");
    int count=input.nextInt();
    input.nextLine();
    
    try
    {
    StringBuilder builder3=logicLayerObject.createBuilder(inputString1);
    String arrayString1[]=new String[count];
    System.out.println("Please Enter the Strings");
    for(int i=0;i<count;i++)  
    {
    arrayString1[i]=input.nextLine();
    }
    System.out.println("Enter a space or any symbol between Strings");
    String symbol4=input.nextLine();
    
    StringBuilder builder4=logicLayerObject.separateString(builder3,arrayString1,symbol4);
    System.out.println(builder4);
    System.out.println(logicLayerObject.stringBuilderLength(builder4));
    System.out.println("Enter a insert String");
    String insertString=input.nextLine();
    StringBuilder builderAfterInsert=logicLayerObject.insertNewString(builder4,inputString1,insertString,symbol4);
    System.out.println(builderAfterInsert);  
    System.out.println(logicLayerObject.stringBuilderLength(builderAfterInsert));
    }
     catch(Exception error)
    {
    System.out.println(error.getMessage());
    }
    }
    catch(Exception ex)
     {
      System.out.println("Please Enter a number");
     }   
    break;
    
    
case 4:
    System.out.println("Enter a First String");
    String name4=input.nextLine();
    try
    {
    System.out.println("Howmany Strings you want after First String");
    int count1=input.nextInt(); 
    input.nextLine();   
    try
    {
    StringBuilder builder5=logicLayerObject.createBuilder(name4);
    String arrayString2[]=new String[count1];
    System.out.println("Please Enter the Strings");
    for(int i=0;i<count1;i++)
    {
    arrayString2[i]=input.nextLine();
    }
    System.out.println("Enter a space or any Symbol between Strings");
    String symbol5=input.nextLine();
    StringBuilder builder6=logicLayerObject.separateString(builder5,arrayString2,symbol5);
    System.out.println(builder6);
    System.out.println(logicLayerObject.stringBuilderLength(builder6));
    StringBuilder builderAfterDelete=logicLayerObject.deleteString(name4,builder6);
    System.out.println(builderAfterDelete);
    System.out.println(logicLayerObject.stringBuilderLength(builderAfterDelete));
    }
     catch(Exception error)
    {
    System.out.println(error.getMessage());
    }
    }
    catch(Exception ex)
     {
      System.out.println("Please Enter a number");
     }   
    break;
    
case 5:
     System.out.println("Enter a First String"); 
     String name5=input.nextLine();
     try
     {
     System.out.println("Howmany String you want after First String");
     int count2=input.nextInt();
     input.nextLine();
     try
     {
     StringBuilder builder7=logicLayerObject.createBuilder(name5);
     String arrayString3[]=new String[count2];
     System.out.println("Please Enter the Strings");
     for(int i=0;i<count2;i++)
     {
     arrayString3[i]=input.nextLine();
     }   
     System.out.println("Enter a space or any Symbol between Strings");
     String symbol6=input.nextLine();
     StringBuilder builder8=logicLayerObject.separateString(builder7,arrayString3,symbol6);
     System.out.println(builder8);
     System.out.println(logicLayerObject.stringBuilderLength(builder8));
     System.out.println("Enter a replacing letter");
     char replacingLetter=input.next().charAt(0);
     StringBuilder builderAfterReplace=logicLayerObject.replaceString(builder8,symbol6.charAt(0),replacingLetter);
     System.out.println(builderAfterReplace);
     System.out.println(logicLayerObject.stringBuilderLength(builderAfterReplace));
     }
      catch(Exception error)
    {
    System.out.println(error.getMessage());
    } 
    }
    catch(Exception ex)
     {
      System.out.println("Please Enter a number");
     }  
    break;    
    
case 6:
     System.out.println("Enter a First String"); 
     String name6=input.nextLine();
     try
     {
     System.out.println("Howmany Strings you want after First String");
     int count3=input.nextInt();
     input.nextLine();
     try
     {
     StringBuilder builder9=logicLayerObject.createBuilder(name6);
     String arrayString4[]=new String[count3];
     System.out.println("Please Enter the Strings");
     for(int i=0;i<count3;i++)
     {
     arrayString4[i]=input.nextLine();
     }
     System.out.println("Enter a space or any symbol between Strings");
     String symbol7=input.nextLine(); 
     StringBuilder builder10=logicLayerObject.separateString(builder9,arrayString4,symbol7);
     System.out.println(builder10);
     System.out.println(logicLayerObject.stringBuilderLength(builder10));
   StringBuilder reverseBuilder=logicLayerObject.reverseString(builder10);
     System.out.println(reverseBuilder);
     System.out.println(logicLayerObject.stringBuilderLength(builder10));
     }     
    catch(Exception error)
    {
    System.out.println(error.getMessage());
    }
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
     try
    {
     StringBuilder startingBuilder=logicLayerObject.createBuilder(name7);    
     System.out.println(logicLayerObject.stringBuilderLength(startingBuilder));
     StringBuilder deleteBuilder=logicLayerObject.deleteCharacter(startingBuilder,startingPosition-1,endingPosition);
     System.out.println(deleteBuilder);
     System.out.println(logicLayerObject.stringBuilderLength(deleteBuilder));   
    }
    catch(Exception error)
    {
    System.out.println(error.getMessage());
    }
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
     try
     {
     StringBuilder normalBuilder=logicLayerObject.createBuilder(name8);
     System.out.println(logicLayerObject.stringBuilderLength(normalBuilder));
     StringBuilder modifyBuilder=logicLayerObject.replaceCharacter(normalBuilder,startPosition-1,endPosition,replaceString);
     System.out.println(modifyBuilder);
     System.out.println(logicLayerObject.stringBuilderLength(modifyBuilder));  
     }
     catch(Exception error)
    {
    System.out.println(error.getMessage());
    }
    }
    catch(Exception ex)
    {
    System.out.println("Please enter a number");
    }

    break;
    
    
case 9:
     System.out.println("Enter a First String"); 
     String name9=input.nextLine();
     try
     {
     System.out.println("Howmany String you want after first String");
     int count9=input.nextInt();
     input.nextLine(); 
     try
     {
     StringBuilder builder_9=logicLayerObject.createBuilder(name9);
     String arrayString9[]=new String[count9];
     System.out.println("Please Enter the Strings");
     for(int i=0;i<count9;i++)
     {
     arrayString9[i]=input.nextLine();
     }
     System.out.println("Enter a space or any symbol between Strings");
     String symbol9=input.nextLine(); 
     StringBuilder builderWithSymbol=logicLayerObject.separateString(builder_9,arrayString9,symbol9);
     System.out.println(builderWithSymbol);
     System.out.println(logicLayerObject.stringBuilderLength(builderWithSymbol));
 
     
    
     int position=logicLayerObject.toFindStartingSymbol(builderWithSymbol,symbol9);
     System.out.println(position);
     
     }
     catch(Exception error)
    {
    System.out.println(error.getMessage());
    }
    }
    catch(Exception ex)
     {
      System.out.println("Please Enter a number");
     }
    break;
    
case 10:
     System.out.println("Enter a First String"); 
     String name10=input.nextLine();
     try
     {
     System.out.println("Howmany String you want after first String");
     int count10=input.nextInt();
     input.nextLine(); 
     try
     {
     StringBuilder builder_10=logicLayerObject.createBuilder(name10);
     String arrayString10[]=new String[count10];
     System.out.println("Please Enter the Strings");
     for(int i=0;i<count10;i++)
     {
     arrayString10[i]=input.nextLine();
     }
     System.out.println("Enter a space or any symbol between Strings");
     String symbol10=input.nextLine(); 
     StringBuilder builderWithSymbol1=logicLayerObject.separateString(builder_10,arrayString10,symbol10);
     System.out.println(builderWithSymbol1);
     System.out.println(logicLayerObject.stringBuilderLength(builderWithSymbol1));
 
     
    
     int position1=logicLayerObject.toFindLastSymbol(builderWithSymbol1,symbol10);
     System.out.println(position1);
     }
     catch(Exception error)
     {
      System.out.println(error.getMessage());
     }
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
