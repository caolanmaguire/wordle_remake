package wordle;

public class PaediatricSurgeon extends Surgeon implements Paediatric
{

	//data members
	int numBaby;
	int numU10;
	int numU16;
	int numNappy;
	 
	
	//constructor
	public PaediatricSurgeon()
	{
		super();
		numBaby = getNumBaby();
		numU10  = getNumU10();
		numU16  = getNumU16();	 
	}
	
	
//methods
//*********************************************	
	public int getNumBaby() 
	{
		System.out.println("How many babies do you operate on per day? ");
		numBaby = console.nextInt(); 
		return numBaby;	 
	}

//***************************************************	 
	public int getNumU10()
	{
		System.out.println("How many U10s do you operate on per day? ");
		numU10 = console.nextInt(); 
		return numU10;	
	}
//***************************************
	 
	public int getNumU16()
	{
		System.out.println("How many U16s do you operate on per day? ");
		numU16 = console.nextInt(); 
		return numU16;	
	}
//*******************************
	
	 
	public String toPrintFile()
	{
		String str1;
		
		str1 = super.toPrintFile();
		str1 +=   numBaby+ "\t" +numU10+ "\t" +numU16+ "\t"   ;
		 
		return str1;
	}


//************************************************************			
	public String toString()
	{
		String str;
		
		str = super.toString();

		str +="Number of babies operated on per day?: " +numBaby + "\n";
		str +="Number of u10s operated on per day?: " +numU10 + "\n";
		str +="Number of u16s operated on per day?: " +numU16 + "\n";
		return str;
	}	
	
	
}//end class paedSurgeon
