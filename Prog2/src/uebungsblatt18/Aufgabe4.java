package uebungsblatt18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Scanner;
import java.util.List;

public class Aufgabe4 
{
	Map<String, ArrayList<String>> english2German = new HashMap<String, ArrayList<String>>();
	String wordToGuess;
	
	public void addToDictionary(String englishWord, ArrayList<String> germanWords)
	{
		english2German.put(englishWord, germanWords);
	}
	
	public String getWordToGuess() 	
	{
		return wordToGuess;
	}
	
	public void createWordToGuess() 
	{
		Set<String> keySet = english2German.keySet(); 			
		int randomIndex = (int)(Math.random()*keySet.size());
		
		Iterator<String> s = keySet.iterator();
		
		int i= 0;
		
		while(s.hasNext()) 
		{
			String word = s.next();
			
			if (i== randomIndex)
			{
				wordToGuess= word;
				return;
			}
			i++;
		}
	}
	
	public List<String> getCorrectList()
	{
		ArrayList<String> list = english2German.get(wordToGuess);
		List<String> list1  = list;
		
		return list1;
	}
	
	public boolean checkIfGuessedWordIsCorrect( String wordToCheck ) 
	{
		ArrayList<String> list = english2German.get(wordToGuess);
		if(list.contains(wordToCheck)) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public static void main(String[] args)
	{
		Aufgabe4 guessingGame = new Aufgabe4();
		ArrayList<String> clean = new ArrayList<String>();
		clean.add("reinigen");
		clean.add("säubern");
		clean.add("putzen");
		
		guessingGame.addToDictionary("to clean",clean );
		
		ArrayList<String> expand = new ArrayList<String>();
		expand.add("vergrößern");
		expand.add("wachsen");
		
		guessingGame.addToDictionary("to expand",expand );
		
		guessingGame.createWordToGuess();
		System.out.println(guessingGame.wordToGuess);
		
		List<String> correctWordList = guessingGame.getCorrectList();
		
		Scanner scan = new Scanner(System.in);
		String wordToCheck = scan.nextLine();
		scan.close();
		//String wordToCheck = "reinigen";  // zum testen
		//String wordToCheck = "wachsen";	// zum testen
		
		if(guessingGame.checkIfGuessedWordIsCorrect(wordToCheck)) 
		{
			System.out.println("Your answer was \""+wordToCheck+"\". Your answer is correct");
			System.out.print("Also correct would be: ");
			int count = 0;
			for(String s : correctWordList) 
			{
				count++;
				System.out.print(s);
				if(correctWordList.size() != count) 
				{
					System.out.print(" or ");
				}
			}	
		}
		else 
		{
			System.out.println("Your answer was \""+wordToCheck+"\", it is wrong");
			System.out.print("Correct would be: ");
			int count = 0;
			for(String s : correctWordList) 
			{
				count++;
				System.out.print(s);
				if(correctWordList.size() != count) 
				{
					System.out.print(" or ");
				}
			}	
		}
	}
}
