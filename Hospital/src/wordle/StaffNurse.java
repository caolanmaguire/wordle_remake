package wordle;

 

public class StaffNurse extends Nurse

{
	//data members
	int numStaff;
	int	numDoctors;
	double ratioNursePatient;
	double ratioDoctorPatient;
	
	//constructor
	public StaffNurse()
	{
		super();
		numStaff = getNumStaff();
		numDoctors = getNumDoctors();
		ratioNursePatient=setRatioNursePatient();
		ratioDoctorPatient=setRatioDoctorPatient();
	}
	
//methods*********************************************************		
//*********************************************************		
	
	public int getNumStaff()
	{
		System.out.println("How many staff are on your ward(including yourself)? ");
		numStaff = console.nextInt(); 
		return numStaff;
	}
	//*********************************************************		
	
	public int getNumDoctors()
	{
		System.out.println("How many doctors are involved with your ward? ");
		 numDoctors = console.nextInt(); 
		 return numDoctors;
	}
		
	//*********************************************************		
	public double setRatioNursePatient( )
	{	 
		ratioNursePatient =((double)numPatients/ numStaff);
		return ratioNursePatient;
	}
	
	//*********************************************************		
	public double setRatioDoctorPatient( )
	{  
		ratioDoctorPatient =((double)numPatients/ numDoctors);
		return ratioDoctorPatient;
	}
	//*********************************************************	
	
	public String toPrintFile()
	{
		String str1;
		
		str1 = super.toPrintFile();
		str1 +=   numStaff+ "\t" +numDoctors+ "\t"+"1:"+ratioNursePatient+ "\t"+"1:"+ratioDoctorPatient+ "\t"   ;
		 
		return str1;
	}
		
	//************************************************************		
	public String toString()
	{
		String str;
		
		str = super.toString();

		str +="Number of staff on ward: " +numStaff + "\n";
		str +="Number of doctors involved with your ward: " +numDoctors + "\n";
		str += "Ratio of nursing staff to patients:  1:"  +ratioNursePatient+ "\n";
		str += "Ratio of medical staff to patients:  1:"  +ratioDoctorPatient+ "\n";
		return str;
	}
	
}//end class StaffNurse
