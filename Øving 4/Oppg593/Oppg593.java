/*
Oppgave 5.9.3 side 178, Øving 4
*/

import java.util.Random;
import java.util.Scanner;
class Oppg593
{
	public static void main (String[] args)
	{
		kjørSpill();
	}//main
	static void kjørSpill()
	{
		System.out.println("To spillere: Førstemann til 100 poeng");
		int kastNr1 = 0;
		int kastNr2 = 0;
		int runde = 0;
		Spiller spiller1 = new Spiller("spiller1");
		Spiller spiller2 = new Spiller("spiller2");

		while(!spiller1.erFerdig() && !spiller2.erFerdig())
		{
			kastNr1 = spiller1.kastTerning();
			kastNr2 = spiller2.kastTerning();
			runde++;
			System.out.println("Rundenr: " + runde);
			System.out.println("Spiller 1 fikk " + kastNr1 + ", og har poengsum " + spiller1.getSumPoeng() +" poeng");
			System.out.println("Spiller 2 fikk " + kastNr2 + ", og har poengsum " + spiller2.getSumPoeng() +" poeng");
		}//while

		System.out.println("Spillet er ferdig! ");
		System.out.println("Spiller 1 fikk "+ spiller1.getSumPoeng() +" poeng");
		System.out.println("Spiller 2 fikk "+ spiller2.getSumPoeng() +" poeng");
		}//kjørSpill()

}//class