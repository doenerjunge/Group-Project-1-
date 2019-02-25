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
	public static JButton jbutOne;
	public static JButton jbutTwo;
	public static JButton jbutThree;
	
	public Buttons()
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
		
		hide();
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
	}
	
	public void hide()
	{
		jbutOne.setVisible(false);
		jbutTwo.setVisible(false);
		jbutThree.setVisible(false);
	}
	
	public void show()
	{
		jbutOne.setVisible(true);
		jbutTwo.setVisible(true);
		jbutThree.setVisible(true);
	}
}
