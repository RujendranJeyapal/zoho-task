package file;

public class SingletonClass 
{
	
private static SingletonClass object;

private SingletonClass()
{
	
}
public static SingletonClass createObject()
{
if(object==null)
	synchronized(SingletonClass.class)
	{
		if(object==null)
		
		{
			object=new SingletonClass();
		}
		
		
	}

	
	return object; 
}
public void display()
{
	System.out.println("Hello");
}
}
