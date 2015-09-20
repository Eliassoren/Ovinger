/*
Main klient for oppgave 6.10.3 side 207-208
*/

class Oppg6103Main
{
	public static void main(String[]args)
	{
/*-----------------------------------------------------------------------
		Her kommer tilfeldige heltall
-------------------------------------------------------------------------*/
		MinRandom tilfeldig = new MinRandom();
		System.out.println("Tilfeldige heltall:");
		System.out.println(" ");
		for (int i = 1; i<15;i++)
		{
			for (int j =1 ; j<i;j++)
			{
				int tall = tilfeldig.nesteHeltall(j,i);
				System.out.println("Tilfeldig tall fra "+ j +" til "+ i + ":");
				System.out.println(tall);
			}
		}//for
/*-------------------------------------------------------------------------
			Her kommer tilfeldige desimaltall
---------------------------------------------------------------------------*/
		System.out.println("Tilfeldige desimaler:");
		System.out.println(" ");
		for (double i = 1. ; i<15.;i++)
		{
			for(double j = 1.; j<i ;j++)
			{
				double tall = tilfeldig.nesteDesimaltall(j/100,i/100);
				System.out.println("Tilfeldig desimal fra "+String.format("%.3f",j/100)+" til "+String.format("%.3f",i/100)+":");
				String tallUt = String.format("%.3f", tall);
				System.out.println(tallUt);
			}//for
		}//for
	}//main
}//class