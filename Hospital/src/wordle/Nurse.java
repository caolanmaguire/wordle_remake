package wordle;

 

public  class Nurse extends HospitalWorker
{
	//data members
	int numPatients;
	int numBeds;
	int emptyBeds;
	String wardName;
	 
	
	//constructor
	public Nurse()
	{
		super();
		wardName = getWardName();
		numPatients = getNumPatients();
		numBeds = getNumBeds();
		emptyBeds = setEmptyBeds(numPatients, numBeds);
	}
	
	//methods
	//************************************************	  
	public String getWardName()
	{
		console.nextLine(); 
		System.out.println("What is the name of your ward? ");
		wardName = console.nextLine();  
		  
		return wardName;
	 }
//************************************************	  
	public int getNumPatients()
	{
		System.out.println("How many patients are on your ward? ");
		numPatients = console.nextInt();  
		  
		return numPatients;
	}
 
//************************************************	  
	public int getNumBeds()
	{
		System.out.println("How many beds are on your ward? ");
		numBeds = console.nextInt();  
			  
		return numBeds;
	}
//*********************************************************		
	public  int setEmptyBeds(int sNumPatients,int sNumBeds) throws BedException
	{
		emptyBeds = sNumBeds-sNumPatients;
		  
		if (emptyBeds<0)
		{
			throw  new BedException("not enough beds");
		}
				
		return emptyBeds;
	}
//********************************************************	
			
			 
	public String toPrintFile()
	{
		String str1;
				
		str1 = super.toPrintFile();
		str1 +=  wardName+ "\t"+ numPatients+ "\t" +numBeds+ "\t"+emptyBeds+ "\t"   ;
				 
		return str1;
	}
				
//************************************************************			
	public String toString()
	{
		String str;
				
		str = super.toString();
		str +="Name of ward:  "+wardName + "\n";
		str +="Number of patients on ward: " +numPatients + "\n";
		str +="Number of beds on ward: " +numBeds + "\n";
		str +="Number of empty beds on ward: " +emptyBeds + "\n";
		return str;
	}
			
			
			
			

			 
}//end class
