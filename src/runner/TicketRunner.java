package runner;
import java.util.*;
import passenger.*;

public class TicketRunner 
{

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		boolean condition=true;
		
  while(condition)
  {
		System.out.println("Press 1--> Book\nPress 2--> Cancel\n"
				+ "Press 3--> Print Booked Tickets\nPress 4--> Print Available Tickets");
		int option=input.nextInt();
		input.nextLine();
		switch(option)
		{
		case 1:
			System.out.println("Enter the Name");
			String name=input.nextLine();
			System.out.println("Enter the Age");
			int age=input.nextInt();
			boolean condition1=true;
		    String gender="";
			while(condition1)
			{
			System.out.println("Choose the Gender\nPress 1--> Male\nPress 2--> Female");
            int choose=input.nextInt();
        
            
            switch(choose)
            {
                  case 1:
                        gender="Male";
                        condition1=false;
                        break;
                    
                  case 2: 
                	    gender="Female";
                	    condition1=false;
                	    break;
                	  
                  default:
                	    System.out.println("Enter 1 or 2 only");
                	  
                	    break;
            
            }
			}
            
            String berthPref="";
            boolean condition2=true;
            while(condition2)
            {
            System.out.println("Choose your berth Preference\nPress 1--> Lower\n"
            		+ "Press 2--> Middle\nPress 3--> Upper\n"
            		+ "Press 4--> Side-Upper");
            
            int berth=input.nextInt();
            
            switch(berth)
            {
            case 1:
            	
            	berthPref="Lower";
            	condition2=false;
            	break;
            	
            case 2:
            	
            	berthPref="Middle";
            	condition2=false;
            	break;
            	
            case 3:
            	
            	berthPref="Upper";
            	condition2=false;
            	break;
            	
            case 4:
            	
            	berthPref="Side-Upper";
            	condition2=false;
            	break;
            		
            default:
            	System.out.println("Press correct number");
            
            	break;
            }
            
            }
            PassengerInfo passInfo=new PassengerInfo();
            
            passInfo.setName(name);
            passInfo.setGender(gender);
            passInfo.setAge(age);
            passInfo.setBerthPreference(berthPref);
            
            break;
            
            
            
		case 2:
			System.out.println("Enter your Ticket ID");
			String ticketId=input.nextLine();
			
			break;
			
		case 3:
			break;
			
		case 4:
			break;
			
		default:
         			
			System.out.println("Press Correct Number");
			condition=false;
			break;
		}
		

	}
	}

}
