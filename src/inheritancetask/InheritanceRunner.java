package inheritancetask;

import java.util.*;

public class InheritanceRunner
{
	
	
	public void case2()
	{
		 Scanner input=new Scanner(System.in);
		
			 System.out.println("Enter the count of seats");
			 int seats=input.nextInt();
			 System.out.println("Enter the count of airbags");
			 int airBags=input.nextInt();
			 input.nextLine();
			 System.out.println("Enter the model of Car");
			 String model=input.nextLine();
			 System.out.println("Enter the Car color");
			 String color=input.nextLine();
			 Swift objForSwift=new Swift();
			 objForSwift.setSeats(seats);
			 objForSwift.setAirBags(airBags);
			 objForSwift.setModel(model);
			 objForSwift.setColor(color);
			 System.out.println("No of Seats:"+objForSwift.getSeats());
			 System.out.println("No of AirBags:"+objForSwift.getAirBags());
			 System.out.println("Car model:"+objForSwift.getModel());
			 System.out.println("Car color:"+objForSwift.getColor());
		
	}
	
	
	public void case3()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the count of seats");
		 int seats=input.nextInt();
		 System.out.println("Enter the count of airbags");
		 int airBags=input.nextInt();
		 input.nextLine();
		 System.out.println("Enter the model of Car");
		 String model=input.nextLine();
		 System.out.println("Enter the Car color");
		 String color=input.nextLine();
		 SCross objForSCross=new SCross();
		 objForSCross.setSeats(seats);
		 objForSCross.setAirBags(airBags);
		 objForSCross.setModel(model);
		 objForSCross.setColor(color);
		 System.out.println("No of Seats:"+objForSCross.getSeats());
		 System.out.println("No of AirBags:"+objForSCross.getAirBags());
		 System.out.println("Car model:"+objForSCross.getModel());
		 System.out.println("Car color:"+objForSCross.getColor());
		 System.out.println("Enter the year of make");
		 int yearOfMake=input.nextInt();
		 input.nextLine();
		 System.out.println("Enter the Engine Number");
		 String engineNumber=input.nextLine();
		 System.out.println("Enter the type");
		 String type=input.nextLine();
		 objForSCross.setYearOfMake(yearOfMake);
		 objForSCross.setEngineNumber(engineNumber);
		 objForSCross.setType(type);
		 System.out.println("Year Of Make:"+objForSCross.getYearOfMake());
		 System.out.println("Car Engine Number:"+objForSCross.getEngineNumber());
		 System.out.println("Car Type:"+objForSCross.getType());
		
	}
	
	
	public void createObject()
	{
		 XUV objForXUV=new XUV();
		 acceptCar(objForXUV);
		 SCross objForSCross=new SCross();
		 acceptCar(objForSCross);
		 Swift objForSwift=new Swift();
		 acceptCar(objForSwift);
	}
	
	
	
	
	public void acceptCar(Car object)
	{
		if(object instanceof XUV)
		{
			System.out.println("SUV");
		}
		if(object instanceof Swift)
		{
			System.out.println("Hatch");
		}
		if(object instanceof SCross)
		{
			System.out.println("Sedan");
		}
	}
	
	
	public void acceptSwift(Swift object)
	{
		System.out.println("I am swift");
	}
		

    public static void main(String[] args)
    
     {
    	
	 InheritanceRunner objForMain=new InheritanceRunner();
	 Scanner input=new Scanner(System.in);
	 int questionNo=0;
	 System.out.println("Enter the Question Number");
	 try
	 {
	 questionNo=input.nextInt();
	 }
	 catch(Exception ex)
	 {
		 System.out.println("Please enter the number");
	 }
	 input.nextLine();
	 switch(questionNo)
	 {
	 case 2:
		 try
		 {
			 
		 objForMain.case2();
		 }
		 catch(Exception ex)
		 {
			 System.out.println("Enter integers  only");
		 }
		 
		 break;
	 
	 case 3:	
		 try
		 {
		 objForMain.case3();
		 }
		 catch(Exception ex)
		 {
			 System.out.println("Enter integers  only");
		 }
		 break;
		 
		 
	 case 4:
		 objForMain.createObject();
		 break;
		 
	 case 5:
		 objForMain.createObject();
		 break;
		 
	 case 6:
		 Swift objForSwift=new Swift();
		 objForMain.acceptSwift(objForSwift);
		 Car objForCar=new Swift();
	//	 objForCar.accptSwift();
		 XUV objForXUV=new XUV();
		 SCross objForSCross=new SCross();
	//	 objForMain.acceptSwift(objForXUV);
	//	 objForMain.acceptSwift(objForSCross);
		 
		 
		 break;
		 
		 
	 case 7:
		 SCross objForSCross1=new SCross();
		 objForSCross1.maintanance();
		 Car obj=new SCross();
		 obj.maintanance();
		 Car objForCar1=new Car();
		 objForCar1.maintanance();
		 Swift objForSwift1=new Swift();
		 objForSwift1.maintanance();
		 break;
		 
		 
	 case 8:
		 XUV objForXUV1=new XUV();
	//	 XUV objForXUV2=new XUV("Name");
		 break;
		 
	 case 9:
	//	 BirdAbstract objForAbstract=new BirdAbstract();
		 ParrotMod objForParrot=new ParrotMod();
		 objForParrot.fly();
		 objForParrot.speak();
		 break;
		 
	 case 10:
		 Duck objForDuck=new Duck();
		 objForDuck.fly();
		 break;
		 
	 default:
			 System.out.println("Invalid Input...!");
	 }
     }

     }
