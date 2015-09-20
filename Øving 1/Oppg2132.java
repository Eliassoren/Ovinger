class Oppg2132
{
	public static void main (String[] args)
	{
		omregning (0,1,10);
	}//main
	static void omregning (int timer, int minutter, int sekunder)
	{
		int sekunderTotalt = timer*3600 + minutter*60 + sekunder;

		System.out.println(timer + " time(r) " + minutter + " minutt(er) og " + sekunder + " sekund(er) blir totalt " + sekunderTotalt + " sekund(er)");
	}//static void
}//class