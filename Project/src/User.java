public class User 
{
	private Minimon[] miniBalls;
	private String name;
	private int curIndex;
	private int numMini;

	public User(String name)
	{
		this.miniBalls = new Minimon[5];
		this.name = name;
		this.curIndex = 0;
		this.numMini = 0;
	}
	
	public String getName()
	{
		return name;
	}
	
	public Minimon[] getMiniBalls()
	{
		return miniBalls;
	}
	
	public int getNumMini()
	{
		return numMini;
	}
	
	public boolean full()
	{
		boolean full = false;
		if(curIndex == 5)
		{
			full = true;
		}
		else
		{
			full = false;
		}
		return full;
	}
	
	public void addMinimon(Minimon Mini)
	{
		miniBalls[curIndex] = Mini;
		Mini.setOwner(name);
		curIndex ++;
		numMini ++;
	}
	
	public String getMinimon()
	{
		String out = "";
		for(int i = 0; i < numMini; i++)
		{
			if(i == numMini-1)
			{
				if(numMini == 1)
				{
					out += miniBalls[i];
				}
				else
				{
					out += "and "+ miniBalls[i];
				}
			}
			else
			{
				out += miniBalls[i] + ", ";
			}
		}
		return out;
	}
	
	public void loseMinimon(int index)
	{
		Minimon[] tempMiniBalls = new Minimon[5];
		for(int i = 0; i < index; i++)
		{
			tempMiniBalls[i] = miniBalls[i];
		}
		for(int i = index + 1; i < miniBalls.length; i ++)
		{
			tempMiniBalls[i-1] = miniBalls[i];
		}
		miniBalls = tempMiniBalls;
	}
	
	public int findIndex(Minimon p)
	{
		int index = 0;
		for(int i = 0; i < numMini; i++)
		{
			if(miniBalls[i].getName().equals(p.getName()))
			{
				index = i;
			}
		}
		return index;
	}

	
	public void replaceMinimon(int index, Minimon newMini)
	{
		Minimon[] tempMiniBalls = new Minimon[5];
		int stop = 0;
		for(int i = 0; i < index; i++)
		{
			tempMiniBalls[i] = miniBalls[i];
			stop = i + 1;
		}
		tempMiniBalls[stop] = newMini;
		for(int i = index + 1; i < miniBalls.length; i ++)
		{
			tempMiniBalls[i] = miniBalls[i];
		}
		miniBalls = tempMiniBalls;
	}
}
