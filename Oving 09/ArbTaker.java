import java.util.GregorianCalendar;
public class ArbTaker
{
	private final Person personalia;
	private final int arbtakerNr;
	private final int ansettelses�r;
	private int mndL�nn;
	private int skatteprosent;
/*------------------------------------
�vrige variabler
-------------------------------------*/
	private int �r;
	private final GregorianCalendar kalender;
	private final int MND_I_ET_�R = 12;
	private double skatteDesimal;
/*--------------------------------------------------------
Konstrukt�r
------------------------------------------------------------*/
	public ArbTaker(Person person1,int arbtakerNr, int ansettelses�r, int mndL�nn, int skatteprosent)
	{
		this.personalia = person1; // new Person(person1.getFornavn(),person1.getEtternavn(),person1.getF�dsels�r());
		this.arbtakerNr = arbtakerNr;
		this.ansettelses�r = ansettelses�r;
		this.mndL�nn = mndL�nn;
		this.skatteprosent = skatteprosent;
		kalender = new GregorianCalendar();
		�r = kalender.get(GregorianCalendar.YEAR);
	}
/*--------------------------------------------------------------
	Get-metoder
-----------------------------------------------------------*/
	public String getPersonalia()
	{
		String utString = "";
		utString += personalia.getFornavn()+" ";
		utString += personalia.getEtternavn()+", ";
		utString += personalia.getF�dsels�r();
		return utString;
	}
	public int getArbtakerNr()
	{
		return arbtakerNr;
	}
	public int getAnsettelses�r()
	{
		return ansettelses�r;
	}
	public int getMndL�nn()
	{
		return mndL�nn;
	}
	public int getSkatteprosent()
	{
		return skatteprosent;
	}
/*--------------------------------------------------------------
	Set-metoder
-----------------------------------------------------------*/
	public void setMndl�nn(int l�nn)
	{
		mndL�nn = l�nn;
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
		return mndL�nn*skatteDesimal;
	}
	public double beregnSkattetrekk�r()//juni skattefritt, desember halv skatt
	{
		double skattetrekkMnd = beregnSkattetrekkMnd();
		double skattetrekkTot = MND_I_ET_�R*skattetrekkMnd-((3*skattetrekkMnd)/2);
		return skattetrekkTot;
	}
	public int beregnBruttol�nn()
	{
		return MND_I_ET_�R*mndL�nn;
	}
	public int beregnAlder()
	{
		return �r-personalia.getF�dsels�r();
	}
	public int �rAnsatt()
	{
		return �r-ansettelses�r;
	}
	public String milep�l(int ant�r)
	{
		if(�rAnsatt()-ant�r>0)
		return "Har v�rt ansatt i lenger enn "+ant�r+" �r";
		else if(�rAnsatt()-ant�r==0)
		return "Har v�rt ansatt like lenge som"+ant�r+" �r";
		else
		return "Har ikke v�rt ansatt i s� lenge som"+ant�r+" �r";
	}
	public String ordneNavn()
	{
		return personalia.getEtternavn()+", "+personalia.getFornavn();
	}

}//public class