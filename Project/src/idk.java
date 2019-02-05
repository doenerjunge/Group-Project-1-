import java.util.HashMap;

public class idk extends Pokemon
{
	HashMap<String, Integer> attacks;
	public idk()
	{
		super("???", "???", 2000);
		attacks = new HashMap<String, Integer>();
		attacks.put("?", 35);
		attacks.put("??", 40);
		attacks.put("???", 25);

	}
	
	public String getAtk()
	{
		while(true)
		{
			String attck = readLine("Select attack (?, ??, ???): ");
			if(attck.equals("?"))
			{
				return attck;
			}
			else if(attck.equals("??"))
			{
				return attck;
			}
			else if(attck.equals("???"))
			{
				return attck;
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
		if(attck.equals("?"))
		{
			System.out.println("??? attacked " + other.getName() + " with ?.");
			other.loseHealth(attacks.get("?"));
		}
		else if(attck.equals("??"))
		{
			System.out.println("??? attacked " + other.getName() + " with ??.");
			other.loseHealth(attacks.get("??"));
		}
		else if(attck.equals("???"))
		{
			System.out.println("??? attacked " + other.getName() + " with ???.");
			other.loseHealth(attacks.get("???"));
		}
		else
		{
			System.out.println("This is not a valid attack. Try Again."); 
		}


	}
}


