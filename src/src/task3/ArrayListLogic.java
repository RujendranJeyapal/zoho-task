package task3;
import task.Task1;
import java.util.*;

public class ArrayListLogic
{

Task1 objectForTask1=new Task1();

public void nullCheckForList(List actualList)throws Exception
{
if(actualList==null)
{
throw new Exception("Don't Enter a null value..!");
}
}


public void numberLengthCheck(List actualList,int position)throws Exception
{
nullCheckForList(actualList);
if(position<0 || position>=sizeOfList(actualList))
{
throw new Exception("Invalid Input..!");
}
}



public List createList()
{
List emptyList=new ArrayList();
return emptyList;
}

public int sizeOfList(List actualList)throws Exception
{
nullCheckForList(actualList);
return actualList.size();
}

public List addObjects(List actualList,Object inputObject[])throws Exception
{
nullCheckForList(actualList);
actualList.addAll(Arrays.asList(inputObject));
return actualList;
}



public int findIndex(List actualList,String checkingString)throws Exception
{
nullCheckForList(actualList);
return actualList.indexOf(checkingString);
}

public int findLastIndex(List actualList,String checkingString)throws Exception
{
nullCheckForList(actualList);
return actualList.lastIndexOf(checkingString);
}

 
public String stringOfPosition(List actualList,int position)throws Exception 
{
nullCheckForList(actualList);
numberLengthCheck(actualList,position);
return (String)actualList.get(position);
}

public List insertList(List actualList,int position,String insertString)throws Exception
{
nullCheckForList(actualList);
numberLengthCheck(actualList,position);
actualList.add(position,insertString);
return actualList;
}

public List createListFromList(List actualList,int startingPosition,int endingPosition)throws Exception
{
nullCheckForList(actualList);
numberLengthCheck(actualList,startingPosition);
numberLengthCheck(actualList,endingPosition);
objectForTask1.positionCheck(startingPosition,endingPosition);
List subList=actualList.subList(startingPosition,endingPosition);
return subList;
}

public List addTwoLists(List oneList,List actualList)throws Exception
{
nullCheckForList(actualList);
nullCheckForList(oneList);
actualList.addAll(oneList);
return actualList;
}



public List removeFloat(List actualList,float deleteFloat)throws Exception
{
nullCheckForList(actualList);
actualList.remove(deleteFloat);
return actualList;
}


public List removePosition(List actualList,int position)throws Exception
{
nullCheckForList(actualList);
numberLengthCheck(actualList,position);
actualList.remove(position);
return actualList;
}

public List removeSameElement(List oneList,List anotherList)throws Exception
{
nullCheckForList(oneList);
nullCheckForList(anotherList);
oneList.removeAll(anotherList);
return oneList;
}


public List removeUnSameElement(List oneList,List anotherList)throws Exception
{
nullCheckForList(oneList);
nullCheckForList(anotherList);
oneList.retainAll(anotherList);
return oneList;
}

public List removeList(List actualList)throws Exception
{
nullCheckForList(actualList);
actualList.clear();
return actualList;
}



public boolean checkStringInList(List actualList,String inputString)throws Exception
{
nullCheckForList(actualList);
boolean same=actualList.contains(inputString);
return same;
}
}
