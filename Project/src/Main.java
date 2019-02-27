
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

public class Main
{
	static User me = new User("Player");
	
	static JFrame Screen;
	static SpringLayout layout = new SpringLayout();
	private Panel pnl;
	private static JTextArea jText;
	public static Buttons that;
	ImageIcon icon = new ImageIcon("https://images.pexels.com/photos/2334/hill-meadow-tree-green.jpg?auto=compress&cs=tinysrgb&h=750&w=1260", "beautyIncarnate");
	private JScrollPane pane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	private static int lines = 0;

	
	public static void main(String[] args)
	{
		new Main();
	}
	
	public Main()
	{
		initialize();
		println("Hello there! Welcome to the world of Minimon! (press one to continue)");
		waitTill();
		println("My name is Git, I am the Minimon Professor Here.");
		waitTill();
		println("These Minimon are fascinating creatures that people all over the world have befriend");
		waitTill();
		println("As for you, you can have one as a pet, use it for fights, or the obvious answer, study them for a living!");
		waitTill();
		println("Here are three excellent Minimon to start your journey: 1 Charmander, 2 Squirtle, and 3 Bulbasaur, feel free to select one");
		int mini = getButtons(3);
		String min = "";
		if(mini == 1)
		{
			min += "Charmander";
		}
		else if(mini == 2)
		{
			min += "Squirtle";
		}
		else if(mini == 3)
		{
			min += "Bulbasaur";
		}
		Minimon first = new Minimon(min);
		me.addMinimon(first);
		println(first.getName() + " Minimon has been added!");
		game();
	}
	
	public void waitTill()
	{
		while(true)
		{
			if(getButtons(1) == 1)
			{
				break;
			}
		}
	}
	
	public void game()
	{
		while(true)
		{
			println("");
			println("What would you like to do? (one for find Minimon, two for duel)");
			int choice = getButtons(2);
			if(choice == 1)
			{
				findMinimon();
			}
			else if(choice == 2)
			{
				duel();
			}
		}
	}
	
	public boolean attack(Minimon mine, Minimon opp)
	{
		boolean win = false;
		while(true)
		{
			if(mine.getHealth() > 0)
			{
				mine.attack(opp);
			}
			else
			{
				println("Your Minimon's health is too low, retreat!");
				win = false;
				break;
			}
			if(opp.getHealth() > 0)
			{
				oppAttack(opp, mine);
			}
			else
			{
				println("You have Won!");
				mine.addXP(20);
				win = true;
				break;
			}
		}
		return win;
	}
	
	public void findMinimon()
	{
		Minimon rand = randMini();
		println(rand.getName() + " Minimon found, would you like to attack? (1 for yes, 2 for no)");
		int choice = getButtons(2);
		if(choice == 1)
		{
			println("Please Select a Minimon to attack " + rand.getName() + ".");
			int choice2 = getButtons(me.getMiniBalls().length);
			boolean win = attack(me.getMiniBalls().clone()[choice2], rand);
			if(win)
			{
				println("Would you like to keep this Minimon? (1 for yes, 2 for no");
				int choice3 = getButtons(2);
				if(choice3 == 1)
				{
					if(me.full())
					{
						println("Select a Minimon to replace");
						int choice4 = getButtons(5);
						me.replaceMinimon(choice4, rand);
					}
					else
					{
						me.addMinimon(rand);
					}
				}
				else
				{
					println("Thanks for coming!");
				}
			}
			else
			{
				println("Better luck next Time!");
			}
		}
		else
		{
			println("That's okay! Come back soon");
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
				println("Your Minimon have all Lost! retreat");
				break;
			}
			println("");
			me.getMiniBalls()[meMini].attack(opp.getMiniBalls()[oppMini]);
			
			if(opp.getMiniBalls()[oppMini].getHealth() <= 0)
			{
				println("Opponents " + opp.getMiniBalls()[oppMini].getName() + " is too weak!");
				oppMini += 1;
			}
			if(oppMini > 4)
			{
				println("You have Won!");
				for(int i = 0; i < me.getMiniBalls().length; i++)
				{
					me.getMiniBalls()[i].addXP(20);
				}
				break;
			}
			println("");
			println(lines);
			oppAttack(opp.getMiniBalls()[oppMini], me.getMiniBalls()[meMini]);
			for(int i = 0; i < me.getMiniBalls().length; i++)
			{
				me.getMiniBalls()[i].resetHealth();
			}
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
	
	public static void println(String message)
	{
		jText.append(message + "\n");
		lines++;
		lineCheck();
	}
	
	public static void println(boolean message)
	{
		jText.append(message + "\n");
		lines++;
		lineCheck();
	}
	
	public static void println(int message)
	{
		jText.append(message + "\n");
		lines++;
		lineCheck();
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
		Screen.add(jText);
		jText.add(pane);
		
		
		Screen.pack();
		Screen.revalidate();
		Screen.repaint();
		
		new Minimon();
	}
	
	private static void lineCheck()
	{
		if(lines >= 50)
		{
			codePurge();
		}
	}
	
	private static void codePurge()
	{
		int start = 0;
		int end = 60;
		jText.replaceRange(null, start, end);
		jText.repaint();
		lines = 0;
	}
	
	public static int getButtons(int amount)
	{
		int output = 0;
			Buttons there = Main.that;
			there.showAll();
			while(true)
			{
				System.out.println(there.onePressed);
				boolean one = there.onePressed;
				boolean two = there.twoPressed;
				boolean three = there.threePressed;
				boolean four = there.fourPressed;
				boolean five = there.fivePressed;
				if(one == true)
				{
					if(amount >= 1)
					{
						System.out.println(there.onePressed);
						output = 1;
						there.onePressed = false;
						there.hide();
						break;
					}
					else
					{
						Main.println("Please press a recognised button.");
						there.onePressed = false;
					}
				}
				if(two == true)
				{
					if(amount >= 2)
					{
						output = 2;
						there.twoPressed = false;
						there.hide();
						break;
					}
					else
					{
						Main.println("Please press a recognised button.");
						there.twoPressed = false;
					}
				}
				if(three == true)
				{
					if(amount >= 3)
					{
						output = 3;
						there.threePressed = false;
						there.hide();
						break;
					}
					else
					{
						Main.println("Please press a recognised button.");
						there.threePressed = false;
					}
				}
				if(four == true)
				{
					if(amount >= 4)
					{
						output = 4;
						there.fourPressed = false;
						there.hide();
						break;
					}
					else
					{
						Main.println("Please press a recognised button.");
						there.fourPressed = false;
					}
				}
				if(five == true)
				{
					if(amount >= 5)
					{
						output = 5;
						there.fivePressed = false;
						there.hide();
						break;
					}
					else
					{
						Main.println("Please press a recognised button.");
						there.fivePressed = false;
					}
				}
			}
			return output;
	}

	
	public Minimon randMini()
	{
		String output = "";
		int nameInt = Randomizer.nextInt(1,115);
		if(nameInt >= 1 && nameInt <= 8)
		{
			output = "Bulbasaur";
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
