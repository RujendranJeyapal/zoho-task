package threadtask;

public class RunnableThread implements Runnable
{
	int time;
	
	boolean condition=false;
	public RunnableThread()
	{
		
	}
	public void threadKill(boolean condition)
	{
		this.condition=condition;
	}
	public RunnableThread(int time)
	{
		this.time=time;
		
	}
	public void run()
	{
		
		while(!condition)
		{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getState());
		
		
		System.out.println("Going to sleep:"+Thread.currentThread().getName());
		try
		{
			Thread.sleep(time);
		}
		catch(Exception ex)
		{
			
		}
		System.out.println("After sleep:"+Thread.currentThread().getName());
		}
	}

}
