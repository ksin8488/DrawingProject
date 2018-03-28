package drawing.view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JPanel;

import drawing.controller.DrawingController;

public class ShapeCanvas extends JPanel
{
	private ArrayList<Polygon> triangleList;		//triangle is a list of polygon type because there is no triangle type in java
	private ArrayList<Polygon> polygonList;
	private ArrayList<Ellipse2D> ellipseList;
	private ArrayList<Rectangle> rectangleList;
	private DrawingController app;
	
	private BufferedImage canvasImage;
	
	public ShapeCanvas(DrawingController app)
	{
		super();
		
	}
}
