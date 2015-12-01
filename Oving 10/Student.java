public class Student
{
	private final String navn;
/**/private final Person personalia;
	private int antOppg;
public Student(/*String navn*/ Person person, int antOppg)
	{
	/**/this.personalia = person;
		this.navn = /*navn;*/personalia.getFornavn()+" "+personalia.getEtternavn();
		this.antOppg = antOppg;
	}

	public String getNavn()
	{
		return navn;
	}
	public int getAntOppg()
	{
		return antOppg;
	}
	public int økAntOppg(int økning)
	{
		antOppg += økning;
		return antOppg;
	}
	public String toString()
	{
		return navn + " " + antOppg;
	}
}