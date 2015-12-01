import java.util.Random;
class Temperaturer
{

	private int[][] tempTabell;
	private final int MAKSIMUM = 30;
	private final int MINIMUM = -20;
	private int antallDager;
	private int antallTimer;
	private int[]midTempDagTab;
	private int[]midTempTimerTab;
	private int[] intervallTab;

/*------------------------------------------------------------
 I konstruktøren kan vi velge hvor mange dager av måneden vi
 vil vise. Vi viser uansett alle 24 timer av et døgn.
------------------------------------------------------------*/

	public Temperaturer(int antallDager)
	{
		this.antallDager = antallDager;
		antallTimer = 24;
		tempTabell = new int[antallDager][antallTimer];//tabellen viser antall dager nedover, og så timer hver dag bortover
		midTempDagTab = new int[antallDager];
		midTempTimerTab = new int[antallTimer];
		intervallTab = new int[5];


	}
/*-----------------------------------------------------------
		Initialiser metoder
------------------------------------------------------*/
	private void beregnTemperaturer()
	{
		midTempDag();
		midTempIntervall();
		midTempTimer();
	}
/*--------------------------------------------------------
	Get-metoder
----------------------------------------------------------*/
	public int getDager()
	{
		return antallDager;
	}

	public int getTimer()
	{
		return antallTimer;
	}

	public int getMidTempDag(int dager)
	{
		return midTempDagTab[dager];
	}
	public int getMidTempTimer(int timer)
	{
		return midTempTimerTab[timer];
	}

	public int getIntervall(int intervall)
	{
		return intervallTab[intervall];
	}

/*------------------------------------------------------------
	Metoden produserer et tilfeldig som benyttes som temperatur
--------------------------------------------------------------*/
	private int genererTemperatur(int minimum, int maksimum)
	{
		Random genererTemp = new Random();
		int temperatur = 0;
		temperatur = genererTemp.nextInt(maksimum - minimum+1)+minimum;

		return temperatur;
	}
/*------------------------------------------------------------------------------------
		Lager en tom tabell. Kan være nyttig ved eventuelle utvidelser
-----------------------------------------------------------------------*/
	private void initialiserTabell()
	{
		for (int i = 0;i<tempTabell.length;i++)
		{
			for(int j=0;j<tempTabell[i].length;j++)
			{
				tempTabell[i][j] = 0;
			}//for
		}//for
	}
/*------------------------------------------------------------
	Fyller temperaturtabell med verdier
------------------------------------------------------------*/
	public void setTempTabell()
	{
			initialiserTabell();
			int temperatur = 0;
			for (int i = 0;i<tempTabell.length;i++)
			{
				for (int j = 0;j<tempTabell[i].length;j++)
				{
					temperatur = genererTemperatur(MINIMUM,MAKSIMUM);
					tempTabell[i][j] = temperatur;
				}//for
			}//for
 			beregnTemperaturer();
	}//void
/*----------------------------------------------------------------------
	Metode som legger tabellen i en string, så den blir klar for utskrift
-------------------------------------------------------------------------*/
	public String utTabell()
	{
		String output = "";

		for (int i=0;i<tempTabell.length;i++)
		{
			output += "Dag: "+(i+1)+ "\n";
			for (int j=0;j<tempTabell[i].length;j++)
			{
				output += " Time "+(j+1) +": "+tempTabell[i][j]+" grader \n";
			}//for
		}//for
		return output;
	}
/*------------------------------------------------------------
	Beregner snittemperatur for hver dag i måneden
------------------------------------------------------------*/
	private void midTempDag()
	{
		int sumTimer = 0;
		int snitt = 0;
		for (int i=0;i<tempTabell.length;i++)
		{

			sumTimer = 0;
			for (int j=0;j<tempTabell[i].length;j++)
			{
				sumTimer += tempTabell[i][j];
			}//for
			snitt = sumTimer / tempTabell[i].length;
			midTempDagTab[i] = snitt;
		}//for
	}
/*------------------------------------------------------------
	Beregner snittemperatur for alle timer i måneden
------------------------------------------------------------*/
	public int midTempMnd()
	{
		int sum = 0;
		int snitt = 0;
		int sumTimer = 0;
		int totaltAntTimer=0;
		for (int i=0;i<tempTabell.length;i++)
		{
			for (int j=0;j<tempTabell[i].length;j++)
			{
				sumTimer += tempTabell[i][j];
			}//for
		}//for
		totaltAntTimer = tempTabell[0].length * tempTabell.length;
		snitt = sumTimer/totaltAntTimer;

		return snitt;
	}
/*------------------------------------------------------------
	Snittet av de respektive timene, i alle månedens dager.
	F. eks beregnes snittet av alle de første timene hver dag i måneden,
		samt de andre, tredje, etc opp til de 24. timene i alle dager.
--------------------------------------------------------------*/
	private void midTempTimer()
	{
		int sumTimer = 0;
		int snitt = 0;

		for (int j=0;j<tempTabell[j].length;j++)
		{
			sumTimer = 0;
			for (int i=0;i<tempTabell.length;i++)
			{
				sumTimer += tempTabell[i][j];
			}//for
			snitt = sumTimer / tempTabell.length;
			midTempTimerTab[j]=snitt;
		}//for
	}
/*--------------------------------------------------------------------
	Beregner hvor mange dager som har snittemperatur i gitte intervaller
------------------------------------------------------------------------*/
	private void midTempIntervall()
	{

		for(int i = 0;i<30;i++)
		{
			if(getMidTempDag(i)< -5)//definerer verdiene ved å summe opp i en tabell.
			intervallTab[0]++;

			else if(getMidTempDag(i)>-5 && getMidTempDag(i)<0)
			intervallTab[1]++;

			else if(getMidTempDag(i)>0 && getMidTempDag(i)<5)
			intervallTab[2]++;

			else if(getMidTempDag(i)>0 && getMidTempDag(i)<10)
			intervallTab[3]++;

			else intervallTab[4]++;
		}//for
	}//public int
}//class