package logic;
import java.util.*;

public class ArrayLogic
{


public int[] rotateClockWise(int numbers[],int size)
{
          int output[]=new int[size];
          
          output[0]=numbers[size-1];
          
          for(int i=0;i<size-1;i++)
          {
                 output[i+1] =numbers[i]; 
          }
          
          return output;
      
}


public Map getCounts(int numbers[],int size)
{
     Map<Integer,Integer> outputMap=new HashMap<>();
     
     for(int i=0;i<size;i++)
     {
            Integer count=outputMap.get(numbers[i]);
            
            if(count==null)
            {
                 count=0;
            }
            
            count++;
            outputMap.put(numbers[i],count);
     
     }

       return outputMap;

}


public void getMinimum(int numbers[],int size)
{
      Arrays.sort(numbers);
      int minimum=Integer.MAX_VALUE;
      
      int value1=0;
      int value2=0;
      
      for(int i=0;i<size-1;i++)
      {
             int temp=Math.abs(numbers[i]-numbers[i+1]);
             
             if(minimum>temp)
             {
                          value1=numbers[i];
                          value2=numbers[i+1];
                          minimum=temp;                         
             }     
      }
      
      
      System.out.println("The pair with minimum difference is:"+value1+","+value2);     

}




}
