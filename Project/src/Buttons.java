import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SpringLayout;

public class Buttons implements ActionListener
{
	public boolean onePressed = false;
	public boolean twoPressed = false;
	public boolean threePressed = false;
	public boolean fourPressed = false;
	public boolean fivePressed = false;
	public static JButton jbutOne;
	public static JButton jbutTwo;
	public static JButton jbutThree;
	public static JButton jbutFour;
	public static JButton jbutFive;
	
	public Buttons()
	{
		jbutOne = new JButton("One");
		jbutTwo = new JButton("Two");
		jbutThree = new JButton("Three");
		jbutFour = new JButton("Four");
		jbutFive = new JButton("Five");
		
		jbutOne.setPreferredSize(new Dimension(100, 100));
		jbutTwo.setPreferredSize(new Dimension(100, 100));
		jbutThree.setPreferredSize(new Dimension(100, 100));
		jbutFour.setPreferredSize(new Dimension(100, 100));
		jbutFive.setPreferredSize(new Dimension(100, 100));
		
		Main.layout.putConstraint(SpringLayout.NORTH, jbutOne, 200, SpringLayout.NORTH, Main.Screen);
		Main.layout.putConstraint(SpringLayout.NORTH, jbutTwo, 300, SpringLayout.NORTH, Main.Screen);
		Main.layout.putConstraint(SpringLayout.NORTH, jbutThree, 400, SpringLayout.NORTH, Main.Screen);
		Main.layout.putConstraint(SpringLayout.NORTH, jbutFour, 500, SpringLayout.NORTH, Main.Screen);
		Main.layout.putConstraint(SpringLayout.NORTH, jbutFive, 600, SpringLayout.NORTH, Main.Screen);
		Main.layout.putConstraint(SpringLayout.WEST, jbutOne, 1580, SpringLayout.NORTH, Main.Screen);
		Main.layout.putConstraint(SpringLayout.WEST, jbutTwo, 1580, SpringLayout.NORTH, Main.Screen);
		Main.layout.putConstraint(SpringLayout.WEST, jbutThree, 1580, SpringLayout.NORTH, Main.Screen);
		Main.layout.putConstraint(SpringLayout.WEST, jbutFour, 1580, SpringLayout.NORTH, Main.Screen);
		Main.layout.putConstraint(SpringLayout.WEST, jbutFive, 1580, SpringLayout.NORTH, Main.Screen);
		Main.Screen.add(jbutOne, SpringLayout.EAST);
		Main.Screen.add(jbutTwo, SpringLayout.EAST);
		Main.Screen.add(jbutThree, SpringLayout.EAST);
		Main.Screen.add(jbutFour, SpringLayout.EAST);
		Main.Screen.add(jbutFive, SpringLayout.EAST);
		
		jbutOne.addActionListener(this);
		jbutTwo.addActionListener(this);
		jbutThree.addActionListener(this);
		jbutFour.addActionListener(this);
		jbutFive.addActionListener(this);
		jbutOne.setActionCommand("One");
		jbutTwo.setActionCommand("Two");
		jbutThree.setActionCommand("Three");
		jbutFour.setActionCommand("Four");
		jbutFive.setActionCommand("Five");
		
	}
	
	@Override
	public void actionPerformed(ActionEvent ar) 
	{
		String action = ar.getActionCommand();
		if(action.equals("One"))
		{
			onePressed = true;
		}
		else if(action.equals("Two"))
		{
			twoPressed = true;
		}
		else if(action.equals("Three"))
		{
			threePressed = true;
		}
		else if(action.equals("Four"))
		{
			fourPressed = true;
		}
		else if(action.equals("Five"))
		{
			fivePressed = true;
		}
	}
}
