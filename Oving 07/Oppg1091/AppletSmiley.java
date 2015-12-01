import javax.swing.*;
import java.awt.*;

class AppletSmiley extends JApplet
{
	public void init ()
	{
		add(new Smiley());
	}

}
class Tegning extends JPanel{
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
}