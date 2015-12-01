public class Person
{
	private final String fornavn;
	private final String etternavn;
	private final int f�dselsdato;

	public Person(String fornavn,String etternavn,int f�dselsdato)
	{
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.f�dselsdato = f�dselsdato;
	}//konstrukt�r

	public String getFornavn()
	{
		return fornavn;
	}//getFornavn

	public String getEtternavn()
	{
		return etternavn;
	}

	public int getF�dselsdato()
	{
		return f�dselsdato;
	}//getF�dsels�r
}