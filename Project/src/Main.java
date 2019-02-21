
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

public class Main
{
	Minimon unusable = new Minimon();
	User me = new User();
	
	static JFrame Screen;
	static SpringLayout layout = new SpringLayout();
	private Panel pnl;
	private static JTextArea jText;
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
		
		Three_Buttons threebut = new Three_Buttons();
		
		pnl = new Panel();
		pnl.setLayout(new SpringLayout());
		Screen.add(pnl, SpringLayout.WEST);
		
		jText = new JTextArea();
		jText.append( "Welcome to the world of Minimon.\n" );
		Screen.add(jText);
		
		
		Screen.pack();
		Screen.repaint();
	}
}
