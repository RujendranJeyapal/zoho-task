package reflection;

public class PojoReflection 
{
	private String name;
	private int id;
	
public PojoReflection()
{
	
}
public PojoReflection(String name,int id)
{
	this.name=name;
	this.id=id;
}

public String getName()
{
   return name;
}
public void setName(String name)
{
  this.name=name;	
}

public int getId()
{
	return id;
}

public void setId(int id)
{
	this.id=id;
}
public String toString()
{
	return name+"\n"+id;
}
}
