package file;

public class PojoClass 
{
private String name;
private int id;

public PojoClass()
{
	
}

public PojoClass(String name,int id)
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
	this.name= name;
	
}

public int getId() 
{
	return id;
}
public void setId(int id)
{
	this.id= id;
}
public String toString()
{
	return name+"\n"+id;
}
}

	

