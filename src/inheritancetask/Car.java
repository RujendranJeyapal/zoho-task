package inheritancetask;

public class Car
{
public Car()
{
	
}
	
public Car(String inputString)
{
	System.out.println(inputString);
}



private int yearOfMake;
private String engineNumber;
private String type;

public void setYearOfMake(int yearOfMake)
{
this.yearOfMake=yearOfMake;	
}

public int getYearOfMake()
{
return yearOfMake;	
}

public void setEngineNumber(String engineNumber)
{
this.engineNumber=engineNumber;	
}

public String getEngineNumber()
{
return engineNumber;	
}

public void setType(String type)
{
this.type=type;	
}

public String getType()
{
return type;	
}

public void maintanance()
{
	System.out.println("Car under maintanance");
}



}
