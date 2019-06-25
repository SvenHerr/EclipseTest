package KlausurWS15_16;

import java.util.*;

public class Senderauswahl extends ASenderauswahl
{
	static int nummer = 1;
	List<Sender> listeAllerSender = new ArrayList<Sender>();
	protected Sender aktuellerSender;
	
	public Senderauswahl(String[] senderArray) 
	{
		for(int i = 0; i < senderArray.length; i++) 
		{
			Sender s = new Sender(nummer, senderArray[i]);
			nummer++;
			listeAllerSender.add(s);
		}
		aktuellerSender = listeAllerSender.get(0);
	}
	
	
	@Override
	public Sender wechselZuSenderMitNamen(String name) 
	{		
		for(Sender se : listeAllerSender) 
		{
			if(se.getSenderName().equals(name)) 
			{
				aktuellerSender = se;
			}
		}
			
		return aktuellerSender;
	}

	@Override
	public Sender wechselZuSenderMitNummer(int kanalNr) 
	{
		int fixedNumber = kanalNr -1; 
		if(fixedNumber < listeAllerSender.size()  && fixedNumber > 0) 
		{
			aktuellerSender = listeAllerSender.get(fixedNumber);
		}
				
		return aktuellerSender;
	}

	@Override
	public String toString() 
	{
		return "Aktuller Sender: "+ aktuellerSender.getSenderName() + "\n" + "Aktuelle Sender Nummer: "+ aktuellerSender.getKanalNr();
	}
}
