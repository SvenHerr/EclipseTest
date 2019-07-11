package uebungsblatt14;

public class Aufg1_Brett
{
  boolean[][] brett = new boolean[8][8];
  
  public Aufg1_Brett()
  {
    
  }
  
  public void markiereFeld(int x, int y)
  {
    brett[x-1][y-1] = true;
  }
  
  public boolean gibFeld(int x, int y)
  {
    return brett[x-1][y-1];
  }
  
  public Aufg1_Brett kombiniere(Aufg1_Brett brett1) 
  {
	  Aufg1_Brett kombiniertesBrett = new Aufg1_Brett();
	  kombiniertesBrett.brett = this.brett; // braucht man this. ?
	  
	  for(int i = 1; i < 9; i++) 
	  {
		  for(int k = 1; k < 9; k++) 
		  {
			  if(brett1.brett[i-1][k-1]== true) 
			  {
				  kombiniertesBrett.brett[i-1][k-1] = true;
			  } 
		  }	  	  
	  }	  
	return kombiniertesBrett;
  }
}
