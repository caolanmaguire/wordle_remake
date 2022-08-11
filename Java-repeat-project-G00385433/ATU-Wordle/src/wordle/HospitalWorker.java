package wordle;

import java.util.*;


public abstract class HospitalWorker {
	 
	//data members
	String name;
	String staffID;
	int hoursWorked;
	double hourlyRate;
	double weeklyWage;
	
	Scanner console = new Scanner(System.in);
	
	
	
	
//constructor	
	HospitalWorker()
	{
		name = getNameWorker();
		staffID = getStaffID();
		hoursWorked = getHoursWorked();
		hourlyRate = getHourlyRate();
		weeklyWage = setWeeklyWage(hoursWorked, hourlyRate); 
	}
	
// methods
//**************************************	
	public String getNameWorker()
	{
		System.out.println("What is your name? ");
		name = console.nextLine();
		  
		return name;
	}
//*****************************************	
	  
	public String getStaffID()
	{
			  
		System.out.println("What is your staff ID? ");
		staffID = console.nextLine();
		  
		return staffID;
	}
//************************************************		
	  	  
	public int getHoursWorked()
	{
		System.out.println("How many hours do you work per week? ");
		hoursWorked = console.nextInt();  
		  
		return hoursWorked;
	}
//*********************************************************		
 	
	public double getHourlyRate()
	{
		System.out.println("What is your hourly rate? ");
		hourlyRate = console.nextDouble();  
			  
		return hourlyRate;
	}
//*****************************************************		
	  
	public  double setWeeklyWage(int hoursWorked, double hourlyRate)
	{
		weeklyWage =this.hoursWorked * this.hourlyRate;
			
		return weeklyWage;
	}
//************************************************************	
	public String toPrintFile()
	{
		String str1;
		
		str1 ="\t" +  name+ "\t" +staffID+ "\t"+hourlyRate+ "\t"+hoursWorked+ "\t"+weeklyWage+ "\t" ;
		
		return str1;
	}
		
//**************************************
	public String toString()
	{
		String str;
		str = "Name: "+name +"\n";
		str +="Staff ID: "+staffID + "\n";
		str +="Hourly pay: "+hourlyRate + "\n";
		str +="Hours worked per week: "+hoursWorked + "\n";
		str +="Weekly wage: "+weeklyWage + "\n";
			 	
		return str;
	}
		
		 
		 
 
}//end of HosptialWorker Class
