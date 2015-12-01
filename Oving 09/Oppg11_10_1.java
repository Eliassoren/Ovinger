import java.util.Scanner;
class Oppg11_10_1
{

	public static void main(String[]args)
	{
		Person person1 = new Person("Hans Jakob","Rivertz",1970);
		ArbTaker arbtaker1 = new ArbTaker(person1,1234,1998,50000,30);//personalia,ansattnr,ansettelsesår,mndlønn,skatteprosent

		System.out.println("Fornavn: "+ person1.getFornavn());//bare for å teste person-klassen
		System.out.println("Etternavn: "+ person1.getEtternavn());
		System.out.println("Fødselsår: "+ person1.getFødselsår());

/*---------------------------------------------------------------
Standard
---------------------------------------------------------------*/


		System.out.println("Personalia:" + arbtaker1.getPersonalia());
		System.out.println("Arbeidstakernr: "+arbtaker1.getArbtakerNr());
		System.out.println("Ansettelsesår: "+ arbtaker1.getAnsettelsesÅr());
		System.out.println("Månedslønn: "+ arbtaker1.getMndLønn());
		System.out.println("Skatteprosent: "+ arbtaker1.getSkatteprosent());
		System.out.println("Skattetrekk pr måned: "+arbtaker1.beregnSkattetrekkMnd());
		System.out.println("Skattetrekk pr år: "+arbtaker1.beregnSkattetrekkÅr());

		arbtaker1.setMndlønn(53000);
		System.out.println("Ny mndlønn: "+arbtaker1.getMndLønn());
		arbtaker1.setSkatteprosent(31);
		System.out.println("Ny skatteprosent: "+arbtaker1.getSkatteprosent());
/*-----------------------------------------------------------
Beregninger
-------------------------------------------------------------------*/
		System.out.println("Ny skattetrekk pr måned: "+arbtaker1.beregnSkattetrekkMnd());
		System.out.println("Ny skattetrekk pr år: "+arbtaker1.beregnSkattetrekkÅr());
		System.out.println("Bruttolønn for et år: "+arbtaker1.beregnBruttolønn());
		System.out.println("Alder: "+arbtaker1.beregnAlder());
		System.out.println("Antall år ansatt: "+arbtaker1.årAnsatt());
		System.out.println(arbtaker1.milepæl(15));
		System.out.println(arbtaker1.ordneNavn());
		System.out.println(" ");
/*----------------------------------------------------------------
	Menystyrt program
-----------------------------------------------------------------*/
			Scanner sc = new Scanner(System.in);
			int nyMndLønn,nySkatteprosent = 0;
			while(true)
			{
			System.out.println("Endre månedslønn");
			nyMndLønn = sc.nextInt();
			arbtaker1.setMndlønn(nyMndLønn);
			System.out.println("Bruttolønn for et år: "+arbtaker1.beregnBruttolønn());

			System.out.println("Månedslønn: "+ arbtaker1.getMndLønn());


			System.out.println(" ");
			System.out.println("Endre skatteprosent");
			nySkatteprosent = sc.nextInt();
			arbtaker1.setSkatteprosent(nySkatteprosent);
			System.out.println("Skatteprosent: "+ arbtaker1.getSkatteprosent());
			System.out.println("Skattetrekk pr måned: "+arbtaker1.beregnSkattetrekkMnd());
			System.out.println("Skattetrekk pr år: "+arbtaker1.beregnSkattetrekkÅr());
		}
	}

}