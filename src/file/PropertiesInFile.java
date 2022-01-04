package file;
import utility.*;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import task5.FileLogic;

public class PropertiesInFile 
{
	
	
	  void case2()throws Exception
		{
			
			Scanner input=new Scanner(System.in);
			FileLogic fileObj=new FileLogic();
			boolean check;
			System.out.println("Enter the path");
			String path2=input.nextLine();
			System.out.println("File name");
			String fileName2=input.nextLine();
			File newFile2=fileObj.createNewFile(path2, fileName2);
			System.out.println("Do you want to write or overwrite in File?"+"\n"+"Say true for write or false for overwrite");
			try
			{
				 check=input.nextBoolean();
			}
			catch(Exception ex)
			{
				throw new CustomException("Please enter true or false only");
			}
			Properties newProperty2=fileObj.createProperty();
		    System.out.println("Howmany pairs you want...");
		    int count2=input.nextInt();
		    input.nextLine();
		    for(int i=0;i<count2;i++)
		    {
		    System.out.println("Enter the key");
		    String key2=input.nextLine();
		    System.out.println("Enter the value");
		    String value2=input.nextLine();
		    fileObj.storeProperty(newFile2, newProperty2, key2, value2,check);
		    }
	}
	

}
