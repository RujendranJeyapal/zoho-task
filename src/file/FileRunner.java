package file;
import utility.*;
import task5.FileLogic;
import java.io.*;
import java.lang.reflect.*;
import java.util.*;




public class FileRunner 
{





public static void main(String[] args)
{
	FileLogic fileObj=new FileLogic();
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the Question number");
	int questionNo=0;
	try
	{
	 questionNo=input.nextInt();
	 input.nextLine();
	}
	catch(Exception error)
	{
	System.out.println("Please enter the Question Number...");
	}
	
	FileCreator fileCreatorObj=new FileCreator();
	PropertiesInFile propertiesObj=new PropertiesInFile(); 
	FileReading fileReadObj=new FileReading();
	
switch(questionNo)
{
case 1:
    try
    {
	   
	   fileCreatorObj.case1();
    } 
    catch(CustomException error)
    {
	   System.out.println(error.getMessage());
    }
    catch(Exception ex)
    {
	   System.out.println("Please Enter the number");
    }
    break;
   
case 2:
	try
	{
		propertiesObj.case2();
	}
	catch(CustomException error)
	{
		   System.out.println(error.getMessage());
    }
	catch(Exception ex)
	{
		   System.out.println("Please Enter the number");
	}
	break;
	   
case 3:
	try
	{
		fileReadObj.case3();
	}
	catch(CustomException error)
	{
		   System.out.println(error.getMessage());
    }
    catch(Exception ex)
	{
		   System.out.println("Please Enter the number");
	}
	break;
case 4:
	try
	{
	System.out.println("Enter the path");
	String path4=input.nextLine();
	System.out.println("Folder name");
	String folderName3=input.nextLine();
	fileObj.createFolder(path4, folderName3);
	fileCreatorObj.case1();
	propertiesObj.case2();
	fileReadObj.case3();
	}
	catch(CustomException error)
	{
		   System.out.println(error.getMessage());
    }
	   catch(Exception ex)
	{
		   System.out.println("Please Enter the number");
	}
	break;
	
case 5:
	System.out.println("Enter the String");
	String inputString=input.nextLine();
	PrintObject case5Obj=new PrintObject(inputString);
	System.out.println(case5Obj);
	break;
	
case 6:
	System.out.println("Enter the name");
	String name=input.nextLine();
	System.out.println("Enter the id");
	int id=input.nextInt();
	PojoClass pojoClsObj=new PojoClass(name,id);
	System.out.println(pojoClsObj);
	break;
	
case 7:
	System.out.println("Enter the name");
	String name1=input.nextLine();
	System.out.println("Enter the id");
	int id1=input.nextInt();
	PojoClass pojoClsObj1=new PojoClass();
	pojoClsObj1.setName(name1);
	System.out.println(pojoClsObj1.getName());
	pojoClsObj1.setId(id1);
	System.out.println(pojoClsObj1.getId());
	break;
	
	
case 8:
	try
	{
	Class myClass=Class.forName("reflection.PojoReflection");
	Constructor emptyCons[]=myClass.getDeclaredConstructors();
	for(Constructor existCons:emptyCons)
	{
	System.out.println(existCons);
	}
	Method methods[]=myClass.getDeclaredMethods();
	for(Method existMethods:methods)
	{
		System.out.println(existMethods);
	}
	Constructor loadCons=myClass.getConstructor(String.class,int.class);
	System.out.println("Enter the name");
	String name8=input.nextLine();
	System.out.println("Enter the id");
	int id8=input.nextInt();
	input.nextLine();
	Object obj=loadCons.newInstance(name8,id8);
	System.out.println(obj);
	Constructor emptyCons1=myClass.getConstructor();
	//Object obj1=myClass.newInstance();
	Object objForEmpty=emptyCons1.newInstance();
	
	Method stringMethod=myClass.getDeclaredMethod("setName",String.class);
	
	
	stringMethod.invoke(objForEmpty,name8);
	
	Method stringMethod1=myClass.getDeclaredMethod("getName",null);
	System.out.println(stringMethod1.invoke(objForEmpty, null));
	}
    catch(Exception ex)
	{
	System.out.println("Please Enter the number");
    }
    break;
    
case 9:
	Rainbow colours[]=Rainbow.values();
	Rainbow a=Rainbow.VIOLET;
	for(Rainbow colour:colours)
	{
		System.out.println("Colour code of "+colour+" is "+colour.getPosition());
	}
	break;
	
case 10:
	System.out.println(SingletonClass.createObject().hashCode());
	System.out.println(SingletonClass.createObject().hashCode());
	SingletonClass.createObject().display();
	break;
	
case 11:
	System.out.println(SingletonEnum.OBJECT.hashCode());
	System.out.println(SingletonEnum.OBJECT.hashCode());
	SingletonEnum.OBJECT.run();
	break;
default:
	System.out.println("Invalid Input");
}
}
}
