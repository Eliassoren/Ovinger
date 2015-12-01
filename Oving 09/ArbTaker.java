import java.util.GregorianCalendar;
public class ArbTaker
{
	private final Person personalia;
	private final int arbtakerNr;
	private final int ansettelsesår;
	private int mndLønn;
	private int skatteprosent;
/*------------------------------------
Øvrige variabler
-------------------------------------*/
	private int år;
	private final GregorianCalendar kalender;
	private final int MND_I_ET_ÅR = 12;
	private double skatteDesimal;
/*--------------------------------------------------------
Konstruktør
------------------------------------------------------------*/
	public ArbTaker(Person person1,int arbtakerNr, int ansettelsesår, int mndLønn, int skatteprosent)
	{
		this.personalia = person1; // new Person(person1.getFornavn(),person1.getEtternavn(),person1.getFødselsår());
		this.arbtakerNr = arbtakerNr;
		this.ansettelsesår = ansettelsesår;
		this.mndLønn = mndLønn;
		this.skatteprosent = skatteprosent;
		kalender = new GregorianCalendar();
		år = kalender.get(GregorianCalendar.YEAR);
	}
/*--------------------------------------------------------------
	Get-metoder
-----------------------------------------------------------*/
	public String getPersonalia()
	{
		String utString = "";
		utString += personalia.getFornavn()+" ";
		utString += personalia.getEtternavn()+", ";
		utString += personalia.getFødselsår();
		return utString;
	}
	public int getArbtakerNr()
	{
		return arbtakerNr;
	}
	public int getAnsettelsesÅr()
	{
		return ansettelsesår;
	}
	public int getMndLønn()
	{
		return mndLønn;
	}
	public int getSkatteprosent()
	{
		return skatteprosent;
	}
/*--------------------------------------------------------------
	Set-metoder
-----------------------------------------------------------*/
	public void setMndlønn(int lønn)
	{
		mndLønn = lønn;
	}
	public void setSkatteprosent(int prosent)
	{
		skatteprosent = prosent;
	}
/*--------------------------------------------------------------
	Metoder for beregninger
-----------------------------------------------------------*/

	public double beregnSkattetrekkMnd()
	{
		//double skatteDouble = (double)skatteprosent;
		skatteDesimal = (double)skatteprosent/100.;
		return mndLønn*skatteDesimal;
	}
	public double beregnSkattetrekkÅr()//juni skattefritt, desember halv skatt
	{
		double skattetrekkMnd = beregnSkattetrekkMnd();
		double skattetrekkTot = MND_I_ET_ÅR*skattetrekkMnd-((3*skattetrekkMnd)/2);
		return skattetrekkTot;
	}
	public int beregnBruttolønn()
	{
		return MND_I_ET_ÅR*mndLønn;
	}
	public int beregnAlder()
	{
		return år-personalia.getFødselsår();
	}
	public int årAnsatt()
	{
		return år-ansettelsesår;
	}
	public String milepæl(int antÅr)
	{
		if(årAnsatt()-antÅr>0)
		return "Har vært ansatt i lenger enn "+antÅr+" år";
		else if(årAnsatt()-antÅr==0)
		return "Har vært ansatt like lenge som"+antÅr+" år";
		else
		return "Har ikke vært ansatt i så lenge som"+antÅr+" år";
	}
	public String ordneNavn()
	{
		return personalia.getEtternavn()+", "+personalia.getFornavn();
	}

}//public class