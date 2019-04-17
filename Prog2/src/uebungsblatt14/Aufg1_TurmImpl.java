package uebungsblatt14;

public class Aufg1_TurmImpl extends Aufg1_AbstractFigur implements Aufg1_Turm
{
  public Aufg1_TurmImpl(int x, int y)
  {
    super(x, y);
  }

  public Aufg1_Brett gibErlaubteFelder()
  {
    Aufg1_Brett brett = new Aufg1_Brett();
    for (int i = 1; i <= 8; i++)
    {
      brett.markiereFeld(i, y);
      brett.markiereFeld(x, i);
    }
    return brett;
  }
  
  public static void main(String[] args)
  {
    Aufg1_TurmImpl turm = new Aufg1_TurmImpl(4,5);
    Aufg1_Brett brett = turm.gibErlaubteFelder();
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
