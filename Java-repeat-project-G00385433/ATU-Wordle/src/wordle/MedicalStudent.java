package wordle;

public class MedicalStudent extends Doctor implements Student
{
	//data members
	static int gradYear;
	int currentYear;
	
	//constructor
	public MedicalStudent ()
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
	
	public String toPrintFile()
	{
		String str1;
		
		str1 = super.toPrintFile();
		str1 +=   currentYear+ "\t" +gradYear+ "\t"   ;
		 
		 return str1;
	}

	// ******************************************
	public String toString()
	{
		String str;
		
		str = super.toString();
		str += "Current year of course: "+currentYear +"\n";
		str += "Graduation year: "+gradYear +"\n"; 
		 
		return str;
	}
	
	
}
