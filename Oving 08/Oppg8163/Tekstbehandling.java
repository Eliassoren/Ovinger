import java.util.StringTokenizer;
public class Tekstbehandling
{
	private String input;
	String ord;
	String[]ordtab;
	int antall;
	int antTegnTot;
	int antTegn;
	StringTokenizer analyse;
	StringTokenizer periodeAnalyse;
	public Tekstbehandling(String input)
	{
		this.input = input;
		analyse = new StringTokenizer(input,"., -");
		periodeAnalyse = new StringTokenizer(input,".,-");
	}
	public int ordUtenMellomrom()
	{
		return antTegnTot;
	}
	public String returnerTekst()
	{
		return input;
	}
	public  int finnAntOrd()
	{
		antall = analyse.countTokens();

		return antall;
	}
	public  int gjennomsnitt()
	{
		ord = "";
		int antOrd = finnAntOrd();
		int totAntall=0;
		while(analyse.hasMoreTokens())
		{
			ord = analyse.nextToken();
			totAntall +=ord.length();
		}
			return totAntall/antOrd;
	}

	public int ordPrPeriode()
	{

		antTegnTot = periodeAnalyse.countTokens();

		return antall/antTegnTot;
	}

	public String skiftUt(String finn, String erstatt)
	{
		ord = input.replace(finn,erstatt);
		return ord;
	}
	public String tilStoreBokstaver()
	{
		return input.toUpperCase();
	}
}