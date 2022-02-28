package database;
import java.util.Map;

import accounts.AccountInfo;
import customers.CustomerInfo;
import persistant.*;
import utility.CustomException;

public class DataBase implements PersistantLayer
{

	DPQuery callDp=new DPQuery();
	

	public void createCusTable()throws CustomException
	{
		String queryForCusTable="create table "
				+ "CustomerDetails(CustomerID int not null auto_increment,NAME varchar(50)"
				+ ",ADDRESS varchar(50),MobileNo bigint,Status tinyint,primary key(CustomerID));";
		
		callDp.createTable(queryForCusTable);		
		
	}
	
	public void createAccTable()throws CustomException
	{
		String queryForAccTable="create table AccountDetails(CustomerID int not null,"
				+ "AccountID int not null auto_increment,Branch varchar(50),Status tinyint,"
				+ "AvailableBalance int,primary key(AccountID),"
				+ "foreign key(CustomerID) references CustomerDetails(CustomerID));";

		callDp.createTable(queryForAccTable);
		callDp.createTable("alter table AccountDetails auto_increment=1001"); 
		
	}
	
	
	public int addCusInfo(CustomerInfo customerInfo)throws CustomException 
	{
		
		String name=customerInfo.getName();
		String address=customerInfo.getAddress();
		long mobileNo=customerInfo.getMobileNo();
		boolean status=customerInfo.getStatus();
		int cusId= callDp.insertData("insert into CustomerDetails set  NAME='"+name+"',"
				+ "ADDRESS='"+address+"',MobileNo="+mobileNo+",Status="+status);
		customerInfo.setCustomerId(cusId);
		return cusId;
	}
	

	
	public int addAccInfo(AccountInfo accountInfo)throws CustomException
	{
		int cusID=accountInfo.getCustomerId();
		String branch=accountInfo.getBranch();
		boolean status=accountInfo.getStatus();
		double availableBalance=accountInfo.getAvailableBalance();
		int accId=callDp.insertData("insert into AccountDetails set"
				+ " CustomerID="+cusID+",Branch='"+branch+"',Status="+
				status+",AvailableBalance="+availableBalance);
		accountInfo.setAccountId(accId);
		return accId;
	}

	
	public void setCustomerStatus(int cusId, int status)throws CustomException 
	{
		callDp.updateData("update CustomerDetails set Status="+status+" where CustomerID="+cusId);
	}

	
	public void setAccountStatus(int cusId, int accId, int status)throws CustomException 
	{
		
		callDp.updateData("update AccountDetails set Status="+status+" where CustomerID="+cusId+" and AccountID="+accId);
	}

	
	public CustomerInfo getCusInfo(int cusId)throws CustomException
	{
		Map<Integer,CustomerInfo> cusDetailsMap=readCusDetails();
		return cusDetailsMap.get(cusId);
	}


	public AccountInfo getAccInfo(int cusId, int accId)throws CustomException
	{
		cusIdCheck(cusId);
		Map<Integer,Map<Integer,AccountInfo>> accDetailsMap=readAccDetails();
		return accDetailsMap.get(cusId).get(accId);		
	}

	
	public void depositAmount(int cusId, int accId, int amount)throws CustomException 
	{
		AccountInfo accountInfo=getAccInfo(cusId,accId);
		double balance=accountInfo.getAvailableBalance();
		balance=balance+amount;
		callDp.updateData("update AccountDetails set AvailableBalance="+balance+" where CustomerID="+cusId+" and AccountID="+accId);
		
		
	}

	public void withDrawAmount(int cusId, int accId, int amount)throws CustomException 
	{
		AccountInfo accountInfo=getAccInfo(cusId,accId);
		double balance=accountInfo.getAvailableBalance();
		if(balance<amount)
		{
			throw new CustomException("Amount out of range in Cache...!");
		}
		balance=balance-amount;
		callDp.updateData("update AccountDetails set AvailableBalance="+balance+" where CustomerID="+cusId+" and AccountID="+accId);
		
		
	}



	public Map<Integer, Map<Integer, AccountInfo>> readAccDetails()throws CustomException 
	{
		Map<Integer,Map<Integer,AccountInfo>> accDetailsMap=callDp.getAccountDetailsMap("select * from AccountDetails;");
		return accDetailsMap;
		
	}


	
	public Map<Integer, CustomerInfo> readCusDetails()throws CustomException
	{	
		Map<Integer,CustomerInfo> cusDetailsMap=callDp.getCustomerDetailsMap("select * from CustomerDetails;");
		return cusDetailsMap;
	}


	
	private void cusIdCheck(int cusId)throws CustomException
	{
		Map<Integer,CustomerInfo> cusDetailsMap=readCusDetails();
		if(cusDetailsMap.get(cusId)==null)
		{
		throw new CustomException("Doesn't exist");
		}
	}


		
	@SuppressWarnings("unused")
	private void activationCheck(AccountInfo accDetails)throws CustomException
	{
		if(accDetails.getStatus()==false)
		{
			throw new CustomException("Your account is InActivate");
		}
		
	}

	

	

}
