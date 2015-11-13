package gui.controller;

import gui.view.GUIFrame;

/**
 * AppController for Simple GUI Application
 * @author bjol7457
 * 0.x Nov 9, 2015
 */

public class GUIAppController 
{
	//References to the GUIFrame object for internal use.
	private GUIFrame baseFrame;
	
	//Creates a GUIAppController and initializes the GUIFrame
	public GUIAppController()
	{
		baseFrame = new GUIFrame(this);
	}
	
	public void start()
	{
		
	}
	
	
}
