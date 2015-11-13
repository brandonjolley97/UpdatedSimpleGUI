package gui.view;

import java.awt.Color;
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
		firstButton = new JButton("Answer");
		firstTextField = new JTextField("Question of Life");
		
		setupPanel();
		setupLayout();
		setupListeners();
		
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
		
	}
	
	private void setupListeners()
	{
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
