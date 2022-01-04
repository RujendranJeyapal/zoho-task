package file;
import utility.*;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import task5.FileLogic;

public class FileCreator 
{

	
	  void case1()throws Exception
	{
		Scanner input=new Scanner(System.in);
		FileLogic fileObj=new FileLogic();
		
		boolean check;
	       System.out.println("Enter the path");
		   String path1=input.nextLine();
		   System.out.println("File name");
		   String fileName1=input.nextLine();
		  
		   File newFile=fileObj.createNewFile(path1,fileName1);
		   System.out.println("Do you want to write or overwrite in File?"+"\n"+"Say true for write or false for overwrite");
		   try
		   {
	     	 check=input.nextBoolean();
		   }
		   catch(Exception ex)
		   {
			   throw new CustomException("Please enter true or false only");
		   }
		   System.out.println("Howmany Strings you write in the file");
		   int count1=input.nextInt();
		   input.nextLine();
		   String writeString[]=new String[count1];
		   for(int i=0;i<count1;i++)
		   {
			   writeString[i]=input.nextLine();
		   }
		   fileObj.writeLines(newFile, writeString,check);
	
	}

}
