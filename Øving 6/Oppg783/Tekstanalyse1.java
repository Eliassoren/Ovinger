public class Tekstanalyse1
{
	private int[] antallTegn;
	private String tekst;
/*------------------------------------
		Konstruktør
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
Gjør tabell klar til utskrift
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
				int størsteTall = finnStørsteTall();
                //
                for (int i = 0;i<antallTegn.length-1;i++)
                {
					if(antallTegn[i]==størsteTall)
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
 Metode som henter det største tallet i tabellen
---------------------------------------------------*/

	public int finnStørsteTall()
	{
		int størsteTall = antallTegn[0];

		for(int i = 0 ; i<antallTegn.length-1 ; i++)
		{
			if(størsteTall < antallTegn[i])
			{
				størsteTall = antallTegn[i];
				antallTegn[i] = størsteTall;
			}

		}//for
		return størsteTall;
	}//finnStørsteTall()

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
		case 'æ': return 26;
		case'ø': return 27;
		case'å': return 28;
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
		case 26: return 'æ';
		case 27: return 'ø';
		case 28: return 'å';
		default: return (char)(indeks+97);
		}
	}

}//class