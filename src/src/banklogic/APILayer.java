package banklogic;
import utility.*;
import java.util.*;
import filestorage.*;
import temporary.*;
import customers.*;
import accounts.*;

public  class APILayer 
{	 
	
	private FileHandling callFile=new FileHandling();
	private CacheMemory storeCache=new CacheMemory();
	 
	 
public void addCusInfo(CustomerInfo customerInfo)throws CustomException
{	
	int customerID=callFile.addCusInfo(customerInfo);
	storeCache.addCusInfo(customerID,customerInfo);
}


public void addAccInfo(AccountInfo accountInfo)throws CustomException
{
	
	int accountID=callFile.addAccInfo(accountInfo);
    storeCache.addAccInfo(accountID,accountInfo);
}


public void readCusDetails()throws CustomException
{
	Map<Integer,CustomerInfo> cusDetailsMap=callFile.readCusDetails();

	CacheMemory.cusDetailsMap=cusDetailsMap;
	System.out.println(cusDetailsMap);
}


public void readAccDetails()throws CustomException
{
	Map<Integer,Map<Integer,AccountInfo>> accDetailsMap=callFile.readAccDetails();

	CacheMemory.accDetailsMap=accDetailsMap;
	System.out.println(accDetailsMap);
}


public CustomerInfo getCusInfoFromFile(int cusId)throws CustomException
{
	
	CustomerInfo customerInfo=callFile.getCusInfo(cusId);
	return customerInfo;
}
/*
public AccountInfo getAccInfoFromFile(int cusId,int AccId)throws CustomException
{
	AccountInfo accountInfo=callFile.getAccInfo(cusId, AccId);
	return accountInfo;
}
*/

public CustomerInfo getCusInfoFromCache(int cusId)throws CustomException
{
	
	CustomerInfo customerInfo=storeCache.getCusInfo(cusId);
	return customerInfo;
}

public AccountInfo getAccInfoFromCache(int cusId,int AccId)throws CustomException
{
	AccountInfo accountInfo=storeCache.getAccInfo(cusId, AccId);
	return accountInfo;
}

public void depositAmount(int cusId,int accId,int amount)throws CustomException
{
	callFile.depositAmount(cusId, accId, amount);
	storeCache.depositAmount(cusId, accId, amount);

}

public void withDrawAmount(int cusId,int accId,int amount)throws CustomException
{
	callFile.withDrawAmount(cusId, accId, amount);
	storeCache.withDrawAmount(cusId, accId, amount);
}

public void setCustomerStatus(int cusId,int status)throws CustomException
{
	
callFile.setCustomerStatus(cusId, status);
storeCache.setCustomerStatus(cusId, status);	
}


public void setAccountStatus(int cusId,int accId,int status)throws CustomException
{
callFile.setAccountStatus(cusId, accId, status);	
storeCache.setAccountStatus(cusId, accId, status);
}

public Map<Integer,CustomerInfo> showCusDetailsFromCache()
{
	return CacheMemory.cusDetailsMap;
}

public Map<Integer,Map<Integer,AccountInfo>> showAccDetailsFromCache()
{
	return CacheMemory.accDetailsMap;
}

/*
public Map<Integer,CustomerInfo> showCusDetailsFromFile()
{
	return FileHandling.cusDetailsMap;
}

public Map<Integer,Map<Integer,AccountInfo>> showAccDetailsFromFile()
{
	return FileHandling.accDetailsMap;
}
*/


}
