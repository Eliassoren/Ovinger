
class Oppg8163Main
{
	public static void main(String[]args)
	{
	Tekstbehandling nesteTekst = new Tekstbehandling("Jeg er en liten tullepike. En skikkelig tøs!");
	System.out.println("Den opprinnelige stringen er: "+"\n" + nesteTekst.returnerTekst());
	System.out.println("Antall ord: "+nesteTekst.finnAntOrd());
	System.out.println("Gjennomsnitt: "+nesteTekst.gjennomsnitt());
	System.out.println("Bytter ut ord: "+nesteTekst.skiftUt("tøs","apekatt"));
	System.out.println("Til store bokstaver: "+nesteTekst.tilStoreBokstaver());
	System.out.println("Snitt hver periode: "+nesteTekst.ordPrPeriode());
	System.out.println("Antall tegn uten mellomrom: "+nesteTekst.ordUtenMellomrom());

	}
}