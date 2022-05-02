package availabletickets;

public class AvailableTickets 
{
	
	private int avaiLowTickets=18;
	private int avaiMidTickets=18;
	private int avaiUppTickets=18;
	private int avaiSideUppTickets=9;
	private int avaiRactickets=18;
	private int avaWaitListTickets=10;
	
	public int getAvaiLowTickets() 
	{
		return avaiLowTickets;
	}
	
	public void setAvaiLowTickets(int avaiLowTickets) 
	{
		this.avaiLowTickets = avaiLowTickets;
	}
	
	public int getAvaiMidTickets()
	{
		return avaiMidTickets;
	}
	
	public void setAvaiMidTickets(int avaiMidTickets) 
	{
		this.avaiMidTickets = avaiMidTickets;
	}
	
	public int getAvaiUppTickets() 
	{
		return avaiUppTickets;
	}
	
	public void setAvaiUppTickets(int avaiUppTickets) 
	{
		this.avaiUppTickets = avaiUppTickets;
	}
	
	public int getAvaiSideUppTickets() 
	{
		return avaiSideUppTickets;
	}
	
	public void setAvaiSideUppTickets(int avaiSideUppTickets) 
	{
		this.avaiSideUppTickets = avaiSideUppTickets;
	}
	
	public int getAvaiRactickets() 
	{
		return avaiRactickets;
	}
	
	public void setAvaiRactickets(int avaiRactickets)
	{
		this.avaiRactickets = avaiRactickets;
	}

	public int getAvaWaitListTickets() 
	{
		return avaWaitListTickets;
	}

	public void setAvaWaitListTickets(int avaWaitListTickets) 
	{
		this.avaWaitListTickets = avaWaitListTickets;
	}

	@Override
	public String toString() 
	{
		return "Available Lower Berth Tickets=" + 
	avaiLowTickets + ", Available Middle Berth Tickets=" + avaiMidTickets
				+ ", Available Upper Berth Tickets=" + avaiUppTickets + 
				", Available Side-Upper Berth Tickets=" + avaiSideUppTickets
				+ ", Available RAC Tickets=" + avaiRactickets
				+ ", Available Waiting List Tickets=" + avaWaitListTickets;
	}
	
	
	

}
