package temporary;
import java.util.HashMap;
import java.util.Map;

import utility.CustomException;
import utility.Utility;
import customers.*;
import accounts.*;


public class CacheMemory 
{
	
public static Map<Integer,CustomerInfo>  cusDetailsMap=new HashMap<>();
public static Map<Integer,Map<Integer,AccountInfo>> accDetailsMap=new HashMap<>();


	
public Map<Integer,CustomerInfo> addCusInfo(int cusID,CustomerInfo customerInfo)
{	
	 cusDetailsMap.put(cusID, customerInfo);
	 return cusDetailsMap;
}



public Map<Integer,Map<Integer,AccountInfo>> addAccInfo(int accID,AccountInfo accountInfo)
{
	int cusID=accountInfo.getCustomerId();
	Map<Integer,AccountInfo> accDetails=accDetailsMap.get(cusID);
	if(accDetails==null)
	{
		accDetails =new HashMap<>();
		accDetailsMap.put(cusID, accDetails);
	}
	accDetails.put(accID, accountInfo);
	return accDetailsMap;
}

public void setCustomerStatus(int cusId,int status)throws CustomException
{
	
	CustomerInfo cusDetails=getCusInfo(cusId);
	if(status==0)
	{
	cusDetails.setStatus(false);
	System.out.println("Successfully Inactivate in Cache Memory.....");
	}
	else if(status==1)
	{
	cusDetails.setStatus(true);	
	System.out.println("Successfully Activate in Cache Memory.....");
	}
	else
	{
		throw new CustomException("Enter corresponding number only");
	}
}


public void setAccountStatus(int cusId,int accId,int status)throws CustomException
{
AccountInfo accDetails=getAccInfo(cusId,accId);
Utility.objectCheck(accDetails,"AccountInfo");
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



public CustomerInfo getCusInfo(int cusId)throws CustomException
{
cusIdCheck(cusId);
return  cusDetailsMap.get(cusId);

}


public AccountInfo getAccInfo(int cusId,int AccId)throws CustomException
{
cusIdCheck(cusId);
Map<Integer,AccountInfo> accountDetails=accDetailsMap.get(cusId);
Utility.objectCheck(accountDetails, "Account Is not Avilable and");
return  accountDetails.get(AccId);	
}

public void depositAmount(int cusId,int accId,int amount)throws CustomException
{
AccountInfo accDetails=getAccInfo(cusId,accId);
Utility.objectCheck(accDetails,"AccountInfo");
activationCheck(accDetails);
double balance=accDetails.getAvailableBalance();
accDetails.setAvailableBalance(balance+amount);	
}

public void withDrawAmount(int cusId,int accId,int amount)throws CustomException
{
AccountInfo accDetails=getAccInfo(cusId,accId);
Utility.objectCheck(accDetails,"AccountInfo");
activationCheck(accDetails);	
double balance=accDetails.getAvailableBalance();
if(balance<amount)
{
	throw new CustomException("Amount out of range...!");
}
accDetails.setAvailableBalance(balance-amount);
}



private void cusIdCheck(int cusId)throws CustomException
{
if(cusDetailsMap.get(cusId)==null)
{
throw new CustomException("Doesn't exist");
}
}



private void activationCheck(AccountInfo accDetails)throws CustomException
{
if(accDetails.getStatus()==false)
{
	throw new CustomException("Your account is InActivate");
}

}

@SuppressWarnings("unused")
private void activationCheck(CustomerInfo cusDetails)throws CustomException
{
if(cusDetails.getStatus()==false)
{
	throw new CustomException("Customer ID is InActivate");
}	
}

}
