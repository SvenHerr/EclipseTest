package KlausurSS15;

public class Sparkonto extends Konto
{
	int kuendigungsfrist;
	
	public Sparkonto(String inhaber, double saldo, double zins) 
	{
		super(inhaber, saldo, zins);
	}
	
	@Override
	public String toString() 
	{
		return "Sparkonto: "+"\n"
				+ "Kündigungsfrist= "+ kuendigungsfrist
				+ super.toString();
	}

	@Override
	protected boolean istBuchungZulaessig(double betrag) 
	{
		if(super.getSaldo()-betrag > 0) 
		{
			double newSaldo = (super.getSaldo() - betrag);
			super.setSaldo(newSaldo);
			
			return true;
		}
		
		return false;
	}
	
	protected double abheben(double gewuenschterBetrag) 
	{
		if(istBuchungZulaessig(gewuenschterBetrag)) 
		{
			double newSaldo = (super.getSaldo() - gewuenschterBetrag);
			super.setSaldo(newSaldo);
			
			return (super.getSaldo());
		}
		
		return 0;
	}
}
