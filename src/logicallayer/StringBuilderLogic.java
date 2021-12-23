package logicallayer;
import task.Task1;




public class StringBuilderLogic
{
Task1 objectForTask1=new Task1();


public void nullCheckForBuilder(StringBuilder inputBuilder)throws Exception
{
if(inputBuilder==null) 
{
throw new Exception("Don't enter a null value");
}
}



public void numberLengthCheck(StringBuilder inputBuilder,int number)
                                     throws Exception


{
nullCheckForBuilder(inputBuilder);
if(number<0 || number>=inputBuilder.length())
{
throw new Exception("Invalid input...!");
}

}




public StringBuilder createBuild()
{
StringBuilder emptyStringBuilder=new StringBuilder();
return emptyStringBuilder;
}



public StringBuilder createBuilder(String inputString)throws Exception
{
objectForTask1.nullEmptyCheck(inputString);
StringBuilder newStringBuilder=new StringBuilder(inputString);
return newStringBuilder;
}




public int stringBuilderLength(StringBuilder inputBuilder)throws Exception
{
nullCheckForBuilder(inputBuilder);
return inputBuilder.length();
}




public StringBuilder appendWith(StringBuilder inputBuilder,String inputString)
  throws Exception

{
nullCheckForBuilder(inputBuilder);
objectForTask1.nullEmptyCheck(inputString);
return inputBuilder.append(inputString);
}




public StringBuilder separateString(StringBuilder actualBuilder,
      String arrayString[],String symbol)throws Exception
      
{
nullCheckForBuilder(actualBuilder);
objectForTask1.nullEmptyCheck(symbol);
objectForTask1.arrayCheck(arrayString);
for(int i=0;i<arrayString.length;i++)
{
appendWith(actualBuilder,symbol);
appendWith(actualBuilder,arrayString[i]);
}
return actualBuilder;
}




   
public StringBuilder insertNewString(StringBuilder insertBuilder,
       String actualString,String insertString,String symbol)throws Exception
{
nullCheckForBuilder(insertBuilder);
objectForTask1.nullEmptyCheck(actualString);
objectForTask1.nullEmptyCheck(insertString);
objectForTask1.nullEmptyCheck(symbol);

int firstStringLength=objectForTask1.getLength(actualString);
 insertBuilder.insert(firstStringLength+1,insertString+symbol);
 return insertBuilder;
}




public StringBuilder deleteString(String inputString,
         StringBuilder inputBuilder)throws Exception
{
nullCheckForBuilder(inputBuilder);
objectForTask1.nullEmptyCheck(inputString);
int length=objectForTask1.getLength(inputString);
inputBuilder.delete(0,length+1);
return inputBuilder;
}




public StringBuilder replaceString(StringBuilder inputBuilder,
           char fromChange,char toChange)throws Exception
           
{
nullCheckForBuilder(inputBuilder);
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
                                            throws Exception
{
nullCheckForBuilder(reverseBuilder);
reverseBuilder.reverse();
return reverseBuilder;
}




public StringBuilder deleteCharacter(StringBuilder deleteBuilder,
                                    int startingPosition,int endingPosition)
                                                  throws Exception
{
nullCheckForBuilder(deleteBuilder);
objectForTask1.positionCheck(startingPosition,endingPosition);
deleteBuilder.delete(startingPosition,endingPosition);
return deleteBuilder;
}




public StringBuilder replaceCharacter(StringBuilder replaceBuilder,
                int startingPosition,int endingPosition,String replaceString)
                                                throws Exception
{
nullCheckForBuilder(replaceBuilder);
objectForTask1.nullEmptyCheck(replaceString);
objectForTask1.positionCheck(startingPosition,endingPosition);
numberLengthCheck(replaceBuilder,startingPosition);
numberLengthCheck(replaceBuilder,endingPosition);

replaceBuilder.replace(startingPosition,endingPosition,replaceString);
return replaceBuilder;
}




public int toFindStartingSymbol(StringBuilder withSymbol,String symbol)
                                                 throws Exception
{
nullCheckForBuilder(withSymbol);
objectForTask1.nullEmptyCheck(symbol);
return withSymbol.indexOf(symbol);
}




public int toFindLastSymbol(StringBuilder withSymbol,String symbol)throws Exception
{
nullCheckForBuilder(withSymbol);
objectForTask1.nullEmptyCheck(symbol);
return withSymbol.lastIndexOf(symbol);
}

}
