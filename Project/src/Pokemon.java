import java.util.*;
public abstract class Pokemon 
{
	public String name;
	public String type;
	public int health;
	
	public Pokemon(String name, String type, int health)
	{
		this.name = name;
		this.type = type;
		this.health = health;
	}
	
	public abstract void attack(Pokemon other);
	
	public String getName()
	{
		return this.name;
	}
	
	public void loseHealth(int amount)
	{
		health -= amount;
	}
	
	public int getHealth()
	{
		return health;
	}
}
