package inheritancetask;

public class SCross extends Car 
{
private int seats;
private int airBags;
private String model;
private String color;


public void setSeats(int seats)
{
	this.seats=seats;
}

public int getSeats()
{
	return seats;
}

public void setAirBags(int airBags)
{
	this.airBags=airBags;
}

public int getAirBags()
{
	return airBags;
}

public void setModel(String model)
{
	this.model=model;
}

public String getModel()
{
	return model;
}

public void setColor(String color)
{
	this.color=color;
}

public String getColor()
{
	return color;
}

public void maintanance()
{
	System.out.println("Maruti SCross under maintenance");
}
}
