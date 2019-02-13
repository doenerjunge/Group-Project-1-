import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Main 
{
	private JFrame Screen;
	private Panel pnl;

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
