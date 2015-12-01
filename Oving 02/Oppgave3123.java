import javax.swing.*;
class Oppgave3123
{
	public static void main (String [] args)
	{
		beregn();
	}//main
		static void beregn()
		{
			double input = Double.parseDouble(JOptionPane.showInputDialog(null,"Skriv inn årstall: "));

			if  (input%100 == 0 && input > 0)
			{
				if(input % 400 ==0)
				{
				JOptionPane.showMessageDialog (null, String.format("%.0f er et skuddår!",input));
				}
				else
				{
				JOptionPane.showMessageDialog (null, String.format("%.0f er ikke et skuddår!",input));
				}//
			}//if
			else if (input > 1000 && input%4 ==0 && input > 0)
			{
				JOptionPane.showMessageDialog (null, String.format("%.0f er et skuddår!",input));
			}//else if
			else
			{
				JOptionPane.showMessageDialog (null, String.format("%.0f er ikke et skuddår :(",input));
			}//else
	}//beregn
}//class

/*
Testdata
1996--> et kjent skuddår. Forventet resultat : det blir anerkjent som skuddår
100--> forventet resultat : ikke et skuddår (delelig på 4, men ikke 400)
2001--> et kjent år som ikke er skuddår. forventet resultat--> ikke et skuddår
-156--> forventet resultat : ikke et skuddår (sjekker om verdi er større enn 0)
assd--> forventet resultat : runtime error

*/