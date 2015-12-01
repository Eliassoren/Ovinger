/*
Main klient for oppgave 6.10.2 side 207
*/
class Oppg6102Main
{
	public static void main(String[]args)
	{
		Brok1 temp2 = new Brok1(2,3);
		for(int i = 1; i < 10; i++)
		{
			for(int u = 1; u < i; u++)
			{
				Brok1 temp = new Brok1(i,u);
				System.out.println(" ");

				System.out.println("("+temp2.getTeller()+"/"+temp2.getNevner() +") og ("+ i +"/"+ u +"): ");
				System.out.println(" + ");
				System.out.println(" / ");
				System.out.println(" - ");
				System.out.println(" * ");

				temp.summere(temp2);
				printBrok(temp);
				temp.dividere(temp2);
				printBrok(temp);
				temp.subtrahere(temp2);
				printBrok(temp);
				temp.multiplisere(temp2);
				printBrok(temp);


			}//for

		}//for

	}//main

		public static void printBrok(Brok1 temp)
			{
				System.out.println(temp.getTeller()+" / "+temp.getNevner());
			}//
}//class
