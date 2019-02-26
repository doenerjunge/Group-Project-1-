import java.util.*;

public class Minimon 
{	
	public static final double STRONG = 2;
	public static final double UNAFFECTED = 1;
	public static final double WEAK = .5;
	
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
	public static final String CHARMANDER_TYPE = "Fire";
	public static final HashMap<String, Integer> CHARMANDER_ATTACKS = new HashMap<String, Integer>();
	
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
	public static final HashMap<String, Integer> SANDSHREW_ATTACKS = new HashMap<String, Integer>();
	
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
	
	public static final int IDK_HP = 1;
	public static final String IDK_TYPE = "null";
	public static final HashMap<String, Integer> IDK_ATTACKS = new HashMap<String, Integer>();
	
	private String name;
	private String type;
	private int health;
	private int xP;
	private String nextEvo;
	private String owner;
	private int lastDamageDone;
	private HashMap<String, Integer> attacks;
	private static final Scanner sc = new Scanner(System.in);
	
	public Minimon()
	{
		BULBASAUR_ATTACKS.put("Tackle", 40);
		BULBASAUR_ATTACKS.put("Vine Whip", 45);
		IVYSAUR_ATTACKS.put("Tackle", 40);
		IVYSAUR_ATTACKS.put("Vine Whip", 45);
		IVYSAUR_ATTACKS.put("Power Whip", 50);
		VENUSAUR_ATTACKS.put("Petal Dance", 120);
		VENUSAUR_ATTACKS.put("Power Whip", 120);
		VENUSAUR_ATTACKS.put("Tackle", 40);
		CHARMANDER_ATTACKS.put("Scratch", 40);
		CHARMANDER_ATTACKS.put("Ember", 40);
		CHARMANDER_ATTACKS.put("Fire Spin", 35);
		CHARMELEON_ATTACKS.put("Scratch", 40);
		CHARMELEON_ATTACKS.put("Fury Swipes", 50);
		CHARMELEON_ATTACKS.put("Slash", 70);
		CHARIZARD_ATTACKS.put("Wing Attack", 60);
		CHARIZARD_ATTACKS.put("Crunch", 80);
		CHARIZARD_ATTACKS.put("Heatwave", 95);
		SQUIRTLE_ATTACKS.put("Bubble", 40);
		SQUIRTLE_ATTACKS.put("Tackle", 40);
		WARTORTLE_ATTACKS.put("Water Gun", 50);
		WARTORTLE_ATTACKS.put("Bubble", 45);
		WARTORTLE_ATTACKS.put("Tackle", 40);
		BLASTOISE_ATTACKS.put("Water Gun", 40);
		BLASTOISE_ATTACKS.put("Flash Cannon", 80);
		BLASTOISE_ATTACKS.put("Aqua Jet", 40);
		PIDGEY_ATTACKS.put("Tackle", 40);
		PIDGEY_ATTACKS.put("Gust", 45);
		PIDGEOTTO_ATTACKS.put("Gust", 40);
		PIDGEOTTO_ATTACKS.put("Quick Attack", 40);
		PIDGEOT_ATTACKS.put("Heatwave", 95);
		PIDGEOT_ATTACKS.put("Gust", 40);
		PIDGEOT_ATTACKS.put("Quick Attack", 40);
		PIKACHU_ATTACKS.put("Thunder Bolt", 40);
		PIKACHU_ATTACKS.put("Tackle", 30);
		RAICHU_ATTACKS.put("Thunder Punch", 75);
		RAICHU_ATTACKS.put("Fake Out", 40);
		RAICHU_ATTACKS.put("Thunder Bolt", 40);
		SANDSHREW_ATTACKS.put("Scratch", 40);
		SANDSHREW_ATTACKS.put("Tackle", 30);
		SANDSLASH_ATTACKS.put("Scratch", 40);
		SANDSLASH_ATTACKS.put("Poison Sting", 15);
		SANDSLASH_ATTACKS.put("Tackle", 35);
		MACHOP_ATTACKS.put("Low Kick", 40);
		MACHOP_ATTACKS.put("Tackle", 30);
		MACHOKE_ATTACKS.put("Low Kick", 80);
		MACHOKE_ATTACKS.put("Tackle", 60);
		MACHAMP_ATTACKS.put("Strength", 80);
		MACHAMP_ATTACKS.put("Low Kick", 100);
		MACHAMP_ATTACKS.put("Counter", lastDamageDone);
		EEVEE_ATTACKS.put("Tackle", 40);
		EEVEE_ATTACKS.put("Scratch", 42);
		VAPOREON_ATTACKS.put("Water Gun", 40);
		VAPOREON_ATTACKS.put("Tackle", 40);
		JOLTEON_ATTACKS.put("Thundershock", 40);
		JOLTEON_ATTACKS.put("Tackle", 40);
		FLAREON_ATTACKS.put("Ember", 40);
		FLAREON_ATTACKS.put("Tackle", 40);
		MEW_ATTACKS.put("Pound", 40);
		MEW_ATTACKS.put("Confusion", 50);
		IDK_ATTACKS.put("null", Randomizer.nextInt(20, 60));
	}
	
	public Minimon(String name)
	{
		this.name = name;
		this.type = findType(name);
		this.health = findHP(name);
		this.nextEvo = findNextEvo(name);
		this.attacks = findAttacks(name);
		this.xP = 0;
		this.lastDamageDone = 0;
		this.owner = "Wild";
	}
	
	public String findType(String name)
	{
		String type = "";
		if(name.equals("Bulbasaur") || name.equals("Ivysaur") || name.equals("Venusaur"))
		{
			type = BULBASAUR_TYPE;
		}
		else if(name.equals("Charmander") || name.equals("Charmeleon") || name.equals("Charizard") || name.equals("Flareon"))
		{
			type = CHARMANDER_TYPE;
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
		else if(name.equals("Ivysaur")) 
		{
			hp = IVYSAUR_HP;
		}
		else if(name.equals("Venusaur")) 
		{
			hp = VENUSAUR_HP;
		}
		else if(name.equals("Charmander")) 
		{
			hp = CHARMANDER_HP;
		}
		else if(name.equals("Charmeleon")) 
		{
			hp = CHARMELEON_HP;
		}
		else if(name.equals("Charizard")) 
		{
			hp = CHARIZARD_HP;
		}
		else if(name.equals("Squirtle"))
		{
			hp = SQUIRTLE_HP;
		}
		else if(name.equals("Wartortle"))
		{
			hp = WARTORTLE_HP;
		}
		else if(name.equals("Blastoise"))
		{
			hp = BLASTOISE_HP;
		}
		else if(name.equals("Pidgey"))
		{
			hp = PIDGEY_HP;
		}
		else if(name.equals("Pidgeotto"))
		{
			hp = PIDGEOTTO_HP;
		}
		else if(name.equals("Pidgeot"))
		{
			hp = PIDGEOT_HP;
		}
		else if(name.equals("Pikachu"))
		{
			hp = PIKACHU_HP;
		}
		else if(name.equals("Raichu"))
		{
			hp = RAICHU_HP;
		}
		else if(name.equals("Sandshrew"))
		{
			hp = SANDSHREW_HP;
		}
		else if(name.equals("Sandslash"))
		{
			hp = SANDSLASH_HP;
		}
		else if(name.equals("Machop"))
		{
			hp = MACHOP_HP;
		}
		else if(name.equals("Machoke"))
		{
			hp = MACHOKE_HP;
		}
		else if(name.equals("Machamp"))
		{
			hp = MACHAMP_HP;
		}
		else if(name.equals("Eevee"))
		{
			hp = EEVEE_HP;
		}
		else if(name.equals("Vaporeon"))
		{
			hp = VAPOREON_HP;
		}
		else if(name.equals("Jolteon"))
		{
			hp = JOLTEON_HP;
		}
		else if(name.equals("Flareon"))
		{
			hp = FLAREON_HP;
		}
		else if(name.equals("Mew"))
		{
			hp = MEW_HP;
		}
		else
		{
			hp = IDK_HP;
		}
		return hp;
	}
	
	public String findNextEvo(String name)
	{
		String nextEvo = "";
		if(name.equals("Bulbasaur"))
		{
			nextEvo = "Ivysaur";
		}
		else if(name.equals("Ivysaur")) 
		{
			nextEvo = "Venusaur";
		}
		else if(name.equals("Venusaur")) 
		{
			nextEvo = "Venusaur";
		}
		else if(name.equals("Charmander")) 
		{
			nextEvo = "Charmeleon";
		}
		else if(name.equals("Charmeleon")) 
		{
			nextEvo = "Charizard";
		}
		else if(name.equals("Charizard")) 
		{
			nextEvo = "Charizard";
		}
		else if(name.equals("Squirtle"))
		{
			nextEvo = "Wartortle";
		}
		else if(name.equals("Wartortle"))
		{
			nextEvo = "Blastoise";
		}
		else if(name.equals("Blastoise"))
		{
			nextEvo = "Blastoise";
		}
		else if(name.equals("Pidgey"))
		{
			nextEvo = "Pidgeotto";
		}
		else if(name.equals("Pidgeotto"))
		{
			nextEvo = "Pidgeot";
		}
		else if(name.equals("Pidgeot"))
		{
			nextEvo = "Pidgeot";
		}
		else if(name.equals("Pikachu"))
		{
			nextEvo = "Raichu";
		}
		else if(name.equals("Raichu"))
		{
			nextEvo = "Raichu";
		}
		else if(name.equals("Sandshrew"))
		{
			nextEvo = "Sandslash";
		}
		else if(name.equals("Sandslash"))
		{
			nextEvo = "Sandslash";
		}
		else if(name.equals("Machop"))
		{
			nextEvo = "Machoke";
		}
		else if(name.equals("Machoke"))
		{
			nextEvo = "Machamp";
		}
		else if(name.equals("Machamp"))
		{
			nextEvo = "Machamp";
		}
		else if(name.equals("Eevee"))
		{
			nextEvo = findEeveeNextEvo();
		}
		else if(name.equals("Vaporeon"))
		{
			nextEvo = "Vaporeon";
		}
		else if(name.equals("Jolteon"))
		{
			nextEvo = "Jolteon";
		}
		else if(name.equals("Flareon"))
		{
			nextEvo = "Flareon";
		}
		else if(name.equals("Mew"))
		{
			nextEvo = "Mew";
		}
		else
		{
			nextEvo = "Idk";
		}
		return nextEvo;
	}
	
	private String findEeveeNextEvo()
	{
		String nextEvo = "";
		int randEvo = Randomizer.nextInt(1,3);
		if(randEvo == 1)
		{
			nextEvo = "Vaporeon";
		}
		else if(randEvo == 2)
		{
			nextEvo = "Jolteon";
		}
		else if(randEvo == 3)
		{
			nextEvo = "Flareon";
		}
		return nextEvo;
	}
	
	public HashMap<String, Integer> findAttacks(String name)
	{
		HashMap<String, Integer> output;
		if(name.equals("Bulbasaur"))
		{
			output = BULBASAUR_ATTACKS;
		}
		else if(name.equals("Ivysaur")) 
		{
			output = IVYSAUR_ATTACKS;
		}
		else if(name.equals("Venusaur")) 
		{
			output = VENUSAUR_ATTACKS;
		}
		else if(name.equals("Charmander")) 
		{
			output = CHARMANDER_ATTACKS;
		}
		else if(name.equals("Charmeleon")) 
		{
			output = CHARMELEON_ATTACKS;
		}
		else if(name.equals("Charizard")) 
		{
			output = CHARIZARD_ATTACKS;
		}
		else if(name.equals("Squirtle"))
		{
			output = SQUIRTLE_ATTACKS;
		}
		else if(name.equals("Wartortle"))
		{
			output = WARTORTLE_ATTACKS;
		}
		else if(name.equals("Blastoise"))
		{
			output = BLASTOISE_ATTACKS;
		}
		else if(name.equals("Pidgey"))
		{
			output = PIDGEY_ATTACKS;
		}
		else if(name.equals("Pidgeotto"))
		{
			output = PIDGEOTTO_ATTACKS;
		}
		else if(name.equals("Pidgeot"))
		{
			output = PIDGEOT_ATTACKS;
		}
		else if(name.equals("Pikachu"))
		{
			output = PIKACHU_ATTACKS;
		}
		else if(name.equals("Raichu"))
		{
			output = PIKACHU_ATTACKS;
		}
		else if(name.equals("Sandshrew"))
		{
			output = SANDSHREW_ATTACKS;
		}
		else if(name.equals("Sandslash"))
		{
			output = SANDSLASH_ATTACKS;
		}
		else if(name.equals("Machop"))
		{
			output = MACHOP_ATTACKS;
		}
		else if(name.equals("Machoke"))
		{
			output = MACHOKE_ATTACKS;
		}
		else if(name.equals("Machamp"))
		{
			output = MACHAMP_ATTACKS;
		}
		else if(name.equals("Eevee"))
		{
			output = EEVEE_ATTACKS;
		}
		else if(name.equals("Vaporeon"))
		{
			output = VAPOREON_ATTACKS;
		}
		else if(name.equals("Jolteon"))
		{
			output = JOLTEON_ATTACKS;
		}
		else if(name.equals("Flareon"))
		{
			output = FLAREON_ATTACKS;
		}
		else if(name.equals("Mew"))
		{
			output = MEW_ATTACKS;
		}
		else
		{
			output = IDK_ATTACKS;
		}
		return output;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getType()
	{
		return type;
	}
	
	public String getNextEvo()
	{
		return nextEvo;
	}
	
	public int getXP()
	{
		return xP;
	}
	
	public int getHealth()
	{
		return health;
	}
	
	public String getOwner()
	{
		return owner;
	}
	
	public int getLastDamageDone()
	{
		return lastDamageDone;
	}
	
	public HashMap<String, Integer> getAttacks()
	{
		return attacks;
	}
	
	public String getAttacksString()
	{
		String out = "";
		for(int i = 0; i < attacks.size(); i++)
		{
			if(i == attacks.size()-1)
			{
				out += (i+1) + ": " + attacks.keySet().toArray()[i];
			}
			else
			{
				out += (i+1) + ": " + attacks.keySet().toArray()[i] + ", ";
			}
		}
		return out;
	}
	
	public String toString()
	{
		return "level " + xP + " " + name;
	}
	
	public void loseHealth(int amount)
	{
		health -= amount;
		lastDamageDone = amount;
	}
	
	public void setOwner(String owner)
	{
		this.owner = owner;
	}
	
	public int whichAttack()
	{
		int output = 0;
		Main.println("Choose Your Attack: " + getAttacksString());
		Buttons there = Main.that;
		there.show();
		while(true)
		{
			System.out.println(there.onePressed);
			boolean one = there.onePressed;
			boolean two = there.twoPressed;
			boolean three = there.threePressed;
			if(one == true)
			{
				if(attacks.size() >= 1)
				{
					System.out.println(there.onePressed);
					output = 1;
					there.onePressed = false;
					there.hide();
					break;
				}
				else
				{
					Main.println("Please press a button coresponding to an attack.");
					there.onePressed = false;
				}
			}
			if(two == true)
			{
				if(attacks.size() >= 2)
				{
					output = 2;
					there.twoPressed = false;
					there.hide();
					break;
				}
				else
				{
					Main.println("Please press a button coresponding to an attack.");
					there.twoPressed = false;
				}
			}
			if(three == true)
			{
				if(attacks.size() >= 3)
				{
					output = 3;
					there.threePressed = false;
					there.hide();
					break;
				}
				else
				{
					Main.println("Please press a button coresponding to an attack.");
					there.threePressed = false;
				}
			}
		}
		return output;
	}
	
	public void attack(Minimon other)
	{
		int choiceIndex = whichAttack() - 1;
		int dmg = findDmg(attacks.keySet().toArray()[choiceIndex].toString(), other);
		other.loseHealth(dmg);
		Main.println(owner + "'s " + name + " attacked " + other.getName() + " with " + attacks.keySet().toArray()[choiceIndex] + " for " + dmg + " damage, leaving it at " + other.getHealth() + " health");
	}
	
	public int findDmg(String atk, Minimon other)
	{
		MACHAMP_ATTACKS.replace("Counter", lastDamageDone);
		int dmg = attacks.get(atk);
		dmg *= typeEffect(other);
		return dmg;
	}
	
	public double typeEffect(Minimon other)
	{
		double effect = UNAFFECTED;
		if(type.equals(BULBASAUR_TYPE))
		{
			if(other.type.equals(CHARMANDER_TYPE))
			{
				effect = WEAK;
			}
			else if(other.type.equals(SQUIRTLE_TYPE))
			{
				effect = STRONG;
			}
		}
		else if(type.equals(CHARMANDER_TYPE))
		{
			if(other.type.equals(SQUIRTLE_TYPE))
			{
				effect = WEAK;
			}
			else if(other.type.equals(BULBASAUR_TYPE))
			{
				effect = STRONG;
			}
		}
		else if(type.equals(SQUIRTLE_TYPE))
		{
			if(other.type.equals(BULBASAUR_TYPE))
			{
				effect = WEAK;
			}
			else if(other.type.equals(CHARMANDER_TYPE))
			{
				effect = STRONG;
			}
		}
		else if(type.equals(PIKACHU_TYPE))
		{
			if(other.type.equals(BULBASAUR_TYPE))
			{
				effect = WEAK;
			}
			else if(other.type.equals(SQUIRTLE_TYPE))
			{
				effect = STRONG;
			}
		}
		else if(type.equals(SANDSHREW_TYPE))
		{
			if(other.type.equals(BULBASAUR_TYPE))
			{
				effect = WEAK;
			}
			else if(other.type.equals(PIKACHU_TYPE))
			{
				effect = STRONG;
			}
		}
		else if(type.equals(MACHOP_TYPE))
		{
			if(other.type.equals(PIDGEY_TYPE))
			{
				effect = STRONG;
			}
		}
		else if(type.equals(MEW_TYPE))
		{
			if(other.type.equals(MEW_TYPE))
			{
				effect = WEAK;
			}
			else if(other.type.equals(MACHOP_TYPE))
			{
				effect = STRONG;
			}
		}
		return effect;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public String readLine(String prompt)
	{
        Main.println(prompt);
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
