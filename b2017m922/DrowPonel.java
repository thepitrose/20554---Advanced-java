package b2017m922;

import java.awt.*;
import java.awt.Point;
import java.util.*;

import javax.swing.*;

public class DrowPonel extends JPanel{
	private ArrayList<Polygon> polygons;
	
	public DrowPonel()
	{
		polygons= new ArrayList<>();
	}
		 public void paintComponent(Graphics g)
		   {    
			 	for (Polygon p: polygons)
			 	{	
			 		
			 		//g.drawPolygon(p.getPoints());
			   }
		   }
		   
		 
		 public void addPolygon(Polygon p)
		 {
			 polygons.add(p);
			 repaint();
		 }
		
	}

