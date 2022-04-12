package string3logic;
import task4.CustomException;
import utility.*;
import java.util.*;
import java.lang.*;

public class StringThreeLogic
{





public boolean checkRotation(String firstString,String secondString)throws CustomException
{
          Utility.stringCheck(firstString);
          Utility.stringCheck(secondString);
          
          char letter=firstString.charAt(0);
          int position=secondString.indexOf(letter);
          String firstHalf=secondString.substring(position);
          String secondHalf=secondString.substring(0,position);
          String newString=firstHalf+secondHalf;
          
          if(firstString.equals(newString))
          {
                return true;
          }
          
          return false;

}


private boolean findCommon(String arrayString[],String word)throws CustomException
{
          Utility.arrayCheck(arrayString);
          Utility.stringCheck(word);
          int count=0;
          int length=arrayString.length;
          
          for(int i=0;i<length;i++)
          {
               if(arrayString[i].contains(word))
               { 
               count++;
               }
          
          }
          
          if(count==length)
          {
                return true;          
          }
          
          return false;

}




public String togetCommonFragments(String arrayString[])throws CustomException
{

       Utility.arrayCheck(arrayString);
        int count=0;
       String dummy="";
       ArrayList<String> actualList=new ArrayList<>();
       int length=arrayString.length;
       String temp=arrayString[0];
       
       for(int i=1;i<length;i++)
       {
       
           String newString=arrayString[i];
        
           int length1=newString.length();
           
               for(int j=0;j<length1;j++)
               {
               
                      char letter=newString.charAt(j);
               
                   if(letter==' ')
                   {
                          
                          if(findCommon(arrayString,dummy))
                          {
                               actualList.add(dummy);
                               count++;
                          }
                          else
                          {
                               actualList.clear();
                               dummy="";
                          }
                             
                   }
                   
                  if(count==3)
                  {
                       return actualList.get(actualList.size()-1);
                  }
                   
                   dummy+=letter;
                   
                   
                   
               
               }
           
           
                  
       }
        
        return null;

}


public String toPrintNotMatchPair(String firstString,String secondString)throws CustomException
{
         Utility.stringCheck(firstString);
         Utility.stringCheck(secondString);
         
         int length1=firstString.length();
         int length2=secondString.length();
         String temp1="";
         String temp2="";
         String result="";
  
         if(length1==length2)
         {
                 for(int i=0;i<length1;i++)
                 {

                     while(i<length1  && firstString.charAt(i)!=secondString.charAt(i)) 
                     {
                     
                       char letter1=firstString.charAt(i);
                       char letter2=secondString.charAt(i);
                      
                             temp1+=letter1;
                             temp2+=letter2;
                               i++;                               
                      }
                      
                     
                      if(temp1!="" && temp2!="")
                      {
                      result+=temp1+","+temp2+"\n";
                      }  
                   
                      
                      if(i<length1 &&  firstString.charAt(i)==secondString.charAt(i))
                      {
                           temp1="";
                           temp2="";
                      }
                     
                  
                            
                      
                 }     
                 
               
         
         }
             return result; 

}


public String getUniqueCharacter(String inputString)throws CustomException
{

           Utility.stringCheck(inputString);
           
           int length=inputString.length();
           String output="";
           for(int i=0;i<length;i++)
           {
                 char letter=inputString.charAt(i);
                 int firstPosition=inputString.indexOf(letter);
                 int lastPosition=inputString.lastIndexOf(letter);
                 if(lastPosition-firstPosition==0)
                 {
                      output+=letter;
                 }
                 
           }
           
           if(output=="")
           {
           
                 return "no matching character";           
           }
           
           
           return String.valueOf(output.charAt(0));
           
}


public String toEncodeString(String inputString)throws CustomException
{

         Utility.stringCheck(inputString);
         
         
         
         if( inputString.contains("(") && inputString.contains(")"))
         {
         
                 int firstPosition=inputString.lastIndexOf('(');
                 int lastPosition=inputString.indexOf(')',firstPosition);
                 String temp="";
                 String numberStore="";
                               
                 String newString=inputString.substring(firstPosition+1,lastPosition);
                 
                       int k=firstPosition-1;
                       while(k>=0 && Character.isDigit(inputString.charAt(k)))
                       {
                        String count=String.valueOf(inputString.charAt(k));
                        numberStore=count+numberStore;
                        k--;
                       }
                       
                       int numberLength=numberStore.length();
                       
                           if(numberStore=="")
                           {
                                temp+=newString;
                           }
                           
                           else
                           {
                             
                           int count=Integer.parseInt(numberStore); 
                           for(int i=0;i<count;i++)
                           {
                            temp+=newString;
                           }
                              
                           }
                  
                           temp=inputString.substring(0,firstPosition-numberLength)+temp+inputString.substring(lastPosition+1);         
                           return toEncodeString(temp);
         
         }
         
         String output="";
         String numberStore="";
         
         int length=inputString.length();
         
         for(int i=0;i<length;i++)
         {
         
                  char element=inputString.charAt(i);
                  
                  if(Character.isDigit(element))    
                  {
                     numberStore+=element;                  
                  }
                  
                  
                  
                  else
                  {
                  
                  
                           if(numberStore=="")
                           {
                                output+=element;  
                           }  
                           else
                           { 
                           int number=Integer.parseInt(numberStore);
                           for(int j=0;j<number;j++)
                           {
                                  output+=element;                          
                           }
                           
                           numberStore="";
                           }
                  }    
         }
         
         
         return output;


}

public String removePalindrome(String inputString)throws CustomException
{      
      Utility.stringCheck(inputString);
      inputString+=" ";
      int length=inputString.length();
      String output="";
      String temp="";
      
      for(int i=0;i<length;i++)
      {
            char letter=inputString.charAt(i);
            
            if(letter==' ')
            {
                
                  if(!isPalindrome(temp))
                  {   
                  temp+=letter;
                  output+=temp;
                  temp="";
                  }
                  else
                  {
                      temp="";
                  }
                  
            }
            else
            {
            temp+=letter;
            }
            
            
      
      }
      
      
      return output;

}


private boolean isPalindrome(String inputString)throws CustomException
{
       Utility.stringCheck(inputString);
       String output="";
       
       int length=inputString.length();
       
       for(int i=length-1;i>=0;i--)
       {
           output+=inputString.charAt(i);
       }      
       
   
       
       if(output.equals(inputString))
       {
            return true;      
       }
       
            return false;
            
}


public boolean checkMagicString(String firstString,String secondString)throws CustomException
{
     Utility.stringCheck(firstString);
     Utility.stringCheck(secondString);
     
     String dummy="abcdefghijklmnopqrstuvwxyz";
     int length1=firstString.length();
     int length2=firstString.length();
     String temp="";
     
     if(length1!=length2)
     {
         return false;
     }
     
     for(int i=0;i<length1;i++)
     {
         
          temp+=dummy.charAt(25-(firstString.charAt(i)-'a'));
          
     }
     
     if(temp.equals(secondString))
     {
          return true;    
     }
     
          return false;


}



public String toConvertNumtoWords(int number)
{
    Map<Integer,String> numberMap=new HashMap<>();
    
    numberMap.put(0,"");
    numberMap.put(1,"one");
    numberMap.put(2,"two");
    numberMap.put(3,"three");
    numberMap.put(4,"four");
    numberMap.put(5,"five");
    numberMap.put(6,"six");
    numberMap.put(7,"seven");
    numberMap.put(8,"eight");
    numberMap.put(9,"nine");
    numberMap.put(10,"ten");
    numberMap.put(11,"eleven");
    numberMap.put(12,"twelve");
    numberMap.put(13,"thirteen");
    numberMap.put(14,"forteen");
    numberMap.put(15,"fifteen");
    numberMap.put(16,"sixteen");
    numberMap.put(17,"seventeen");
    numberMap.put(18,"eighteen");
    numberMap.put(19,"nineteen");
    numberMap.put(20,"twenty");
    numberMap.put(30,"thirty");
    numberMap.put(40,"forty");
    numberMap.put(50,"fifty");
    numberMap.put(60,"sixty");
    numberMap.put(70,"seventy");
    numberMap.put(80,"eighty");
    numberMap.put(90,"ninety");
    numberMap.put(100,"hundred");
  
    
    if(number<=20)
    {
    
          return numberMap.get(number);
    }
       
    if(number<=100)
    {
    
          int quotient=number/10;  
          int remainder=number%10;
          return numberMap.get(quotient*10)+" "+numberMap.get(remainder);
    }  
    
    if(number<1000)
    {
    
         
    
         int quotient=number/100;
         int remainder=number%100;
         
         if(remainder==0)
         {
             return numberMap.get(quotient)+" hundred";
         }
              
              int rem_quotient=remainder/10;
              int rem_rem=remainder%10;
              
              
              
          return numberMap.get(quotient)+" hundred and "+numberMap.get(rem_quotient*10)+" "+numberMap.get(rem_rem);     
    }
    
    
    if(number<10000)
    {
        int quotient=number/1000;
        int remainder=number%1000;
        
        if(remainder==0)
        {
             return numberMap.get(quotient)+" thousand";
        }
        
               int rem_quotient=remainder/100;
               int rem_rem=remainder%100;
               
               
                   if(rem_rem==0)
                   {
                         return numberMap.get(quotient)+" thousand "+numberMap.get(rem_quotient)+" hundred";
                   }
                  
              
                        int rem_quo_quo=rem_rem/10;
                        int rem_rem_rem=rem_rem%10;
                        
                                if(rem_quotient==0)
                                {
                                    return numberMap.get(quotient)+" thousand "+numberMap.get(rem_quo_quo*10)+" "+numberMap.get(rem_rem_rem); 
                                }      
                            
                  
           return numberMap.get(quotient)+" thousand "+numberMap.get(rem_quotient)+" hundred and "+numberMap.get(rem_quo_quo*10)+" "+numberMap.get(rem_rem_rem);       
    }
    
    return "below 10000 only";
    
}



public String toCheckBalance(String inputString)throws CustomException
{
      Utility.stringCheck(inputString);
      
      int length=inputString.length();
      
      for(int i=1;i<=length-2;i++)
      {
          
          char letter=inputString.charAt(i);
          
          String firstHalf=inputString.substring(0,i);
          String secondHalf=inputString.substring(i+1);
          
          int firstHalfLength=firstHalf.length();
          int secondHalfLength=secondHalf.length();
          int sum1=0;
          int sum2=0;
          
                int k=firstHalfLength;
                
                while(k>0)
                {
                  sum1+=k*(firstHalf.charAt(firstHalfLength-k)-'A'+1);
                  k--;
                }
                
                int j=0;
                
                while(j<secondHalfLength)
                {
                  sum2+=(j+1)*(secondHalf.charAt(j)-'A'+1);
                  j++;
                }          
              
              
                if(sum1==sum2)
                {
                   return "Balanaced word is "+letter+" and position is "+(i+1);
                }          
      
      }
 
      return "not balanced";
}

private void toPrintDicOrder(String actualString,String temp,List<String> actualList)throws CustomException
{
                
                int length=actualString.length();
                
                if(temp!="" || length==0)
                {
                       actualList.add(temp);
                }
                
                for(int i=0;i<length;i++)
                {
                     char letter=actualString.charAt(i);
                     
                     toPrintDicOrder(actualString.substring(0,i)+actualString.substring(i+1),temp+letter,actualList);
                }

}


public List<String> printDictionaryOrder(String inputString)throws CustomException
{
          Utility.stringCheck(inputString);
          List<String> actualList=new ArrayList<>();
          toPrintDicOrder(inputString,"",actualList);  
          Collections.sort(actualList);       
          return actualList;       
}


}
