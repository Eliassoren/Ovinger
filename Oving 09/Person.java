public class Person
{
	private final String fornavn;
	private final String etternavn;
	private final int fødselsår;

	public Person(String fornavn,String etternavn,int fødselsår)
	{
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.fødselsår = fødselsår;
	}//konstruktør

	public String getFornavn()
	{
		return fornavn;
	}//getFornavn

	public String getEtternavn()
	{
		return etternavn;
	}

	public int getFødselsår()
	{
		return fødselsår;
	}//getFødselsår
}