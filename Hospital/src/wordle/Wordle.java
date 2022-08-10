package wordle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Wordle {

	public static void main(String args[])throws FileNotFoundException {
		
		//String[] wordle_word = {};
		String WordleWord[] = new String[356];
		
		Scanner console = new Scanner(System.in);
		
		//output files for questionaire data
		//PrintWriter FullWordDatabase = new PrintWriter("full_word_database.txt");
		
		
		PrintWriter outFileN = new PrintWriter("nurse.txt");
		PrintWriter outFileSN = new PrintWriter("staffNurse.txt");
		PrintWriter outFileP = new PrintWriter("paedNurse.txt");
		PrintWriter outFileSP = new PrintWriter("studentNurse.txt");
		PrintWriter outFileD = new PrintWriter("doctor.txt");
		PrintWriter outFileS = new PrintWriter("surgeon.txt");
		PrintWriter outFilePS = new PrintWriter("paedSurgeon.txt");
		PrintWriter outFileMS = new PrintWriter("medicalStudent.txt");
		
		Calendar calOne = Calendar.getInstance();
		int dayOfYear = calOne.get(Calendar.DAY_OF_YEAR);
		//System.out.println(dayOfYear);
		
		String position;
		int error=0; //counts error exceptions
		int medStudentCount = 0;
		
		
//		System.out.println(System.getProperty("user.dir"));
        File logo_file = new File(System.getProperty("user.dir") + "/src/asci-logo");
        Scanner ascilogo = new Scanner(logo_file);
        
        int x = 0;
        while (ascilogo.hasNextLine()) {
            System.out.println(ascilogo.nextLine());
        	x++;
        }
		
//		System.out.println(System.getProperty("user.dir"));
        File file = new File(System.getProperty("user.dir") + "/src/wordle_db");
        Scanner hemp = new Scanner(file);
        int i = 0;
        while (hemp.hasNextLine()) {
        	WordleWord[i] = hemp.nextLine();
            //System.out.println(WordleWord[i]);
        	i++;
        }
        
        //Start wordle logic
        
        
        
        String WordleOfTheDay = WordleWord[dayOfYear - 1].toUpperCase();
        
   
        // String WordleOfTheDayArray = new String[6];
        String WordleOfTheDayArray[] = new String[6];
        String AttemptWordleOfTheDayArray[] = new String[6];
        
        int m = 0;
        while(m != 6) {
        	WordleOfTheDayArray[m] = Character.toString(WordleOfTheDay.charAt(m)).toUpperCase();
        	//System.out.println(WordleOfTheDayArray[m]);
        	m++;
        }
        
        String wordleGuess;
        
        int WordleCounter = 0;
        
        int WordleFound = 0;
        
        do
		{
			System.out.print("Enter your guess for the wordle : ");
			wordleGuess = console.nextLine();
			wordleGuess = wordleGuess.toUpperCase();

			// using simple iteration over the array elements
			
			if(wordleGuess.equals(WordleOfTheDay)) {
	        	System.out.println("WELL DONE YOU'VE GOT IT : YOU GOT THE WORD ON YOUR ");
	        	break;
	        }
	        
			
			for (int n = 0; n < WordleOfTheDayArray.length; n++) {
				//System.out.println(WordleOfTheDayArray[n]);
				
				//System.out.println(wordleGuess);
				
				//if(wordleGuess == WordleOfTheDayArray[n]) {
				if (WordleOfTheDayArray[n].equals(wordleGuess)) {
					System.out.println("Found one");
					AttemptWordleOfTheDayArray[n] = wordleGuess;
				}
			}
			
			for(int q = 0; q < AttemptWordleOfTheDayArray.length; q++) {
				if(AttemptWordleOfTheDayArray[q] == null) {
					System.out.print(" _ ");
				}else {
					System.out.print(AttemptWordleOfTheDayArray[q] + " ");	
				}
			}
			System.out.println("\n");
			
			WordleCounter++;
		} while (WordleCounter < 6);//checks for correct input
        
        if(WordleFound == 0) {
        	//User has not found word
        	System.out.println("Afraid you didn't guess the full word today - the word is : " + WordleOfTheDay);
        } else {
        	//User has found word
        	System.out.println("Well done - you won today wordle!");
        }
        
		//pre-while loop test
//		do
//		{
//			System.out.println("Would you like to start game (TYPE - START) / or exit (TYPE - EXIT) : ");//Are you a nurse(N) or doctor(D)? [press Q to quit questionaire] ");
//			position = console.nextLine();
//			position = position.toUpperCase();
//		}while ((!(position.equals("START")))&&(!(position.equals("EXIT"))));//checks for correct input
//		//}while ((!(position.equals("D")))&&(!(position.equals("N")))&&(!(position.equals("Q"))));//checks for correct input
//		
//		
//		int y = 0;
//		while(!(position.equals ("EXIT")))
//		{
//			System.out.println("ATTEMPT : " + y);
//			if  (position.equals ("N"))//worker is a type of nurse
//			{	
//				System.out.println("Are you a general nurse(G), staff nurse(S)\npaediatric nurse(P)or student paediatric nurse (SP)  ? ");
//				position = console.nextLine();
//				position = position.toUpperCase();
//				 
//				 try
//				 {
//				
//					 if (position.equals("G") )
//					 {
//						
//						HospitalWorker g1 = new Nurse();
//						System.out.println(g1.toString());
//						outFileN.print ( g1.getClass().getName());
//						outFileN.println (g1.toPrintFile());
//						 
//					 }
//					 else if (position.equals("S") )
//					 {
//						 HospitalWorker s1 = new StaffNurse();
//						 System.out.println(s1.toString());
//						 outFileSN.print ( s1.getClass().getName());  
//						 outFileSN.println (s1.toPrintFile());
//					 }
//					 
//					 else if (position.equals("P") )
//					 {
//						 HospitalWorker p1 = new PaediatricNurse();
//						 System.out.println(p1.toString());
//						 outFileP.print ( p1.getClass().getName());  
//						 outFileP.println (p1.toPrintFile());
//					 }
//					 else if (position.equals("SP") )
//					 {
//						 HospitalWorker sp1 = new StudentPaediatricNurse();
//						System.out.println(sp1.toString());
//						 outFileSP.print ( sp1.getClass().getName());  
//						 outFileSP.println (sp1.toPrintFile());
//					 }
//					 else
//					 {
//						 System.out.println("Wrong letter input");
//					 }
//				 }
//				 catch(BedException ex1)
//				 {
//					 System.out.println("There are more patients than beds!\nPlease take the time to refill the questionaire.\n.");
//					 error++;
//				 }
//			}
//			
//			else if(position.equals ("D"))//worker is a type of doctor
//			{
//				
//				System.out.println("Are you a general doctor(GD), Surgeon(S)\nPaediatric Surgeon(PS)or Medical Student (MS)  ? ");
//				position = console.nextLine();
//				position = position.toUpperCase();
//				
//				if (position.equals("GD") )
//				 {
//					HospitalWorker gd1 = new Doctor();
//					System.out.println(gd1.toString());
//					outFileD.print ( gd1.getClass().getName());  
//					outFileD.println (gd1.toPrintFile());
//				 }
//				else if (position.equals("S") )
//				 {
//					HospitalWorker gd1 = new Surgeon();
//					System.out.println(gd1.toString());
//					outFileS.print ( gd1.getClass().getName());  
//					outFileS.println (gd1.toPrintFile());
//				 }
//				else if (position.equals("PS") )
//				 {
//					HospitalWorker gd1 = new PaediatricSurgeon();
//					System.out.println(gd1.toString());
//					outFilePS.print ( gd1.getClass().getName());  
//					outFilePS.println (gd1.toPrintFile());
//				 }
//				else if (position.equals("MS") )
//				 {
//					HospitalWorker gd1 = new  MedicalStudent ();
//					System.out.println(gd1.toString());
//					outFileMS.print ( gd1.getClass().getName());  
//					outFileMS.println (gd1.toPrintFile());
//					medStudentCount++;
//				
//				 }
//				else
//				 {
//					 System.out.println("Wrong letter input");
//				 }
//			}
//			
//			if(error==0)
//			{
//				//System.out.println("Thank you for answering the questionaire!\n\n");
//			}
//			//post while loop test
//			do
//			{
//				System.out.print(" - - - - - - - - - - - - - - - - - - - -  - - - - - - - - - - - - - - - - - - - - ");
//				System.out.print("\n\n\n\n\n\n\n");
//				System.out.println("Would you like to start game (TYPE - START) / or exit (TYPE - EXIT) : ");//Are you a nurse(N) or doctor(D)? [press Q to quit questionaire] ");
//				position = console.nextLine();
//				position = position.toUpperCase();
//				error=0; //resets error 
//			}while ((!(position.equals("START")))&&(!(position.equals("EXIT"))));
//		 
//			y++;
//		}//end while not q
//		
//		System.out.println("Thank you for playing!");
//		
////		if(medStudentCount>0)
////		{
////		System.out.println("Medical Student will graduate in : "+MedicalStudent.gradYear);
////		}
		
		//close files
		
		 outFileN.close();
		 outFileSN.close();
		 outFileP.close();
		 outFileSP.close();
		 outFileD.close();
		 outFileS.close();
		 outFilePS.close();
		 outFileMS.close();
	}//end main
	
}//end class
	