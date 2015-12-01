public class Person
{
	private final String fornavn;
	private final String etternavn;
	private final int f�dsels�r;

	public Person(String fornavn,String etternavn,int f�dsels�r)
	{
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.f�dsels�r = f�dsels�r;
	}//konstrukt�r

	public String getFornavn()
	{
		return fornavn;
	}//getFornavn

	public String getEtternavn()
	{
		return etternavn;
	}

	public int getF�dsels�r()
	{
		return f�dsels�r;
	}//getF�dsels�r
}