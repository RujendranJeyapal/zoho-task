package file;
import utility.*;

import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import task5.FileLogic;

public class FileReading
{
	
	

	 void case3()throws CustomException
	{
	 

		Scanner input=new Scanner(System.in);
		FileLogic fileObj=new FileLogic();
		
	    System.out.println("Enter the path");
	    String path3=input.nextLine();
	    System.out.println("File name");
	    String fileName3=input.nextLine();
	    Properties newProperty3=fileObj.createProperty();
	    fileObj.readFile(path3,fileName3,newProperty3);
	    System.out.println(newProperty3);
		
	}
	

}
