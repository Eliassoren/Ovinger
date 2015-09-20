import javax.swing.*;
class Oppgave3123
{
	public static void main (String [] args)
	{
		beregn();
	}//main
		static void beregn()
		{
			double input = Double.parseDouble(JOptionPane.showInputDialog(null,"Skriv inn �rstall: "));

			if  (input%100 == 0 && input > 0)
			{
				if(input % 400 ==0)
				{
				JOptionPane.showMessageDialog (null, String.format("%.0f er et skudd�r!",input));
				}
				else
				{
				JOptionPane.showMessageDialog (null, String.format("%.0f er ikke et skudd�r!",input));
				}//
			}//if
			else if (input > 1000 && input%4 ==0 && input > 0)
			{
				JOptionPane.showMessageDialog (null, String.format("%.0f er et skudd�r!",input));
			}//else if
			else
			{
				JOptionPane.showMessageDialog (null, String.format("%.0f er ikke et skudd�r :(",input));
			}//else
	}//beregn
}//class

/*
Testdata
1996--> et kjent skudd�r. Forventet resultat : det blir anerkjent som skudd�r
100--> forventet resultat : ikke et skudd�r (delelig p� 4, men ikke 400)
2001--> et kjent �r som ikke er skudd�r. forventet resultat--> ikke et skudd�r
-156--> forventet resultat : ikke et skudd�r (sjekker om verdi er st�rre enn 0)
assd--> forventet resultat : runtime error

*/