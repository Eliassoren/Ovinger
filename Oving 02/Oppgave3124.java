import javax.swing.*;
class Oppgave3124
{
	public static void main (String[] args)
	{
		beregn();
	}//main
	static void beregn()
	{
		double vare1Vekt = Double.parseDouble(JOptionPane.showInputDialog(null,"Skriv inn vekt(gram) vare 1: "));//vekt i gram
		double vare1Pris = Double.parseDouble(JOptionPane.showInputDialog(null,"Skriv inn pris(kr) vare 1: "));
		double vare2Vekt = Double.parseDouble(JOptionPane.showInputDialog(null,"Skriv inn vekt(gram) vare 2: "));
		double vare2Pris = Double.parseDouble(JOptionPane.showInputDialog(null,"Skriv inn pris(kr) vare 2: "));
		double prisPrKg1 = vare1Pris / vare1Vekt;
		double prisPrKg2 = vare2Pris / vare2Vekt;
		JOptionPane.showMessageDialog (null, String.format("Vare 1 koster %.2f kr/kg, mens vare 2 koster %.2f kr/kg. Hvilken tror du lønner seg?",prisPrKg1,prisPrKg2));
	}//beregn
}//class