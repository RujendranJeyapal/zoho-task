package threadtask;
import java.util.*;
public class ThreadRunner
{

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int questionNo=0;
		System.out.println("Enter the Question Number");
		try
		{
			questionNo=input.nextInt();
		}
		catch(Exception ex)
		{
			System.out.println("Please enter the Question Number");
		}
		input.nextLine();
		ExtendedThread objForLogic=new ExtendedThread();
		RunnableThread objForRunnable=new RunnableThread();
		Thread objForThread=new Thread(objForRunnable);
		switch(questionNo)
		{
		
		
		case 1:   
                     System.out.println(Thread.currentThread().getName());
                     System.out.println(Thread.currentThread().getPriority());
                     System.out.println(Thread.currentThread().getState());	      
                     objForLogic.start();	      
                     break;
             
	        case 2:
		
			 
		      System.out.println(Thread.currentThread().getName());
                      System.out.println(Thread.currentThread().getPriority());
                      System.out.println(Thread.currentThread().getState());
                      objForThread.start();
                      break;
             
		case 3:

		      System.out.println(Thread.currentThread().getName());
                     System.out.println(Thread.currentThread().getPriority());
                     System.out.println(Thread.currentThread().getState());
                     objForLogic.setName("Raman");
                     objForLogic.start();
		      System.out.println(Thread.currentThread().getName());
                     System.out.println(Thread.currentThread().getPriority());
                     System.out.println(Thread.currentThread().getState());
                     objForThread.setName("Lakshmanan");
                     objForThread.start();
                     break;
			
		case 4:
		      System.out.println("Howmany threads you want");
		      int count=input.nextInt();
		      input.nextLine();
		      System.out.println(Thread.currentThread().getName());
	              System.out.println(Thread.currentThread().getPriority());
	              System.out.println(Thread.currentThread().getState());
	              for(int i=0;i<count;i++)
	              {
	            	ExtendedThread objForLogic1=new ExtendedThread();
	               objForLogic1.setName("Raman"+i);
	               objForLogic1.start();
	              }
		        System.out.println(Thread.currentThread().getName());
	                System.out.println(Thread.currentThread().getPriority());
	                System.out.println(Thread.currentThread().getState());
	              for(int i=0;i<count;i++)
	              {
	        	 RunnableThread objForRunnable1=new RunnableThread();
	                Thread objForThread1=new Thread(objForRunnable1);
	                objForThread1.setName("Lakshmanan"+i);
	                objForThread1.start();
	              }
	              break;
				
		case 5:
			System.out.println("Howmany threads you want");
			int count1=input.nextInt();
			input.nextLine();
			
			 System.out.println(Thread.currentThread().getName());
	            System.out.println(Thread.currentThread().getPriority());
	            System.out.println(Thread.currentThread().getState());
	            ArrayList<ExtendedThread> newList=new ArrayList();
	            ArrayList<RunnableThread> newList1=new ArrayList();
	            ArrayList<Thread> newList2=new ArrayList();
	            for(int i=0;i<count1;i++)
	            {
	            	ExtendedThread objForLogic2=new ExtendedThread(60000);
	            objForLogic2.setName("Raman"+i);
	            newList.add(objForLogic2);
	            objForLogic2.start();
	            }
	            try
	            {
	            Thread.sleep(60000);
	            }
	            catch(Exception ex)
	            {
	            	
	            }
			   System.out.println(Thread.currentThread().getName());
	           System.out.println(Thread.currentThread().getPriority());
	           System.out.println(Thread.currentThread().getState());
	           for(int i=0;i<count1;i++)
	           {
	        	   RunnableThread objForRunnable2=new RunnableThread(45000);
	       		Thread objForThread2=new Thread(objForRunnable2);
	           objForThread2.setName("Lakshmanan"+i);
	           newList2.add(objForThread2);
	           objForThread2.start();
	           }
	           
	           for(int i=0;i<count1;i++)
	           {
	        	   ExtendedThread eachThread=newList.get(i);
	        	   eachThread.threadKill(true);
	        	   
	        	   RunnableThread eachThread1=newList1.get(i);
	        	   eachThread1.threadKill(true);
	        	  
	        	   
	           }
	           break;
		
	
			
			
			 
        default:
        	 System.out.println("Invalid Input...");
		}
	}

}
