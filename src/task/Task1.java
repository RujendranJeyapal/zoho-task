package task;
import utility.*; 
import task4.*;
import java.util.*;

public class Task1
{

    public void numberLengthCheck(int number,String name)throws MistakeOccuredException
    {
    if(number<0 || number>=getLength(name))
    {        
            throw new MistakeOccuredException("Invalid Input...!");       
    }
    }
           
           
    public void positionCheck(int startingPosition,int endingPosition)throws MistakeOccuredException
    {
    if(startingPosition>endingPosition)
    {
     throw new MistakeOccuredException("Please Enter the correct Position");
    }        
    }      

    public int getLength(String inputString)throws MistakeOccuredException
    {
          Utility.stringCheck(inputString);
          int stringLength=inputString.length();
          return stringLength;
 
    }



    public char[] stringToCharacter(String inputString)throws MistakeOccuredException
    {
         Utility.stringCheck(inputString);
         char stringToChar[]=inputString.toCharArray();
         return stringToChar;
    }



    public char letterOfPosition(String inputString,int position)throws MistakeOccuredException
    {
           Utility.stringCheck(inputString);          
           numberLengthCheck(position,inputString);
           char letter=inputString.charAt(position);         
           return letter;
    }




    public int occurrencesOfLetter(String inputString,char letter)throws MistakeOccuredException
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




    public int greatestPosition(String inputString,char letter)throws MistakeOccuredException
    {
     
        Utility.stringCheck(inputString);     
        int lastPositionOfLetter=inputString.lastIndexOf(letter);
        return lastPositionOfLetter;
    }



    public String printLetters(String inputString,int startPosition,int endPosition)throws MistakeOccuredException
    {
    
     Utility.stringCheck(inputString);
     numberLengthCheck(startPosition,inputString);
     numberLengthCheck(endPosition,inputString);
     positionCheck(startPosition,endPosition);
     String a=inputString.substring(startPosition,endPosition); 
     return a;
    }


   


    public String replaceWithAnotherLetter(String inputString,String replacingLetters,int firstPositionToReplace,int lastPositionToReplace)throws MistakeOccuredException
    {
        Utility.stringCheck(inputString);
        Utility.stringCheck(replacingLetters);
        numberLengthCheck(firstPositionToReplace,inputString);
        numberLengthCheck(lastPositionToReplace,inputString); 
        positionCheck(firstPositionToReplace,lastPositionToReplace);
        
        String newReplaceString=inputString.replace(inputString.substring(firstPositionToReplace,lastPositionToReplace),replacingLetters);
        return newReplaceString;
        
    
   }



   public boolean startingCheck(String inputString,String testingLetters)throws MistakeOccuredException 
   {   
        Utility.stringCheck(inputString);
        Utility.stringCheck(testingLetters);     
        boolean startCheck=inputString.startsWith(testingLetters);
        return startCheck;       
   }





    public boolean endingCheck(String inputString,String testingLetters)throws MistakeOccuredException
    {
        Utility.stringCheck(inputString);
        Utility.stringCheck(testingLetters);        
        boolean endCheck=inputString.endsWith(testingLetters);
        return endCheck;
    }


    public String upperCase(String inputString)throws MistakeOccuredException
    {
        Utility.stringCheck(inputString);
        String upperCase=inputString.toUpperCase();
        return upperCase;
    }





    public String lowerCase(String inputString)throws MistakeOccuredException
    {
        Utility.stringCheck(inputString);
        String lowerCase=inputString.toLowerCase();
        return lowerCase;
    }



    public String toReverseAString(String inputString)throws MistakeOccuredException
    { 
        Utility.stringCheck(inputString);   
        String temp="";
        char reverse[]=stringToCharacter(inputString);
        int l=getLength(inputString);
        for(int i=l-1;i>=0;i--)
        {
            temp=temp+reverse[i];
        }
        return temp;
    }



    public String stringsInNextLine(String inputString)throws MistakeOccuredException

    {
        Utility.stringCheck(inputString);    
        return inputString;

    }




    public String concatenateStrings(String inputString)throws MistakeOccuredException
    {
        Utility.stringCheck(inputString);
        String replaceString=inputString.replace(" ","");
        return replaceString;
    }



    public String[] splitStrings(String inputString)throws MistakeOccuredException
    {
        Utility.stringCheck(inputString);
        String[] splitString=inputString.split(" ");
        return splitString;
    }
    

    public String mergeWith(String[] inputStrings)throws MistakeOccuredException
    {
        
        Utility.arrayCheck(inputStrings);
        String joinString=String.join("-",inputStrings);
        return joinString;
    
    }
    
    

    public boolean checkTwoStringsEqual(String oneString,String anotherString)throws MistakeOccuredException
    {
        Utility.stringCheck(oneString);
        Utility.stringCheck(anotherString);
        boolean same=oneString.equals(anotherString);
        return same;

    }





    public boolean checkTwoStringsEqualIgnoreCase(String oneString,String anotherString)throws MistakeOccuredException
    {
        Utility.stringCheck(oneString);
        Utility.stringCheck(anotherString);
        boolean same=oneString.equalsIgnoreCase(anotherString);
        return same;

    }





    public String toTrimAString(String inputString)throws MistakeOccuredException
    {
        Utility.stringCheck(inputString);
        String trimedSentence=inputString.trim();
        return trimedSentence;
    }



}
