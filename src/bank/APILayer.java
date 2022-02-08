package bank;
import utility.*;
import java.util.*;


public class APILayer 
{
	
	
	
	 static Map<Integer,CustomerInfo> cusDetailsMap=new HashMap();
	 static Map<Integer,Map<Integer,AccountInfo>> accDetailsMap=new HashMap();
	
	 
	 int customerID=0; 
	 int accountID=1000;
	 




public Map addCusInfo(CustomerInfo customerInfo)throws CustomException
{	
	Utility.objectCheck(customerInfo,"CustomerInfo");
	int cusId=customerInfo.getCustomerId();
	cusDetailsMap.put(cusId, customerInfo);
	return cusDetailsMap;
}


public Map addAccInfo(AccountInfo accountInfo)throws CustomException
{
	Utility.objectCheck(accountInfo,"AccountInfo");
	int cusId=accountInfo.getCustomerId();
	cusIdCheck(cusId);
	int accId=accountInfo.getAccountId();
	Map<Integer, AccountInfo> accDetails=accDetailsMap.get(cusId);
	
	
	
	if(accDetails==null)
	{	
		  accDetails=new HashMap();		
		  accDetailsMap.put(cusId, accDetails);	  
	}
	
	
 	  accDetails.put(accId, accountInfo); 
      return accDetailsMap;
	
}


public CustomerInfo getCusInfo(int cusId)
{
	return  cusDetailsMap.get(cusId);
	
}

public AccountInfo getAccInfo(int cusId,int AccId)throws CustomException
{
	cusIdCheck(cusId);
	Map accountDetails=accDetailsMap.get(cusId);
    return (AccountInfo) accountDetails.get(AccId);	
}

public void depositAmount(int cusId,int accId,int amount)throws CustomException
{
	AccountInfo accDetails=getAccInfo(cusId,accId);
	activationCheck(accDetails);
	double balance=accDetails.getAvailableBalance();
	accDetails.setAvailableBalance(balance+amount);	
}


public void withDrawAmount(int cusId,int accId,int amount)throws CustomException
{
	AccountInfo accDetails=getAccInfo(cusId,accId);
	activationCheck(accDetails);	
	double balance=accDetails.getAvailableBalance();
	if(balance<amount)
	{
		throw new CustomException("Amount out of range...!");
	}
	accDetails.setAvailableBalance(balance-amount);
}

public void setCustomerStatus(int cusId,int status)throws CustomException
{
	
	CustomerInfo cusDetails=getCusInfo(cusId);
	if(status==0)
	{
	cusDetails.setStatus(false);
	System.out.println("Successfully Inactivate.....");
	}
	else if(status==1)
	{
	cusDetails.setStatus(true);	
	System.out.println("Successfully Activate.....");
	}
	else
	{
		throw new CustomException("Enter corresponding number only");
	}
	
}



public void setAccountStatus(int cusId,int accId,int status)throws CustomException
{
	AccountInfo accDetails=getAccInfo(cusId,accId);
	if(status==0)
	{
	accDetails.setStatus(false);
	System.out.println("Successfully Inactivate.....");
	}
	else if(status==1)
	{
	accDetails.setStatus(true);	
	System.out.println("Successfully Activate.....");
	}
	else
	{
		throw new CustomException("Enter corresponding number only");
	}
}





public int generateCusID()
{
	return ++customerID;
}

public int generateAccID()
{
	return ++accountID;
}



public void cusIdCheck(int cusId)throws CustomException
{
	if(cusDetailsMap.get(cusId)==null)
	{
	throw new CustomException("Doesn't exist");
	}
}
	
public void activationCheck(AccountInfo accDetails)throws CustomException
{
	if(accDetails.getStatus()==false)
	{
		throw new CustomException("Your account is activate");
	}
	
}

}
