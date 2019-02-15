import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Main
{
	Pokemon unusable = new Pokemon();
	User me = new User();
	
	private JFrame Screen;
	private Panel pnl;
	private JLabel lbl;
	private JTextArea jText;
	ImageIcon icon = new ImageIcon("https://images.pexels.com/photos/2334/hill-meadow-tree-green.jpg?auto=compress&cs=tinysrgb&h=750&w=1260", "beautyIncarnate");
	
	public static void main(String[] args)
	{
		new Main();
	}
	
	public Main()
	{
		initframe();
		Pokemon champ = new Pokemon("Machamp");
		Pokemon mew = new Pokemon("Mew");
		champ.attack(mew);
		mew.attack(champ);
		champ.attack(mew);
	}
	
	public void evolve(Pokemon p)
	{
		me.replacePokemon(p, p.getNextEvo());
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
		initjText();
	}
	 
	public void initjText() 
	{
		jText = new JTextArea();
		jText.append( "Welcome to the world of Pokemon." );
		Screen.add(jText);
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
