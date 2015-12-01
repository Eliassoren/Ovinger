/*
Klasse for klient Oppg6102Main, oppgave 6.10.2 side 207
*/

public class Brok
{
	private double teller;
	private double nevner;

	public Brok(double teller, double nevner)
	{
		if(nevner == 0)
		{
			throw new IllegalArgumentException("� dele p� null er tull!");
		}//if
		this.teller = teller;
		this.nevner = nevner;
	}
	public Brok(double teller)
	{
		this.teller = teller;
		nevner = 1;
	}
	public double getTeller()
	{
		return teller;
	}
	public double getNevner()
	{
		return nevner;
	}
/*---------------------------------------------------------------
		Denne metoden summerer to br�ker
-----------------------------------------------------------------*/
	public void summere(Brok temp2)
	{

		String brokUt;
		double tellerSum;
		String brokG1;
		String brokG2;
		boolean pluss;

		brokG1 = temp2.getTeller() +" / "+temp2.getNevner();
		brokG2 = this.teller + " / " + this.nevner;
		pluss = true;
/*-----------------------------------------------------------------------------------------
//Hvis br�kene har felles nevner legg sammen tellerne, hvis ikke m� vi selv lage fellesnevner
------------------------------------------------------------------------------------------*/
		if (temp2.getTeller()==this.nevner)
		{
			this.teller += temp2.getTeller();
			brokUt = this.teller+ " / " + this.nevner;
		}

		else
		{
			brokUt = fellesNevner(temp2.getTeller(), this.teller, temp2.getNevner(), this.nevner,pluss);
		}
		double sum = temp2.getTeller()/temp2.getNevner() + this.teller / this.nevner;
		System.out.println(brokG1+" + "+brokG2+" er "+ String.format("%.2f ",sum)+ " p� desimalform og");
		System.out.print(brokUt + " p� br�kform");
		System.out.println(" ");
	}

/*--------------------------------------------------------------------------------------------
		Denne metoden trekker en br�k fra en annen
-------------------------------------------------------------------------------------------*/
	public void subtrahere(double tellerInn, double nevnerInn)
	{
		double sum;
		String brokUt;
		double tellerSum;
		String brokG1;
		String brokG2;
		Boolean pluss;

		sum = tellerInn/nevnerInn - this.teller / this.nevner;
		brokG1 = tellerInn + " / " + nevnerInn;
		brokG2 = this.teller + " / "+ this.nevner;
		pluss = false;

/*-----------------------------------------------------------------------------------------
Hvis br�kene har felles nevner trekk teller fra teller, hvis ikke m� vi selv lage fellesnevner
------------------------------------------------------------------------------------------*/
		if (nevnerInn == this.nevner)
		{
			tellerSum =	tellerInn - this.teller;
			brokUt = tellerSum + " / " + this.nevner;
		}

		else
		{
			brokUt = fellesNevner(tellerInn, this.teller, nevnerInn, this.nevner, pluss);
		}
		System.out.println(brokG1 + " - " + brokG2+ " er "+ String.format("%.2f ",sum)+ " p� desimalform og");
		System.out.print(brokUt + " p� br�kform");
		System.out.println(" ");

	}

/*--------------------------------------------------------------------------------------------
		Denne metoden multipliserer to br�ker
-------------------------------------------------------------------------------------------*/
	public void multiplisere(double tellerInn, double nevnerInn)
	{

		double desimal;
		double nyTeller;
		double nyNevner;

		String brokG1;
		String brokG2;
		String brokUt;

		desimal = (tellerInn/nevnerInn)*(this.teller/this.nevner);
		nyTeller = tellerInn * this.teller;
		nyNevner = nevnerInn * this.nevner;

		brokG1 = tellerInn +" / " +nevnerInn;
		brokG2 = this.teller + " / "+ this.nevner;
		brokUt = nyTeller + " / " + nyNevner;

		System.out.println(brokG1 + " * "+ brokG2 + " er " + String.format("%.2f ",desimal)+ " p� desimalform og");
		System.out.print(brokUt + " p� br�kform");
		System.out.println(" ");

	}
/*--------------------------------------------------------------------------------------------
		Denne metoden dividerer en br�k med en annen
-------------------------------------------------------------------------------------------*/
	public void dividere(double tellerInn, double nevnerInn)
	{
		double desimal;
		double nyTeller;
		double nyNevner;

		String brokG1;
		String brokG2;
		String brokUt;

		desimal = (tellerInn/nevnerInn)/(this.teller/this.nevner);
		nyTeller = tellerInn * this.nevner;
		nyNevner = nevnerInn * this.teller;
		brokG1 = "(" + tellerInn + " / " +nevnerInn+ ")";
		brokG2 = "("+this.teller + " / "+ this.nevner+")";
		brokUt = nyTeller + " / " + nyNevner;

		System.out.println(brokG1+" / "+brokG2+" er "+ String.format("%.2f ",desimal)+ " p� desimalform og");
		System.out.print(brokUt+" p� br�kform");
		System.out.println(" ");
	}

/*--------------------------------------------------------------------------------------------
		Denne metoden finner fellesnevner for to br�ker
---------------------------------------------------------------------------------------------*/
	public String fellesNevner(double tellerInn, double thisTeller, double nevnerInn, double thisNevner, boolean pluss)
	{
		double nyTellerInn = tellerInn*thisNevner;
		double nyThisTeller = thisTeller*nevnerInn;
		double nyNevner = nevnerInn*thisNevner;
		double sumTeller;
		String brokUt;

		if(pluss)
		{
			sumTeller = nyTellerInn + nyThisTeller;
		}
		else
		{
			sumTeller = nyTellerInn - nyThisTeller;
		}

		brokUt = sumTeller + " / "+ nyNevner;
		return brokUt;
	}//fellesnevner

/*---------------------------------------------------------------------------------
		eventuell utvidelse til senere, metode for � forkorte alle br�ker
----------------------------------------------------------------------------------*/
	public String forkortBrok()//
	{
		return " ";
	}//forkortBrok()

}//class