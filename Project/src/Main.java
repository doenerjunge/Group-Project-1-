
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

public class Main
{
	User me = new User("Player");
	
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
		me.addMinimon(pik);
		Minimon bulb = new Minimon("Bulbasaur");
		me.addMinimon(bulb);
		Minimon cha = new Minimon("Charmander");
		me.addMinimon(cha);
		Minimon squi = new Minimon("Squirtle");
		me.addMinimon(squi);
		Minimon pidg = new Minimon("Pidgey");
		me.addMinimon(pidg);
		duel();
	}
	
	public void attack(Minimon mine)
	{
		Minimon opp = randMini();
		while(true)
		{
			if(mine.getHealth() > 0)
			{
				mine.attack(opp);
			}
			else
			{
				println("Your Pokemon's health is too low, retreat!");
				break;
			}
			if(opp.getHealth() > 0)
			{
				oppAttack(opp, mine);
			}
			else
			{
				println("You have Won!");
				break;
			}
		}
	}
	
	public void duel()
	{
		User opp = randUser();
		println("Opponent discovered with " + opp.getMinimon() + " get ready to attack!");
		int meMini = 0;
		int oppMini = 0;
		while(true)
		{
			if(me.getMiniBalls()[meMini].getHealth() <= 0)
			{
				println("Your " + me.getMiniBalls()[meMini].getName() + " is too weak!");
				meMini += 1;
			}
			if(meMini > 4)
			{
				println("Your Pokemon have all Lost! retreat");
				break;
			}
			me.getMiniBalls()[meMini].attack(opp.getMiniBalls()[oppMini]);
			
			if(opp.getMiniBalls()[oppMini].getHealth() <= 0)
			{
				println("Opponents " + opp.getMiniBalls()[oppMini].getName() + " is too weak!");
				oppMini += 1;
			}
			if(oppMini > 4)
			{
				println("You have Won!");
				break;
			}
			oppAttack(opp.getMiniBalls()[oppMini], me.getMiniBalls()[meMini]);
		}
	}
	
	public User randUser()
	{
		User out = new User("Opponent");
		for(int i = 0; i < 5; i++)
		{
			Minimon oppRand = randMini();
			out.addMinimon(oppRand);
		}
		return out;
	}
	
	public void oppAttack(Minimon opponent, Minimon you)
	{
		int integer = Randomizer.nextInt(1, opponent.getAttacks().size()-1);
		String attack = opponent.getAttacks().keySet().toArray()[integer].toString();
		int dmg = opponent.findDmg(attack, you);
		you.loseHealth(dmg);
		Main.println("Opponent " + opponent.getName() + " attacked you with " + attack + " for " + dmg + " damage, leaving you at " + you.getHealth() + " health");
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
	
	public Minimon randMini()
	{
		String output = "";
		int nameInt = Randomizer.nextInt(1,115);
		if(nameInt >= 1 && nameInt <= 8)
		{
			output = "Bulbasour";
		}
		else if(nameInt >= 9 && nameInt <= 12) 
		{
			output = "Ivysaur";
		}
		else if(nameInt >= 13 && nameInt <= 14) 
		{
			output = "Venusaur";
		}
		else if(nameInt >= 15 && nameInt <= 22) 
		{
			output = "Charmander";
		}
		else if(nameInt >= 23 && nameInt <= 26) 
		{
			output = "Charmeleon";
		}
		else if(nameInt >= 27 && nameInt <= 28) 
		{
			output = "Charizard";
		}
		else if(nameInt >= 29 && nameInt <= 36)
		{
			output = "Squirtle";
		}
		else if(nameInt >= 37 && nameInt <= 40)
		{
			output = "Wartortle";
		}
		else if(nameInt >= 41 && nameInt <= 42)
		{
			output = "Blastoise";
		}
		else if(nameInt >= 43 && nameInt <= 50)
		{
			output = "Pidgey";
		}
		else if(nameInt >= 51 && nameInt <= 54)
		{
			output = "Pidgeotto";
		}
		else if(nameInt >= 55 && nameInt <= 56)
		{
			output = "Pidgeot";
		}
		else if(nameInt >= 57 && nameInt <= 64)
		{
			output = "Pikachu";
		}
		else if(nameInt >= 65 && nameInt <= 68)
		{
			output = "Raichu";
		}
		else if(nameInt >= 67 && nameInt <= 76)
		{
			output = "Sandshrew";
		}
		else if(nameInt >= 77 && nameInt <= 80)
		{
			output = "Sandslash";
		}
		else if(nameInt >= 81 && nameInt <= 88)
		{
			output = "Machop";
		}
		else if(nameInt >= 89 && nameInt <= 92)
		{
			output = "Machoke";
		}
		else if(nameInt >= 93 && nameInt <= 94)
		{
			output = "Machamp";
		}
		else if(nameInt >= 95 && nameInt <= 102)
		{
			output = "Eevee";
		}
		else if(nameInt >= 103 && nameInt <= 106)
		{
			output = "Vaporeon";
		}
		else if(nameInt >= 107 && nameInt <= 110)
		{
			output = "Jolteon";
		}
		else if(nameInt >= 111 && nameInt <= 114)
		{
			output = "Flareon";
		}
		else if(nameInt == 115)
		{
			output = "Mew";
		}
		else
		{
			output = "Idk";
		}
		Minimon out = new Minimon(output);
		return out;
	}
}
