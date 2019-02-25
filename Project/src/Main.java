
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

public class Main
{
	User me = new User();
	
	static JFrame Screen;
	static SpringLayout layout = new SpringLayout();
	private Panel pnl;
	private static JTextArea jText;
	public static Buttons that;
	ImageIcon icon = new ImageIcon("https://images.pexels.com/photos/2334/hill-meadow-tree-green.jpg?auto=compress&cs=tinysrgb&h=750&w=1260", "beautyIncarnate");
	
	public static void main(String[] args)
	{
		new Main();
	}
	
	public Main()
	{
		initialize();
		println("Hello young trainer, I am Professor Git, feel free to select your first Minimon");
		Minimon pik = new Minimon("Pikachu");
		Minimon bulb = new Minimon("Bulbasaur");
		pik.attack(bulb);
	}
	
	public void attack(Minimon mine)
	{
		Minimon opp = Minimon(randMin());
		while(true)
		{
			mine.attack(opp);
			if(opp.health > 0)
			{
				
			}
		}
	}
	
	public void evolve(Minimon p)
	{
		me.replaceMinimon(p, p.getNextEvo());
	}
	
	public static void println(String message)
	{
		jText.append(message + "\n");
	}
	
	public static void println(boolean message)
	{
		jText.append(message + "\n");
	}
	
	public static void println(int message)
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
		
		that = new Buttons();
		
		pnl = new Panel();
		pnl.setLayout(new SpringLayout());
		Screen.add(pnl, SpringLayout.WEST);
		
		jText = new JTextArea();
		jText.append( "Welcome to the world of Minimon.\n" );
		Screen.add(jText);
		
		
		Screen.pack();
		Screen.revalidate();
		Screen.repaint();
		
		new Minimon();
	}
}
