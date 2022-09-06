package wordle;

 

public  class WordleQuestionaire extends HowWasYourWordle
{
	//data members

	int numWordlePerYear;
	int HowDifficult;
	String PersonName;
	 
	
	//constructor
	public WordleQuestionaire()
	{
		super();
		PersonName = getPersonName();
		HowDifficult = getNumDifficult();
		//numBeds = getNumBeds();
		//emptyBeds = setEmptyBeds(numPatients, numBeds);
	}
	
	//methods
	//************************************************	  
	public String getPersonName()
	{
		console.nextLine(); 
		System.out.println("What is your name? ");
		PersonName = console.nextLine();  
		  
		return PersonName;
	 }
//************************************************	  
	public int getNumDifficult()
	{
		System.out.println("On a scale of one to ten how hard was this wordle (in digits please)? ");
		numDifficult = console.nextInt();  
		  
		return numDifficult;
	}
 
			
			 
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
