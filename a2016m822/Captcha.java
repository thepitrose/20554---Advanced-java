package a2016m822;

import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Captcha {
	
	private ImageIcon image;
	private String text;
	
	ArrayList<ImageIcon> ilist = new  ArrayList<ImageIcon>() ;
	
	public Captcha()
	{
		image = null;
		text=null;
	}
	
	public Captcha(String text,ImageIcon image)
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
