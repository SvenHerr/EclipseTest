package KlausurWS13_14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class VocabularyTrainer extends AbstractVocabularyTrainer
{
	public static void main(String[]args) 
	{  // Wenn NullPointerException auftritt dann zum Testen das Dictionary zuweißen
		VocabularyTrainer voc = new VocabularyTrainer();
		voc.dictionary.put("yes", "ja");
		voc.dictionary.put("no", "nein");
		voc.dictionary.put("yellow", "gelb");
		
		//System.out.println(voc.getRandomFirstLanguageWord());
		System.out.println(voc.testTranslation(voc.getRandomFirstLanguageWord().toLowerCase(), "ja"));
		
	}
	
	// Wenn NullPointerException auftritt dann zum Testen das Dictionary zuweißen
	protected Map<String, String> dictionary = new HashMap<>();
	//protected Map<String, String> dictionary = null;
	
	
	@Override
	public String readLineFromSystemIn() 
	{
		String output = "";
		//try(InputStreamReader is = new InputStreamReader(System.in); BufferedReader br = new BufferedReader(is))
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
			output = br.readLine();
		}
		catch(IOException e) 
		{
			output = "";
		}
		return output;
	}

	@Override
	public void load(String filename) throws IllegalArgumentException 
	{
		dictionary = new HashMap<>();
		
		//try(FileReader fr = new FileReader(filename); BufferedReader br = new BufferedReader(fr))
		try(BufferedReader br = new BufferedReader(new FileReader(filename)))
		{
			do 
			{
				String key = br.readLine().toLowerCase(); // vllt nötig für abschnitt "c"
				String value = br.readLine().toLowerCase(); // vllt nötig für abschnitt "c"
				
				if(key == null || value == null) 
				{
					break;
				}
				
				dictionary.put(key, value);
			}
			while(true);
			
		}
		catch(IOException e)
		{
			throw new IllegalArgumentException();
		}
	}

	@Override
	public String getRandomFirstLanguageWord() 
	{
		int randomNumber =(int) (Math.random() * dictionary.size()) ;
		int count = 0;
		
		for(String s : dictionary.keySet()) 
		{
			if(count == randomNumber) 
			{
				return s;
			}
			count++;
		}
		
		return null;
	}

	@Override
	public boolean testTranslation(String lang1, String lang2) 
	{
		lang1 = lang1.toLowerCase();
		System.out.println("lang1 "+ lang1);
		lang2 = lang2.toLowerCase();
		System.out.println("lang2 "+ lang2);
		
		if(! dictionary.containsKey(lang1)) 
		{
			return false;
		}
		
		String value =  dictionary.get(lang1).toLowerCase();		
		
		if(lang2.equals(value)) 
		{
			return true;
		}
			
		return false;
	}
}
