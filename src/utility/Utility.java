package utility;
import task4.CustomException;
public class Utility
{
public static void nullCheck(Object inputObject)throws CustomException
{
if(inputObject==null)
{
throw new CustomException("Don't enter a null value");
}
}

public static void stringCheck(String inputString)throws CustomException
{
if((inputString==null) || inputString.isEmpty() )
{
throw new CustomException("Don't enter a null or empty String");
}
}
public static void arrayCheck(String arrayString[])throws CustomException
{
for(String outputString:arrayString)
{
stringCheck(outputString);
}
}
}
