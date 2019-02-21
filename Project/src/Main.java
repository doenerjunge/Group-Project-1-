import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

public class Main
{
	Minimon unusable = new Minimon();
	User me = new User();
	
	private JFrame Screen;
	SpringLayout layout = new SpringLayout();
	private Panel pnl;
	private static JTextArea jText;
	private JButton jbutOne;
	private JButton jbutTwo;
	private JButton jbutThree;
	ImageIcon icon = new ImageIcon("https://images.pexels.com/photos/2334/hill-meadow-tree-green.jpg?auto=compress&cs=tinysrgb&h=750&w=1260", "beautyIncarnate");
	
	public static void main(String[] args)
	{
		new Main();
	}
	
	public Main()
	{
		initialize();
		println("Hello young trainer, I am Professor Git, feel free to select your first Minimon");
		
	}
	
	public void evolve(Minimon p)
	{
		me.replaceMinimon(p, p.getNextEvo());
	}
	
	public static void print(String message)
	{
		jText.append(message);
	}
	
	public static void println(String message)
	{
		jText.append(message + "\n");
	}
	
	public void initialize()
	{
		Screen = new JFrame();
		Screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Screen.setLayout(layout);
		Screen.setVisible(true);
		Screen.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		pnl = new Panel();
		pnl.setLayout(new SpringLayout());
		//pnl.setPreferredSize(new Dimension(500, 30));
		//layout.putConstraint(SpringLayout.WEST, pnl, 0, SpringLayout.WEST, Screen);
		Screen.add(pnl, SpringLayout.WEST);
		
		jbutOne = new JButton("One");
		jbutTwo = new JButton("Two");
		jbutThree = new JButton("Three");
		jbutOne.setPreferredSize(new Dimension(100, 100));
		jbutTwo.setPreferredSize(new Dimension(100, 100));
		jbutThree.setPreferredSize(new Dimension(100, 100));
		layout.putConstraint(SpringLayout.NORTH, jbutOne, 300, SpringLayout.NORTH, Screen);
		layout.putConstraint(SpringLayout.NORTH, jbutTwo, 400, SpringLayout.NORTH, Screen);
		layout.putConstraint(SpringLayout.NORTH, jbutThree, 500, SpringLayout.NORTH, Screen);
		layout.putConstraint(SpringLayout.WEST, jbutOne, 1580, SpringLayout.NORTH, Screen);
		layout.putConstraint(SpringLayout.WEST, jbutTwo, 1580, SpringLayout.NORTH, Screen);
		layout.putConstraint(SpringLayout.WEST, jbutThree, 1580, SpringLayout.NORTH, Screen);
		Screen.add(jbutOne, SpringLayout.EAST);
		Screen.add(jbutTwo, SpringLayout.EAST);
		Screen.add(jbutThree, SpringLayout.EAST);
		
		jText = new JTextArea();
		jText.append( "Welcome to the world of Minimon.\n" );
		Screen.add(jText);
		
		
		Screen.pack();
		Screen.repaint();
	}
}
