package ticket;
import passenger.*;
import seat.*;

public class Ticket 
{
      private String ticketId;
      private PassengerInfo passInfo;
      private Seat seat;
      
	public String getTicketId() 
	{
		return ticketId;
	}
	
	public void setTicketId(String ticketId)
	{
		this.ticketId = ticketId;
	}
	
	public PassengerInfo getPassInfo() 
	{
		return passInfo;
	}
	
	public void setPassInfo(PassengerInfo passInfo)
	{
		this.passInfo = passInfo;
	}
	
	public Seat getSeat() 
	{
		return seat;
	}
	
	public void setSeat(Seat seat) 
	{
		this.seat = seat;
	}

	@Override
	public String toString() 
	{
		return "Ticket [ticketId=" + ticketId + ", passInfo=" + passInfo + ", seat=" + seat + "]";
	}
      
    
	
	  
}
