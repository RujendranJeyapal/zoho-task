package ticket;

import java.util.Date;

public class Ticket 
{
       private String ticketId;
       private int cusId;
       private String vehicleType;
       private String vehicleNumber;
       private long parkingTime;
       private int floor;
       private int spotNo;
       
       
	public String getTicketId() 
	{
		return ticketId;
	}
	
	public void setTicketId(String ticketId) 
	{
		this.ticketId = ticketId;
	}
	
	
	
	public int getCusId()
	{
		return cusId;
	}

	public void setCusId(int cusId) 
	{
		this.cusId = cusId;
	}

	public String getVehicleType() 
	{
		return vehicleType;
	}
	
	public void setVehicleType(String vehicleType) 
	{
		this.vehicleType = vehicleType;
	}
	
	public String getVehicleNumber() 
	{
		return vehicleNumber;
	}
	
	public void setVehicleNumber(String vehicleNumber) 
	{
		this.vehicleNumber = vehicleNumber;
	}
	
	public long getParkingTime() 
	{
		return parkingTime;
	}
	
	public void setParkingTime(long parkingTime) 
	{
		this.parkingTime = parkingTime;
	}
	
	public int getFloor() 
	{
		return floor;
	}
	
	public void setFloor(int floor) 
	{
		this.floor = floor;
	}
	
	public int getSpotNo()
	{
		return spotNo;
	}
	
	public void setSpotNo(int spotNo) 
	{
		this.spotNo = spotNo;
	}

	
	public String toString() 
	{
		return "Ticket ID=" + ticketId + "\n Customer Id=" + cusId + "\n Vehicle Type=" 
	                                        + vehicleType + "\n Vehicle Number="
				                            + vehicleNumber + "\n Parking Time=" + new Date(parkingTime) 
				                            + "\n Floor=" + floor + "\n Spot No=" + spotNo;
	}
       
       
       
       
}
