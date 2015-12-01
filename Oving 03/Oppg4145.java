import javax.swing.*;
import java.lang.*;
class Oppg4145
{
	public static void main (String[] args)
	{
	 	finnTall();
	}
	static void finnTall()
	{
		boolean ferdig = false;
		while(!ferdig)
		{
			int input = 0;
			try {
				input = Integer.parseInt(JOptionPane.showInputDialog(null,"Finn ut om tallet er et primtall (avslutt med andre tegn enn tall): "));
			}
			catch (NumberFormatException e)
			{
				break;
			}
			boolean primTall = false;

			if(input <= 1)
			{
				primTall = false;
			}//if

			else if(input <=3)
			{
				primTall = true;
			}//else if
			else if(input % 2 == 0)
			{
				primTall = false;
				System.out.println(" input " + input + " er delelig med " + 2 ) ;
			}//else if
			else
			{
				int j = 1;
				primTall = true;
				while (primTall && j <= input / 2)
				{
                   	j+=2;
					primTall = input%j == 0 ? false : true;
 				}//while
 				if (!primTall)
 				System.out.println(" input " + input + " er delelig med " + j ) ;
			}//else
			if(primTall)
			{
				System.out.println(input + " er et primtall!");
			}//if
			else
			{
			System.out.println(input + " er ikke et primtall!");
			}//else

		}//while
	}//static void
}//class


/*

*/