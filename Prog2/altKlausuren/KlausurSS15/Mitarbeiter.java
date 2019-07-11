package KlausurSS15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Mitarbeiter implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String vorname = null;
	private String nachname = null;
	private int nummer = 0;
	transient private int gehalt = 0; // transient = das Attribut wird nicht Serialisiert
	
	private static String fileName = "mitarbeiter.dat";
	
	public Mitarbeiter(String vorname, String nachname, int nummer, int gehalt) 
	{
		this.vorname = vorname;
		this.nachname = nachname;
		this.nummer = nummer;
		this.gehalt = gehalt;
	}

	public int getNummer() 
	{
		return nummer;
	}
	
	public String toString() 
	{
		return "Nachname: " +nachname +"\n"
				+ "Vorname: " + vorname +"\n" 
				+ "Personalnummer: "+ nummer +"\n"
				+ "Gehalt: "+gehalt +"\n";
	}
	
	
	public static void legDateiAn() 
	{	
		Mitarbeiter m = new Mitarbeiter("Hans", "Müller", 1, 3000);
		Mitarbeiter m1 = new Mitarbeiter("Frank", "Hubert", 4, 2500);
		Mitarbeiter m2 = new Mitarbeiter("Max", "Mustermann", 3, 4000);
		
		try(ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(new File(fileName))))
		{
			o.writeObject(m);
			o.writeObject(m1);
			o.writeObject(m2);
		}
		catch(Exception e) 
		{
			System.out.println("Fehler aufgetreten");
		}
	}
	public static Collection<Mitarbeiter> leseDatei()
	{
		Collection<Mitarbeiter> mitarbeiterList = new ArrayList<Mitarbeiter>();

		try(ObjectInputStream oi = new ObjectInputStream(new FileInputStream(new File(fileName))))
		{
			Mitarbeiter m = (Mitarbeiter) oi.readObject();
			mitarbeiterList.add(m);
			Mitarbeiter m1 = (Mitarbeiter) oi.readObject();
			mitarbeiterList.add(m1);
			Mitarbeiter m2 = (Mitarbeiter) oi.readObject();
			mitarbeiterList.add(m2);
		}
		catch(Exception e) 
		{
			System.out.println("Fehler aufgetreten");
		} 
		
		return mitarbeiterList;
	}
	
	public static void gibCollectionAus(Collection<Mitarbeiter> team) 
	{
		for(Mitarbeiter m : team) 
		{
			System.out.println(m.toString());
		}
	}
	
	public static Mitarbeiter[] sortiere(Collection<Mitarbeiter> team) 
	{
		Mitarbeiter[] ma = new Mitarbeiter[team.size()];
		int index = 0;
		for(Mitarbeiter m : team) 
		{
			ma[index] = m;
			index++;
		}
		
		Arrays.sort(ma, new VergleichePersonalNummer());
		
		return ma;
	}
	/*  // Ich habe es in meiner Main klasse
	public static void main(String[] args) 
	{
		legDateiAn();
		Collection<Mitarbeiter> collection = leseDatei();
		Mitarbeiter[] array = sortiere(collection);
		gibCollectionAus(Arrays.asList(array));
	}*/
}
