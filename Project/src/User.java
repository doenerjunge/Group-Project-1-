public class User 
{
	private Pokemon[] pokeBalls = new Pokemon[5];
	private String name;
	private int curIndex;
	private int numPoke;
	
	public User()
	{
		
	}
	
	public User(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void addPokemon(Pokemon poke)
	{
		pokeBalls[curIndex] = poke;
		poke.setOwner(name);
		curIndex ++;
		numPoke ++;
	}
	
	public String getPokemon()
	{
		String out = "";
		for(int i = 0; i < numPoke; i++)
		{
			if(i == numPoke-1)
			{
				if(numPoke == 1)
				{
					out += pokeBalls[i];
				}
				else
				{
					out += "and "+ pokeBalls[i];
				}
			}
			else
			{
				out += pokeBalls[i] + ", ";
			}
		}
		return out;
	}
	
	private int findIndex(Pokemon p)
	{
		int index = 0;
		for(int i = 0; i < numPoke; i++)
		{
			if(pokeBalls[i].getName().equals(p.getName()))
			{
				index = i;
			}
		}
		return index;
	}
	
	public void losePokemon(int index)
	{
		Pokemon[] tempPokeBalls = new Pokemon[5];
		for(int i = 0; i < index; i++)
		{
			tempPokeBalls[i] = pokeBalls[i];
		}
		for(int i = index + 1; i < pokeBalls.length; i ++)
		{
			tempPokeBalls[i-1] = pokeBalls[i];
		}
		pokeBalls = tempPokeBalls;
	}
	
	public void replacePokemon(Pokemon oldPoke, String newPokeName)
	{
		int index = findIndex(oldPoke);
		Pokemon newPoke = new Pokemon(newPokeName);
		Pokemon[] tempPokeBalls = new Pokemon[5];
		int stop = 0;
		for(int i = 0; i < index; i++)
		{
			tempPokeBalls[i] = pokeBalls[i];
			stop = i + 1;
		}
		tempPokeBalls[stop] = newPoke;
		for(int i = index + 1; i < pokeBalls.length; i ++)
		{
			tempPokeBalls[i] = pokeBalls[i];
		}
		pokeBalls = tempPokeBalls;
	}
}
