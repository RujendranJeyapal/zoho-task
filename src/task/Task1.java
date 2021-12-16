package task;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Task1
{

     public void nullEmptyCheck(String name)throws Exception
     {
          if(name==null  || name.isEmpty())
          {
             throw new Exception("Don't enter a null (or) empty String");
          }
     }
  
    public void numberLengthCheck(int number,String name)throws Exception
    {
      if(number<0 || number>=getLength(name))
           {        
            throw new Exception("Invalid Input...!");       
      }
    }
           
           
     public void positionCheck(int startingPosition,int endingPosition)throws Exception
     {
     if(startingPosition>endingPosition)
     {
     throw new Exception("Please Enter the correct Position");
     }
         
     }      
           

    





     public int getLength(String arrayString)throws Exception
    {
          nullEmptyCheck(arrayString);

          int stringLength=arrayString.length();
          return stringLength;

    }



    public char[] stringToCharacter(String inputString)throws Exception
    {
    
    
         nullEmptyCheck(inputString);
         char stringToChar[]=inputString.toCharArray();
         return stringToChar;
    }



    public char letterOfPosition(String inputString,int position)throws Exception
    {
           nullEmptyCheck(inputString);
    
           
           
           numberLengthCheck(position,inputString);
           char letter=inputString.charAt(position);         
            return letter;
    }




    public int occurrencesOfLetter(String inputString,char letter)throws Exception
    {
    
       
    
        int count=0;
        int b=getLength(inputString);
        for(int i=0;i<b;i++)
        {
            if(letter==inputString.charAt(i))
            {
                count++;
            }
        }
        return count;
        
    }




    public int greatestPosition(String inputString,char letter)throws Exception
    {
        nullEmptyCheck(inputString);
    
        int lastPositionOfLetter=inputString.lastIndexOf(letter);
        return lastPositionOfLetter;
    }



    public String printLetters(String inputString,int startPosition,int endPosition)throws Exception
    {
    
     nullEmptyCheck(inputString);
    
     numberLengthCheck(startPosition,inputString);
     numberLengthCheck(endPosition,inputString);
     positionCheck(startPosition,endPosition);
    String a=inputString.substring(startPosition,endPosition); 
    return a;
    }


    public String printingLetters(String inputString,int startPosition,int endPosition)throws Exception
    {
     return printLetters(inputString,startPosition,endPosition);
    }


    public String replaceWithAnotherLetter(String inputString,String replacingLetters,int firstPositionToReplace,int lastPositionToReplace)throws Exception
    {
        nullEmptyCheck(inputString);
        nullEmptyCheck(replacingLetters);
        numberLengthCheck(firstPositionToReplace,inputString);
        numberLengthCheck(lastPositionToReplace,inputString); 
        positionCheck(firstPositionToReplace,lastPositionToReplace);
        
        String newReplaceString=inputString.replace(inputString.substring(firstPositionToReplace,lastPositionToReplace),replacingLetters);
        return newReplaceString;
        
    
}



    public boolean startingCheck(String inputString,String testingLetters)throws Exception 
   {   
        nullEmptyCheck(inputString);
        nullEmptyCheck(testingLetters);
       
        boolean startCheck=inputString.startsWith(testingLetters);
        return startCheck;       
   }





    public boolean endingCheck(String inputString,String testingLetters)throws Exception
    {
       
        nullEmptyCheck(inputString);
        nullEmptyCheck(testingLetters);       
        boolean endCheck=inputString.endsWith(testingLetters);
        return endCheck;
    }


    public String upperCase(String inputString)throws Exception
    {
        nullEmptyCheck(inputString);
        String upperCase=inputString.toUpperCase();

        return upperCase;
    }





    public String lowerCase(String inputString)throws Exception
    {
        nullEmptyCheck(inputString);
        String lowerCase=inputString.toLowerCase();
        return lowerCase;
    }



    public String toReverseAString(String inputString)throws Exception
    { 
        nullEmptyCheck(inputString);   
        String temp="";
        char reverse[]=stringToCharacter(inputString);
        int l=getLength(inputString);
        for(int i=l-1;i>=0;i--)
        {
            temp=temp+reverse[i];
        }
        return temp;
    }



    public String stringsInNextLine(String inputString)throws Exception

    {
        nullEmptyCheck(inputString);    
        return inputString;

    }




    public String concatenateStrings(String inputString)throws Exception
    {
        nullEmptyCheck(inputString);
        String replaceString=inputString.replace(" ","");
        return replaceString;
    }



    public String[] splitStrings(String inputString)throws Exception
    {
        nullEmptyCheck(inputString);
        String[] splitString=inputString.split(" ");
        return splitString;
    }
    

    public String mergeWith(String[] inputStrings)throws Exception
   {
        
        anotherCheck(inputStrings);
        String joinString=String.join("-",inputStrings);
        return joinString;
    
    }
    public void anotherCheck(String[] inputStrings)throws Exception
    {
    for(String k:inputStrings)
    {
     nullEmptyCheck(k);
    }
    }
    
    
    





    public boolean checkTwoStringsEqual(String oneString,String anotherString)throws Exception
    {
        nullEmptyCheck(oneString);
        nullEmptyCheck(anotherString);
        boolean same=oneString.equals(anotherString);
        return same;

    }





    public boolean checkTwoStringsEqualIgnoreCase(String oneString,String anotherString)throws Exception
    {
        nullEmptyCheck(oneString);
        nullEmptyCheck(anotherString);
        boolean same=oneString.equalsIgnoreCase(anotherString);
        return same;

    }





    public String toTrimAString(String inputString)throws Exception
    {
        nullEmptyCheck(inputString);
        String trimedSentence=inputString.trim();
        return trimedSentence;
    }



}
