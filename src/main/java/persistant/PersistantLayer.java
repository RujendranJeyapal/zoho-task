package persistant;
import utility.*;

import java.util.Map;

import accounts.AccountInfo;
import bank.CustomerInfo;

public interface PersistantLayer 
{
public int addCusInfo(CustomerInfo customerInfo)throws CustomException;
public int addAccInfo(AccountInfo accountInfo)throws CustomException;
public void setCustomerStatus(int cusId,int status)throws CustomException;
public void setAccountStatus(int cusId,int accId,int status)throws CustomException;
public CustomerInfo getCusInfo(int cusId)throws CustomException;
public AccountInfo getAccInfo(int cusId,int AccId)throws CustomException;
public void depositAmount(int cusId,int accId,int amount)throws CustomException;
public void withDrawAmount(int cusId,int accId,int amount)throws CustomException;
public Map<Integer,Map<Integer,AccountInfo>> readAccDetails()throws CustomException;
public Map<Integer,CustomerInfo> readCusDetails()throws CustomException;
}
