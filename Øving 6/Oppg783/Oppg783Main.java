
class Oppg783Main
{
	public static void main(String[]args)
	{
		String[]tekstTabell = {
			"Dette er en en setning","Programmet må testes","Ærlig talt, funker programmet?",
			"Denne stringen bør analyseres nøye","DENNE ER SKREVET MED CAPS","Siste test med æøåÆØÅ."
						};
		String bokstav = "t";

		for(int i=0;i<6;i++)
		{
		Tekstanalyse1 nyTekst = new Tekstanalyse1(tekstTabell[i]);

		System.out.println("Analyserer stringen: "+ tekstTabell[i]);
		System.out.println("");

		System.out.println(nyTekst.printTabell());

		System.out.println("Antall forskjellige bokstaver: " + nyTekst.antForskjBokstaver());
		System.out.println("");

		System.out.println("Totalt antall bokstaver: " + nyTekst.totaltAntBokstaver());
		System.out.println("");

		System.out.println("Andel andre tegn enn bokstaver: "+ String.format("%.2f", nyTekst.andelIkkeBokstaver())+" %");
		System.out.println("");

		System.out.println("Antall "+bokstav+"'er: "+nyTekst.finnBokstav(bokstav));
		System.out.println("");

		System.out.println("Bokstaven(e) som forekommer oftest er "+ nyTekst.finnOftestBokstav() +
		"som det finnes " + nyTekst.finnStørsteTall() + " av.");
		System.out.println("");

		}//for

	}//main
}//class