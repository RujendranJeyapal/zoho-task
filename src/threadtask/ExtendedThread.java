package threadtask;

public class ExtendedThread extends Thread
{
	int time;
	boolean condition=false;
	
	
public ExtendedThread()
{
	
}
	
public ExtendedThread(int time)
{
	this.time=time;
}
	
public void threadKill(boolean condition)
{
	this.condition=condition;
}
public void run()
{
	while(!condition)
	{
	System.out.println(currentThread().getName());
	System.out.println(currentThread().getPriority());
	System.out.println(currentThread().getState());
	
	System.out.println("Going to sleep:"+currentThread().getName());
	try
	{
	sleep(time);
	}
	catch(Exception ex)
	{
		
	}
	System.out.println("After Sleep:"+currentThread().getName());
    }
}
}