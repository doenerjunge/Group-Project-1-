
public class Squirtle extends Pokemon
{
	public Squirtle()
	{
		super("Squirtle", "Water", 60);
	}
	
	public void attack(Pokemon other)
	{
		System.out.println("Squirtle attacked " + other.getName() + " with water splash.");
		other.loseHealth(10);
	}
}
