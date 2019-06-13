package uebungsblatt17;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;

public class Aufgabe3_Browser 
{
	public URL back() 
	{
		try 
		{
			// simulate: fetch last URL from Stack
			return Math.random() < 0.5 ? new URL("http://google.de") : null;
		} catch (MalformedURLException e) 
		{
			System.out.print("Fehler, da ich in Catch gelaufen bin");
			return null;
		}
	}

	public void retrieveSite(URL url) 
	{
		System.out.println(url);
		// ...
	}

	public static void main(String[] args) 
	{
		System.out.println("Normal back");
		Aufgabe3_Browser browser = new Aufgabe3_Browser();
		//URL back = browser.back();
		Optional<URL> backOptional = Optional.ofNullable(browser.back());

		//if (back != null)
		if(backOptional.isPresent())
		{
			URL back = browser.back();
			browser.retrieveSite(back);
		}		
	}
}
