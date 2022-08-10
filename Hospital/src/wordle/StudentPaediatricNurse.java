package wordle;

public final class StudentPaediatricNurse extends PaediatricNurse implements Student
{
	//data members
	int gradYear;
	int currentYear;
	
	//constructor
	public StudentPaediatricNurse()
	{
		super();
		currentYear = getCurrentYear();
		gradYear = getGraduationYear();
	}
	
	
//methods	
//*********************************************************	
	public int getCurrentYear()
	{
		System.out.println("What year of your course are you in? ");
		currentYear = console.nextInt();
		return currentYear;
	}
//***********************************************************	
	public int getGraduationYear()
	{
		System.out.println("What year will you graduate? ");
		gradYear = console.nextInt();
		return gradYear;
	}
//**********************************************************
	
	public String toString()
	{
		String str;
		
		str = super.toString();
		str += "Current year of course: "+currentYear +"\n";
		str += "Graduation year: "+gradYear +"\n"; 
		 
		return str;
	}
	
	
	
}//end StudentPaediatricNurse
