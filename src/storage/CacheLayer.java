package storage;
import java.util.*;

import availabletickets.AvailableTickets;
import passenger.*;
import seat.*;
import ticket.*;

public class CacheLayer 
{

	private Map<String,List<Seat>> seatMap=new HashMap<>();
	private List<PassengerInfo> waitingList=new ArrayList<>();
	private Map<String,Ticket> ticketsMap=new HashMap<>();
	private int ticketId=1;
	
	AvailableTickets availableTicket=new AvailableTickets();
	
	public void bookTicket(PassengerInfo passInfo)
	{
		String berth=passInfo.getBerthPreference();
		
		List<Seat> seatList=seatMap.get(berth);
		
//		Ticket newTicket=new Ticket();
//		String ticketID=generateTicketId();
//		newTicket.setTicketId(ticketID);
//		newTicket.setPassInfo(passInfo);
		
		if(seatList!=null)
		{			
			Ticket newTicket=new Ticket();
			String ticketID=generateTicketId();
			newTicket.setTicketId(ticketID);
			newTicket.setPassInfo(passInfo);
			Seat eachSeat=seatList.get(0);
			newTicket.setSeat(eachSeat);
	        seatList.remove(0);
	        ticketsMap.put(ticketID, newTicket);
	    
		}
		
		else if(seatMap.get("Lower")!=null)
		{
			Ticket newTicket=new Ticket();
			String ticketID=generateTicketId();
			newTicket.setTicketId(ticketID);
			newTicket.setPassInfo(passInfo);
			Seat eachSeat=seatMap.get("Lower").get(0);
			newTicket.setSeat(eachSeat);
	        seatMap.get("Lower").remove(0);
	        ticketsMap.put(ticketID, newTicket);
	        availableTicket.setAvaiLowTickets(availableTicket.getAvaiLowTickets()-1);
		}
		
		else if(seatMap.get("Middle")!=null)
		{
			Ticket newTicket=new Ticket();
			String ticketID=generateTicketId();
			newTicket.setTicketId(ticketID);
			newTicket.setPassInfo(passInfo);
			Seat eachSeat=seatMap.get("Middle").get(0);
			newTicket.setSeat(eachSeat);
			seatMap.get("Middle").remove(0);
			ticketsMap.put(ticketID, newTicket);
			availableTicket.setAvaiMidTickets(availableTicket.getAvaiMidTickets()-1);
		}
		
		else if(seatMap.get("Upper")!=null)
		{
			Ticket newTicket=new Ticket();
			String ticketID=generateTicketId();
			newTicket.setTicketId(ticketID);
			newTicket.setPassInfo(passInfo);
			Seat eachSeat=seatMap.get("Upper").get(0);
			newTicket.setSeat(eachSeat);
			seatMap.get("Upper").remove(0);
			ticketsMap.put(ticketID, newTicket);
			availableTicket.setAvaiUppTickets(availableTicket.getAvaiUppTickets()-1);
		}
		
		else if(seatMap.get("Side-Upper")!=null)
		{
			Ticket newTicket=new Ticket();
			String ticketID=generateTicketId();
			newTicket.setTicketId(ticketID);
			newTicket.setPassInfo(passInfo);
			Seat eachSeat=seatMap.get("Side-Upper").get(0);
			newTicket.setSeat(eachSeat);
			seatMap.get("Side-Upper").remove(0);
			ticketsMap.put(ticketID, newTicket);
			availableTicket.setAvaiSideUppTickets(availableTicket.getAvaiSideUppTickets()-1);
		}
		
		else if(seatMap.get("RAC")!=null)
		{
			Ticket newTicket=new Ticket();
			String ticketID=generateTicketId();
			newTicket.setTicketId(ticketID);
			newTicket.setPassInfo(passInfo);
			Seat eachSeat=seatMap.get("RAC").get(0);
			newTicket.setSeat(eachSeat);
			seatMap.get("RAC").remove(0);
			ticketsMap.put(ticketID, newTicket);
			availableTicket.setAvaiRactickets(availableTicket.getAvaiRactickets()-1);
		}
		
		else
		{
			waitingList.add(passInfo);
			availableTicket.setAvaWaitListTickets(availableTicket.getAvaWaitListTickets()-1);
		}
		
	//    ticketsMap.put(ticketID, newTicket);
		
		
	}
	
	public String generateTicketId()
	{
		return "Ticket"+ticketId++;
	}

   
   public CacheLayer()
   {
	   int seatNo=1;
	   for(int i=1;i<=9;i++)
	   {
		   
		   
		   for(int j=1;j<=9;j++)
		   {
			   
			   if(j==1 || j==4)
			   {
				   Seat eachSeat=new Seat();
				   eachSeat.setSeatNo(seatNo++);
				   eachSeat.setBerth("Lower");
				   List<Seat> seatList=seatMap.get("Lower");
				   
				   if(seatList==null)
				   {
					   seatList=new ArrayList<>();
					   seatMap.put("Lower", seatList);
				   }
				   seatList.add(eachSeat);
				   
			   }
			   
			   else if(j==2 || j==5)
			   {
				   Seat eachSeat=new Seat();
				   eachSeat.setSeatNo(seatNo++);
				   eachSeat.setBerth("Middle");
				   List<Seat> seatList=seatMap.get("Middle");
				   
				   if(seatList==null)
				   {
					   seatList=new ArrayList<>();
					   seatMap.put("Middle", seatList);
				   }
				   seatList.add(eachSeat);
				   
			   }
			   
			   else if(j==3 || j==6)
			   {
				   Seat eachSeat=new Seat();
				   eachSeat.setSeatNo(seatNo++);
				   eachSeat.setBerth("Upper");
				   List<Seat> seatList=seatMap.get("Upper");
				   
				   if(seatList==null)
				   {
					   seatList=new ArrayList<>();
					   seatMap.put("Upper", seatList);
				   }
				   seatList.add(eachSeat);
				   
			   }
			   
			   else if(j==9)
			   {
				   Seat eachSeat=new Seat();
				   eachSeat.setSeatNo(seatNo++);
				   eachSeat.setBerth("Side-Upper");
				   List<Seat> seatList=seatMap.get("Side-Upper");
				   
				   if(seatList==null)
				   {
					   seatList=new ArrayList<>();
					   seatMap.put("Side-Upper", seatList);
				   }
				   seatList.add(eachSeat);
				   
			   }
			   
			   else
			   {
				   Seat eachSeat=new Seat();
				   eachSeat.setSeatNo(seatNo++);
				   eachSeat.setBerth("RAC");
				   List<Seat> seatList=seatMap.get("RAC");
				   
				   if(seatList==null)
				   {
					   seatList=new ArrayList<>();
					   seatMap.put("RAC", seatList);
				   }
				   seatList.add(eachSeat);
			   }   
			   
		   }
		   
	   }
	   
	   

   }
	
	
}
