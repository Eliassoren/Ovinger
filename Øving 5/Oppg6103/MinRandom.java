/*
Klasse som del av klient Oppg6103Main for oppgave 6.10.3 side 207
*/
import java.util.Random;
public class MinRandom
{
	public int nesteHeltall(int nedre, int ovre)
	{
		Random dice = new Random();
		int tilfeldigTall = 0;

		while(tilfeldigTall < nedre)
		{
		tilfeldigTall = dice.nextInt(ovre);
		}
		return tilfeldigTall;
	}//int

	public double nesteDesimaltall(double nedre, double ovre)
	{
		Random dice = new Random();
		double tilfeldigDesimal = 0.;

		while(tilfeldigDesimal <= nedre || tilfeldigDesimal >= ovre)
		{
		tilfeldigDesimal = dice.nextDouble();
		}
		return tilfeldigDesimal;
	}//double
}//public class