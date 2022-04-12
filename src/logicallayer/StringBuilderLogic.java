package logicallayer;
import task.Task1;
import utility.*;
import task4.*;




public class StringBuilderLogic
{
Task1 objectForTask1=new Task1();


public void numberLengthCheck(StringBuilder inputBuilder,int number)
                                     throws MistakeOccuredException
{
Utility.nullCheck(inputBuilder);
if(number<0 || number>=inputBuilder.length())
{
throw new MistakeOccuredException("Invalid input...!");
}

}




public StringBuilder createBuild()
{
StringBuilder emptyStringBuilder=new StringBuilder();
return emptyStringBuilder;
}



public StringBuilder createBuilder(String inputString)throws MistakeOccuredException
{
Utility.stringCheck(inputString);
StringBuilder newStringBuilder=new StringBuilder(inputString);
return newStringBuilder;
}




public int stringBuilderLength(StringBuilder inputBuilder)throws MistakeOccuredException
{
Utility.nullCheck(inputBuilder);
return inputBuilder.length();
}




public StringBuilder appendWith(StringBuilder inputBuilder,String inputString)
  throws MistakeOccuredException

{
Utility.nullCheck(inputBuilder);
Utility.stringCheck(inputString);
return inputBuilder.append(inputString);
}




public StringBuilder separateString(StringBuilder actualBuilder,
      String arrayString[],String symbol)throws MistakeOccuredException
      
{
Utility.nullCheck(actualBuilder);
Utility.stringCheck(symbol);
Utility.arrayCheck(arrayString);
for(int i=0;i<arrayString.length;i++)
{
appendWith(actualBuilder,symbol);
appendWith(actualBuilder,arrayString[i]);
}
return actualBuilder;
}




   
public StringBuilder insertNewString(StringBuilder insertBuilder,
       String actualString,String insertString,String symbol)throws MistakeOccuredException
{
Utility.nullCheck(insertBuilder);
Utility.stringCheck(insertString);
Utility.stringCheck(actualString);
Utility.stringCheck(symbol);
int firstStringLength=objectForTask1.getLength(actualString);
 insertBuilder.insert(firstStringLength+1,insertString+symbol);
 return insertBuilder;
}




public StringBuilder deleteString(String inputString,
         StringBuilder inputBuilder)throws MistakeOccuredException
{
Utility.nullCheck(inputBuilder);
Utility.stringCheck(inputString);
int length=objectForTask1.getLength(inputString);
inputBuilder.delete(0,length+1);
return inputBuilder;
}




public StringBuilder replaceString(StringBuilder inputBuilder,
           char fromChange,char toChange)throws MistakeOccuredException
           
{
Utility.nullCheck(inputBuilder);
int length=stringBuilderLength(inputBuilder);
for(int i=0;i<length;i++)
{
if(inputBuilder.charAt(i)==fromChange)
{
inputBuilder.setCharAt(i,toChange);
}
}
return inputBuilder;
}





public StringBuilder reverseString(StringBuilder reverseBuilder)
                                            throws MistakeOccuredException
{
Utility.nullCheck(reverseBuilder);
reverseBuilder.reverse();
return reverseBuilder;
}




public StringBuilder deleteCharacter(StringBuilder deleteBuilder,
                                    int startingPosition,int endingPosition)
                                                  throws MistakeOccuredException
{
Utility.nullCheck(deleteBuilder);
objectForTask1.positionCheck(startingPosition,endingPosition);
deleteBuilder.delete(startingPosition,endingPosition);
return deleteBuilder;
}




public StringBuilder replaceCharacter(StringBuilder replaceBuilder,
                int startingPosition,int endingPosition,String replaceString)
                                                throws MistakeOccuredException
{
Utility.nullCheck(replaceBuilder);
Utility.stringCheck(replaceString);
objectForTask1.positionCheck(startingPosition,endingPosition);
numberLengthCheck(replaceBuilder,startingPosition);
numberLengthCheck(replaceBuilder,endingPosition);

replaceBuilder.replace(startingPosition,endingPosition,replaceString);
return replaceBuilder;
}




public int toFindStartingSymbol(StringBuilder withSymbol,String symbol)
                                                 throws MistakeOccuredException
{
Utility.nullCheck(withSymbol);
Utility.stringCheck(symbol);
return withSymbol.indexOf(symbol);
}




public int toFindLastSymbol(StringBuilder withSymbol,String symbol)throws MistakeOccuredException
{
Utility.nullCheck(withSymbol);
Utility.stringCheck(symbol);
return withSymbol.lastIndexOf(symbol);
}

}
