package task4;
import java.util.*;
public class HashMapLogic
{
private void nullCheckForMap(Map<Object,Object> actualMap)throws NullException
{
if(actualMap==null)
{
throw new NullException("Don't Enter a null...!");
}
}

public Map createMap()
{
Map<Object,Object> newMap=new HashMap<Object,Object>();
return newMap;
}

public int sizeOfMap(Map actualMap)throws NullException
{
nullCheckForMap(actualMap);
return actualMap.size();
}

public Map addMap(Map<Object,Object> actualMap,Object key,Object value)throws NullException
{
nullCheckForMap(actualMap);
actualMap.put(key,value);
return actualMap;
}

public boolean checkKeyExists(Map<Object,Object> actualMap,Object key)throws NullException
{
nullCheckForMap(actualMap);
return actualMap.containsKey(key);
}

public boolean checkValueExists(Map<Object,Object> actualMap,Object value)throws NullException
{
nullCheckForMap(actualMap);
return actualMap.containsValue(value);
}



public Object getValueInKey(Map<Object,Object> actualMap,Object key)throws NullException
{
nullCheckForMap(actualMap);
Object value=actualMap.get(key);
return value;
}

public Object getValueInDefaultKey(Map<Object,Object> actualMap,Object key,Object defaultValue)throws NullException
{
nullCheckForMap(actualMap);
Object value=actualMap.getOrDefault(key,defaultValue);
return value;
}

public Map putAbsent(Map<Object,Object> actualMap,Object key,Object value)throws NullException
{
nullCheckForMap(actualMap);
actualMap.putIfAbsent(key,value);
return actualMap;
}


public Map removeKey(Map<Object,Object> actualMap,Object key)throws NullException
{
nullCheckForMap(actualMap);
actualMap.remove(key);
return actualMap;
}


public Map removeMatchValues(Map<Object,Object> actualMap,Object key,Object value)throws NullException
{
nullCheckForMap(actualMap);
actualMap.remove(key,value);
return actualMap;
}

public Map replaceValues(Map<Object,Object> actualMap,Object key,Object value)throws NullException
{
nullCheckForMap(actualMap);
actualMap.replace(key,value);
return actualMap;
}

public Map replaceValueFromValue(Map<Object,Object> actualMap,Object key,
                                                      Object oldValue,Object newValue)
                                                                        throws NullException
{
nullCheckForMap(actualMap);
actualMap.replace(key,oldValue,newValue);
return actualMap;
} 

public Map addTwoMaps(Map<Object,Object> actualMap,Map<Object,Object> oneMap)throws NullException
{
nullCheckForMap(actualMap);
nullCheckForMap(oneMap);
actualMap.putAll(oneMap);
return actualMap;
}                                                     
               
public Map clearMap(Map<Object,Object> actualMap)throws NullException     
{
nullCheckForMap(actualMap);
actualMap.clear();
return actualMap;
}                                                 
                                                      
}
