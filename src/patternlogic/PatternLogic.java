package patternlogic;
import task4.*;
import utility.*;


public class PatternLogic
{

public void printPyramid(int row)
{
      int count=row-1;
       for(int i=0;i<row;i++)
       {
           
            for(int j=0;j<row;j++)
            {
            
                   if(j>=count)
                   {
                   System.out.print("* ");
                   }
                   else
                   {
                   System.out.print(" ");
                   }
            
            }
            
            count--;
           System.out.println("");
       }


}



public void printRightTriangle(int row)
{

        for(int i=1;i<=row;i++)
        {
        
        for(int j=i;j>=1;j--)
        {
              System.out.print("*");    
        }
        
             System.out.println("");
        
        }
    
}

public void printLeftTriangle(int row)
{

       int count=row;
       for(int i=1;i<=row;i++)
       {
            for(int j=1;j<=row;j++)
            {
                  if(j>=count)
                  {
                  System.out.print("*");
                  }       
                  else
                  {
                  System.out.print(" ");
                  }
                  System.out.print(" ");
            }
            
            count--;
            System.out.println("");
       
       }
}


public void printDiamondPattern(int row)
{
      
         int temp=row/2+1;
         int count=temp;
         int count1=0;
            
         for(int i=1;i<=temp;i++)
         {
           
           for(int j=1;j<=temp;j++)
           {
                  if(j>=count)
                  {
                  System.out.print("*");
                  }       
                  else
                  {
                  System.out.print(" ");
                  }
              
           }
           
           for(int j=i-1;j>=1;j--)
           {
                   System.out.print("*"); 
           }
           
           count--;
           System.out.println("");
           
           
         
         }
         
   
         for(int i=temp-1;i>=1;i--)
         {
             
             for(int j=0;j<temp;j++)
             {
                  
                 if(j<=count1)
                 {
                   System.out.print(" ");
                 }
                 else
                 {
                   System.out.print("*");
                 }
             }
         
         
             for(int j=i-1;j>=1;j--)
             {
                 System.out.print("*");
             }
             
             count1++;
             System.out.println("");
         }

}

 

public void printRightPascal(int row)
{

       int temp=row/2+1;
       
       for(int i=1;i<=temp;i++)
       {
           for(int j=i;j>=1;j--)
           {
              System.out.print("* ");
              
           }
           
           System.out.println(""); 
       }
       
       for(int i=temp-1;i>=1;i--)
       {
            for(int j=i;j>=1;j--)
            {
               System.out.print("* ");
            
            }
           
           System.out.println(""); 
       }


}


public void printSandGlass(int row)
{
      int temp=row/2;
      int count=0;
      int count1=temp-1;
      
      for(int i=temp;i>=1;i--)
      {
          for(int j=1;j<=temp;j++)
          {
               if(j<=count)
               {
                  System.out.print(" ");
               }
               else
               {
                  System.out.print("* ");
               }
               
          }
          
          count++;
          System.out.println("");
      }
      
      for(int i=0;i<temp;i++)
      {
         for(int j=0;j<temp;j++)
         {
               if(j>=count1)
               {
                  System.out.print("* ");
               }
               else
               {
                  System.out.print(" ");
               }
         
         }
         
          count1--;
          System.out.println("");
      
      }
      
      
}



public void printTriangle(int row)
{
     int count=row;
     
     for(int i=1;i<=row;i++)
     {
            for(int j=1;j<=row;j++)
            {
                     if(count==j || i==row)
                     {
                        System.out.print("*");
                     }
                     else
                     {
                        System.out.print(" ");
                     }
            }
            
            
            
            
            for(int j=1;j<i;j++)
            {
            
                   if(i-1==j || i==row)
                   {
                   System.out.print("*");
                   }
                   else
                   {
                        System.out.print(" ");
                   }
            }
            
            
            
            
            
            
            count--;
            System.out.println("");
        
     }


}



public void printDiamond(int row)
{
     int count=row;
     int count1=1;
     for(int i=1;i<=row;i++)
     {
            for(int j=1;j<=row;j++)
            {
                     if(count==j)
                     {
                        System.out.print("*");
                     }
                     else
                     {
                        System.out.print(" ");
                     }
            }
            
            
            
            
            for(int j=1;j<i;j++)
            {
            
                   if(i-1==j)
                   {
                   System.out.print("*");
                   }
                   else
                   {
                        System.out.print(" ");
                   }
            }
            
            
            
            
            
            
            count--;
            System.out.println("");
        
     }
     
     
     
     for(int i=1;i<row;i++)
     {
         for(int j=1;j<=row;j++)
         {
                
                if(i+1==j)
                {
                   System.out.print("*");
                }
                else
                {
                   System.out.print(" ");
                }
         
         }
         
         for(int j=row-2;j>=1;j--)
         {
               if(j==count1)
               {
               System.out.print("*");
               }
               else
               {
                   System.out.print(" ");
               }
         
         }
         
           count1++;
 
           System.out.println("");
         
     }


}





public void simpleNumber(int row)
{

    for(int i=1;i<=row;i++)
    {
        for(int j=1;j<=i;j++)
        {
             System.out.print(j);
             System.out.print(" ");
        }
        
        System.out.println("");
    
    }
    

}



public void pascalTriangle(int row)
{
     int array[][]=new int[row][row];

    for(int i=0;i<row;i++)
    {
    
          for(int j=row-i;j>1;j--)
          {
                 System.out.print(" ");
          } 
          
          for(int k=0;k<=i;k++)
          {
          
                if(k==0 || k==i)
                {
                      array[i][k]=1;  
                }
                else
                {
                      array[i][k]=array[i-1][k-1]+array[i-1][k];
                }
                 
                System.out.print(array[i][k]+" ");
          }
          
          
          System.out.println("");
    
    
    }



}



public void numberDiamond(int row)
{

        int temp=row/2+1;
     
        
        for(int i=1;i<=temp;i++)
        {
        
                for(int k=temp-i;k>=1;k--)
                {
                       System.out.print(" ");
                }
        
                for(int j=i;j>=1;j--)
                {
                      System.out.print(j);
                }
                
                for(int m=1;m<i;m++)
                {
                
                      System.out.print(m+1);
                } 
                 
                 
                System.out.println("");
        }
        
        
        int count1=temp-1;
        for(int i=temp-1;i>=1;i--)
        {
        
              for(int k=temp-i;k>=1;k--)
              {
                  System.out.print(" ");
              }
        
              for(int j=i;j>=1;j--)
              {
                  System.out.print(j);                      
              }
              
              for(int m=2;m<=temp;m++)
              {
              
                       if(count1>=m)
                       {
                       System.out.print(m);
                       }
                       else
                       {
                       System.out.print(" ");
                       }
              }
               
               
               count1--;
               
               System.out.println(""); 
        
        }
       

}



public void printZ(int row)
{
     
     
     for(int i=1;i<=row;i++)
     {
         for(int j=1;j<=row;j++)
         {
         
               if(i==1 || i==row || j==row+1-i)
               {
                 System.out.print("*");
               }
               else
               {
                System.out.print(" ");
               }
         
         
         }
         
         System.out.println("");
     
     }


}



public void printXO(int row,int col)
{

     char array[][]=new char[row][col];
     
     
     int rowStart=0;
     int colStart=0;
     int rowEnd=row-1;
     int colEnd=col-1;
      char value=' ';
     while(rowStart<=rowEnd || colStart<=colEnd)
     {
     
     
                 if(rowStart%2==0)
                 {
                      value='X';
                 
                 }  
                 else
                 {
                     value='O';
                 }
                 
       
                  for(int j=colStart;j<=colEnd;j++)
                  {
                        
                         array[rowStart][j]=value;
                  } 
                  
                  rowStart++;
                  
                  for(int i=rowStart;i<=rowEnd;i++)
                  {
                         array[i][colEnd]=value;
                  
                  }
                  colEnd--;
            
                  for(int j=colEnd;j>=colStart;j--)
                  {
                          array[rowEnd][j]=value;
                  }
                  
                  rowEnd--;
                  
                  for(int i=rowEnd;i>=rowStart;i--)
                  {
                         array[i][colStart]=value;
                  }
                  colStart++;
     }
     
     
     for(int i=0;i<row;i++)
     {
         for(int j=0;j<col;j++)
         {
         
           System.out.print(array[i][j]+" ");
         }
          System.out.println("");
     }

     
}




public void printSpiral(int size)
{

      int n=size+(size-1);
      int array[][]=new int[n][n];
      
      int rowStart=0;
      int colStart=0;
      int rowEnd=n-1;
      int colEnd=n-1;
      
      
      while(rowStart<=rowEnd || colStart<=colEnd)
      {
      
            
           for(int i=colStart;i<=colEnd;i++)
           {
                array[rowStart][i]=size;
           }
           
           rowStart++;
           
           for(int j=rowStart;j<=rowEnd;j++)
           {
                array[j][colEnd]=size;
           }
           
           colEnd--;
           
           for(int i=colEnd;i>=colStart;i--)
           {
               array[rowEnd][i]=size;
           }
           
           rowEnd--;
           
           for(int i=rowEnd;i>=rowStart;i--)
           {
               array[i][colStart]=size;
           }
           colStart++;
           size--;
      
      }
      
      
      for(int i=0;i<n;i++)
      {
          for(int j=0;j<n;j++)
          {
            System.out.print(array[i][j]+" ");
          }
          
            System.out.println("");
      }
      
      
      

}




public void spiralNumber(int row)
{
       int array[][]=new int[row][row];
       int rowStart=0;
       int rowEnd=row-1;
       int colStart=0;
       int colEnd=row-1;
       int value=1;
       
       while(rowStart<=rowEnd || colStart<=colEnd)
       {
           for(int i=colStart;i<=colEnd;i++)
           {
                array[rowStart][i]=value;
                  value++;
           }
           
           rowStart++;
         
           
           for(int j=rowStart;j<=rowEnd;j++)
           {
                array[j][colEnd]=value;
                value++;
           }
           
           colEnd--;

           
           for(int i=colEnd;i>=colStart;i--)
           {
               array[rowEnd][i]=value;
               value++;
           }
           
           rowEnd--;
        
           
           for(int i=rowEnd;i>=rowStart;i--)
           {
               array[i][colStart]=value;
               value++;
               
           }
           colStart++;
       }
       
      for(int i=0;i<row;i++)
      {
          for(int j=0;j<row;j++)
          {
            System.out.print(array[i][j]+" ");
          }
          
            System.out.println("");
      }
      


}



public void getOutput(String inputString)throws CustomException
{
     Utility.stringCheck(inputString);
     int length=inputString.length();  
     if(length%2==0)
     {
         throw new CustomException("Enter odd length String only...!");
     }
     
     int size=length/2+1;
     int sum=length-1;
     
     
     
     for(int i=0;i<size;i++)
     {
          System.out.print(inputString.charAt(i));
          
          if(sum!=size-1)
          {
          System.out.print(inputString.charAt(sum));
          }
          sum--;
          
          System.out.println("");
     }
     
     for(int i=size-2;i>=0;i--)
     {
              System.out.print(inputString.charAt(i));
                         
              System.out.print(inputString.charAt(size));
              size++;     
              System.out.println("");       
     }

}



public void getSequence(int n)
 {
		String resul="1";
        System.out.print(resul);
    
        for(int i=1;i<n;i++)
        {
            String next1="";
            int k=0;
            System.out.print(",");
        while(k<resul.length())
        {
            int no=1;
            while(k<resul.length()-1 && resul.charAt(k)==resul.charAt(k+1) )
            {
                no++;
                k++;
            }
                
                next1=next1+Integer.toString(no)+resul.charAt(k);
                k++;
                
        }
            System.out.print(next1);
            resul=next1;
        }
        
		
	

}


}
