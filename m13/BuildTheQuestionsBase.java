package m13;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class BuildTheQuestionsBase
{
	
	ArrayList<Questions> qlist = new  ArrayList<Questions>() ;
	private final String TEXT_PATH = "C:\\trivia.txt";
	
	public BuildTheQuestionsBase() 
	{
		
		 
		 
		  try 
	       {
			
	    	   Scanner input = new Scanner(new File(TEXT_PATH));
	    	  
		       while (input.hasNext())
		       {

		    	
		    	   
		    	   String qtext = input.nextLine();		    	  
		    	   String atext = input.nextLine();
		    	   ArrayList<Answers> tamp = new  ArrayList<Answers>() ; 
		    	   Answers xx = new Answers(atext, true);
		    	   tamp.add(xx);
		    	   atext = input.nextLine();
		    	    xx = new Answers(atext, false);
		    	    tamp.add(xx);
		    	    atext = input.nextLine();
		    	    xx = new Answers(atext, false);
		    	    tamp.add(xx);
		    	    atext = input.nextLine();
		    	    xx = new Answers(atext, false);
		    	    tamp.add(xx);
		    	   Collections.shuffle(tamp);
		    	    Questions qq= new Questions (qtext, tamp);
		    	    this.qlist.add(qq);
		    	   
		    	   
		       }
		       input.close();
		       
	       } 
	       catch (FileNotFoundException e) 
	       {
	    	   JOptionPane.showMessageDialog(null,"Can not find the question file,Please check the path --> c:\\trivia.txt","Wrong path",JOptionPane.INFORMATION_MESSAGE);
			e.printStackTrace();
	       }
	    
		
	}
	
	public ArrayList<Questions> copyList()
	{
		 Collections.shuffle(qlist);
	 return this.qlist;
	}
} 