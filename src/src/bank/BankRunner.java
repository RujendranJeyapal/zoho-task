package bank;
import utility.*;
import customers.*;
import accounts.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import banklogic.*;


public class BankRunner 
{
	Scanner input=new Scanner(System.in);
	private APILayer callAPI=new APILayer();

private	void addCusDetails()
	{
		try
		{
		System.out.println("Howmany customers you add");
		int count=input.nextInt();
		input.nextLine();
		for(int i=0;i<count;i++)
		{
			CustomerInfo cusDetails=new CustomerInfo();
			System.out.println("Enter Customer Name");
			String name=input.nextLine();
			System.out.println("Enter Customer Address");
			String address=input.nextLine();
			System.out.println("Enter Customer Mobile Number");
			long mobileNo=input.nextLong();
			input.nextLine();
			cusDetails.setName(name);
			cusDetails.setAddress(address);
			cusDetails.setMobileNo(mobileNo);
			callAPI.addCusInfo(cusDetails);
		}
		}
		catch(CustomException ex)
		{
			System.out.println(ex.getMessage());
		}
		catch(Exception ex)
		{
		   System.out.println("Enter number only");	
		}
	}
	
	

	
	
	
	
	void addAccDetails()
	{
	try
	{
	System.out.println("Howmany Accounts you add");
	int count=input.nextInt();
	input.nextLine();
	for(int i=0;i<count;i++)
	{	
		
		AccountInfo accDetails=new AccountInfo();
		System.out.println("Enter the Customer ID");
		int customerId=input.nextInt();
		input.nextLine();	
		System.out.println("Set Branch Name");
		String branch=input.nextLine();
		accDetails.setCustomerId(customerId);
		accDetails.setBranch(branch);
		callAPI.addAccInfo(accDetails);
	}	
	}
	catch(CustomException ex)
	{
		System.out.println(ex.getMessage());
	}
	catch(Exception ex)
	{
		System.out.println("Enter number only");
	}
		
	}
	
	
	
	
	
	

public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
	    APILayer callAPI=new APILayer();
	    BankRunner objForRunner=new BankRunner();
		int caseNo = 0;
		boolean condition=true;
		  while(condition)
		    {
		System.out.println("Enter the Number");
		System.out.println("1. Read Customer Details \n2. Read "
				+ "Account Details \n3. Add Customer Details "
				+ "\n4. Add Account Details  \n5. Set Customer ID status \n6. Set Account ID "
				+ "status \n7. Deposit Amount \n8. Withdraw Amount \n9. Get Customer "
				+ "Detail From Cache \n10. Get Account Detail From Cache \n11. Get Customer "
				+ "Detail From File \n12. Get Account"
				+ " Detail From File \n13. Show Customer Details From Cache "
				+ "Memory \n14. Show Account Details From Cache Memory");
				
		try
		{
			 
		caseNo=input.nextInt();
		}
		catch(Exception ex)
		{
    		
			System.out.println("Please Enter number only: ");
		}
	    input.nextLine();
	
	    switch(caseNo)
	    { 
	    
	    
	    case 1:
	    	try 
	    	{
	   		callAPI.readCusDetails();
			} 
	    	catch (CustomException ex) 
	    	{
				System.out.println(ex);
			}
	    	break;
	    	
	  	 
	    case 2:
	    	try
	    	{
	    		callAPI.readAccDetails();
	    	}
	    	catch (CustomException ex) 
	    	{
				System.out.println(ex);
			}
	    	break;

	    	
	    case 3:
	    	objForRunner.addCusDetails();
	    	break;
	    	
	    	
	    case 4:
	    	objForRunner.addAccDetails();
	    	break;
	    	
	    	
	    case 5:
	    	try
	    	{
	    	System.out.println("Enter the Customer ID");
	    	int cusId3=input.nextInt();
	    	System.out.println("Press 0-->Inactivate and Press 1-->Activate ");
	    	int status=input.nextInt();
	    	callAPI.setCustomerStatus(cusId3, status);
	
	    	}
	    	catch(InputMismatchException ex)
	    	{
	    		System.out.println(ex);
	    		input.nextLine();
	    	}
	    	catch (CustomException ex) 
	    	{
				System.out.println(ex.getMessage());
	    	}
	    	
	    	break;
	    	
	    case 6:
	    	try
	    	{
	    	System.out.println("Enter the Customer ID");
	    	int cusId4=input.nextInt();
	    	System.out.println("Enter the Account ID");
	    	int accId4=input.nextInt();
	    	System.out.println("Press 0-->Inactivate and Press 1-->Activate");
	    	int status1=input.nextInt();
	    	callAPI.setAccountStatus(cusId4, accId4, status1);
	    	
	    	}
	    	catch(InputMismatchException ex)
	    	{
	    		System.out.println(ex);
	    		
	    		input.nextLine();
	    	} 
	    	catch (CustomException ex) 
	    	{
				System.out.println(ex.getMessage());
	    	}	
	    	break;
	    	
	    	
	    case 7:
	    	try
	    	{
	    	System.out.println("Enter the Customer ID");
	    	int cusId5=input.nextInt();
	    	System.out.println("Enter the Account ID");
	    	int accId5=input.nextInt();
	    	System.out.println("Howmuch Amount to you deposit");
	    	int amount=input.nextInt();
	    	callAPI.depositAmount(cusId5, accId5, amount);

	    	}
	    	catch(InputMismatchException ex)
	    	{
	    		System.out.println(ex);
	    		
	    		input.nextLine();
	    	} 
	    	catch (CustomException ex) 
	    	{
				System.out.println(ex.getMessage());
	    	}
	    	break;
	    	
	    case 8:
	    	try
	    	{
	    	System.out.println("Enter the Customer ID");
	    	int cusId6=input.nextInt();
	    	System.out.println("Enter the Account ID");
	    	int accId6=input.nextInt();
	    	System.out.println("Howmuch Amount to you WithDraw");
	    	int amount=input.nextInt();
	    	callAPI.withDrawAmount(cusId6, accId6, amount);
	    	
	    	}
	    	catch(InputMismatchException ex)
	    	{
	    		System.out.println(ex);
	    		
	    		input.nextLine();
	    	} 
	    	catch (CustomException ex) 
	    	{
				System.out.println(ex.getMessage());
	    	}
	    	break;
	  	
	    case 9:
	    	try
	    	{
	    	System.out.println("Enter the Customer ID");
	    	int cusId=input.nextInt();
	    	System.out.println(callAPI.getCusInfoFromCache(cusId));
	    	}
	    	catch(InputMismatchException ex)
	    	{
	    		System.out.println(ex);
	    		input.nextLine();
	    	}
	    	catch (CustomException ex) 
	    	{
				System.out.println(ex.getMessage());
	    	}
	    	break;
	    	 	    
	   
	    case 10:
	    	try
	    	{
	    	System.out.println("Enter the Customer ID");
	    	int cusId8=input.nextInt();
	    	System.out.println("Enter the Account ID");
	    	int accId8=input.nextInt();
	    	System.out.println(callAPI.getAccInfoFromCache(cusId8, accId8));
	    	}
	    	catch(InputMismatchException ex)
	    	{
	    		System.out.println(ex);
	    		
	    		input.nextLine();
	    	} 
	    	catch (CustomException ex) 
	    	{
				System.out.println(ex.getMessage());
	    	}
	    	break;
	 
	    case 11:
	    	try
	    	{
	    	System.out.println("Enter the Customer ID");
	    	int cusId=input.nextInt();
	    	System.out.println(callAPI.getCusInfoFromFile(cusId));
	    	}
	    	catch(InputMismatchException ex)
	    	{
	    		System.out.println(ex);
	    		input.nextLine();
	    	}
	    	catch (CustomException ex) 
	    	{
				System.out.println(ex.getMessage());
	    	}
	    	break;

	 /*   case 12:
	    	try
	    	{
	    	System.out.println("Enter the Customer ID");
	    	int cusId8=input.nextInt();
	    	System.out.println("Enter the Account ID");
	    	int accId8=input.nextInt();
	    	System.out.println(callAPI.getAccInfoFromFile(cusId8, accId8));
	    	}
	    	catch(InputMismatchException ex)
	    	{
	    		System.out.println(ex);
	    		
	    		input.nextLine();
	    	} 
	    	catch (CustomException ex) 
	    	{
				System.out.println(ex.getMessage());
	    	}
	    	break;	
	   */ 	
	    case 13:
	    	System.out.println(callAPI.showCusDetailsFromCache());
	    	break;
	    
	    case 14:
	    	System.out.println(callAPI.showAccDetailsFromCache());
	    	break;
	    
	    	
	    default:
	    	System.out.println("Invalid input");
	    	condition=false;
	    }
	    }
	    
		
	}

}