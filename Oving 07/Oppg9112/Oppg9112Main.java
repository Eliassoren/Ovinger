class Oppg9112Main
{
	public static void main(String[]args)
	{
		int antallDager = 30;
		Temperaturer temperatur1 = new Temperaturer(antallDager);
/*-------------------------------------------------------------------------
		Tabeller for utskrift
-----------------------------------------------------------------------------*/

		String[]intervallString =
		{"mindre enn -5: ", "mellom -5 og 0: ",
		"mellom 0 og 5: ", "mellom 5 og 10: ", "st�rre enn 10: "};

/*-------------------------------------------------------------------------------
		Setter opp og skriver ut tabellen tempTabell
----------------------------------------------------------------------------------*/

		temperatur1.setTempTabell();
		System.out.println(temperatur1.utTabell());

/*------------------------------------------------------------
  Skriver ut snittemperatur for dagene i m�neden
------------------------------------------------------------*/

		System.out.println("Snittemperatur for dagene:");
		System.out.println("");

		for(int k = 0; k<temperatur1.getDager();k++)
		{
			System.out.println("Dag "+(k+1)+": "+ temperatur1.getMidTempDag(k)+" grader");
		}
		System.out.println("");

/*---------------------------------------------------------------------------------
		Skriver ut snittet for totalt antall timer i en m�ned
--------------------------------------------------------------------------------------------*/

		System.out.println("Snittemperatur for alle timene i m�neden: "+temperatur1.midTempMnd()+" grader");
		System.out.println("");

/*-------------------------------------------------------------------------------------------
		Snittet av de respektive timene, i alle m�nedens dager.
		F. eks beregnes snittet av alle de f�rste timene hver dag i m�neden,
		samt de andre, tredje, etc opp til de 24. timene i alle dager.
---------------------------------------------------------------------------------------*/

		System.out.println("");

		System.out.println("Snittemperatur timer i mnd:");
		System.out.println("");

		for(int i=0;i<temperatur1.getTimer();i++)
		{
		System.out.println("Snittemperatur time "+(i+1)+": "+temperatur1.getMidTempTimer(i)+" grader");
		}
		System.out.println("");

/*-----------------------------------------------------------------------------------
		Skriver ut hvor mange dager som har snittemperatur i gitte intervaller
-------------------------------------------------------------------------------------*/

		for (int m = 0; m<5 ; m++)
		{
		System.out.println("Antall dager med snitt "+intervallString[m] + temperatur1.getIntervall(m));
		}
		System.out.println("");

	}//main
}