class Oppg2133
{
	public static void main (String[] args)
		{
			omregning (5000);
		}//main
		static void omregning(int sekunderTotalt)
		{
			int timer = sekunderTotalt / 3600;
			int restTimer = sekunderTotalt % 3600;
			int minutter = restTimer / 60;
			int restMinutter = restTimer % 60;
			int sekunder = restMinutter / 60;
			int restSekunder = restMinutter % 60;
			System.out.println( "Totalt "+sekunderTotalt +" sekunder blir " + timer + " time(r), " + minutter + " minutt(er) og " + restSekunder + " sekund(er). " );
		}//static void omregning
}