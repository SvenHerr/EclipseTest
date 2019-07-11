package Test;

public class PrimzahlThread extends Thread
{
	int zahlZumTesten;
	String ergebnis;
	
	public PrimzahlThread(int zahlZumTesten) 
	{
		this.zahlZumTesten = zahlZumTesten;
	}

	public boolean testeObPrimzahl() 
	{
		return false;
	}

	@Override
	public void run() 
	{
		for(int i = 0; i < 5; i++) 
		{
			try 
			{
				this.sleep(500);
			} 
			catch (InterruptedException e) 
			{
			}
			
			System.out.println(i);
		}
		this.ergebnis = "Jetzt Fertig";
	}
	
	public static void main(String[]args) throws InterruptedException 
	{
		// Mit Vererbung
		PrimzahlThread a  = new PrimzahlThread(10);
		//a.start();
		a.join();
		System.out.println(a.ergebnis);
		
		Thread t1 = new Thread()
		{			
			@Override
			public void run()
			{
				for(int i = 0; i < 5; i++) 
				{
					try 
					{
						this.sleep(500);
					} 
					catch (InterruptedException e) 
					{
					}
					
					System.out.println(i);
				}
				System.out.println("Jetzt Fertig anonyme Klasse");
			}
		};
		t1.start();	
		
	}
}
