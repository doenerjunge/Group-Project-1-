
public enum PokemonConstants
{
	BULBASUAR(10, 5);
	
	private Integer hp, dmg;
	private Object[] fieldList;
	private PokemonConstants(Integer hp, Integer dmg)
	{
		this.hp = hp;
		this.dmg = dmg;
		
		fieldList = new Object[2];
		fieldList[0] = hp;
		fieldList[1] = dmg;
	}
	
	public Object[] getDuplicateFields()
	{
		Object[] out = new Object[fieldList.length];
		for(int i = 0; i < out.length; i++)
		{
			Object obj = fieldList[i];
			if(obj instanceof Integer)
			{
				Integer objInInteger = (Integer)obj;
				out[i] = Integer.parseInt(String.valueOf(objInInteger.intValue()));
			}
			else if(obj instanceof String)
			{
				String str = (String)obj;
				out[i] = str;
			}
		}
		return out;
	}
}
