import java.util.*;

public class Pokemon 
{
	public static final int BULBASAUR_HP = 45;
	public static final String BULBASAUR_TYPE = "Grass";
	public static final HashMap<String, Integer> BULBASAUR_ATTACKS = new HashMap<String, Integer>();
	
	public static final int PIKACHU_HP = 35;
	public static final String PIKACHU_TYPE = "Electric";
	public static final HashMap<String, Integer> PIKACHU_ATTACKS = new HashMap<String, Integer>();
	
	public static final int IDK_HP = 2000;
	public static final String IDK_TYPE = "???";
	public static final HashMap<String, Integer> IDK_ATTACKS = new HashMap<String, Integer>();
	
	
	private String name;
	private String type;
	private int health;
	private static final Scanner sc = new Scanner(System.in);
	
	public Pokemon()
	{
		BULBASAUR_ATTACKS.put("Tackle", 35);
		BULBASAUR_ATTACKS.put("Growl", 40);
		BULBASAUR_ATTACKS.put("Vine Whip", 25);
		IDK_ATTACKS.put("???", Randomizer.nextInt(20, 60));
		PIKACHU_ATTACKS.put("Thunderbolt", 40);
		PIKACHU_ATTACKS.put("Growl", 40);
		PIKACHU_ATTACKS.put("Tail Whip", 25);
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
		if(name.equals("Bulbasaur"))
		{
			type = BULBASAUR_TYPE;
		}
		else if(name.equals("Pikachu"))
		{
			type = PIKACHU_TYPE;
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
	
	public String readLine(String prompt){
        System.out.print(prompt);
        return sc.nextLine();
    }

    public boolean readBoolean(String prompt){

        while(true){
            String input = readLine(prompt);

            if(input.equalsIgnoreCase("true")){
                return true;
            }

            if(input.equalsIgnoreCase("false")){
                return false;
            }
        }
    }

    public double readDouble(String prompt){

        while(true){
            String input = readLine(prompt);
            try {
                double n = Double.valueOf(input).doubleValue();
                return n;
            } catch (NumberFormatException e){

            }
        }
    }

    // Allow the user to get an integer.
    public int readInt(String prompt){

        while(true){
            String input = readLine(prompt);
            try {
                int n = Integer.parseInt(input);
                return n;
            } catch (NumberFormatException e){

            }
        }
    }
}
