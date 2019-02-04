import java.util.*;

public class Pikachu extends Pokemon
{
	HashMap<String, Integer> attacks;
	public Pikachu()
	{
		super("Pikachu", "Electric", 40);
		attacks = new HashMap<String, Integer>();
	}
	
	public void attack(Pokemon other)
	{
		System.out.println("Pikachu attacked " + other.getName() + " with thunderbolt.");
		other.loseHealth(30);
	}
}
