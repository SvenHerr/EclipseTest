package KlausurSS15;

public class Hypothekenkonto extends Konto
{

	public Hypothekenkonto(String inhaber, double saldo, double zins) 
	{
		super(inhaber, saldo, zins);
	}

	@Override
	public String toString() 
	{
		return "Hypothek: " + super.toString();
	}
	
	@Override
	protected boolean istBuchungZulaessig(double betrag) 
	{
		double newSaldo = (super.getSaldo() + betrag);
		
		if(newSaldo < 0 ) 
		{
			return true;
		}
		
		return false;
	}
	
	protected void sondertilgung(double betrag) 
	{	
		if(!istBuchungZulaessig(betrag)) 
		{
			throw new IllegalArgumentException();
		}
		else 
		{
			double newSaldo = (super.getSaldo() + betrag);
			super.setSaldo(newSaldo);
		}
	}
}
