import java.util.*;
import java.util.Scanner; 

public class Pikachu extends Pokemon
{
	HashMap<String, Integer> attacks;
	public Pikachu()
	{
		super("Pikachu", "Electric", 40);
		attacks = new HashMap<String, Integer>();
		attacks.put("thunderbolt", 30);
	}
	
	public void attack(Pokemon other)
	{
		String atk = readLine("Select attack: ");
		System.out.println(atk);
		if(atk.equals("thunderbolt"));
		{
			System.out.println("Pikachu attacked " + other.getName() + " with thunderbolt.");
			other.loseHealth(attacks.get("thunderbolt"));
		}
	}
}
