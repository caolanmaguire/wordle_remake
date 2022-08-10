package wordle;

public class Doctor extends HospitalWorker
{
	//data members
	int patientsSeen;
	int patientsDischarged;
	
	
	//constructor
	public Doctor()
	{
		super();
		patientsSeen = getPatientsSeen();
		patientsDischarged = getPatientsDischarged();
	}
	 
	//********************************************************		
	//********************************************************	
	
	public int getPatientsSeen()
	{
		System.out.println("How many patients do you see per day? ");
		patientsSeen = console.nextInt(); 
		 
		return patientsSeen;
	} 
	//********************************************************	
	
	public int getPatientsDischarged()
	{
		System.out.println("How many patients do you discharge per day? ");
		patientsDischarged = console.nextInt();  
		return patientsDischarged;
	}
	
	
	// ******************************************
	public String toPrintFile()
	{
		String str1;
		
		str1 = super.toPrintFile();
		str1 +=   patientsSeen+ "\t" +patientsDischarged+ "\t"   ;
		 
		return str1;
	}


	//************************************************************			
	public String toString()
	{
		String str;
		
		str = super.toString();

		str +="Number of patients seen per day: " +patientsSeen + "\n";
		str +="Number of patients discharged per day: " +patientsDischarged + "\n";
		return str;
	}
	
	
	
	
	

	
	
	
	
	
	
	
	
}//end class doctor
