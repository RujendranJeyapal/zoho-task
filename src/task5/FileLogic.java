package task5;
import utility.*;
import java.io.*;
import java.util.*;


public class FileLogic 
{
	
public File createNewFile(String path,String fileName)throws CustomException
{  
	Utility.stringCheck(path);
	Utility.stringCheck(fileName);
	File newFile=new File(path,fileName);
	try
	{
	if(newFile.createNewFile())
	{
		System.out.println("File is create");
	}
	else
	{
		System.out.println("File is already exist");
	}
	}
	catch(IOException exception)
	{
		throw new CustomException(exception);
	}
	
	return newFile;
}

public void createFolder(String path,String newFolder)throws CustomException 
{ 
	Utility.stringCheck(path);
	Utility.stringCheck(newFolder);
    File newFile=new File(path,newFolder);
    if(newFile.mkdir())
    {
	 System.out.println("Folder Create");
    }
    else
    {
	 throw new CustomException("Already exist");
    }
}

public Properties createProperty()
{
	Properties newProperty=new Properties();
	return newProperty;
}

public FileWriter fileToWriter(File actualFile,boolean check)throws CustomException
{
	Utility.nullCheck(actualFile);
	try
	{
	FileWriter newWriter=new FileWriter(actualFile,check);
	return newWriter;
	}
	catch(IOException exception)
	{
		throw new CustomException(exception);
	}
	
}

public void writeLines(File newFile,String inputString[],boolean check)throws CustomException
{
	Utility.nullCheck(newFile);
	Utility.arrayCheck(inputString);
	FileWriter newWriter=fileToWriter(newFile,check);
	try
	{
	for(String arrayString:inputString)
	{
		newWriter.append(arrayString+"\n");
	}
	
	}
	catch(IOException exception)
	{
		throw new CustomException(exception);
	}
	finally
	{
		try
		{
	     newWriter.close();
		}
		catch(Exception ex)
		{
			
		}
	}
	
}

public void storeProperty(File actualFile,Properties newProperty,String key,String value,boolean check)throws CustomException
{  
	Utility.nullCheck(actualFile);
	Utility.nullCheck(newProperty);
	Utility.stringCheck(key);
	Utility.stringCheck(value);
	FileWriter newWriter=fileToWriter(actualFile,check);
	newProperty.setProperty(key, value);
	try
	{
	newProperty.store(newWriter,null);
	}
	catch(IOException exception)
	{
		throw new CustomException(exception);
	}
}

public Properties readFile(String path,String fileName,Properties newProperty)throws CustomException
{   
	
	Utility.stringCheck(path);
	Utility.stringCheck(fileName);
	Utility.nullCheck(newProperty);
	try
	{
    FileReader readFile=new FileReader(path+File.separator+fileName);
    newProperty.load(readFile);
    return newProperty;
	}
	catch(IOException exception)
	{
		throw new CustomException(exception);
	}
}
}
