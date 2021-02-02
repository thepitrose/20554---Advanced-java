package m12;

import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;

import java.util.ArrayList;
import java.util.Scanner; 
	


public class Paint extends JPanel
	{ 
	 
	   ArrayList<Dots> alt= new ArrayList<Dots>();
	   ArrayList<Lines> alinet= new ArrayList<Lines>();
	   
	  Scanner input = new Scanner(System.in);
	  String action = input.nextLine();


	 
//============Let's draw! Method======================	
	 
	 
	   public void paintComponent(Graphics g)
	   {
	      
		   super.paintComponent(g);
	    
 //============Collecting information from the user======================	
		   
	      while(!(action).equals(""))
				 {
					 int x = Integer.parseInt(action);
					  
					 while(x<0 ||x>400 ) 
					 {
						 System.out.println(" the point X  is out of range,0 to 400, please re-enter it");
						 action = input.nextLine();
						 x = Integer.parseInt(action);
					 }
					 
					 action = input.nextLine();
					 int y = Integer.parseInt(action);
					  
					  
					 while (y<0 ||y>400 ) 
					 {
						System.out.println(" the point Y  is out of range,0 to 400, please re-enter it");
						action = input.nextLine();
						y = Integer.parseInt(action);				
					 }

						 
//============The creation of the dots======================					 

			    Dots  xx = new Dots(x,y);
				alt.add(xx);
			    action = input.nextLine();

			    } 
				  
			  input.close();
			  
				 for (int i=1; i<alt.size();i++)
				 {
					 Lines xx = new Lines(alt.get(i-1).getX(), alt.get(i-1).getY(), alt.get(i).getX(), alt.get(i).getY());
					 alinet.add(xx);	 
				 }
			  
	      

	      
			      for (int i=0; i<alt.size();i++)
					 {
			    	  		g.fillOval(alt.get(i).getX(),alt.get(i).getY(),6,6);

					 }
			      
			      for (int i=0; i<alinet.size();i++)
					 {
			    	  
			    	  		g.drawLine(alinet.get(i).getLxx(), alinet.get(i).getLxy(),  alinet.get(i).getLyx(), alinet.get(i).getLyy());
			    	  		
			    	  		int tampx;
			    	  		int tampy;
			    	  		

			     			 tampx=(alinet.get(i).getLxx()+ alinet.get(i).getLyx())/2;

			   	  			 tampy=(alinet.get(i).getLxy()+ alinet.get(i).getLyy())/2;
			    	  	

			    	  		
			    	  		int tampsx=(alinet.get(i).getLxx()- alinet.get(i).getLyx())*(alinet.get(i).getLxx()- alinet.get(i).getLyx());
			    	  		int tampsy=(alinet.get(i).getLxy()- alinet.get(i).getLyy())*(alinet.get(i).getLxy()- alinet.get(i).getLyy());
			    	  		double tampsxy=tampsx+tampsy;
			    	  		double tampss = Math.sqrt(tampsxy);
			    	  		int tamps = (int) tampss;
			    	  		
			    	  		
			    	  		g.drawString(Integer.toString(tamps),tampx , tampy);
					 }
	    
 }
	
	  
	   
 public static void main (String[] args)
  {
	

//============Basic variable and settings======================	
		
	 System.out.println("Please enter the X and Y of the dot");
	 System.out.println("Press ENTER to stop");
	 System.out.println("Each X must have a Y, if you exit before set a Y, Everything will CRASH!!!!");
		
	 Paint t = new Paint();
		
	 JFrame jf = new JFrame("wow dots!");
		
	 jf.setVisible(true);
	 jf.setSize(400, 400);
	 jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 jf.add(t);
		 
		
 } 
}
