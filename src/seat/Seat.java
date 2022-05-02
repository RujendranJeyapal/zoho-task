package seat;

public class Seat 
{
     private int seatNo;
     private String berth;
     
	public int getSeatNo() 
	{
		return seatNo;
	}
	
	public void setSeatNo(int seatNo) 
	{
		this.seatNo = seatNo;
	}
	
	public String getBerth() 
	{
		return berth;
	}
	
	public void setBerth(String berth) 
	{
		this.berth = berth;
	}

	@Override
	public String toString()
	{
		return "Seat [seatNo=" + seatNo + ", berth=" + berth + "]";
	}
	
	
     
     
}
