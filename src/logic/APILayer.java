package logic;
import ticket.*;
import utility.CustomException;
import utility.Utility;
import customer.*;
import memory.CacheLayer;

public class APILayer
{
   
    CacheLayer callCache=null;
	public APILayer(int floor,int spot)
	{
	  
	    callCache=new CacheLayer(floor,spot);
	}
	
	
	
	
	
	private int cusId=1;
       
    public Ticket bookTicket(CustomerInfo customerInfo,String vehicleType,String vehicleNo) throws CustomException
    {
         return callCache.bookTicket(customerInfo, vehicleType, vehicleNo);
    }
       
    public double getAmount(String ticketId) throws CustomException
   	{
        return callCache.getAmount(ticketId);
   	}
    
    public void addCusInfo(CustomerInfo customerInfo)
	{
		callCache.addCusInfo(customerInfo);
	}
	
	public CustomerInfo getCusInfo(int cusId) throws CustomException
	{
	    return callCache.getCusInfo(cusId);
	}
       
   	public void addCusID(long mobileNo,int cusID)
   	{
   		callCache.addCusID(mobileNo, cusID);
   	}
   	
   	public Integer getCusID(long mobileNo)
   	{
   		return callCache.getCusID(mobileNo);
   	}
   	
   	
	public int generateCusId()
	{
		return cusId++;
	}
	
	public String get()
	{
		return callCache.get();
	}

	
}
