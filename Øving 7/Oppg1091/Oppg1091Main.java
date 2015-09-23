import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JFrame;
class Oppg1091Main
{
	public static void main(String[]args)
	{
		Vindu nyttVindu = new Vindu("Smilefjes");
		nyttVindu.setVisible(true);
	}
}//Oppg1091Main

class Vindu extends JFrame
{
	public Vindu(String tittel)
	{
		setTitle(tittel);
		setSize(200,120);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Smiley smilefjes = new Smiley();
		add(smilefjes);
	}
}//Vindu

class Smiley extends JPanel
{
	public void paintComponent(Graphics tegneflate)
	{
		super.paintComponent(tegneflate);
		tegneflate.setColor(Color.YELLOW);
		tegneflate.fillOval(500/*x-pos*/,300/*y-pos*/,300/*bredde*/,300/*høyde*/);//hode
		tegneflate.setColor(Color.BLACK);
		tegneflate.fillOval(520/*x-pos*/,390/*y-pos*/,100/*bredde*/,30/*høyde*/);//venstre øye
		tegneflate.setColor(Color.BLACK);
		tegneflate.fillOval(680/*x-pos*/,390/*y-pos*/,100/*bredde*/,30/*høyde*/);//høyre øye
		tegneflate.setColor(Color.BLACK);
		tegneflate.fillArc(550/*x*/,420/*y*/,200/*br*/,150/*h*/,180/*startangle*/,/*arcangle*/180);

	}
}//Smiley
