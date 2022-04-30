package spots;

public class Spot 
{
     private int floorNo;
     private String vehicleType;
     private int spotNo;
     
     
	public int getFloorNo() 
	{
		return floorNo;
	}
	
	public void setFloorNo(int floorNo) 
	{
		this.floorNo = floorNo;
	}
	
	public String getVehicleType() 
	{
		return vehicleType;
	}
	
	public void setCarType(String carType) 
	{
		this.vehicleType = carType;
	}
	
	public int getspotNo() 
	{
		return spotNo;
	}
	
	public void setspotNo(int spotNo) 
	{
		this.spotNo = spotNo;
	}


	public String toString() 
	{
		return "Floor No=" + floorNo + ", Car Type=" + vehicleType + ", Spot No=" + spotNo ;
	}
     
	
     
}
