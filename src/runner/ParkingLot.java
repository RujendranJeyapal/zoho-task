package runner;
import java.util.*;
import customer.*;
import logic.*;
import utility.*;

public class ParkingLot 
{
	
public static void main(String[] args)
{
	
	
	Scanner input=new Scanner(System.in);
	
	System.out.println("How many floors you want");
	int floor=input.nextInt();
	System.out.println("How many spots you want");
	int spot=input.nextInt();
	APILayer callAPI=new APILayer(floor,spot);
	
	

	boolean flag=true;
	
	while(flag)
	{
	
	System.out.println("1.ENTRY \n0.EXIT");
	
	int option=input.nextInt();

	switch(option)
	{
	
	case 1:
		try
		{
			
			System.out.println("VehicleType     Floor     Spot");
			System.out.println(callAPI.get());

		CustomerInfo customerInfo=null;
	
		System.out.println("Enter the mobile Number");
		long mobileNo=input.nextLong();
	
		Integer cusID=callAPI.getCusID(mobileNo);
		

		
	    if(cusID==null)
	    {
	    	customerInfo=new CustomerInfo();
	    	cusID=callAPI.generateCusId();
	    	customerInfo.setCusId(cusID);
	    	customerInfo.setMobileNo(mobileNo);
	    	callAPI.addCusID(mobileNo,cusID);;
	    }
	    else
	    {
	    	customerInfo=callAPI.getCusInfo(cusID);
	    }
	    
        input.nextLine();
		System.out.println("Enter the Vehicle Number");
		String vehicleNo=input.nextLine();
		System.out.println("Enter the Vehicle Type");
		String vehicleType=input.nextLine();
		
		System.out.println("Take your Ticket");
		System.out.println(callAPI.bookTicket(customerInfo, vehicleType, vehicleNo));
	    
		
		double existAmount=customerInfo.getVallet();
		
	    System.out.println("Your vallet amount is "+existAmount+
	    		"Do you add your vallet \n Press 1-->add Press 0-->No ");
		int condition=input.nextInt();
		
		switch(condition)
		{
		case 1:
			System.out.println("Howmany amount do you add");
			double amount=input.nextDouble();
			customerInfo.setVallet(existAmount+amount);
			System.out.println("Amount add Successfully");
			break;
			
		case 0:
			System.out.println("Ok");
			break;
			
		default:
			System.out.println("Press 1 and 0 only");
			break;
		}
		
	
		}
		catch(CustomException ex)
		{
			System.out.println(ex.getMessage());
		}
        break;	    
        
        
	case 0:
		try
		{
	
		System.out.println("Enter the ticketId");
		String ticketId=input.next();
		double amount=callAPI.getAmount(ticketId);
		
		if(amount==0)
		{
			System.out.println("Don't pay");
		}
		else
		{
			
			System.out.println("Please Pay "+amount);
			int pay=input.nextInt();
			
			if(pay==amount)
			{
				System.out.println("Thankyou");
			}
			else
			{
				System.out.println("Please give correct amount");
			}
			
		}
		
		
		
		}
		catch(CustomException ex)
		{
			System.out.println(ex.getMessage());
		}
        break;
		
      default:
    	  
    	  System.out.println("Enter 1 and 0 only");
          flag=false;
          break;
	}
	
	}
	
}

}
