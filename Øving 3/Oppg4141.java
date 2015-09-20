import javax.swing.*;
import java.lang.*;

class Oppg4141
{
	public static void main (String[] args)
	{
		velgDel();
	}//main
	static void velgDel ()
	{
		boolean ferdig = false;
		while(!ferdig){

		int delValgt1 = 0;
		int delValgt2 = 0;
		try {
				 delValgt1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Velg del av gangetabellen du vil starte: "));
				 delValgt2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Velg del av gangetabellen du vil slutte: "));
			}
		catch (NumberFormatException e)
			{
				System.out.println("Gangetabellen består av heltall, ikke andre symboler");
				break;
			}

			if (delValgt1 > 0 && delValgt1 < 2147483647/10 || delValgt2 > 0 && delValgt2 < 2147483647/10)
			{
				for(int j = delValgt1; j <= delValgt2;j++)
				{
					System.out.println(j + "- Gangen:");
					for (int i = 1; i<11 ; i++)//skriver ut gangetabellen 1-10
					{
						System.out.println(i+ " * " + j + " = " + i * j);
					}//for
					System.out.println("     ");
				}//for
				ferdig = true;
			}//if
			else if(delValgt1 > 2147483647/10 || delValgt2 > 2147483647/10)
			{
				JOptionPane.showMessageDialog(null,"Tallet ditt er for stort ");
			}//else if

			else if( delValgt1<0 || delValgt2 < 0)
			{
				JOptionPane.showMessageDialog(null,"Tallet ditt er negativt ");
			}//else if
		}//while
	}//static void
}//class