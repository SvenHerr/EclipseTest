package uebungsblatt14;

public class Aufg1_Dame extends Aufg1_AbstractFigur implements Aufg1_Laeufer, Aufg1_Turm
{
  Aufg1_Laeufer laeufer;
  Aufg1_Turm turm;
  
  public Aufg1_Dame(int x, int y)
  {
    super(x, y);
    laeufer = new Aufg1_LaeuferImpl(x, y);
    turm = new Aufg1_TurmImpl(x, y);
  }

  @Override
  public Aufg1_Brett gibErlaubteFelder()
  {
    Aufg1_Brett brettLaeufer = laeufer.gibErlaubteFelder();
    Aufg1_Brett brettTurm = turm.gibErlaubteFelder();
    Aufg1_Brett kombiniertesBrett = brettTurm.kombiniere(brettLaeufer);
    return kombiniertesBrett;
  }

  public static void main(String[] args)
  {
    Aufg1_Dame d = new Aufg1_Dame(4,5);
    System.out.println(d.gibErlaubteFelder());
    Aufg1_Brett brett = d.gibErlaubteFelder();
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
