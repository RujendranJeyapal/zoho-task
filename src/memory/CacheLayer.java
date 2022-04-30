package memory;
import spots.*;
import customer.*;
import ticket.*;
import java.util.*;
import utility.*;

public class CacheLayer 
{
	private static Map<String,List<Spot>> spotsMap=new HashMap<>();
	private static Map<Integer,CustomerInfo> cusDetailsMap=new HashMap<>();
	private static Map<String,Ticket> ticketsMap=new HashMap<>();
	private static Map<Long,Integer> cusIDStoreMap=new HashMap<>();

	
	private int ticketId=1;

	
	

	public Ticket bookTicket(CustomerInfo customerInfo,String vehicleType,String vehicleNo) throws CustomException
	{
	    Ticket newTicket=new Ticket();
	    String ticketId=generateTicketId();
	    newTicket.setVehicleNumber(vehicleNo);
	    newTicket.setVehicleType(vehicleType);
	    newTicket.setTicketId(ticketId);
	    newTicket.setCusId(customerInfo.getCusId());
	    List<Spot> spotList=spotsMap.get(vehicleType);
	    Utility.objectCheck(spotList,"Spot ");
	    Spot eachSpot=spotList.get(0);
	    newTicket.setFloor(eachSpot.getFloorNo());
	    newTicket.setSpotNo(eachSpot.getspotNo());
	    addCusInfo(customerInfo);
	    newTicket.setParkingTime(System.currentTimeMillis());
	    ticketsMap.put(ticketId, newTicket);
	    spotList.remove(0);
		return newTicket;
	}
	
	public void addCusID(long mobileNo,int cusID)
	{
		cusIDStoreMap.put(mobileNo,cusID);
	}
	
	public Integer getCusID(long mobileNo)
	{
		return cusIDStoreMap.get(mobileNo);
	}
	
	
	public double getAmount(String ticketId) throws CustomException
	{
		Ticket ticket=ticketsMap.get(ticketId);
		Utility.objectCheck(ticket,"Ticket ");
		
		int spotNo=ticket.getSpotNo();
		int floor=ticket.getFloor();
		String vehicleType=ticket.getVehicleType();
		
		List<Spot> spotList=spotsMap.get(vehicleType);
		Utility.objectCheck(spotList,"Spot ");
		Spot eachSpot=new Spot();
		eachSpot.setCarType(vehicleType);
		eachSpot.setFloorNo(floor);
		eachSpot.setspotNo(spotNo);
		spotList.add(eachSpot);
		
		
		 long timeInMilli=System.currentTimeMillis()-ticket.getParkingTime();
		 
		 long min=timeInMilli/60000;
		 int hour=(int) Math.ceil(min/60);
		 double amount=4;
		 
		 for(int i=1;i<=hour;i++)
		 {
			 if(i==1)
			 {
				 amount=4;
			 }
			 if(i==2 || i==3)
			 {
				 amount+=3.5;
			 }
			 else
			 {
				 amount+=2.5;
			 }
		 }
		 
		 CustomerInfo customerInfo=cusDetailsMap.get(ticket.getCusId());
		 double valletAmount=customerInfo.getVallet();
		 
		 if(valletAmount>=amount)
		 {
			 customerInfo.setVallet(valletAmount-amount);
			 amount=0;
		 }
		 else
		 {
			 customerInfo.setVallet(0);
			 amount=amount-valletAmount;
		 }
		
		return amount;
	}
	
	
	public void addCusInfo(CustomerInfo customerInfo)
	{
		
		cusDetailsMap.put(customerInfo.getCusId(),customerInfo);
	}
	
	public CustomerInfo getCusInfo(int cusId) throws CustomException
	{
		CustomerInfo customerInfo=cusDetailsMap.get(cusId);
		Utility.objectCheck(customerInfo,"CustomerInfo ");
		return customerInfo;
	}
     

	  
	
	
	private String generateTicketId()
	{
		return "Ticket"+ticketId++;
	}
	
    public CacheLayer(int floor,int spot)
    {
    	int eachType=spot/5;
    	
    	
    	
    	for(int i=0;i<floor;i++)
    	{
    	     
    	
    	         for(int j=1;j<=spot;j++)
    	         {
    	        	 Spot eachSpot=new Spot();
    	        	 eachSpot.setFloorNo(i);
    	        //		List<Spot> spotList=new ArrayList<>();
    	        		
    	        	 if(j<=eachType)
    	        	 {
    	        	    eachSpot.setspotNo(j); 
        	            eachSpot.setCarType("Handicapped"); 
    	        		 
    	        		List<Spot> spotList=spotsMap.get("Handicapped");
    	        		
    	        		if(spotList==null)
    	        		{
    	        			spotList=new ArrayList<>();
    	        			spotsMap.put("Handicapped",spotList);
    	        		}
    	        		spotList.add(eachSpot);
    	        		 
    	        	 }
    	        	 
    	        	 else if(j<=2*eachType)
    	        	 {
    	        		 eachSpot.setspotNo(j); 
         	            eachSpot.setCarType("Large"); 
     	        		 
     	        		List<Spot> spotList=spotsMap.get("Large");
     	        		
     	        		if(spotList==null)
     	        		{
     	        			spotList=new ArrayList<>();
     	        			spotsMap.put("Large",spotList);
     	        		}
     	        		spotList.add(eachSpot);
    	        	 }
    	        	 
    	        	 else if(j<=3*eachType)
    	        	 {
    	        		 eachSpot.setspotNo(j); 
         	            eachSpot.setCarType("MotorCycle"); 
     	        		 
     	        		List<Spot> spotList=spotsMap.get("MotorCycle");
     	        		
     	        		if(spotList==null)
     	        		{
     	        			spotList=new ArrayList<>();
     	        			spotsMap.put("MotorCycle",spotList);
     	        		}
     	        		spotList.add(eachSpot);
    	        	 }
    	        	 
    	        	 else if(j<=4*eachType)
    	        	 {
    	        		 eachSpot.setspotNo(j); 
         	            eachSpot.setCarType("E-Vehicle"); 
     	        		 
     	        		List<Spot> spotList=spotsMap.get("E-Vehicle");
     	        		
     	        		if(spotList==null)
     	        		{
     	        			spotList=new ArrayList<>();
     	        			spotsMap.put("E-Vehicle",spotList);
     	        		}
     	        		spotList.add(eachSpot);;
    	        	 }
    	        	 
    	        	 else 
    	        	 {
    	        		 eachSpot.setspotNo(j); 
         	            eachSpot.setCarType("Compact"); 
     	        		 
     	        		List<Spot> spotList=spotsMap.get("Compact");
     	        		
     	        		if(spotList==null)
     	        		{
     	        			spotList=new ArrayList<>();
     	        			spotsMap.put("Compact",spotList);
     	        		}
     	        		spotList.add(eachSpot);
    	        	 }
    	        	 
    	        	 
    	        	
    	         }
    	     
    	             
    	}
    	
    
    		
    }
    
    public String get()
    {
    	String temp="";
    	for(String key:spotsMap.keySet())
    	{
    		List<Spot> ss=spotsMap.get(key);
    		
    		for(int i=0;i<ss.size();i++)
    		{
    			
    			temp+=ss.get(i).getVehicleType()+"      "+ss.get(i).getFloorNo()+"      "+ss.get(i).getspotNo();
                temp+="\n";    		
    		}
    		
    	}
    	
    	
		return temp;
    	
    }
    



}
