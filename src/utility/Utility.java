package utility;

public class Utility 
{
public static void stringCheck(String inputString)throws CustomException
{
if((inputString==null) || inputString.isEmpty())
{
throw new CustomException("Don't enter a null or Empty");	
}
}

public static void nullCheck(Object inputObject)throws CustomException
{
if(inputObject==null)
{
throw new CustomException("Don't enter a null");	
}
}

public static void arrayCheck(String inputString[])throws CustomException
{
for(String arrayString:inputString)
{
stringCheck(arrayString);	
}
}
}
