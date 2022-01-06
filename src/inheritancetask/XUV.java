package inheritancetask;

public class XUV extends Car
{
	
	
public XUV()
{
super("XUV class");	
}
	
	
private int seats;
private int airBags;
private String model;
private String color;

public void setseats(int seats)
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
}
