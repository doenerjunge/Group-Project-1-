import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SpringLayout;

public class Three_Buttons implements ActionListener
{
	public static boolean onePressed = false;
	public static boolean twoPressed = false;
	public static boolean threePressed = false;
	public JButton jbutOne;
	public JButton jbutTwo;
	public JButton jbutThree;
	
	public Three_Buttons()
	{
		jbutOne = new JButton("One");
		jbutTwo = new JButton("Two");
		jbutThree = new JButton("Three");
		jbutOne.setPreferredSize(new Dimension(100, 100));
		jbutTwo.setPreferredSize(new Dimension(100, 100));
		jbutThree.setPreferredSize(new Dimension(100, 100));
		Main.layout.putConstraint(SpringLayout.NORTH, jbutOne, 300, SpringLayout.NORTH, Main.Screen);
		Main.layout.putConstraint(SpringLayout.NORTH, jbutTwo, 400, SpringLayout.NORTH, Main.Screen);
		Main.layout.putConstraint(SpringLayout.NORTH, jbutThree, 500, SpringLayout.NORTH, Main.Screen);
		Main.layout.putConstraint(SpringLayout.WEST, jbutOne, 1580, SpringLayout.NORTH, Main.Screen);
		Main.layout.putConstraint(SpringLayout.WEST, jbutTwo, 1580, SpringLayout.NORTH, Main.Screen);
		Main.layout.putConstraint(SpringLayout.WEST, jbutThree, 1580, SpringLayout.NORTH, Main.Screen);
		Main.Screen.add(jbutOne, SpringLayout.EAST);
		Main.Screen.add(jbutTwo, SpringLayout.EAST);
		Main.Screen.add(jbutThree, SpringLayout.EAST);
		jbutOne.addActionListener(this);
		jbutTwo.addActionListener(this);
		jbutThree.addActionListener(this);
		jbutOne.setActionCommand("One");
		jbutTwo.setActionCommand("Two");
		jbutThree.setActionCommand("Three");
	}
	
	@Override
	public void actionPerformed(ActionEvent ar) 
	{
		String action = ar.getActionCommand();
		if(action.equals("One"))
		{
			pressOne();
		}
		else if(action.equals("Two"))
		{
			pressTwo();
		}
		else if(action.equals("Three"))
		{
			pressThree();
		}
	}
	
	public void pressOne()
	{
		onePressed = true;
		onePressed = false;
	}
	
	public void pressTwo()
	{
		twoPressed = true;
		twoPressed = false;
	}
	
	public void pressThree()
	{
		threePressed = true;
		threePressed = false;
	}

}
