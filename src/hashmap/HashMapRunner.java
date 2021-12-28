package hashmap;
import java.util.*;
import task4.*;
public class HashMapRunner
{
public static void main(String[] args)
{
HashMapLogic hashMapObj=new HashMapLogic();
Scanner input=new Scanner(System.in);
int questionNo=0;
System.out.println("Enter the Question Number");
   try
   {
   questionNo=input.nextInt();
   input.nextLine();
   }
   catch(Exception error)
   {
   System.out.println("Please Enter the Question Number...!");
   }

switch(questionNo)
{
case 1:
  try
   {
   Map newMap1=hashMapObj.createMap();
   System.out.println(newMap1);
   System.out.println("Size:"+hashMapObj.sizeOfMap(newMap1));
   }
   catch(MistakeOccuredException error)
   {
   System.out.println(error.getMessage());
   }
   break;
  

case 2:
   try
   {
   Map newMap=createMapWithKeys();
   System.out.println(newMap);  
   System.out.println("Size:"+hashMapObj.sizeOfMap(newMap));
   } 
   
   catch(MistakeOccuredException error)
   {
   System.out.println(error.getMessage());
   }
   catch(Exception ex)
   {
   System.out.println("Please enter a Number");
   }
   
   break;
   
   
case 3:
   try
   {
   
   System.out.println("Howmany pairs you want...");
   int count3=input.nextInt();
   if(count3<0)
   {
   System.out.println("Your number is Negative");
   }
   else
   {
   input.nextLine();
   Map newMap3=hashMapObj.createMap();
   for(int i=0;i<count3;i++) 
   {
   System.out.println("Enter the Key");
   Object key3=input.nextInt();
   System.out.println("Enter the value");
   Object value3=input.nextInt();
   hashMapObj.addMap(newMap3,key3,value3);
   }
   System.out.println(newMap3);
   System.out.println("Size:"+hashMapObj.sizeOfMap(newMap3));  
   }  
   }
   catch(MistakeOccuredException error)
   {
   System.out.println(error.getMessage());
   }
   
   catch(Exception ex)
   {
   System.out.println("Please enter a Number.");
   }
   break;
   
   
case 4:
   try
   {
   System.out.println("Howmany pairs you want...");
   int count4=input.nextInt();
   if(count4<0)
   {
   System.out.println("Your number is Negative");
   }
   else
   {
   input.nextLine();
   Map newMap4=hashMapObj.createMap();
   for(int i=0;i<count4;i++)
   {
   System.out.println("Enter the Key");
   String key4=input.nextLine();
   System.out.println("Enter the value");
   Object value4=input.nextInt();
   input.nextLine();
   hashMapObj.addMap(newMap4,key4,value4); 
   }
   System.out.println(newMap4);
   System.out.println("Size:"+hashMapObj.sizeOfMap(newMap4));
   }  
   } 
   catch(MistakeOccuredException error)
   {
   System.out.println(error.getMessage());
   }
   
   catch(Exception ex)
   {
   System.out.println("Please enter a Number.");
   }
   break;


case 5:
   try
   {
   System.out.println("Howmany pairs you want...");
   int count5=input.nextInt();
   if(count5<0)
   {
   System.out.println("Your number is Negative");
   }
   else
   {
   input.nextLine();
   Object value5=new Object();
   Map newMap5=hashMapObj.createMap();
   for(int i=0;i<count5;i++)
   {
   System.out.println("Enter the Key");
   String key5=input.nextLine();
   HashMapLogic Object=new HashMapLogic();
   value5=Object;
   hashMapObj.addMap(newMap5,key5,value5); 
   }
   System.out.println(newMap5);
   System.out.println("Size:"+hashMapObj.sizeOfMap(newMap5));
   }   
   }
   catch(MistakeOccuredException error)
   {
   System.out.println(error.getMessage());
   }
   
   catch(Exception ex)
   {
   System.out.println("Please enter a Number.");
   }
   break;


case 6:
   try
   {
   System.out.println("Howmany pairs you want...");
   int count6=input.nextInt(); 
   if(count6<0)
   {
   System.out.println("Your number is Negative");
   }
   else
   {
   input.nextLine();
   Object key6=new Object();
   Object value6=new Object();
   Map newMap6=hashMapObj.createMap();
   for(int i=0;i<count6;i++)
   {
   if(i==0)
   {
   System.out.println("Enter the Key");
   key6=input.nextLine();
   System.out.println("First Value is null");
   value6=null; 
   }
   else
   {
   System.out.println("Enter the Key");
   key6=input.nextLine();
   System.out.println("Enter the Value");
   value6=input.nextLine(); 
   } 
   hashMapObj.addMap(newMap6,key6,value6);
   }
   System.out.println(newMap6);
   System.out.println("Size:"+hashMapObj.sizeOfMap(newMap6));
   }
   }   
   catch(MistakeOccuredException error)
   {
   System.out.println(error.getMessage());
   }
   
   catch(Exception ex)
   {
   System.out.println("Please enter a Number.");
   }
   
   break;


case 7:
   try
   {
   System.out.println("Howmany pairs you want...");
   int count7=input.nextInt();
   if(count7<0)
   {
   System.out.println("Your number is Negative");
   }
   else
   {
   input.nextLine();
   Object key7=new Object();
   Object value7=new Object();
   Map newMap7=hashMapObj.createMap();
   for(int i=0;i<count7;i++)
   {
   if(i==0)
   {
   System.out.println("First Key is null");
   key7=null;
   System.out.println("Enter the Value");
   value7=input.nextLine(); 
   }
   else
   {
   System.out.println("Enter the Key");
   key7=input.nextLine();
   System.out.println("Enter the Value");
   value7=input.nextLine(); 
   } 
   hashMapObj.addMap(newMap7,key7,value7);
   }
   System.out.println(newMap7);
   System.out.println("Size:"+hashMapObj.sizeOfMap(newMap7));
   }   
   }
   catch(MistakeOccuredException error)
   {
   System.out.println(error.getMessage());
   }
   
   catch(Exception ex)
   {
   System.out.println("Please enter a Number.");
   }
   break;     


case 8:
   try
   {
   Map newMap8=createMapWithKeys();
   System.out.println(newMap8);
   System.out.println("Enter the Key to check for exists in a HashMap");
   String checkingKey=input.nextLine();
   System.out.println(hashMapObj.checkKeyExists(newMap8,checkingKey));
   }
   catch(MistakeOccuredException error)
   {
   System.out.println(error.getMessage());
   }
   
   catch(Exception ex)
   {
   System.out.println("Please enter a Number.");
   }
   break; 


case 9:
   try
   {
   Map newMap9=createMapWithKeys();
   System.out.println(newMap9);
   System.out.println("Enter the Value to check for exists in a HashMap");
   String checkingValue=input.nextLine();
   System.out.println(hashMapObj.checkValueExists(newMap9,checkingValue));
   }
   catch(MistakeOccuredException error)
   {
   System.out.println(error.getMessage());
   }
   
   catch(Exception ex)
   {
   System.out.println("Please enter a Number.");
   }
   break;


case 10:
  try
  {
  System.out.println("Howmany pairs you want...");
  int count10=input.nextInt(); 
  if(count10<0)
  {
  System.out.println("Your number is Negative");
  }
  else
  {
  input.nextLine();
  Map newMap10=hashMapObj.createMap();
  for(int i=0;i<count10;i++)
  {
  System.out.println("Enter the Key");
  String key10=input.nextLine();
  System.out.println("Enter the Value");
  String value10=input.nextLine();
  hashMapObj.addMap(newMap10,key10,value10); 
  }
  System.out.println(newMap10);
  System.out.println("Size:"+hashMapObj.sizeOfMap(newMap10));
  for(int i=0;i<count10;i++)
  {
  System.out.println("Enter the Key");
  String key_10=input.nextLine();
  System.out.println("Enter the replacingValue");
  String value_10=input.nextLine();
  hashMapObj.replaceValues(newMap10,key_10,value_10);
  }
  System.out.println(newMap10); 
  System.out.println("After Size:"+hashMapObj.sizeOfMap(newMap10));
  }   
  }
  catch(MistakeOccuredException error) 
  {
  System.out.println(error.getMessage());
  }
   
  catch(Exception ex)
  {
  System.out.println("Please enter a Number.");
  }
  break;


case 11:
  try
  {
  Map newMap11=createMapWithKeys();
  System.out.println(newMap11);
  System.out.println("Enter a existing key to find the value");
  String existKey=input.nextLine();
  Object getValue=hashMapObj.getValueInKey(newMap11,existKey);
  System.out.println(getValue);
  }
  
  catch(MistakeOccuredException error) 
  {
  System.out.println(error.getMessage());
  }
   
  catch(Exception ex)
  {
  System.out.println("Please enter a Number.");
  }
  break;      


case 12:
  try
  {
  Map newMap12=createMapWithKeys();
  System.out.println(newMap12);
  System.out.println("Enter a non existing key");
  String nonExistKey=input.nextLine();
  System.out.println("Enter a Default value");
  String defaultValue=input.nextLine();
  Object getValue_=hashMapObj.getValueInDefaultKey(newMap12,nonExistKey,defaultValue);
  System.out.println(getValue_);
  }
  catch(MistakeOccuredException error) 
  {
  System.out.println(error.getMessage());
  }
  catch(Exception ex)
  {
  System.out.println("Please enter a Number.");
  }
  break;


case 13:
  try
  {
  Map newMap13=createMapWithKeys();
  System.out.println(newMap13);
  System.out.println("Size:"+hashMapObj.sizeOfMap(newMap13));
  System.out.println("Enter a non existing Key:");
  String nonExistKey_=input.nextLine();
  System.out.println("Enter the Value");
  String value_13=input.nextLine();
  hashMapObj.putAbsent(newMap13,nonExistKey_,value_13);
  System.out.println(newMap13);
  System.out.println("After Size:"+hashMapObj.sizeOfMap(newMap13));
  } 
  
  catch(MistakeOccuredException error) 
  {
  System.out.println(error.getMessage());
  }
   
  catch(Exception ex)
  {
  System.out.println("Please enter a Number.");
  }
  break;


case 14:
  try
  { 
  Map newMap14=createMapWithKeys();
  System.out.println(newMap14);
  System.out.println("Size:"+hashMapObj.sizeOfMap(newMap14));
  System.out.println("Enter the key value to remove");
  String removeKey=input.nextLine();
  hashMapObj.removeKey(newMap14,removeKey);
  System.out.println(newMap14);
  System.out.println("After Size:"+hashMapObj.sizeOfMap(newMap14));
  }  
  catch(MistakeOccuredException error) 
  {
  System.out.println(error.getMessage());
  }   
  catch(Exception ex)
  {
  System.out.println("Please enter a Number.");
  }
  break;


case 15:
  try
  {
  Map newMap15=createMapWithKeys();
  System.out.println(newMap15);
  System.out.println("Size:"+hashMapObj.sizeOfMap(newMap15));
  System.out.println("Enter the key to remove");
  String removeKey_=input.nextLine();
  System.out.println("Enter the value to remove in key");
  String removeValue=input.nextLine();
  hashMapObj.removeMatchValues(newMap15,removeKey_,removeValue);
  System.out.println(newMap15);
  System.out.println("After Size:"+hashMapObj.sizeOfMap(newMap15));
  }  
  catch(MistakeOccuredException error) 
  {
  System.out.println(error.getMessage());
  }   
  catch(Exception ex)
  {
  System.out.println("Please enter a Number.");
  }
  break;


case 16:
  try
  {
  System.out.println("Howmany pairs you want...");
  int count16=input.nextInt(); 
  if(count16<0)
  {
  System.out.println("Your number is Negative");
  }
  else
  {
  input.nextLine();
  Map newMap16=hashMapObj.createMap();
  for(int i=0;i<count16;i++)
  {
  System.out.println("Enter the Key");
  String key16=input.nextLine();
  System.out.println("Enter the Value");
  String value16=input.nextLine();
  hashMapObj.addMap(newMap16,key16,value16); 
  }
  System.out.println(newMap16);
  System.out.println("Size:"+hashMapObj.sizeOfMap(newMap16)); 
  System.out.println("Enter the Key for replace");
  String key_16=input.nextLine();
  System.out.println("Enter the replacingValue");
  String value_16=input.nextLine();
  hashMapObj.replaceValues(newMap16,key_16,value_16);
  System.out.println(newMap16); 
  System.out.println("After Size:"+hashMapObj.sizeOfMap(newMap16));
  } 
  } 
  catch(MistakeOccuredException error) 
  {
  System.out.println(error.getMessage());
  }   
  catch(Exception ex)
  {
  System.out.println("Please enter a Number.");
  }
  break;

  
case 17:
  try
  { 
  Map newMap17=createMapWithKeys();
  System.out.println(newMap17);
  System.out.println("Size:"+hashMapObj.sizeOfMap(newMap17));
  System.out.println("Enter the Key for replace");
  String key_17=input.nextLine();
  System.out.println("Enter the oldValue");
  String value_17=input.nextLine();
  System.out.println("Enter the newValue");
  String value__17=input.nextLine();
  hashMapObj.replaceValueFromValue(newMap17,key_17,value_17,value__17);  
  System.out.println(newMap17); 
  System.out.println("After Size:"+hashMapObj.sizeOfMap(newMap17));
  }    
  catch(MistakeOccuredException error) 
  {
  System.out.println(error.getMessage());
  }   
  catch(Exception ex)
  {
  System.out.println("Please enter a Number.");
  }
  break;

case 18:
  try
  { 
  Map oneMap=createMapWithKeys();
  System.out.println(oneMap);
  System.out.println("Size of first Map:"+hashMapObj.sizeOfMap(oneMap)); 
  Map anotherMap=createMapWithKeys();
  System.out.println(anotherMap);
  System.out.println("Size of first Map:"+hashMapObj.sizeOfMap(anotherMap));
  hashMapObj.addTwoMaps(anotherMap,oneMap);
  System.out.println(anotherMap);
  System.out.println("Size of new Map:"+hashMapObj.sizeOfMap(anotherMap));
  }  
  catch(MistakeOccuredException error) 
  {
  System.out.println(error.getMessage());
  }   
  catch(Exception ex)
  {
  System.out.println("Please enter a Number.");
  }
  break;


case 19:
  try
  {
  Map newMap19=createMapWithKeys();
  System.out.println(newMap19);
  System.out.println("After Iterate:");
  Iterator iterateMap=newMap19.entrySet().iterator();
  for(int i=0;iterateMap.hasNext();i++)
  {
  System.out.println(iterateMap.next());
  }
  }  
  catch(MistakeOccuredException error) 
  {
  System.out.println(error.getMessage());
  }  
  catch(Exception ex)
  {
  System.out.println("Please enter a Number.");
  }
  break;


case 20:
  try
  {
  Map newMap20=createMapWithKeys();
  System.out.println(newMap20);
  System.out.println("Size:"+hashMapObj.sizeOfMap(newMap20));
  hashMapObj.clearMap(newMap20); 
  System.out.println(newMap20);
  System.out.println("After Size:"+hashMapObj.sizeOfMap(newMap20));
  }
  catch(MistakeOccuredException error) 
  {
  System.out.println(error.getMessage());
  }   
  catch(Exception ex)
  {
  System.out.println("Please enter a Number.");
  }
  break;


default:
  System.out.println("Invalid Input...!");  
}
}

private static Map createMapWithKeys()throws Exception
{

   HashMapLogic hashMapObj=new HashMapLogic();
   Map newMap=hashMapObj.createMap();
   Scanner input=new Scanner(System.in);
   System.out.println("Howmany pairs you want..");
   int count=Integer.parseInt(input.nextLine()); 
   negativeCheck(count);
   for(int i=0;i<count;i++)
   {
   System.out.println("Enter the Key"); 
   String key=input.nextLine();
   System.out.println("Enter the value");
   String value=input.nextLine();
   hashMapObj.addMap(newMap,key,value);
   } 
   return newMap;
}

private static void negativeCheck(int count)throws MistakeOccuredException
{
if(count<0)
{
throw new MistakeOccuredException("Your number is negative");
}
}
}
