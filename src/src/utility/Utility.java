package utility;

public class Utility 
{
	public static void stringCheck(String inputString)throws CustomException
	{
		if(inputString==null || inputString.isEmpty())
		{
			throw new CustomException("Don't enter a null or Empty String");
		}
		
	}
	
	public static void objectCheck(Object inputObject,String objType)throws CustomException
	{
		if(inputObject==null)
		{
			throw new CustomException(objType+" is null");
		}
	}
	
	public static void arrayCheck(String arrayString[])throws CustomException
	{
		for(String eachString:arrayString)
		{
			stringCheck(eachString);
		}
	}

}
