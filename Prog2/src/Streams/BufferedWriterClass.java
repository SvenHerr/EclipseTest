package Streams;

import java.io.*;

public class BufferedWriterClass 
{
	public static void main(String[] args)
	{
		try(BufferedWriter br = new BufferedWriter(new FileWriter("BufferedText.txt"));)
		{
			String str = "Anfang Zeile 1 .................Ende Zeile 1 "+"\n"+
					"\n"+
					"Anfang Zeile 2 .................Ende Zeile 2 "+"\n"+
					"Anfang Zeile 3 .................Ende Zeile 3 "+"\n"+
					"Anfang Zeile 4 .................Ende Zeile 4 "+"\n"+
					"Anfang Zeile 5 .................Ende Zeile 5 "+"\n";
			
			br.write(str);
				
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
