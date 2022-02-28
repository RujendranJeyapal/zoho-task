package banklogic;
import utility.*;
import java.util.*;
import temporary.*;
import customers.*;
import accounts.*;
import persistant.*;

public  class APILayer 
{	 
	
	PersistantLayer storeMemory;
    Properties property=new Properties();

	public APILayer(boolean condition)
	{
		property.setProperty("File","filestorage.FileHandling");
		property.setProperty("database","database.DataBase");
		 String path=" ";
		if(condition)
		{
			 path=property.getProperty("File");
		}
		else
		{
			 path=property.getProperty("database");
		}
		
	
	try
	{
	Class<?> clsName=Class.forName(path);
	Object storeMemory=clsName.getDeclaredConstructor().newInstance();
	this.storeMemory=(PersistantLayer) storeMemory;
	}
	catch(Exception ex)
	{
		
	}
	}
	
	private CacheMemory storeCache=new CacheMemory();
	//DataBase db=new DataBase();
/*	 
public void createCusTable() throws CustomException
{
	db.createCusTable();
}

public void createAccTable() throws CustomException
{
	db.createAccTable();
}
*/
public void addCusInfo(CustomerInfo customerInfo)throws CustomException
{	
;
	int customerID=storeMemory.addCusInfo(customerInfo);
	storeCache.addCusInfo(customerID,customerInfo);
}


public void addAccInfo(AccountInfo accountInfo)throws CustomException
{	
	int accountID=storeMemory.addAccInfo(accountInfo);
	storeCache.addAccInfo(accountID, accountInfo);	
}


public void readCusDetails()throws CustomException
{
;
	Map<Integer,CustomerInfo> cusDetailsMap=storeMemory.readCusDetails();
	storeCache.setCusDetailsMap(cusDetailsMap);
	System.out.println(cusDetailsMap);
}


public void readAccDetails()throws CustomException
{

	Map<Integer,Map<Integer,AccountInfo>> accDetailsMap=storeMemory.readAccDetails();
	storeCache.setAccDetailsMap(accDetailsMap);
	System.out.println(accDetailsMap);

}


public CustomerInfo getCusInfoFromMemory(int cusId)throws CustomException
{
	
	CustomerInfo customerInfo=storeMemory.getCusInfo(cusId);
	return customerInfo;
}
public AccountInfo getAccInfoFromMemory(int cusId,int AccId)throws CustomException
{
	AccountInfo accountInfo=storeMemory.getAccInfo(cusId, AccId);
	return accountInfo;
}


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
	storeMemory.depositAmount(cusId, accId, amount);
	storeCache.depositAmount(cusId, accId, amount);	
}

public void withDrawAmount(int cusId,int accId,int amount)throws CustomException
{
	storeMemory.withDrawAmount(cusId, accId, amount);
	storeCache.withDrawAmount(cusId, accId, amount);	
}

public void setCustomerStatus(int cusId,int status)throws CustomException
{
    storeMemory.setCustomerStatus(cusId, status);		
    storeCache.setCustomerStatus(cusId, status);	
}


public void setAccountStatus(int cusId,int accId,int status)throws CustomException
{
    storeMemory.setAccountStatus(cusId,accId,status);		
    storeCache.setAccountStatus(cusId, accId, status);
}

public Map<Integer,CustomerInfo> showCusDetailsFromCache()
{
	return storeCache.getCusDetailsMap();
}

public Map<Integer,Map<Integer,AccountInfo>> showAccDetailsFromCache()
{
	return storeCache.getAccDetailsMap();
}



}
