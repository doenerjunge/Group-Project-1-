import java.util.*;

public class Pokemon 
{
	public static final int STRONG = 1;
	public static final int UNAFFECTED = 0;
	public static final int WEAK = -1;
	
	public static final int BULBASAUR_HP = 45;
	public static final String BULBASAUR_TYPE = "Grass";
	public static final HashMap<String, Integer> BULBASAUR_ATTACKS = new HashMap<String, Integer>();
	
	public static final int IVYSAUR_HP = 60;
	public static final String IVYSAUR_TYPE = "Grass";
	public static final HashMap<String, Integer> IVYSAUR_ATTACKS = new HashMap<String, Integer>();
	
	public static final int PIKACHU_HP = 35;
	public static final String PIKACHU_TYPE = "Electric";
	public static final HashMap<String, Integer> PIKACHU_ATTACKS = new HashMap<String, Integer>();
	
	public static final int IDK_HP = 2000;
	public static final String IDK_TYPE = "???";
	public static final HashMap<String, Integer> IDK_ATTACKS = new HashMap<String, Integer>();
	
	public static final int MEW_HP = 100;
	public static final String MEW_TYPE = "Psychic";
	public static final HashMap<String, Integer> MEW_ATTACKS = new HashMap<String, Integer>();
	
	public static final int VENUSAUR_HP = 80;
	public static final String VENUSAUR_TYPE = "Grass";
	public static final HashMap<String, Integer> VENUSAUR_ATTACKS = new HashMap<String, Integer>();
	
	private String name;
	private String type;
	private int health;
	private static final Scanner sc = new Scanner(System.in);
	
	public Pokemon()
	{
		BULBASAUR_ATTACKS.put("Tackle", 35);
		BULBASAUR_ATTACKS.put("Growl", 40);
		BULBASAUR_ATTACKS.put("Vine Whip", 25);
		PIKACHU_ATTACKS.put("Thunderbolt", 40);
		PIKACHU_ATTACKS.put("Growl", 40);
		PIKACHU_ATTACKS.put("Tail Whip", 25);
		IDK_ATTACKS.put("???", Randomizer.nextInt(20, 60));
		MEW_ATTACKS.put("Pound", 40);
		MEW_ATTACKS.put("Confusion", 50);
		
		
	}
	
	public Pokemon(String name)
	{
		this.name = name;
		this.type = findType(name);
		this.health = findHP(name);
	}
	
	public String findType(String name)
	{
		String type = "";
		if(name.equals("Bulbasaur") || name.equals("Ivysaur") || name.equals("Venusaur"))
		{
			type = BULBASAUR_TYPE;
		}
		else if(name.equals("Pikachu"))
		{
			type = PIKACHU_TYPE;
		}
		else if(name.equals("Mew"))
		{
			type = MEW_TYPE;
		}
		else
		{
			type = IDK_TYPE;
		}
		return type;
	}
	
	public int findHP(String name)
	{
		int hp = 0;
		if(name.equals("Bulbasaur"))
		{
			hp = BULBASAUR_HP;
		}
		else if(name.equals("Pikachu")) 
		{
			hp = PIKACHU_HP;
		}
		else if(name.equals("Mew"))
		{
			hp = MEW_HP;
		}
		else if(name.equals("Ivysaur")) 
		{
			hp = IVYSAUR_HP;
		}
		else if(name.equals("Venusaur")) 
		{
			hp = VENUSAUR_HP;
		}
		else
		{
			hp = IDK_HP;
		}
		return hp;
	}
	
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
	
	public String getAttack()
	{
		return "";
	}
	
	public void attack()
	{
		
	}
	
	public int typeEffect()
	{
		return 0;
	}
	
	
	
	
	
	
	
	
	
	public String readLine(String prompt)
	{
        System.out.print(prompt);
        return sc.nextLine();
    }

    public boolean readBoolean(String prompt)
    {

        while(true)
        {
            String input = readLine(prompt);

            if(input.equalsIgnoreCase("true"))
            {
                return true;
            }

            if(input.equalsIgnoreCase("false"))
            {
                return false;
            }
        }
    }

    public double readDouble(String prompt)
    {

        while(true)
        {
            String input = readLine(prompt);
            try 
            {
                double n = Double.valueOf(input).doubleValue();
                return n;
            } catch (NumberFormatException e)
            {

            }
        }
    }

    // Allow the user to get an integer.
    public int readInt(String prompt)
    {

        while(true)
        {
            String input = readLine(prompt);
            try 
            {
                int n = Integer.parseInt(input);
                return n;
            } catch (NumberFormatException e)
            {

            }
        }
    }
}
