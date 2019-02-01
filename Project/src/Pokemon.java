
public abstract class Pokemon 
{
	public String name;
	public String type;
	
	public Pokemon(String name, String type)
	{
		this.name = name;
		this.type = type;
	}
	
	public abstract void attack();
	
	
}
