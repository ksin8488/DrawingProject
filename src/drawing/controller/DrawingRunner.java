package drawing.controller;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.util.Hashtable;

import javax.swing.*;
import javax.swing.event.ChangeEvent;	//still need to addeven with javax.swing.*
import javax.swing.event.ChangeListener;

import drawing.controller.DrawingController;

public class DrawingRunner
{
	public static void main(String [] args)
	{
		DrawingController appController = new DrawingController();
		appController.start();
	}
}
