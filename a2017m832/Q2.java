package a2017m832;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Q2 extends JPanel{
	
	private JButton[][] buttonBord;
	private int [][] numBord;
	private final int SIZE=4;
	
	public Q2()
	{
		
		int temp=15;
		
		this.setLayout(new BorderLayout());
		Listener lis = new Listener();
		JPanel up = new JPanel();
		up.setLayout(new GridLayout(SIZE,SIZE));
		
		 buttonBord = new JButton[SIZE][SIZE];
		 numBord = new int [SIZE][SIZE];
		 
			for (int i=SIZE-1; i>=0;i--)
			{
				for (int j=SIZE-1; j>=0;j--)
				{
					if (temp!=0) {
					String xxName = String.valueOf(temp);
					buttonBord[i][j]=new JButton(xxName);
					numBord[i][j]=temp;
					temp--;
					}
					
					else
					{
						buttonBord[i][j]=new JButton("");
						numBord[i][j]=0;
					}
					buttonBord[i][j].addActionListener(lis);
					up.add(buttonBord[i][j]);
					
					
				}
			}
			
			this.add(up);
			JFrame fr = new JFrame("q2");
			fr.add(this);
			fr.pack();
			fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			fr.setVisible(true);
			
	}
	
	  private class Listener implements ActionListener 
	    { public void actionPerformed(ActionEvent e)
	    	{ 
	    	for (int i=0; i<SIZE;i++)
    		{
    			for (int j=0; j<SIZE;j++)
    			{
    				if(e.getSource()== buttonBord[i][j] && numBord[i][j]!=0) 
    				{
    					
    					if (i<SIZE-1)
    					{	
    						if (numBord[i+1][j]==0)
    						{	
    							String xxName = String.valueOf(numBord[i][j]);
    							numBord[i+1][j]=numBord[i][j];
    							numBord[i][j]=0;
    							buttonBord[i+1][j].setText(xxName);
    							buttonBord[i][j].setText("");
    	    	    			validate();
    	    	    			repaint();

    	    	    			
    	    	    			break;
    						}
    						
    					}
    					
    					 if (i>0)
    					{	
    					
    						if (numBord[i-1][j]==0)
    						{
    							String xxName = String.valueOf(numBord[i][j]);
    							numBord[i-1][j]=numBord[i][j];
    							numBord[i][j]=0;
    							buttonBord[i][j].setText(""); 
    							buttonBord[i-1][j].setText(xxName);
    	    	    			validate();
    	    	    			repaint();
    	    	    			
    	    	    			
    	    	    			break;
    						}
    					}
    					
    					 if (j<SIZE-1)
    					{	
    						if (numBord[i][j+1]==0)
    						{
							String xxName = String.valueOf(numBord[i][j]);
							numBord[i][j+1]=numBord[i][j];
							numBord[i][j]=0;
							buttonBord[i][j].setText("");
							buttonBord[i][j+1].setText(xxName);
	    	    			validate();
	    	    			repaint();
	    	    			
	    	    			
	    	    			break;
						}
    					}
    					
    					 if (j>0)
    					{ 
    						if (numBord[i][j-1]==0)
    						{
    							String xxName = String.valueOf(numBord[i][j]);
    							numBord[i][j-1]=numBord[i][j];
    							numBord[i][j]=0;
    							buttonBord[i][j].setText(""); 
    							buttonBord[i][j-1].setText(xxName);
    	    	    			validate();
    	    	    			repaint();
    	    	    			
    	    	    			
    	    	    			break;
    						}
    					}
    					 

    					 
    					
    			}
    			}
    		}
	    	
	    }
	    }
	 public static void main(String[] args)
	 {
		 new Q2();
	 }

}
