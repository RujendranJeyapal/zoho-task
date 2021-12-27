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
   catch(NullException error)
   {
   System.out.println(error.getMessage());
   }
   break;
  

case 2:
   try
   {
   Map newMap2=hashMapObj.createMap();
   System.out.println("Howmany pairs you want..");
   int count2=input.nextInt();
   if(count2<0)
   {
   System.out.println("Your number is Negative");
   }
   else
   {
   input.nextLine();
   for(int i=0;i<count2;i++)
   {
   System.out.println("Enter the Key"); 
   String key2=input.nextLine();
   System.out.println("Enter the value");
   String value2=input.nextLine();
   hashMapObj.addMap(newMap2,key2,value2);
   }  
   System.out.println(newMap2);
   System.out.println("Size:"+hashMapObj.sizeOfMap(newMap2));
   } 
   }
   catch(NullException error)
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
   catch(NullException error)
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
   catch(NullException error)
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
   catch(NullException error)
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
   catch(NullException error)
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
   catch(NullException error)
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
   System.out.println("Howmany pairs you want...");
   int count8=input.nextInt();
   if(count8<0)
   {
   System.out.println("Your number is Negative");
   }
   else
   {
   input.nextLine();
   Map newMap8=hashMapObj.createMap();
   for(int i=0;i<count8;i++)
   {
   System.out.println("Enter the Key");
   String key8=input.nextLine();
   System.out.println("Enter the Value");
   String value8=input.nextLine();
   hashMapObj.addMap(newMap8,key8,value8);
   }
   System.out.println(newMap8);
   System.out.println("Enter the Key to check for exists in a HashMap");
   String checkingKey=input.nextLine();
   System.out.println(hashMapObj.checkKeyExists(newMap8,checkingKey));
   }
   }
   catch(NullException error)
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
   System.out.println("Howmany pairs you want...");
   int count9=input.nextInt();
   if(count9<0)
   {
   System.out.println("Your number is Negative");
   }
   else
   {
   input.nextLine();
   Map newMap9=hashMapObj.createMap();
   for(int i=0;i<count9;i++)
   {
   System.out.println("Enter the Key");
   String key9=input.nextLine();
   System.out.println("Enter the Value");
   String value9=input.nextLine();
   hashMapObj.addMap(newMap9,key9,value9);
   }
   System.out.println(newMap9);
   System.out.println("Enter the Value to check for exists in a HashMap");
   String checkingValue=input.nextLine();
   System.out.println(hashMapObj.checkValueExists(newMap9,checkingValue));
   }
   }
   catch(NullException error)
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
  catch(NullException error) 
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
  System.out.println("Howmany pairs you want...");
  int count11=input.nextInt();
  if(count11<0)
  {
  System.out.println("Your number is Negative");
  }
  else
  {
  input.nextLine();
  Map newMap11=hashMapObj.createMap();
  for(int i=0;i<count11;i++)
  {
  System.out.println("Enter the Key");
  String key11=input.nextLine();
  System.out.println("Enter the Value");
  String value11=input.nextLine();
  hashMapObj.addMap(newMap11,key11,value11); 
  }
  System.out.println(newMap11);
  System.out.println("Enter a existing key to find the value");
  String existKey=input.nextLine();
  Object getValue=hashMapObj.getValueInKey(newMap11,existKey);
  System.out.println(getValue);
  }
  }
  catch(NullException error) 
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
  System.out.println("Howmany pairs you want...");
  int count12=input.nextInt();
  if(count12<0)
  {
  System.out.println("Your number is Negative");
  } 
  else
  {
  input.nextLine();
  Map newMap12=hashMapObj.createMap();
  for(int i=0;i<count12;i++)
  {
  System.out.println("Enter the Key");
  String key12=input.nextLine();
  System.out.println("Enter the Value");
  String value12=input.nextLine();
  hashMapObj.addMap(newMap12,key12,value12); 
  }
  System.out.println(newMap12);
  System.out.println("Enter a non existing key");
  String nonExistKey=input.nextLine();
  System.out.println("Enter a Default value");
  String defaultValue=input.nextLine();
  Object getValue_=hashMapObj.getValueInDefaultKey(newMap12,nonExistKey,defaultValue);
  System.out.println(getValue_);
  }
  }
  catch(NullException error) 
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
  System.out.println("Howmany pairs you want...");  
  int count13=input.nextInt();
  if(count13<0)
  {
  System.out.println("Your number is Negative");
  }
  else
  {
  input.nextLine();
  Map newMap13=hashMapObj.createMap();
  for(int i=0;i<count13;i++)
  {
  System.out.println("Enter the Key");
  String key13=input.nextLine();
  System.out.println("Enter the Value");
  String value13=input.nextLine();
  hashMapObj.addMap(newMap13,key13,value13); 
  }
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
  }
  catch(NullException error) 
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
  System.out.println("Howmany pairs you want...");
  int count14=input.nextInt();
  if(count14<0)
  {
  System.out.println("Your number is Negative");
  }
  else
  {
  input.nextLine();
  Map newMap14=hashMapObj.createMap();
  for(int i=0;i<count14;i++)
  {
  System.out.println("Enter the Key");
  String key14=input.nextLine();
  System.out.println("Enter the Value");
  String value14=input.nextLine();
  hashMapObj.addMap(newMap14,key14,value14);
  }
  System.out.println(newMap14);
  System.out.println("Size:"+hashMapObj.sizeOfMap(newMap14));
  System.out.println("Enter the key value to remove");
  String removeKey=input.nextLine();
  hashMapObj.removeKey(newMap14,removeKey);
  System.out.println(newMap14);
  System.out.println("After Size:"+hashMapObj.sizeOfMap(newMap14));
  }
  }
  catch(NullException error) 
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
  System.out.println("Howmany pairs you want...");
  int count15=input.nextInt();
  if(count15<0)
  {
  System.out.println("Your number is Negative");
  }
  else
  {
  input.nextLine();
  Map newMap15=hashMapObj.createMap();
  for(int i=0;i<count15;i++)
  {
  System.out.println("Enter the Key");
  String key15=input.nextLine();
  System.out.println("Enter the Value");
  String value15=input.nextLine();
  hashMapObj.addMap(newMap15,key15,value15);
  }
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
  }
  catch(NullException error) 
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
  for(int i=0;i<count16;i++)
  {
  System.out.println("Enter the Key for replace");
  String key_16=input.nextLine();
  System.out.println("Enter the replacingValue");
  String value_16=input.nextLine();
  hashMapObj.replaceValues(newMap16,key_16,value_16);
  }
  System.out.println(newMap16); 
  System.out.println("After Size:"+hashMapObj.sizeOfMap(newMap16));
  } 
  } 
  catch(NullException error) 
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
  System.out.println("Howmany pairs you want...");
  int count17=input.nextInt();
  if(count17<0)
  {
  System.out.println("Your number is Negative");
  }
  else
  {
  input.nextLine();
  Map newMap17=hashMapObj.createMap();
  for(int i=0;i<count17;i++)
  {
  System.out.println("Enter the Key");
  String key17=input.nextLine();
  System.out.println("Enter the Value");
  String value17=input.nextLine();
  hashMapObj.addMap(newMap17,key17,value17); 
  }
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
  }
  catch(NullException error) 
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
  System.out.println("Howmany pairs you want for first Map...");
  int count18=input.nextInt();  
  if(count18<0)
  {
  System.out.println("Your number is Negative");
  }   
  else
  {
  input.nextLine();
  Map oneMap=hashMapObj.createMap();
  for(int i=0;i<count18;i++)
  {
  System.out.println("Enter the Key");
  String key18=input.nextLine();
  System.out.println("Enter the Value");
  String value18=input.nextLine();
  hashMapObj.addMap(oneMap,key18,value18); 
  }
  System.out.println(oneMap);
  System.out.println("Size of first Map:"+hashMapObj.sizeOfMap(oneMap));
  System.out.println("Howmany pairs you want for second Map...");
  int count_18=input.nextInt();
  if(count_18<0)
  {
  System.out.println("Your number is Negative");
  }
  else 
  {
  input.nextLine();
  Map anotherMap=hashMapObj.createMap();
  for(int i=0;i<count_18;i++)
  {
  System.out.println("Enter the Key");
  String key_18=input.nextLine();
  System.out.println("Enter the Value");
  String value_18=input.nextLine();
  hashMapObj.addMap(anotherMap,key_18,value_18); 
  }
  System.out.println(anotherMap);
  System.out.println("Size of first Map:"+hashMapObj.sizeOfMap(anotherMap));
  hashMapObj.addTwoMaps(anotherMap,oneMap);
  System.out.println(anotherMap);
  System.out.println("Size of new Map:"+hashMapObj.sizeOfMap(anotherMap));
  }
  }
  }
  catch(NullException error) 
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
  System.out.println("Howmany pairs you want for first Map...");
  int count19=input.nextInt();
  if(count19<0)
  {
  System.out.println("Your number is Negative");
  }
  else
  {
  input.nextLine();
  Map newMap19=hashMapObj.createMap();
  for(int i=0;i<count19;i++)
  {
  System.out.println("Enter the Key");
  String key19=input.nextLine();
  System.out.println("Enter the Value");
  String value19=input.nextLine();
  hashMapObj.addMap(newMap19,key19,value19); 
  }
  System.out.println(newMap19);
  System.out.println("After Iterate:");
  Iterator iterateMap=newMap19.entrySet().iterator();
  for(int i=0;iterateMap.hasNext();i++)
  {
  System.out.println(iterateMap.next());
  }
  }
  }
  catch(NullException error) 
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
  System.out.println("Howmany pairs you want...");
  int count20=input.nextInt();
  if(count20<0)
  {
  System.out.println("Your number is Negative");
  }
  else
  {
  input.nextLine();
  Map newMap20=hashMapObj.createMap();
  for(int i=0;i<count20;i++)
  {
  System.out.println("Enter the Key");
  String key20=input.nextLine();
  System.out.println("Enter the Value");
  String value20=input.nextLine();
  hashMapObj.addMap(newMap20,key20,value20); 
  }
  System.out.println(newMap20);
  System.out.println("Size:"+hashMapObj.sizeOfMap(newMap20));
  hashMapObj.clearMap(newMap20); 
  System.out.println(newMap20);
  System.out.println("After Size:"+hashMapObj.sizeOfMap(newMap20));
  }
  }
  catch(NullException error) 
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
}
