import java.io.*;
import java.util.*;

class Oppg16_13_3Main
{
	public static void main(String[]arg)throws IOException
	{
		int valg =0;
		String input;
		char type;

		Konto sparekonto = new Konto(4000,"saldo.txt");
		Scanner sc = new Scanner(System.in);

		System.out.println("Saldo: "+sparekonto.getSaldo());
		System.out.println("");

		System.out.println("1: Flere transaksjoner");
		System.out.println("2: Avslutt");

		System.out.println("");
		System.out.println("Siste transaksjoner:\n"+sparekonto.getHistorikk());
		System.out.println("");

		valg = sc.nextInt();


		while(valg ==1)
		{

			System.out.println("");
			System.out.println("I: Innskudd");
			System.out.println("U: Uttak");
			System.out.println("H: Historikk");
			System.out.println("Andre trykk: Avslutt \n");

			type = sc.next().charAt(0);

			switch(type)
			{

				case 'i':
				System.out.println("Skriv inn beløp");
				input = sc.next();
				System.out.println("");
				sparekonto.transaksjon("i "+input,true);
				System.out.println("Ny saldo etter innskudd på "+input+": "+sparekonto.getSaldo());
				break;

				case 'u':
				System.out.println("Skriv inn beløp \n");

				input = sc.next();
				if((sparekonto.getSaldo()- Integer.parseInt(input)) >=0)sparekonto.transaksjon("u "+input,true);

				else {
					sparekonto.transaksjon(" ",false);
					sparekonto.setSaldo(0);
					}

				System.out.println("Ny saldo etter uttak på "+input+": "+sparekonto.getSaldo()+"\n");

				break;

				case 'h':
				System.out.println("Siste transaksjoner: \n"+sparekonto.getHistorikk());
				break;
				default: return;
				}
			}
	}//main
}