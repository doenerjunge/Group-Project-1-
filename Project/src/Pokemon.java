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
	
	public static final int VENUSAUR_HP = 80;
	public static final String VENUSAUR_TYPE = "Grass";
	public static final HashMap<String, Integer> VENUSAUR_ATTACKS = new HashMap<String, Integer>();
	
	public static final int CHARMANDER_HP = 39;
	public static final String CHARMANDAR_TYPE = "Fire";
	public static final HashMap<String, Integer> CHARMANDAR_ATTACKS = new HashMap<String, Integer>();
	
	public static final int CHARMELEON_HP = 58;
	public static final String CHARMELEON_TYPE = "Fire";
	public static final HashMap<String, Integer> CHARMELEON_ATTACKS = new HashMap<String, Integer>();
	
	public static final int CHARIZARD_HP = 78;
	public static final String CHARIZARD_TYPE = "Fire";
	public static final HashMap<String, Integer> CHARIZARD_ATTACKS = new HashMap<String, Integer>();
	
	public static final int SQUIRTLE_HP = 44;
	public static final String SQUIRTLE_TYPE = "Water";
	public static final HashMap<String, Integer> SQUIRTLE_ATTACKS = new HashMap<String, Integer>();
	
	public static final int WARTORTLE_HP = 59;
	public static final String WARTORTLE_TYPE = "Water";
	public static final HashMap<String, Integer> WARTORTLE_ATTACKS = new HashMap<String, Integer>();
	
	public static final int BLASTOISE_HP = 79;
	public static final String BLASTOISE_TYPE = "Water";
	public static final HashMap<String, Integer> BLASTOISE_ATTACKS = new HashMap<String, Integer>();
	
	public static final int PIDGEY_HP = 40;
	public static final String PIDGEY_TYPE = "Normal";
	public static final HashMap<String, Integer> PIDGEY_ATTACKS = new HashMap<String, Integer>();
	
	public static final int PIDGEOTTO_HP = 63;
	public static final String PIDGEOTTO_TYPE = "Normal";
	public static final HashMap<String, Integer> PIDGEOTTO_ATTACKS = new HashMap<String, Integer>();
	
	public static final int PIDGEOT_HP = 83;
	public static final String PIDGEOT_TYPE = "Normal";
	public static final HashMap<String, Integer> PIDGEOT_ATTACKS = new HashMap<String, Integer>();
	
	public static final int PIKACHU_HP = 35;
	public static final String PIKACHU_TYPE = "Electric";
	public static final HashMap<String, Integer> PIKACHU_ATTACKS = new HashMap<String, Integer>();
	
	public static final int RAICHU_HP = 60;
	public static final String RAICHU_TYPE = "Electric";
	public static final HashMap<String, Integer> RAICHU_ATTACKS = new HashMap<String, Integer>();
	
	public static final int SANDSHREW_HP = 50;
	public static final String SANDSHREW_TYPE = "Ground";
	public static final HashMap<String, Integer> SANDSHREW_ATtACKS = new HashMap<String, Integer>();
	
	public static final int SANDSLASH_HP = 75;
	public static final String SANDSLASH_TYPE = "Ground";
	public static final HashMap<String, Integer> SANDSLASH_ATTACKS = new HashMap<String, Integer>();
	
	public static final int MACHOP_HP = 70;
	public static final String MACHOP_TYPE = "Fighting";
	public static final HashMap<String, Integer> MACHOP_ATTACKS = new HashMap<String, Integer>();
	
	public static final int MACHOKE_HP = 80;
	public static final String MACHOKE_TYPE = "Fighting";
	public static final HashMap<String, Integer> MACHOKE_ATTACKS = new HashMap<String, Integer>();
	
	public static final int MACHAMP_HP = 90;
	public static final String MACHAMP_TYPE = "Fighting";
	public static final HashMap<String, Integer> MACHAMP_ATTACKS = new HashMap<String, Integer>();
	
	public static final int EEVEE_HP = 55;
	public static final String EEVEE_TYPE = "Normal";
	public static final HashMap<String, Integer> EEVEE_ATTACKS = new HashMap<String, Integer>();
	
	public static final int VAPOREON_HP = 130;
	public static final String VAPOREON_TYPE = "Water";
	public static final HashMap<String, Integer> VAPOREON_ATTACKS = new HashMap<String, Integer>();
	
	public static final int JOLTEON_HP = 65;
	public static final String JOLTEON_TYPE = "Electric";
	public static final HashMap<String, Integer> JOLTEON_ATTACKS = new HashMap<String, Integer>();
	
	public static final int FLAREON_HP = 65;
	public static final String FLAREON_TYPE = "Fire";
	public static final HashMap<String, Integer> FLAREON_ATTACKS = new HashMap<String, Integer>();
	
	public static final int MEW_HP = 100;
	public static final String MEW_TYPE = "Psychic";
	public static final HashMap<String, Integer> MEW_ATTACKS = new HashMap<String, Integer>();
	
	public static final int IDK_HP = 2000;
	public static final String IDK_TYPE = "Error";
	public static final HashMap<String, Integer> IDK_ATTACKS = new HashMap<String, Integer>();
	
	private String name;
	private String type;
	private int health;
	private static final Scanner sc = new Scanner(System.in);
	
	public Pokemon()
	{
		MEW_ATTACKS.put("Pound", 40);
		MEW_ATTACKS.put("Confusion", 50);
		IDK_ATTACKS.put("???", Randomizer.nextInt(20, 60));
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
		else if(name.equals("Charmandar") || name.equals("Charmeleon") || name.equals("Charizard") || name.equals("Flareon"))
		{
			type = CHARMANDAR_TYPE;
		}
		else if(name.equals("Squirtle") || name.equals("Wartortle") || name.equals("Blastoise") || name.equals("Vaporeon"))
		{
			type = SQUIRTLE_TYPE;
		}
		else if(name.equals("Pidgey") || name.equals("Pidgeotto") || name.equals("Pidgeot") || name.equals("Eevee"))
		{
			type = PIDGEY_TYPE;
		}
		else if(name.equals("Pikachu") || name.equals("Raichu") || name.equals("Jolteon"))
		{
			type = PIKACHU_TYPE;
		}
		else if(name.equals("Sandshrew") || name.equals("Sandslash"))
		{
			type = SANDSHREW_TYPE;
		}
		else if(name.equals("Machop") || name.equals("Machoke") || name.equals("Machamp"))
		{
			type = MACHOP_TYPE;
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
