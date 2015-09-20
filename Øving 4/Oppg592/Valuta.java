/*
Klasse Valuta for klientprogram Oppg592
*/

public class Valuta
{
	private String valuta;
	private double kurs;

	public Valuta (String valuta, double kurs)
	{
	   this.valuta = valuta;
	   this.kurs = kurs;
	}//Valuta

	public double calculateValuta(double verdi, boolean to)
	{
		if (to)
			return verdi/kurs;
		else
			return verdi*kurs;
	}//getDollar

	public String getValutaType()
	{
		return valuta;
    }

    public double getValutaKurs()
    {
		return kurs;
	}
}//public class Valuta

			/*euroKurs = 9.3400;
			dollarKurs = 8.2890;
			sekKurs = 0.9836*/

