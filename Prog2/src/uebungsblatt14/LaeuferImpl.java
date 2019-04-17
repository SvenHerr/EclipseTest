package uebungsblatt14;

public class LaeuferImpl extends AbstractFigur implements Laeufer
{
  public LaeuferImpl(int x, int y)
  {
    super(x, y);
  }

  public Brett gibErlaubteFelder()
  {
    Brett brett = new Brett();
    //TODO: Ergänzen Sie den Algorithmus zur Bestimmung der Felder
    if (x > 0 && x < 9 && y > 0 && y < 9){					//Stelle an dem die Figur steht - checkt ob innerhalb des Arrays
    	brett.markiereFeld(x, y);
    } 
    
    for (int i = 1; i <= 8; i++)							// hier die Diagonale von oben links nach rechts unten zur Figur
    {
    	int x1 = x -i;
    	int y1 = y -i;
    	
    	if (x1 > 0 && y1 > 0 && x1 < 9 && y1 < 9){			// schauen dass die Zahlen nicht aus dem Array kommen
    		
    		brett.markiereFeld(x1, y1);
    	}
    	
    	x1 = x +i;											//immer bis zum Standort der Figur und dann ab hier die andere Seite
    	y1 = y +i;
    	
    	if (x1 > 0 && y1 > 0 && x1 < 9 && y1 < 9){			// schauen dass die Zahlen nicht aus dem Array kommen
    		
    		brett.markiereFeld(x1, y1);
    	}
    }
    
    for (int i = 1; i <= 8; i++)							// hier die Diagonale von rechts oben nach links unten
    {
    	int x1 = x +i;
    	int y1 = y -i;
    	
    	if (x1 > 0 && y1 > 0 && x1 < 9 && y1 < 9){
    		
    		brett.markiereFeld(x1, y1);
    	}  
    	
    	x1 = x -i;
    	y1 = y +i;
    	
    	if (x1 > 0 && y1 > 0 && x1 < 9 && y1 < 9){
    		
    		brett.markiereFeld(x1, y1);
    	}
    }
    
    return brett;
  }
  
  public static void main(String[] args)
  {
    LaeuferImpl l = new LaeuferImpl(4,5); 
    Brett brett = l.gibErlaubteFelder();
    for (int j = 1; j <= 8; j++)
    {
      for (int i = 1; i <= 8; i++)
      {
        if (brett.gibFeld(i, j)) System.out.print("x");
        else System.out.print("o");
      }
      System.out.println();
    }
  }
}
