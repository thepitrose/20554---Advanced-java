package a2019m852;

import java.util.*;
import javax.swing.*;

public class Picture {
	
	private ImageIcon image;
	private String text;
	
	ArrayList<ImageIcon> ilist = new  ArrayList<ImageIcon>() ;
	
	public Picture()
	{
		image = null;
		text=null;
	}
	
	public Picture(String text,ImageIcon image)
	{
		this.text=text;
		this.image=image;
	}
	
	
	public ImageIcon getImage()
	{
		return image;
	}
	
	public String getText()
	{
		return text;
	}
	

}
