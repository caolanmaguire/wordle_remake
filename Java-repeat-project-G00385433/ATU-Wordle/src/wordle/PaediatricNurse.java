package wordle;

public class PaediatricNurse extends Nurse implements Paediatric
{
	//data members
	int numBaby;
	int numU10;
	int numU16;
	int numNappy;
	int numTotalNappy;
	
	//constructors
	public PaediatricNurse()
	{
		super();
		numBaby=getNumBaby();
		numU10 = getNumU10();
		numU16 = getNumU16();
		numNappy = getNappy();
		numTotalNappy = getTotalNappy();
	}
	
//methods	
//**********************************	 
	public int getNumBaby() 
	{
		System.out.println("How many babies are on your ward? ");
		numBaby = console.nextInt(); 
		return numBaby;	 
	}

//**********************************		 
	public int getNumU10()
	{
		System.out.println("How many U10s are on your ward? ");
		numU10 = console.nextInt(); 
		return numU10;	
	}
//**********************************	
	 
	public int getNumU16()
	{
		System.out.println("How many U16s are on your ward? ");
		numU16 = console.nextInt(); 
		return numU16;	
	}
	//**********************************		
	public int getNappy() 
	{
		System.out.println("How many nappies per baby do you change a day? ");
		numNappy = console.nextInt(); 
		return numNappy;	 
	}
	//**********************************	
	public int getTotalNappy() 
	{
		 
		numTotalNappy = numNappy* numBaby;
		
		return numTotalNappy;	 
	}
	//*******************************************
	public String toPrintFile()
	{
		String str1;
		
		str1 = super.toPrintFile();
		str1 +=   numBaby+ "\t" +numTotalNappy+ "\t"+"1:"+numU10+ "\t"+"1:"+numU16+ "\t"   ;
		 
		return str1;
	}
		
	//************************************************************	
	public String toString()
	{
		String str;
		
		str = super.toString();
		str += "Number of babies on ward: "+numBaby +"\n";
		str +="Number of nappies changed per day: "+numTotalNappy+"\n";
		str +="Number of U10s on ward: " +numU10 +"\n";
		str +="Number of U16s on ward: " +numU16 +"\n";
		 
		return str;
	}
	


}//end class PaediatricNurse
