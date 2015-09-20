/*
Klasse spiller for klient Oppg593
*/

import java.util.Random;

public class Spiller
{
	private String spillerNavn;
	private boolean ferdig;
	private int poengSum = 0;

	public Spiller(String spillerNavn)//spillernavn er det eneste som må være unik
	{
		this.spillerNavn = spillerNavn;
		this.poengSum = 0;
	}

	public int kastTerning()
	{
		java.util.Random terning = new java.util.Random();
		int terningKast = terning.nextInt(6) + 1;

		if (terningKast > 1) {// overskrider 100 skal kastet trekkes fra summen.
			if (this.poengSum + terningKast > 100)
				this.poengSum -= terningKast;
			else
				this.poengSum += terningKast;
		}
		else
			this.poengSum = 0;//hvis terningkastet kun gir en, resettes poengsummen til 0

		return terningKast;
	}

	public int getSumPoeng()
	{
		return poengSum;
	}

	public boolean erFerdig()
	{
		if (this.poengSum == 100)//spillet er ferdig når en spiller når akkurat 100 poeng
			return true;
		else
			return false;
	}


}//public class