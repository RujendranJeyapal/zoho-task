package filestorage;
import java.io.File;
import java.io.FileInputStream;
import accounts.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import utility.CustomException;
import utility.Utility;
import bank.*;
import persistant.*;

public class FileHandling implements PersistantLayer
{
	private File cusFile=new File("/home/inc2/eclipse-workspace/BankingSystem/CustomerDetails.txt");
	private File accFile=new File("/home/inc2/eclipse-workspace/BankingSystem/AccountDetails.txt"); 
	private File cusIdFile=new File("/home/inc2/eclipse-workspace/BankingSystem/CusID");
	private File accIdFile=new File("/home/inc2/eclipse-workspace/BankingSystem/AccID");
    private static int customerID=0;
	private static int accountID=1000;
	

	
	
	public void writeCusDetails(Map<Integer,CustomerInfo> cusDetailsMap)throws CustomException
	{
         
		try( 
				FileOutputStream write=new FileOutputStream(cusFile);
				ObjectOutputStream writer=new ObjectOutputStream(write);)
		{
			writer.writeObject(cusDetailsMap);
		
		
		}
		catch(IOException ex)
		{
			throw new CustomException(ex);
		}
	}

	public void writeCusID(int cusID) throws CustomException
	{
		try( FileOutputStream write=new FileOutputStream(cusIdFile);
				ObjectOutputStream writer=new ObjectOutputStream(write);)
		{
			
			writer.writeInt(cusID);
		
		}
		catch(IOException ex)
		{
			throw new CustomException(ex);
		}
	}
	
	
	@SuppressWarnings("unchecked")
	public Map<Integer,CustomerInfo> readCusDetails()throws CustomException
	{
		Map<Integer,CustomerInfo> cusDetailsMap=new HashMap<>();
	
		if(cusFile.exists())
		{
		try(FileInputStream read=new FileInputStream(cusFile);
				ObjectInputStream reader=new ObjectInputStream(read);)
		{	
			 cusDetailsMap=(Map<Integer, CustomerInfo>) reader.readObject();
    
		}
		catch(IOException | ClassNotFoundException ex)
		{
			ex.printStackTrace();
			throw new CustomException(ex);
			
		}
		}
		return cusDetailsMap;
		
	}
	
	public int readCusID()throws CustomException
	{
		if(cusIdFile.exists())
		{
		try(FileInputStream read=new FileInputStream(cusIdFile);
				ObjectInputStream reader=new ObjectInputStream(read);)
		{	
			
			customerID=reader.readInt();	
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
			throw new CustomException(ex);
			
		}
		}
		return customerID;
		
	}
	

	public void writeAccDetails(Map<Integer,Map<Integer,AccountInfo>> accDetailsMap)throws CustomException
	{
		
		try( FileOutputStream write=new FileOutputStream(accFile);
				ObjectOutputStream writer=new ObjectOutputStream(write);)
		{
			writer.writeObject(accDetailsMap);
		}
		catch(IOException ex)
		{
			throw new CustomException(ex);
		}
	}
	
	public void writeAccID(int accID) throws CustomException
	{
		try( FileOutputStream write=new FileOutputStream(accIdFile);
				ObjectOutputStream writer=new ObjectOutputStream(write);)
		{		
			writer.writeInt(accID);
		}
		catch(IOException ex)
		{
			throw new CustomException(ex);
		}
	}
	@SuppressWarnings("unchecked")
	
	
	public Map<Integer,Map<Integer,AccountInfo>> readAccDetails()throws CustomException
	{
		Map<Integer,Map<Integer,AccountInfo>> accDetailsMap=new HashMap<>();
		if(accFile.exists())
		{
		try(FileInputStream read=new FileInputStream(accFile);
				ObjectInputStream reader=new ObjectInputStream(read);)
		{
		accDetailsMap=(Map<Integer,Map<Integer,AccountInfo>>) reader.readObject();
		}
		catch(IOException | ClassNotFoundException ex)
		{
			ex.printStackTrace();
			throw new CustomException(ex);
		}
		}
		return accDetailsMap;
	}
	
	public int readAccID()throws CustomException
	{
		if(accIdFile.exists())
		{
		try(FileInputStream read=new FileInputStream(accIdFile);
				ObjectInputStream reader=new ObjectInputStream(read);)
		{	
			
			accountID=reader.readInt();	
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
			throw new CustomException(ex);
			
		}
		}
		return accountID;
		
	}
	
	@Override
	public int addCusInfo(CustomerInfo customerInfo)throws CustomException
	{
		Map<Integer,CustomerInfo> cusDetailsMap=readCusDetails();
		readCusID();
		Utility.objectCheck(customerInfo,"CustomerInfo");
		int cusID=generateCusID();
		customerInfo.setCustomerId(cusID);	
		cusDetailsMap.put(cusID, customerInfo);
		writeCusDetails(cusDetailsMap);
		writeCusID(cusID);
		return cusID;
	}
	
	@Override
	public int addAccInfo(AccountInfo accountInfo)throws CustomException
	{
		int cusID=accountInfo.getCustomerId();
		cusIdCheck(cusID);
		Map<Integer,Map<Integer,AccountInfo>> accDetailsMap=readAccDetails();
		readAccID();
		int accID=generateAccID();
		accountInfo.setAccountId(accID);
		Map<Integer,AccountInfo> accDetails=accDetailsMap.get(cusID);
		if(accDetails==null)
		{
			accDetails=new HashMap<>();
			accDetailsMap.put(cusID, accDetails);
		}
		accDetails.put(accID,accountInfo);		
		writeAccDetails(accDetailsMap);
		writeAccID(accID);
		return accID;
	}
	

	public void setCustomerStatus(int cusId,int status)throws CustomException
	{
		Map<Integer,CustomerInfo> cusDetailsMap=readCusDetails();
		CustomerInfo cusDetails=getCusInfo(cusDetailsMap,cusId);
		if(status==0)
		{
		cusDetails.setStatus(false);
		System.out.println("Successfully Inactivate in File.....");
		}
		else if(status==1)
		{
		cusDetails.setStatus(true);	
		System.out.println("Successfully Activate in File.....");
		}
		else
		{
			throw new CustomException("Enter corresponding number only");
		}
		writeCusDetails(cusDetailsMap);
	}
	
	@Override
public void setAccountStatus(int cusId,int accId,int status)throws CustomException
{
	Map<Integer,Map<Integer,AccountInfo>> accDetailsMap=readAccDetails();	
	AccountInfo accDetails=getAccInfo(accDetailsMap,cusId,accId);
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

	writeAccDetails(accDetailsMap);
}


@SuppressWarnings("unused")
private CustomerInfo getCusInfo(Map<Integer,CustomerInfo> cusDetailsMap,int cusId)throws CustomException
{
	cusIdCheck(cusId);
	return  cusDetailsMap.get(cusId);
	
}


public CustomerInfo getCusInfo(int cusId)throws CustomException
{
	cusIdCheck(cusId);
	Map<Integer,CustomerInfo> cusDetailsMap=readCusDetails();
	return  cusDetailsMap.get(cusId);
	
}

private AccountInfo getAccInfo(Map<Integer,Map<Integer,AccountInfo>> accDetailsMap,int cusId,int AccId)throws CustomException
{
	cusIdCheck(cusId);
	Map<Integer,AccountInfo> accountDetails=accDetailsMap.get(cusId);
	Utility.objectCheck(accountDetails, "Account Is not Avilable and");
    return  accountDetails.get(AccId);	
}

public AccountInfo getAccInfo(int cusId,int AccId)throws CustomException
{
	cusIdCheck(cusId);
	Map<Integer,Map<Integer,AccountInfo>> accDetailsMap=readAccDetails();
	Map<Integer,AccountInfo> accountDetails=accDetailsMap.get(cusId);
	Utility.objectCheck(accountDetails, "Account Is not Avilable and");
    return  accountDetails.get(AccId);	
}

public void depositAmount(int cusId,int accId,int amount)throws CustomException
{
	Map<Integer,Map<Integer,AccountInfo>> accDetailsMap=readAccDetails();
	AccountInfo accDetails=getAccInfo(accDetailsMap,cusId,accId);
	Utility.objectCheck(accDetails,"AccountInfo");
	activationCheck(accDetails);
	double balance=accDetails.getAvailableBalance();
	accDetails.setAvailableBalance(balance+amount);		
	writeAccDetails(accDetailsMap);

}

public void withDrawAmount(int cusId,int accId,int amount)throws CustomException
{
	Map<Integer,Map<Integer,AccountInfo>> accDetailsMap=readAccDetails();
	AccountInfo accDetails=getAccInfo(accDetailsMap,cusId,accId);
	Utility.objectCheck(accDetails,"AccountInfo");
	activationCheck(accDetails);	
	double balance=accDetails.getAvailableBalance();
	if(balance<amount)
	{
		throw new CustomException("Amount out of range...!");
	}
	accDetails.setAvailableBalance(balance-amount);
	writeAccDetails(accDetailsMap);

}



private void cusIdCheck(int cusId)throws CustomException
{
	Map<Integer,CustomerInfo> cusDetailsMap=readCusDetails();
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




private int generateCusID()
{
	return ++customerID;
}

private int generateAccID()
{
	return ++accountID;
}




}
