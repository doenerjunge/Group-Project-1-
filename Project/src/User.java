public class User 
{
	private Pokemon[] pokeBalls = new Pokemon[5];
	private int curIndex;
	private int numPoke;
	
	public User()
	{
		
	}
	
	public void addPokemon(Pokemon poke)
	{
		pokeBalls[curIndex] = poke;
		curIndex ++;
		numPoke ++;
	}
	
	public String getPokemon()
	{
		String out = "";
		for(int i = 0; i < numPoke; i++)
		{
			out += pokeBalls[i] + ", ";
		}
		return out;
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
	
	public void replacePokemon(int index, Pokemon rplc)
	{
		Pokemon[] tempPokeBalls = new Pokemon[5];
		int stop = 0;
		for(int i = 0; i < index; i++)
		{
			tempPokeBalls[i] = pokeBalls[i];
			stop = i + 1;
		}
		tempPokeBalls[stop] = rplc;
		for(int i = index + 1; i < pokeBalls.length; i ++)
		{
			tempPokeBalls[i] = pokeBalls[i];
		}
		pokeBalls = tempPokeBalls;
	}
}
