import java.io.*;
import java.util.*;
public class Konto
{

	private int saldo;

	private String kommando, innlestKommando,element,historikk,filnavn;
	private StringTokenizer analyse;
	private String[] linjer;

	private FileWriter skrivePrep;
	private PrintWriter skriver;
	private FileReader lesePrep;
	private BufferedReader leser;

	public Konto(int startSaldo,String filnavn)
	{
		this.saldo = startSaldo;
		this.filnavn = filnavn;
	}
/*-------------------------------------------------
	get-metoder
--------------------------------------------------------*/
	public int getSaldo()throws IOException
	{
		analyserKommando();
		return saldo;
	}


	public void setSaldo(int tall)
	{
		saldo = tall;
	}

	public String getHistorikk()throws IOException
	{
		finnHistorikk();
		return historikk;
	}
/*------------------------------------------------------

--------------------------------------------------------*/
	private void finnHistorikk()throws IOException
	{
		historikk =" ";
		lesFil();
		linjer = innlestKommando.split("\n");

		int startIndeks=linjer.length-3;
		startIndeks = Math.max(0,startIndeks);

		for(int i=startIndeks;i<linjer.length;i++)
		{
			historikk += linjer[i]+"\n";
		}
	}

	private void analyserKommando()throws IOException
	{
		lesFil();
		linjer = innlestKommando.split("\n");//deler opp stringen på linjeskift

		for(int i =0; i<linjer.length; i++)
		{
			analyse = new StringTokenizer(linjer[i]," ");//splitter på mellomrom med tokenizer

			while(analyse.hasMoreTokens())
			{
				element = analyse.nextToken();

				if(element.equals("i"))
				{
					saldo += Integer.parseInt(analyse.nextToken());
				}

				else if(element.equals("u"))
				{
					saldo -= Integer.parseInt(analyse.nextToken());

				}//else if

			}//while

		}//for

	}//analyserKommando()

	public void transaksjon(String input, boolean lagre)throws IOException//skriv fil
	{
		skrivePrep = new FileWriter(filnavn,lagre);
		skriver = new PrintWriter(new BufferedWriter(skrivePrep));

		skriver.println(input);
		skriver.close();
	}

	private void lesFil()throws IOException
	{
		lesePrep = new FileReader(filnavn);
		leser = new BufferedReader(lesePrep);

		kommando = leser.readLine();
		innlestKommando = "";

		while(kommando != null)
		{
			innlestKommando += (kommando+"\n");
			kommando = leser.readLine();
		}
		leser.close();
	}//lesFil()
}//class