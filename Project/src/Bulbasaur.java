import java.util.*;

public class Bulbasaur extends Pokemon
{
	HashMap<String, Integer> attacks;
	public Bulbasaur()
	{
		super("Bulbasaur", "Grass", 45);
		attacks = new HashMap<String, Integer>();
		attacks.put("Tackle", 35);
		attacks.put("Growl", 40);
		attacks.put("Vine Whip", 25);

	}
	
	public String getAtk()
	{
		while(true)
		{
			String attck = readLine("Select attack (Tackle, Growl, Vine Whip)");
			if(attck.equals("Tackle"));
			{
				return attck;
				break;
			}
			else if(attck.equals("Growl"));
			{
				return attck;
				break;
			}
			else if(attck.equals("Vine Whip")); 
			{
				return attck;
				break;
			}
			else 
			{
				System.out.println("This is not a valid attack. Try Again."); 
			}
		}
	}
	
	public void attack(Pokemon other)
	{
		String attck = getAtk();
		if(attck.equals("Tackle"));
		{
			System.out.println("Bulbasaur attacked " + other.getName() + " with Tackle.");
			other.loseHealth(attacks.get("Tackle"));
		}
		else if(attck.equals("Growl"));
		{
			System.out.println("Bulbasaur attacked " + other.getName() + " with Growl.");
			other.loseHealth(attacks.get("Growl"));
		}
		else if(attck.equals("Vine Whip"));
		{
			System.out.println("Bulbasaur attacked " + other.getName() + " with Vine Whip.");
			other.loseHealth(attacks.get("Vine Whip"));
		}
		else
		{
			System.out.println("This is not a valid attack. Try Again."); 
		}


	}
}


