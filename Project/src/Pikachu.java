public class Pikachu extends Pokemon
{
	public Pikachu()
	{
		super("Pikachu", "Electric", 40);
	}
	
	public void attack(Pokemon other)
	{
		System.out.println("Pikachu attacked " + other.getName() + " with thunderbolt.");
		other.loseHealth(30);
	}
}
