import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main
{
	private JFrame Screen;
	private Panel pnl;
	private JLabel lbl;
	ImageIcon icon = new ImageIcon("c:/users/jmhbyeu/Pictures/GreenHill.jpg", "beautyIncarnate");
	
	public static void main(String[] args)
	{
		new Main();
	}
	
	public Main()
	{
		//initframe();
		Pokemon unusable = new Pokemon();
		Pokemon p = new Pokemon("Pikachu");
		System.out.println(p.getType());
	}
	
	public void initframe()
	{
		Screen = new JFrame();
		Screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Screen.setLayout(new BorderLayout());
		Screen.setVisible(true);
		Screen.setExtendedState(JFrame.MAXIMIZED_BOTH);
		Screen.pack();
		Screen.repaint();
		initpanel();
		initlabel();
	}
	 
	private void initlabel() 
	{
		lbl = new JLabel(icon);
		Screen.add(lbl);
		Screen.pack();
		Screen.repaint();
	}

	public void initpanel()
	{
		pnl = new Panel();
		pnl.setLayout(new BorderLayout());
		Screen.add(pnl);
		Screen.pack();
		Screen.repaint();
	}
	
}
