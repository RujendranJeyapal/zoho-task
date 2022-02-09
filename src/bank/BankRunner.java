package bank;
import utility.*;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BankRunner 
{
	Scanner input=new Scanner(System.in);
	APILayer callAPI=new APILayer();
	
	Map newMap=new HashMap();
	
	Map newMap1=new HashMap();
	void addCusDetails()
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
			int customerId=callAPI.generateCusID();
			cusDetails.setCustomerId(customerId);
			cusDetails.setName(name);
			cusDetails.setAddress(address);
			cusDetails.setMobileNo(mobileNo);
			
			newMap=callAPI.addCusInfo(cusDetails);
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
	
	
	void printCusDetails()
	{
		System.out.println(newMap);
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
		int accountId=callAPI.generateAccID();
		System.out.println("Set Branch Name");
		String branch=input.nextLine();
		System.out.println("Set Account Number");
		long accountNo=input.nextLong();
		input.nextLine();
		accDetails.setCustomerId(customerId);
		accDetails.setAccountId(accountId);
		accDetails.setBranch(branch);
		accDetails.setAccountNo(accountNo);

		newMap1=callAPI.addAccInfo(accDetails);
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
	
	
	void printAccDetails()
	{
		System.out.println(newMap1);
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
		System.out.println("1. Add Customer Details \n2. Add Account Details \n3. Set Customer ID status \n4. Set Account ID status \n5. Deposit Amount \n6. Withdraw Amount \n7. Get Customer "
				+ "Detail \n8. Get Account Detail \n9. Show Customers Details \n10. Show Accounts Details");
				
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
	    	objForRunner.addCusDetails();
	    	break;
	    	 
	    case 2:

	        objForRunner.addAccDetails();
	        break;
	    
	    case 3:
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
	    	
	    case 4:
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
	    case 5:
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
	    	
	    case 6:
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
	    	
	    case 7:
	    	try
	    	{
	    	System.out.println("Enter the Customer ID");
	    	int cusId=input.nextInt();
	    	System.out.println(callAPI.getCusInfo(cusId));
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
	    	int cusId8=input.nextInt();
	    	System.out.println("Enter the Account ID");
	    	int accId8=input.nextInt();
	    	System.out.println(callAPI.getAccInfo(cusId8, accId8));
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
	    	objForRunner.printCusDetails();
	    	break;
	    
	    case 10:
	    	objForRunner.printAccDetails();
	    	break;
	    	
	    	
	    default:
	    	System.out.println("Invalid input");
	    	condition=false;
	    }
	    }
	    
		
	}

}