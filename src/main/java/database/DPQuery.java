package database;
import utility.*;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import accounts.AccountInfo;
import bank.CustomerInfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DPQuery 
{
	private String url="jdbc:mysql://localhost:3306/Banking";
	private String userName="root";
	private String password="Root@123";
	
@SuppressWarnings("unused")
private Statement getStatement()throws CustomException 
{
	
	try
	{
		
		Connection connection=DriverManager.getConnection(url,userName,password);
    
		return connection.createStatement();
	} 
    catch (Exception ex) 
    {
	     throw new CustomException(ex);
	}	
}


public void createTable(String query) throws CustomException
{
	try(Statement statement=getStatement();)
	{		
	statement.execute(query);		
	} 
	catch (SQLException ex) 
	{
		 throw new CustomException(ex);
	}

}


public int insertData(String query)throws CustomException
{
	int cusId;
	try(Statement statement=getStatement();)
	{
		
		statement.executeUpdate(query,statement.RETURN_GENERATED_KEYS);
		ResultSet result=statement.getGeneratedKeys();
		result.next();
		cusId=result.getInt(1);
	} 
	catch (SQLException ex) 
	{
		 throw new CustomException(ex);
	}
	return cusId;	
}

public void updateData(String query)throws CustomException
{
	try(Statement statement=getStatement();)
	{
		
		statement.executeUpdate(query);
	} 
	catch (SQLException ex) 
	{
		 throw new CustomException(ex);
	}
	
}

public Map<Integer,CustomerInfo> getCustomerDetailsMap(String query)throws CustomException, ClassNotFoundException
{
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	try(
			Connection connection=DriverManager.getConnection(url,userName,password);
			Statement statement=connection.createStatement(); )
	{	
		


		
		ResultSet result=statement.executeQuery(query);
		Map<Integer,CustomerInfo> cusDetailsMap=new HashMap<>(); 
			while(result.next())
			{
			   CustomerInfo customerInfo=new CustomerInfo();
			   customerInfo.setCustomerId(result.getInt("CustomerID"));
			   customerInfo.setName(result.getString("NAME"));
			   customerInfo.setAddress(result.getString("ADDRESS"));
			   customerInfo.setMobileNo(result.getLong("MobileNo"));
			   customerInfo.setStatus(result.getBoolean("Status"));
			   int cusID=customerInfo.getCustomerId();
			   cusDetailsMap.put(cusID, customerInfo);	   
			}
			return cusDetailsMap;
	} 
	catch (SQLException ex) 
	{
		 throw new CustomException(ex);
	}
}



public Map<Integer,Map<Integer,AccountInfo>> getAccountDetailsMap(String query)throws CustomException
{
	Map<Integer,Map<Integer,AccountInfo>> accDetailsMap=new HashMap<>(); 
	try(Statement statement=getStatement();)
	{
		
		ResultSet result=statement.executeQuery(query);
			while(result.next())
			{
			   AccountInfo accountInfo=new AccountInfo();
			   accountInfo.setCustomerId(result.getInt(1));
			   accountInfo.setAccountId(result.getInt(2));
			   accountInfo.setBranch(result.getString(3));
			   accountInfo.setStatus(result.getBoolean(4));
			   accountInfo.setAvailableBalance(result.getDouble(5));
			   int cusID=accountInfo.getCustomerId();
			   int accID=accountInfo.getAccountId();
			   Map<Integer,AccountInfo> accDetails=accDetailsMap.get(cusID);
			   if(accDetails==null)
			   {
			   accDetails=new HashMap<>();	   
			   accDetailsMap.put(cusID,accDetails);
			   }
			   accDetails.put(accID, accountInfo);
			}

	} 
	catch (SQLException ex) 
	{
		 throw new CustomException(ex);
	}
	return accDetailsMap;
}




}

