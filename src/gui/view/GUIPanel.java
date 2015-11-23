package gui.view;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing .JTextField;
import javax.swing.SpringLayout;  //For Layout

import gui.controller.GUIAppController;

/**
 * 
 * @author bjol7457
 * @version 0.1 Nov 9, 2015
 */

public class GUIPanel extends JPanel
{
	
	private GUIAppController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	
	public GUIPanel(GUIAppController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		firstButton = new JButton("Please don't click me!");
		firstTextField = new JTextField("I have words....");
		
		
		setupPanel();
		setupLayout();
		setupListeners();
		changeRandomColor();
		
	}
	
	private void changeRandomColor()
	{
		int red = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		setBackground(new Color(red, green, blue));
	}
	
	
	//Helper method to load all the GUI components into the panel
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(firstTextField);
		this.setBackground(new Color(65,105,225));
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, firstTextField, 67, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 165, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 0, SpringLayout.WEST, firstTextField);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstButton, -47, SpringLayout.SOUTH, this);
	}
	
	private void setupListeners()
	{
		this.addMouseListener(new MouseListener()
		{
			public void mouseClicked(MouseEvent click)
			{
				
			}
			
			public void mouseReleased(MouseEvent released)
			{
				
			}
			
			public void mousePressed(MouseEvent pressed)
			{
				
			}
			
			public void mouseEntered(MouseEvent entered)
			{
				
			}
			
			public void mouseExited(MouseEvent exited)
			{
				
			}
			
		});
		
		this.addMouseMotionListener(new MouseMotionListener()
		{
			
			public void mouseMoved(MouseEvent moved)
			{
				if(moved.isAltDown())
				{
					changeRandomColor();
				}
				
				firstTextField.setText("Mouse X: " + moved.getX() + " Moved Y: " + moved.getY());
				
				if((Math.abs(moved.getX() - firstButton.getX()) < 5) && (Math.abs(moved.getY() - firstButton.getY()) < 5))
				{
					firstButton.setLocation((int) (Math.random() * 300), (int) (Math.random() * 300)); 
					changeRandomColor();
				}
			}
			
			public void mouseDragged(MouseEvent dragged)
			{
				changeRandomColor();
			}
			
		});
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
