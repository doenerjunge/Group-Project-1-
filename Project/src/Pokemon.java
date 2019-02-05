import java.util.Scanner;

public abstract class Pokemon 
{
	private String name;
	private String type;
	private int health;
	private static final Scanner sc = new Scanner(System.in);
	
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
