package b2017m922;


import java.awt.Point;
import java.io.ObjectInputStream;
import java.net.*;
import java.util.ArrayList;

import javax.swing.*;

public class PointGetter extends SwingWorker <Point[],Object>{
	
	private String ip;
	private int port;
	private MyPanel panel;
	private Socket s;
	
	public PointGetter(String ip,int port,MyPanel panel)
	{
		this.ip=ip;
		this.port=port;
		this.panel=panel;
	}

	@Override
	protected Point[] doInBackground() throws Exception {
		return fetch();
	}
	
	protected void done()
	{
		try
		{

			panel.addPolygon(get());
		}
		catch (Exception e) {} 
	}
	
	public Point[] fetch()
	{
		Point[] points = new Point[10];
		
		try
		{
			s = new Socket(ip,port);
			ObjectInputStream input = (ObjectInputStream) s.getInputStream();
			
			for(int i=0;i<10;i++)
			{
				Point p=(Point)input.readObject();
				points[i]=p;
			}
			
			s.close();

		}
		catch (Exception e) {} 
		
		

		return points;
	}

}
