public class Person
{
	private final String fornavn;
	private final String etternavn;
	private final int fødselsdato;

	public Person(String fornavn,String etternavn,int fødselsdato)
	{
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.fødselsdato = fødselsdato;
	}//konstruktør

	public String getFornavn()
	{
		return fornavn;
	}//getFornavn

	public String getEtternavn()
	{
		return etternavn;
	}

	public int getFødselsdato()
	{
		return fødselsdato;
	}//getFødselsår
}