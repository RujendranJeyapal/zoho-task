package accounts;

import java.io.Serializable;

@SuppressWarnings("serial")
public class AccountInfo implements Serializable
{
	private int customerId;
	private int accountId;
	private String branch;
	private boolean status=true;
	private double availableBalance=1000;
	
	
	public int getCustomerId() 
	{
		return customerId;
	}
	
	public void setCustomerId(int customerId)
	{
		this.customerId = customerId;
	}
	
	public int getAccountId()
	{
		return accountId;
	}
	
	public void setAccountId(int accountId)
	{
		this.accountId=accountId;
	}
	
	public String getBranch()
	{
		return branch;
	}
	
	public void setBranch(String branch) 
	{
		this.branch = branch;
	}
	
	public boolean getStatus() 
	{
		return status;
	}

	public void setStatus(boolean status) 
	{
		this.status = status;
	}

	public double getAvailableBalance() 
	{
		return availableBalance;
	}

	public void setAvailableBalance(double availableBalance) 
	{
		this.availableBalance = availableBalance;
	}

	@Override
	public String toString() 
	{
		return "[CustomerId:" + customerId + ", AccountId:" + accountId + ", Branch:" + branch
				 + ", Status:" + status + ", AvailableBalance:" + availableBalance + "]";
	}

	
	

	


	
	
	
	
	
	
	
	
	
	

}
