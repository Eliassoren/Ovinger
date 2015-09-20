/*
Klasse for klient Oppg6102Main, oppgave 6.10.2 side 207
*/

public class Brok1
{
	private int teller;
	private int nevner;

	public Brok1(int teller, int nevner)
	{
		if(nevner == 0)
		{
			throw new IllegalArgumentException("Å dele på null er tull!");
		}//if
		this.teller = teller;
		this.nevner = nevner;
	}
	public Brok1(int teller)
	{
		this.teller = teller;
		nevner = 1;
	}
	public int getTeller()
	{
		return teller;
	}
	public int getNevner()
	{
		return nevner;
	}
/*---------------------------------------------------------------
		Denne metoden summerer to brøker
-----------------------------------------------------------------*/
	public void summere(Brok1 temp2)
	{

/*-----------------------------------------------------------------------------------------
//Hvis brøkene har felles nevner legg sammen tellerne, hvis ikke må vi selv lage fellesnevner
------------------------------------------------------------------------------------------*/
		int tellerInn = temp2.getTeller();
		int nevnerInn = temp2.getNevner();
		int fellesNevner = this.nevner * nevnerInn;
		if (this.nevner == nevnerInn)
		{
			this.teller +=	tellerInn;
		}

		else
		{
			this.teller *= nevnerInn;
			tellerInn *= this.nevner;
			teller += tellerInn;
			this.nevner = fellesNevner;


		}
		forkort();
	}



	public void subtrahere(Brok1 temp2)
		{

	/*-----------------------------------------------------------------------------------------
	//Hvis brøkene har felles nevner legg sammen tellerne, hvis ikke må vi selv lage fellesnevner
	------------------------------------------------------------------------------------------*/
				int tellerInn = temp2.getTeller();
				int nevnerInn = temp2.getNevner();
				int fellesNevner = this.nevner*nevnerInn;

				if (nevnerInn == this.nevner)
					{
						this.teller -=	tellerInn;
					}

					else
					{
						this.teller *= nevnerInn;
						tellerInn *= this.nevner;
						this.nevner = fellesNevner;
						teller -= tellerInn;
					}
				forkort();
			}




/*--------------------------------------------------------------------------------------------
		Denne metoden multipliserer to brøker
-------------------------------------------------------------------------------------------*/
	public void multiplisere(Brok1 temp2)
	{
		int tellerInn = temp2.getTeller();
		int nevnerInn = temp2.getNevner();
		this.teller *= tellerInn;
		this.nevner *= nevnerInn;
	}
/*--------------------------------------------------------------------------------------------
		Denne metoden dividerer en brøk med en annen
-------------------------------------------------------------------------------------------*/
	public void dividere(Brok1 temp2)
	{
		int tellerInn = temp2.getTeller();
		int nevnerInn = temp2.getNevner();
		this.teller *= nevnerInn;
		this.nevner *= tellerInn;
		forkort();
	}
	public void forkort()//
		{
			for (int i = 2; i<=teller;i++)
			{
				while(this.teller % i == 0 && this.nevner % i == 0)
				{
					this.teller /= i;
					this.nevner /= i;
				}
			}
		}//forkort()


}//class
/*---------------------------------------------------------------------------------
		eventuell utvidelse til senere, metode for å forkorte alle brøker
----------------------------------------------------------------------------------*/


