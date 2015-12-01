import java.util.*;
class Oppg781Main
{
	public static void main(String[]args)
	{
		Random random = new Random();
		int[] antall = new int[10];
		int tall =0;
		for (int i = 0; i < 20000;i++)
		{
			tall = random.nextInt(10);
			antall[tall] += 1;
		}//for


		for (int j = 0;j<antall.length;j++)
		{
			String stjerner =" ";
			int antStjerner = 0;
			double mengdePros = antall[j];
			double lengde = Math.round(mengdePros/100);
			for (double k = 0.; k<lengde ;k++)
			{
			stjerner += "*";
			antStjerner++;

			}//for
			System.out.println(antall[j] + stjerner + antStjerner);
		}//for

	}//main
}//class