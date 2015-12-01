public class Tekstanalyse1
{
	private int[] antallTegn;
	private String tekst;
/*------------------------------------
		Konstrukt�r
-------------------------------------*/
	public Tekstanalyse1(String tekst)
	{
		this.tekst = tekst.toLowerCase();
		antallTegn = new int[30];
		analyser();
	}//public Tekstanalyse
/*---------------------------------------------
		Metode som oppretter tabellen antallTegn
----------------------------------------------*/
	private void analyser()
	{
		for(int j =0;j<antallTegn.length;j++)
				{
					antallTegn[j]=0;
				}
		for(int i=0 ; i < tekst.length();i++)
		{
			char tegn = tekst.charAt(i);
			int asciiIndeks = charTilIndeks(tegn);
			if(asciiIndeks < 0 || asciiIndeks > 28)
			{
				asciiIndeks = 29;
			}
				antallTegn[asciiIndeks]++;
		}
	}


/*------------------------------------------------
Gj�r tabell klar til utskrift
---------------------------------------------------*/
	public String printTabell()
	{
		String utTabell ="";

		for (int i = 0;i<antallTegn.length;i++)
		{
			utTabell += indeksTilChar(i)+": " + antallTegn[i]+"\n";
		}

			return utTabell;
	}

/*----------------------------------------------------
 	Denne metoden returnerer antall forskjellige bokstaver
-------------------------------------------------------*/
	public int antForskjBokstaver()
	{
		int antall = 0;
		int i = 0;
		while( i < antallTegn.length-1)
			{
				if(antallTegn[i] > 0)
				{
					antall++;
				}
				i++;
			}//while
		return antall;
	}
/*-------------------------------------------------------------
		Metode som finner totalt antall bokstaver i stringen
---------------------------------------------------------------*/
	public int totaltAntBokstaver()
	{
		int antall = 0;
		for (int i = 0;i<antallTegn.length-1;i++)
		{
			if(antallTegn[i]>0)
			antall +=antallTegn[i];
		}
		return antall;
	}

/*----------------------------------------------------------
Metode som finner ut prosentandel av andre tegn enn bokstaver
--------------------------------------------------------*/
	public double andelIkkeBokstaver()
	{
		final double PROSENT = 100.;
		double andel = 0;

		andel = (double)antallTegn[29]/(double)totaltAntBokstaver();
		return andel*PROSENT;
	}
/*---------------------------------------------------------
 Metode som finner antall forekomster av en bestemt bokstav
------------------------------------------------------*/

	public int finnBokstav(String bokstav)
	{
		int antall = 0;
		char tegn = bokstav.charAt(0);
		int indeks = charTilIndeks(tegn);

			for (int i=0;i<antallTegn.length-1;i++)
			{
					if(indeks ==i)
					antall += antallTegn[indeks];
			}
		return antall;
	}
/*----------------------------------------------------
 Metode som finner bokstaven(e) som forekommer oftest
---------------------------------------------------*/
	public String finnOftestBokstav()
			{
				String output=" ";

				int[]bokstavIndeks = new int[29];
				int st�rsteTall = finnSt�rsteTall();
                //
                for (int i = 0;i<antallTegn.length-1;i++)
                {
					if(antallTegn[i]==st�rsteTall)
					bokstavIndeks[i]++;
				}//for
				for (int j = 0; j<bokstavIndeks.length;j++)
				{
					if(bokstavIndeks[j]>0)
					output += indeksTilChar(j)+", ";

				}
				return output;
		}//static void finnOftestBokstav


/*----------------------------------------------------
 Metode som henter det st�rste tallet i tabellen
---------------------------------------------------*/

	public int finnSt�rsteTall()
	{
		int st�rsteTall = antallTegn[0];

		for(int i = 0 ; i<antallTegn.length-1 ; i++)
		{
			if(st�rsteTall < antallTegn[i])
			{
				st�rsteTall = antallTegn[i];
				antallTegn[i] = st�rsteTall;
			}

		}//for
		return st�rsteTall;
	}//finnSt�rsteTall()

/*----------------------------------------------------------------
-----------------------------------------------------------------
						Private metoder
-----------------------------------------------------------------
------------------------------------------------------------------*/

/*-------------------------------------------------
		Metode som konverterer fra char til indeks
---------------------------------------------------*/
	private int charTilIndeks(char tegn)
	{
		switch (tegn)
		{
		case '�': return 26;
		case'�': return 27;
		case'�': return 28;
		default: return (int)(tegn-97);
		}
	}
/*-----------------------------------------------------
			Metode som konverterer fra char til indeks
----------------------------------------------------*/
	private char indeksTilChar(int indeks)
	{
		switch(indeks)
		{
		case 26: return '�';
		case 27: return '�';
		case 28: return '�';
		default: return (char)(indeks+97);
		}
	}

}//class