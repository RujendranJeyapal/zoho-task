package arraylist;
import task3.ArrayListLogic;
import java.util.*;
public class ArrayListRunner
{
public static void main(String[] args)
{
ArrayListLogic objectForLogicLayer=new ArrayListLogic();
Scanner input=new Scanner(System.in);
System.out.println("Enter the question number");
int questionNo=0;
    try
    {
    questionNo=input.nextInt();
    input.nextLine();
    }
    catch(Exception error)
    {
    System.out.println("Please Enter a Question Number...!");
    }

switch(questionNo)
{
case 1:
    try
    {
    List emptyList=objectForLogicLayer.createList();
    System.out.println("size is:"+objectForLogicLayer.sizeOfList(emptyList));
    }
    catch(Exception error)
    {
    System.out.println(error.getMessage());
    }
    break;
    
case 2:
    try
    {
    System.out.println("Howmany Strings you want...?");
    int count2=input.nextInt();
    input.nextLine();
    try
    {
    
    String arrayString[]=new String[count2];
    for(int i=0;i<count2;i++)
    {
    arrayString[i]=input.nextLine();
    }  
    List newList2=objectForLogicLayer.createList();  
    objectForLogicLayer.addObjects(newList2,arrayString);
    System.out.println(newList2);
    System.out.println("size is:"+objectForLogicLayer.sizeOfList(newList2));
    }
    catch(Exception error)
    {
    System.out.println(error.getMessage());
    }
    }
    catch(Exception ex)
    {
    System.out.println("Please Enter a number...!");
    }
    break;
    
case 3:
    try
    {
    System.out.println("Howmany Integers you want...?");
    int count3=input.nextInt();
    input.nextLine();  
    Integer arrayInt[]=new Integer[count3]; 
    for(int i=0;i<count3;i++)
    { 
    arrayInt[i]=input.nextInt();
    }
    try
    {
    List newList3=objectForLogicLayer.createList();
    objectForLogicLayer.addObjects(newList3,arrayInt);
    System.out.println(newList3);
    System.out.println("Size is:"+objectForLogicLayer.sizeOfList(newList3));
    }
    catch(Exception error)
    {
    System.out.println(error.getMessage());
    }
    }
    catch(Exception ex)
    {
    System.out.println("Please Enter a number...!");
    }
    break;  
    
case 4:
   try
   {
    System.out.println("Howmany Objects you want...?");
    int count4=input.nextInt();
    input.nextLine();
    Object arrayObject[]=new Object[count4];
    for(int i=0;i<count4;i++)
    {
    ArrayListLogic customObject=new ArrayListLogic();
    arrayObject[i]=customObject;
    }
    try
    {
    List newList4=objectForLogicLayer.createList();
    objectForLogicLayer.addObjects(newList4,arrayObject);
    System.out.println(newList4);
    System.out.println("size is:"+objectForLogicLayer.sizeOfList(newList4));
    }
    catch(Exception error)
    {
    System.out.println(error.getMessage());
    }
    }
    catch(Exception ex)
    {
    System.out.println("Please Enter a number...!");
    }
    
    break;  


case 5:
  
   
  try
  { 
  
   
   System.out.println("Howmany Integers you want...?");
   int count5=input.nextInt();
   input.nextLine();
   System.out.println("Enter the Integer Values");
  Integer intArray[]=new Integer[count5];
   for(int i=0;i<count5;i++)
   {
   intArray[i]=input.nextInt();
   input.nextLine();
   }    
   System.out.println("Howmany Strings you want...?");
   int count_5=input.nextInt();
   input.nextLine();
   System.out.println("Enter the String Values");
    String stringArray[]=new String[count_5];
   for(int i=0;i<count_5;i++)
   {
   stringArray[i]=input.nextLine();
   }
   System.out.println("Howmany Objects you want...?");
   int count__5=input.nextInt();
   Object objectArray[]=new Object[count__5];
   for(int i=0;i<count__5;i++)
   {
   ArrayListLogic customObject1=new ArrayListLogic();
   objectArray[i]=customObject1;
   }
   
   try
   {
   List newList5=objectForLogicLayer.createList();
   objectForLogicLayer.addObjects(newList5,intArray);
   objectForLogicLayer.addObjects(newList5,stringArray);
   objectForLogicLayer.addObjects(newList5,objectArray);   
   System.out.println(newList5);
   System.out.println("size is:"+objectForLogicLayer.sizeOfList(newList5));
   }
   catch(Exception error)
   {

   System.out.println(error.getMessage());
   }
   }
   catch(Exception ex)
   {

   System.out.println("Please Enter a number...!");
   } 
   break;
   
   
case 6:
   try
   {
   System.out.println("Howmany Strings you want...?");
   int count6=input.nextInt();
   input.nextLine();
   System.out.println("Enter the Strings");
   String arrayString6[]=new String[count6];
   for(int i=0;i<count6;i++)
   {
   arrayString6[i]=input.nextLine();
   }
   System.out.println("Enter the String to find index");
   String inputString=input.nextLine(); 
   try
   {
   List newList6=objectForLogicLayer.createList();
   objectForLogicLayer.addObjects(newList6,arrayString6);
   System.out.println("Index is:"+objectForLogicLayer.findIndex(newList6,inputString));
   System.out.println(newList6);
   System.out.println("Size is"+objectForLogicLayer.sizeOfList(newList6));  
   }  
   catch(Exception error)
   {

   System.out.println(error.getMessage());
   }
   }
   catch(Exception ex)
   {

   System.out.println("Please Enter a number...!");
   } 
   break;
   
   
case 7:
   try
   {
   System.out.println("Howmany Strings you want...?");
   int count7=input.nextInt();
   input.nextLine();
   System.out.println("Enter the Strings");
   String arrayString7[]=new String[count7];
   for(int i=0;i<count7;i++)
   {
   arrayString7[i]=input.nextLine();
   }  
   try
   {    
   List newList7=objectForLogicLayer.createList();
   objectForLogicLayer.addObjects(newList7,arrayString7);
   System.out.println(newList7);
   Iterator iterateList=newList7.iterator();
   for(int i=0;iterateList.hasNext();i++)
   {
   System.out.println(iterateList.next());
   }
   }
   catch(Exception error)
   {

   System.out.println(error.getMessage());
   }
   }
   catch(Exception ex)
   {

   System.out.println("Please Enter a number...!");
   } 
   break;
   
   
case 8:
   try
   {
   System.out.println("Howmany Strings you want...?");
   int count8=input.nextInt();
   input.nextLine();
   System.out.println("Enter the Strings");
   String arrayString8[]=new String[count8];
   for(int i=0;i<count8;i++)
   {
   arrayString8[i]=input.nextLine();
   }   
   try
   {
   List newList8=objectForLogicLayer.createList();
   objectForLogicLayer.addObjects(newList8,arrayString8);
   System.out.println(newList8);
   System.out.println("Size is:"+objectForLogicLayer.sizeOfList(newList8)); 
   System.out.println("Enter the position you want");
   int position=input.nextInt();
   input.nextLine();
   System.out.println(objectForLogicLayer.stringOfPosition(newList8,position-1));
   
   }
   catch(Exception error)
   {

   System.out.println(error.getMessage());
   }
   }
   catch(Exception ex)
   {

   System.out.println("Please Enter a number...!");
   } 
   break;
   
   
case 9:
   try
   {
   System.out.println("Howmany Strings you want...?");
   int count9=input.nextInt();
   input.nextLine();
   System.out.println("Enter the Strings");
   String arrayString9[]=new String[count9];
   for(int i=0;i<count9;i++)
   {
   arrayString9[i]=input.nextLine();
   }
   try
   {      
   List newList9=objectForLogicLayer.createList();
   objectForLogicLayer.addObjects(newList9,arrayString9);
   System.out.println(newList9);
   System.out.println("Enter the Duplicate String within the List");
   String duplicateString=input.nextLine();
   System.out.println("First Index is:"+objectForLogicLayer.findIndex(newList9,duplicateString));
   System.out.println("Last Index is:"+objectForLogicLayer.findLastIndex(newList9,duplicateString));
   }
   catch(Exception error)
   {

   System.out.println(error.getMessage());
   }
   }
   catch(Exception ex)
   {

   System.out.println("Please Enter a number...!");
   } 
   break;
   
   
case 10:
   try
   {
   System.out.println("Howmany Strings you want...?");
   int count10=input.nextInt();
   input.nextLine();
   System.out.println("Enter the Strings");
   String arrayString10[]=new String[count10];
   for(int i=0;i<count10;i++)
   {
   arrayString10[i]=input.nextLine();
   }   
   
   System.out.println("Enter the String to insert");
   String insertString=input.nextLine();
   System.out.println("Enter the position to insert");
   int position10=input.nextInt();
   input.nextLine();
   try
   {
   List newList10=objectForLogicLayer.createList();
   objectForLogicLayer.addObjects(newList10,arrayString10);
   System.out.println(newList10);
   System.out.println("Before insert:"+objectForLogicLayer.sizeOfList(newList10));
   objectForLogicLayer.insertList(newList10,position10-1,insertString);
   System.out.println(newList10);
   System.out.println("After insert:"+objectForLogicLayer.sizeOfList(newList10));
   }
   catch(Exception error)
   {

   System.out.println(error.getMessage());
   }
   }
   catch(Exception ex)
   {

   System.out.println("Please Enter a number...!");
   } 
   break;
   
   
case 11:
   try
   {
   System.out.println("Howmany Strings you want...?");
   int count11=input.nextInt();
   input.nextLine();
   System.out.println("Enter the Strings");
   String arrayString11[]=new String[count11];
   for(int i=0;i<count11;i++)
   {
   arrayString11[i]=input.nextLine();
   }   
   try
   {
   List newList11=objectForLogicLayer.createList();
   objectForLogicLayer.addObjects(newList11,arrayString11);
   System.out.println(newList11);
   System.out.println("Enter the starting position");
   int startPosition=input.nextInt();
   System.out.println("Enter the ending position");
   int endPosition=input.nextInt();
   List storeList=objectForLogicLayer.createListFromList(newList11,startPosition-1,endPosition);
   System.out.println("After:"+storeList);
   }
   catch(Exception error)
   {

   System.out.println(error.getMessage());
   }
   }
   catch(Exception ex)
   {

   System.out.println("Please Enter a number...!");
   } 
   break;
   

case 12: 
   try
   {
   System.out.println("Howmany Strings want for firstlist");
   int count12=input.nextInt();
   System.out.println("Howmany Strings want for secondlist");
   int count_12=input.nextInt();
   input.nextLine();
   System.out.println("Enter the Strings for first list");
   String arrayString12[]=new String[count12];
   for(int i=0;i<count12;i++)
   {
   arrayString12[i]=input.nextLine();
   }     
   System.out.println("Enter the Strings for second list");
   String arrayString_12[]=new String[count_12];
   for(int i=0;i<count_12;i++)
   {
   arrayString_12[i]=input.nextLine();
   }      
   try
   {
   List newList12=objectForLogicLayer.createList(); 
   List newList_12=objectForLogicLayer.createList();
   objectForLogicLayer.addObjects(newList12,arrayString12);
   objectForLogicLayer.addObjects(newList_12,arrayString_12);
   objectForLogicLayer.addTwoLists(newList_12,newList12);
   System.out.println("Third list is:"+newList12);
   System.out.println("Third list size:"+objectForLogicLayer.sizeOfList(newList12));
   }
   catch(Exception error)
   {

   System.out.println(error.getMessage());
   }
   }
   catch(Exception ex)
   {

   System.out.println("Please Enter a number...!");
   } 
   break;
   

case 13:
   try
   {
   System.out.println("Howmany Strings want for firstlist");
   int count13=input.nextInt();
   System.out.println("Howmany Strings want for secondlist");
   int count_13=input.nextInt();
   input.nextLine();
   System.out.println("Enter the Strings for first list");
   String arrayString13[]=new String[count13];
   for(int i=0;i<count13;i++)
   {
   arrayString13[i]=input.nextLine();
   }     
   System.out.println("Enter the Strings for second list");
   String arrayString_13[]=new String[count_13];
   for(int i=0;i<count_13;i++)
   {
   arrayString_13[i]=input.nextLine();
   }      
   try
   {
   List newList13=objectForLogicLayer.createList(); 
   List newList_13=objectForLogicLayer.createList();  
   objectForLogicLayer.addObjects(newList13,arrayString13);
   objectForLogicLayer.addObjects(newList_13,arrayString_13);
   objectForLogicLayer.addTwoLists(newList13,newList_13);
   System.out.println(newList_13);
   System.out.println("size:"+objectForLogicLayer.sizeOfList(newList_13));
   }
   catch(Exception error)
   {

   System.out.println(error.getMessage());
   }
   }
   catch(Exception ex)
   {

   System.out.println("Please Enter a number...!");
   } 
   break; 
   
   
case 14:
   try
   {
   System.out.println("Howmany Decimals you want");
   int count14=input.nextInt();
   System.out.println("Enter the Decimal values");
   Float floatArray[]=new Float[count14];
   for(int i=0;i<count14;i++)
   {
   floatArray[i]=input.nextFloat();
   }  
   try
   {
   List newList14=objectForLogicLayer.createList();
   objectForLogicLayer.addObjects(newList14,floatArray);
   System.out.println(newList14);  
   System.out.println("size:"+objectForLogicLayer.sizeOfList(newList14));
   System.out.println("Enter the Float for remove");
   float removeFloat=input.nextFloat();  
   objectForLogicLayer.removeFloat(newList14,removeFloat);
   System.out.println(newList14);  
   System.out.println("After size:"+objectForLogicLayer.sizeOfList(newList14));
   }
   catch(Exception error)
   {

   System.out.println(error.getMessage());
   }
   }
   catch(Exception ex)
   {

   System.out.println("Please Enter a number...!");
   } 
   break; 


case 15: 
   try
   {
   System.out.println("Howmany Decimals you want");
   int count15=input.nextInt();
   System.out.println("Enter the Decimal values");
   Float floatArray1[]=new Float[count15];
   for(int i=0;i<count15;i++)
   {
   floatArray1[i]=input.nextFloat();
   }  
   try
   {
   List newList15=objectForLogicLayer.createList();
   objectForLogicLayer.addObjects(newList15,floatArray1);
   System.out.println(newList15);  
   System.out.println("size:"+objectForLogicLayer.sizeOfList(newList15));
   System.out.println("Enter the position to remove");
   int removePosition=input.nextInt();  
   objectForLogicLayer.removePosition(newList15,removePosition-1);
   System.out.println(newList15);  
   System.out.println("After size:"+objectForLogicLayer.sizeOfList(newList15));
   }
   catch(Exception error)
   {

   System.out.println(error.getMessage());
   }
   }
   catch(Exception ex)
   {

   System.out.println("Please Enter a number...!");
   } 
   break;  
   
case 17:
   try
   {
   System.out.println("Howmany Strings want for firstlist");
   int count17=input.nextInt();
   System.out.println("Howmany Strings want for secondlist");
   int count_17=input.nextInt();
   input.nextLine();
   System.out.println("Enter the Strings for first list");
   String arrayString17[]=new String[count17];
   for(int i=0;i<count17;i++)
   {
   arrayString17[i]=input.nextLine();
   }     
   System.out.println("Enter the Strings for second list");
   String arrayString_17[]=new String[count_17];
   for(int i=0;i<count_17;i++)
   {
   arrayString_17[i]=input.nextLine();
   }
   try
   {
   List newList17=objectForLogicLayer.createList(); 
   List newList_17=objectForLogicLayer.createList(); 
   objectForLogicLayer.addObjects(newList17,arrayString17);
   System.out.println("First list is:"+newList17);
   objectForLogicLayer.addObjects(newList17,arrayString_17);
   System.out.println("Second list is:"+newList_17);
   objectForLogicLayer.removeSameElement(newList17,newList_17);
   System.out.println("New list is:"+newList17);
   System.out.println("size:"+objectForLogicLayer.sizeOfList(newList17));
   }
   catch(Exception error)
   {

   System.out.println(error.getMessage());
   }
   }
   catch(Exception ex)
   {

   System.out.println("Please Enter a number...!");
   } 
   break;
   
case 18:     
   try
   {
   System.out.println("Howmany Strings want for firstlist");
   int count18=input.nextInt();
   System.out.println("Howmany Strings want for secondlist");
   int count_18=input.nextInt();
   input.nextLine();
   System.out.println("Enter the Strings for first list");
   String arrayString18[]=new String[count18];
   for(int i=0;i<count18;i++)
   {
   arrayString18[i]=input.nextLine();
   }     
   System.out.println("Enter the Strings for second list");
   String arrayString_18[]=new String[count_18];
   for(int i=0;i<count_18;i++)
   {
   arrayString_18[i]=input.nextLine();
   }
   try
   {
   List newList18=objectForLogicLayer.createList(); 
   List newList_18=objectForLogicLayer.createList(); 
   objectForLogicLayer.addObjects(newList18,arrayString18);
   System.out.println("First list is:"+newList18);
   objectForLogicLayer.addObjects(newList_18,arrayString_18);
   System.out.println("Second list is:"+newList_18);
   objectForLogicLayer.removeUnSameElement(newList18,newList_18);
   System.out.println("New list is:"+newList18);
   System.out.println("size:"+objectForLogicLayer.sizeOfList(newList18));
   }
   catch(Exception error)
   {

   System.out.println(error.getMessage());
   }
   }
   catch(Exception ex)
   {

   System.out.println("Please Enter a number...!");
   } 
   break;
 
case 19:
   try
   {
   System.out.println("Howmany long values you want");
   int count19=input.nextInt();
   System.out.println("Enter the long values");
   Long longArray[]=new Long[count19];
   for(int i=0;i<count19;i++)
   {
   longArray[i]=input.nextLong();
   }    
   try
   {
   List newList19=objectForLogicLayer.createList();
   objectForLogicLayer.addObjects(newList19,longArray);
   System.out.println("Before clear:"+newList19);
   System.out.println("size:"+objectForLogicLayer.sizeOfList(newList19));
   objectForLogicLayer.removeList(newList19);
   System.out.println("After clear:"+newList19);
   System.out.println("size:"+objectForLogicLayer.sizeOfList(newList19));
   }
   catch(Exception error)
   {

   System.out.println(error.getMessage());
   }
   }
   catch(Exception ex)
   {

   System.out.println("Please Enter a number...!");
   } 
   break;
   
case 20: 
   try
   {
   System.out.println("Howmany Strings you want...?");
   int count20=input.nextInt();
   input.nextLine();
   System.out.println("Enter the Strings");
   String arrayString20[]=new String[count20];
   for(int i=0;i<count20;i++)
   {
   arrayString20[i]=input.nextLine();
   }
   try
   { 
   List newList20=objectForLogicLayer.createList();
   objectForLogicLayer.addObjects(newList20,arrayString20); 
   System.out.println(newList20);
   System.out.println("size:"+objectForLogicLayer.sizeOfList(newList20));
   System.out.println("Enter the String to find");
   String checkingString=input.nextLine();  
   System.out.println(objectForLogicLayer.checkStringInList(newList20,checkingString));
   }
   catch(Exception error)
   {

   System.out.println(error.getMessage());
   }
   }
   catch(Exception ex)
   {

   System.out.println("Please Enter a number...!");
   } 
   break;
   
default:
   System.out.println("Invalid input...!");
   
   
}
}
}
