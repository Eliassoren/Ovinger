/*
Oppgave 2 side

euroKurs = 9.3400;
dollarKurs = 8.2890;
sekKurs = 0.9836
*/
import java.util.Scanner;

class Oppg592
{
	public static void main (String[] args)
	{
		beregnValuta();
	}//main

	static void beregnValuta()
	{
		Scanner sc1 = new Scanner(System.in);
		double kurs = 0;
		final double dollarKurs = 8.2890;
		final double euroKurs = 9.3400;
		final double sekKurs = 0.9836;
		int valgValuta = 0, konvertering = 0;
		double verdi, resultat = 0.;
		boolean to = false;

		Valuta dollar = new Valuta("dollar", dollarKurs);
		Valuta euro = new Valuta("euro", euroKurs);
		Valuta sek = new Valuta("SEK", sekKurs);
		Valuta valgt = null;



		System.out.println("Velg valuta: ");
		System.out.println("1: Dollar");
		System.out.println("2: Euro");
		System.out.println("3: Svenske kroner");
		System.out.println("4: Avslutt");
		valgValuta = sc1.nextInt();

		while (valgValuta != 4)
		{
			System.out.println("Velg 1 for å konverter til og 2 for konvertere fra");
			konvertering = sc1.nextInt();

			if (konvertering == 1) to = true;
			else to = false;


			System.out.println("Angi beløp for konvertering:");
			verdi = sc1.nextDouble();

			switch (valgValuta)//SuRoMoTeHfGo
			{

			case 1:
				valgt = dollar;
				resultat = dollar.calculateValuta(verdi, to);
				break;

			case 2:
				valgt = euro;
				resultat = euro.calculateValuta(verdi, to);
				break;
			case 3:
				valgt = sek;
				resultat = sek.calculateValuta(verdi, to);
				break;
			case 4: return;

			}//switch

			if (to)
			{
				System.out.println(verdi + String.format(" kroner blir %.2f ", resultat) + valgt.getValutaType()+".");
				for (int i =0;i<5;i++)
				{
				System.out.println(" ");
				}
			}

			else
			{
				System.out.println(verdi +" "+ valgt.getValutaType() + String.format(" blir %.2f kroner. ", resultat));
				for (int i =0;i<5;i++)
									{
										System.out.println(" ");
					}

				System.out.println("Velg valuta: ");
				System.out.println("1: Dollar ");
				System.out.println("2: Euro ");
				System.out.println("3: Svenske kroner ");
				System.out.println("4: Avslutt ");
				valgValuta = sc1.nextInt();

			}

		}//while
	}//beregnValuta
}