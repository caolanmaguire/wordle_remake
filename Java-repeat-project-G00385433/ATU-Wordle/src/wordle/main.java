package wordle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Calendar;

public class main {
	public static void main(String args[])throws FileNotFoundException {
		
		String WordleWord[] = new String[356];

		Scanner console = new Scanner(System.in);
		
		//output files for questionaire data
		PrintWriter FullWordDatabase = new PrintWriter("full_word_database.txt");
				
		Calendar calOne = Calendar.getInstance();
		int dayOfYear = calOne.get(Calendar.DAY_OF_YEAR);
				
        File logo_file = new File(System.getProperty("user.dir") + "/src/asci-logo");
        Scanner ascilogo = new Scanner(logo_file);
        
        while (ascilogo.hasNextLine()) {
            System.out.println(ascilogo.nextLine());
        }
		
        ascilogo.close();
        
        File file = new File(System.getProperty("user.dir") + "/src/wordle_db");
        Scanner WordleDB = new Scanner(file);
        int i = 0;
        while (WordleDB.hasNextLine()) {
        	WordleWord[i] = WordleDB.nextLine();
        	i++;
        }
        
        WordleDB.close();
        
        //Start wordle logic
        String WordleOfTheDay = WordleWord[dayOfYear - 1].toUpperCase();
    
   
        String WordleOfTheDayArray[] = new String[6];
        String AttemptWordleOfTheDayArray[] = new String[6];
        String wordleGuess = "";
        
        int m = 0;
        while(m != 6) {
        	WordleOfTheDayArray[m] = Character.toString(WordleOfTheDay.charAt(m)).toUpperCase();
        	m++;
        }
        
        int WordleCounter = 0;
        int WordleFound = 0;
      
        do
		{
			System.out.print("Enter your guess for the wordle : ");
			if (wordleGuess != "") {
				//System.out.println(wordleGuess.length());
				if(wordleGuess.length() != 6) {
					System.out.println("\nPlease enter a 6 letter word next time.");
					break;
				}
			}
			wordleGuess = console.nextLine();
			wordleGuess = wordleGuess.toUpperCase();

			// using simple iteration over the array elements
			//user has found the correct word
			if(wordleGuess.equals(WordleOfTheDay)) {
	        	WordleFound = 1;
	        	break;
	        }
	        
			
			for (int n = 0; n < WordleOfTheDayArray.length; n++) {
					AttemptWordleOfTheDayArray[n] = Character.toString(wordleGuess.charAt(n));
			}
			
//			for (int xy = 0; xy < WordleOfTheDayArray.length; xy++) {
//				if (WordleOfTheDayArray[xy].equals(AttemptWordleOfTheDayArray[xy])) {
//					System.out.print("found one : ");
//					System.out.println(AttemptWordleOfTheDayArray[xy]);
//				}
//			}
			
			
			int CorrectLetters = 0;
			for(int q = 0; q < AttemptWordleOfTheDayArray.length; q++) {
				if (WordleOfTheDayArray[q].equals(AttemptWordleOfTheDayArray[q])) {
					CorrectLetters++;
					System.out.print(AttemptWordleOfTheDayArray[q] + " ");
				}else {
					System.out.print(" _ ");	
				}
			}
			System.out.println("\n");
			
			if(CorrectLetters == 6) {
				WordleFound = 1;
			}
			
			WordleCounter++;
		} while (WordleCounter < 6);//checks for correct input
        
        if(WordleFound == 0) {
        	//User has not found word
        	System.out.println("Afraid you didn't guess the full word today - the word is : " + WordleOfTheDay);
        } else {
        	//User has found word
        	System.out.println("Well done - you won todays wordle! Come back tomorrow for another go at the game");
        }
        
		
		//close files
        
        FullWordDatabase.close();
        console.close();
	}//end main
	
}//end class
	