package drawing.controller;

import drawing.view.DrawingFrame;

import java.awt.Component;

import javax.swing.JOptionPane;

public class DrawingController
{
	private DrawingFrame appFrame;
	
	public DrawingController()
	{
		appFrame = new DrawingFrame(this);
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(appFrame, "Welcome to art!");
	}
	
	public void handleErrors(Exception error)
	{
		JOptionPane.showMessageDialog(appFrame,  error.getMessage());
	}
	
	public Component getFrame()
	{
		return appFrame;
	}
}
