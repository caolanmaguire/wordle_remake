package wordle;

public class Surgeon extends Doctor
{
	//data members
	int numOperations;
	int numDayProcedures;
	int numStaffOnTeam;
	
	//constructor
	public Surgeon()
	{
		super();
		numOperations = getNumOperations();
		numDayProcedures = getNumDayProcedures();
		numStaffOnTeam = getNumStaffOnTeam();
	}
	
//***********************************	
	public int getNumOperations() 
	{
		System.out.println("How many operations do you do per day? ");
		numOperations = console.nextInt();  
		return numOperations;
	}
	
//*****************************************	
	public int getNumDayProcedures() 
	{
		
		System.out.println("How many day procedures do you do per day? ");
		numDayProcedures = console.nextInt();  
		return numDayProcedures;
	}
//***********************************	
	public int getNumStaffOnTeam() 
	{
		System.out.println("How many staff are on your operating team? ");
		numStaffOnTeam = console.nextInt();  
		return numStaffOnTeam;
	}
//**********************************	
//*******************************************
	public String toPrintFile()
	{
		String str1;
		
		str1 = super.toPrintFile();
		str1 +=   numOperations+ "\t" +numDayProcedures+ "\t" +numStaffOnTeam+ "\t"   ;
		 
		 return str1;
	}


//************************************************************			
	public String toString()
	{
		String str;
		
		str = super.toString();

		str +="Number of operations done per day: "     +numOperations + "\n";
		str +="Number of day procedures done per day: " +numDayProcedures + "\n";
		str +="Number of staff on team: " +numStaffOnTeam + "\n";
		return str;
	}
	
}//end class surgeon
