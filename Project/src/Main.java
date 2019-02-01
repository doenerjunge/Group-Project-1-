public class Main 
{
	public static void main(String[] args)
	{
		Pokemon p = new Pikachu();
		Pokemon s = new Squirtle();
		p.attack(s);
		s.attack(p);
		System.out.println(p.getHealth());
		System.out.println(s.getHealth());
	}
}
