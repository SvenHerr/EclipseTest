package KlausurSS2017;

public class Aufg1_FalscheIBANException extends RuntimeException
{
	static String message = "FEHLER: Datei enthält ungültige IBAN";
	
	public Aufg1_FalscheIBANException() 
	{
		super(message);
	}
	
	public Aufg1_FalscheIBANException(String message) 
	{
		super(message);
	}
}
