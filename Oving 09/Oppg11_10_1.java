import java.util.Scanner;
class Oppg11_10_1
{

	public static void main(String[]args)
	{
		Person person1 = new Person("Hans Jakob","Rivertz",1970);
		ArbTaker arbtaker1 = new ArbTaker(person1,1234,1998,50000,30);//personalia,ansattnr,ansettelses�r,mndl�nn,skatteprosent

		System.out.println("Fornavn: "+ person1.getFornavn());//bare for � teste person-klassen
		System.out.println("Etternavn: "+ person1.getEtternavn());
		System.out.println("F�dsels�r: "+ person1.getF�dsels�r());

/*---------------------------------------------------------------
Standard
---------------------------------------------------------------*/


		System.out.println("Personalia:" + arbtaker1.getPersonalia());
		System.out.println("Arbeidstakernr: "+arbtaker1.getArbtakerNr());
		System.out.println("Ansettelses�r: "+ arbtaker1.getAnsettelses�r());
		System.out.println("M�nedsl�nn: "+ arbtaker1.getMndL�nn());
		System.out.println("Skatteprosent: "+ arbtaker1.getSkatteprosent());
		System.out.println("Skattetrekk pr m�ned: "+arbtaker1.beregnSkattetrekkMnd());
		System.out.println("Skattetrekk pr �r: "+arbtaker1.beregnSkattetrekk�r());

		arbtaker1.setMndl�nn(53000);
		System.out.println("Ny mndl�nn: "+arbtaker1.getMndL�nn());
		arbtaker1.setSkatteprosent(31);
		System.out.println("Ny skatteprosent: "+arbtaker1.getSkatteprosent());
/*-----------------------------------------------------------
Beregninger
-------------------------------------------------------------------*/
		System.out.println("Ny skattetrekk pr m�ned: "+arbtaker1.beregnSkattetrekkMnd());
		System.out.println("Ny skattetrekk pr �r: "+arbtaker1.beregnSkattetrekk�r());
		System.out.println("Bruttol�nn for et �r: "+arbtaker1.beregnBruttol�nn());
		System.out.println("Alder: "+arbtaker1.beregnAlder());
		System.out.println("Antall �r ansatt: "+arbtaker1.�rAnsatt());
		System.out.println(arbtaker1.milep�l(15));
		System.out.println(arbtaker1.ordneNavn());
		System.out.println(" ");
/*----------------------------------------------------------------
	Menystyrt program
-----------------------------------------------------------------*/
			Scanner sc = new Scanner(System.in);
			int nyMndL�nn,nySkatteprosent = 0;
			while(true)
			{
			System.out.println("Endre m�nedsl�nn");
			nyMndL�nn = sc.nextInt();
			arbtaker1.setMndl�nn(nyMndL�nn);
			System.out.println("Bruttol�nn for et �r: "+arbtaker1.beregnBruttol�nn());

			System.out.println("M�nedsl�nn: "+ arbtaker1.getMndL�nn());


			System.out.println(" ");
			System.out.println("Endre skatteprosent");
			nySkatteprosent = sc.nextInt();
			arbtaker1.setSkatteprosent(nySkatteprosent);
			System.out.println("Skatteprosent: "+ arbtaker1.getSkatteprosent());
			System.out.println("Skattetrekk pr m�ned: "+arbtaker1.beregnSkattetrekkMnd());
			System.out.println("Skattetrekk pr �r: "+arbtaker1.beregnSkattetrekk�r());
		}
	}

}