package m13a;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;


public class FiR  extends JPanel
{

	

       private JButton clear,cmdOne,cmdTwo,cmdThree,cmdFour,cmdFive,cmdSix,cmdSeven;
       protected static final int M = 6;
	   protected static final int N = 7;
	   private static final int PREF_W = 700;
	   private static final int PREF_H = 500;
	   private JPanel upPanel;

	   public int rowOne = (M*N)-7;
	   public int rowTwo = (M*N)-6;
	   public int rowThree = (M*N)-5;
	   public int rowFour = (M*N)-4;
	   public int rowFive = (M*N)-3;
	   public int rowSix = (M*N)-2;
	   public int rowSeven = (M*N)-1;
	   public int tor=0; 
	   
	   public  int gameBoard[][] = new int [M][N];
	   
    public  FiR()
    {
    	
        this.setLayout(new BorderLayout());
       
        
//===========================creating the Panels



    	upPanel = new JPanel(new GridLayout(M, N));
        upPanel.setBorder(BorderFactory.createLineBorder(Color.red));
        final Dimension labelPrefSize = new Dimension(PREF_W / N, PREF_H / M);
        for (int i = 0; i < M; i++) 
        {
           for (int j = 0; j < N; j++) 
           {

        	  JPanel label = new DrawCanvas() 
              { 	
                 public Dimension getPreferredSize()
                 {
                    return labelPrefSize;
                 }
              };
              label.setBorder(BorderFactory.createLineBorder(Color.blue));
              label.setBackground(Color.GRAY);
              upPanel.add(label);
           }
        }
       
        
//===========================creating the buttons for numbers        
        
       cmdOne = new JButton("1");
       cmdTwo = new JButton("2");
       cmdThree = new JButton("3");
       cmdFour = new JButton("4");
       cmdFive = new JButton("5");
       cmdSix = new JButton("6");
       cmdSeven = new JButton("7");
        
       JPanel buttonPanel = new JPanel();
       buttonPanel.setLayout(new GridLayout(1, 1));
       
       buttonPanel.add(cmdOne);
       buttonPanel.add(cmdTwo);
       buttonPanel.add(cmdThree);
       buttonPanel.add(cmdFour);
       buttonPanel.add(cmdFive);
       buttonPanel.add(cmdSix);
       buttonPanel.add(cmdSeven);
        
       Listener lis = new Listener();
       
       cmdOne.addActionListener(lis);
       cmdTwo.addActionListener(lis);
       cmdThree.addActionListener(lis);
       cmdFour.addActionListener(lis);
       cmdFive.addActionListener(lis);
       cmdSix.addActionListener(lis);
       cmdSeven.addActionListener(lis);
       

       
//===========================creating the clear button    
       
        clear= new JButton("clear");
        JPanel cPanel = new JPanel();
        cPanel.add(clear);
        
        clear.addActionListener(lis);
        
//===========================United the panels

        this.add(upPanel,BorderLayout.NORTH);
        this.add(buttonPanel,BorderLayout.CENTER);
        this.add(cPanel,BorderLayout.SOUTH);
    }
        
  
//===========================Listeners
    
    
        private class Listener implements ActionListener 
        { public void actionPerformed(ActionEvent e)
        	{ 
        	if(e.getSource()==cmdOne)
        	{
         		if (rowOne>0 || rowOne ==0)
        		{
        		tor +=1;
        		 if (whoTor()==1)
        		 {
        		upPanel.getComponent(rowOne).setBackground(Color.RED);
        		 }
        		 else
        		 {
        			 upPanel.getComponent(rowOne).setBackground(Color.BLUE);
        		 }
        		sp(rowOne/N,0);
        		rowOne = rowOne-N;		
        		}
         		whoWin();
        	}
        	
        	if(e.getSource()==cmdTwo)
        	{
         		if (rowTwo>0 || rowTwo ==0)
        		{
        		tor +=1;
       		      if (whoTor()==1)
       		        {
       		    	  upPanel.getComponent(rowTwo).setBackground(Color.RED);
       		        }
       		      else
       		        {
       		    	  upPanel.getComponent(rowTwo).setBackground(Color.BLUE);
       		        }
        		sp(rowTwo/N,1);
        		rowTwo = rowTwo-N;
        		}
         		whoWin();
        	}
        	
        	if(e.getSource()==cmdThree)
        	{
         		if (rowThree>0 || rowThree ==0)
        		{
        		tor +=1;
        		  if (whoTor()==1)
        		  {
        		    upPanel.getComponent(rowThree).setBackground(Color.RED);
        		  }
        		  else
        		  {
       			    upPanel.getComponent(rowThree).setBackground(Color.BLUE);
       		      }
        		sp(rowThree/N,2);
        		rowThree = rowThree-N;	
        		}
         		whoWin();
        	}
        	
        	if(e.getSource()==cmdFour)
        	{
         		if (rowFour>0 || rowFour ==0)
        		{
        	  	tor +=1;
       		     if (whoTor()==1)
       		     {
       		       upPanel.getComponent(rowFour).setBackground(Color.RED);
       		     }
       		     else
       		     {
       		    upPanel.getComponent(rowFour).setBackground(Color.BLUE);
       		     }
        		sp(rowFour/N,3);
        		rowFour = rowFour-N; 		
        		}
         		whoWin();
        	}
        	
        	if(e.getSource()==cmdFive)
        	{
         		if (rowFive>0 || rowFive ==0)
        		{
        		tor +=1;
        		if (whoTor()==1)
        		{
       		     upPanel.getComponent(rowFive).setBackground(Color.RED);
        		}
        		else
        		{
       			 upPanel.getComponent(rowFive).setBackground(Color.BLUE);
        		}		
        		sp(rowFive/N,4);
        		rowFive = rowFive-N;
        		}
         		whoWin();
        	}
        	
        	if(e.getSource()==cmdSix)
        	{
         		if (rowSix>0 || rowSix ==0)
        		{
        		tor +=1;
        		if (whoTor()==1)
        		{
        		  upPanel.getComponent(rowSix).setBackground(Color.RED);
        		}
        		else
        		{
       			 upPanel.getComponent(rowSix).setBackground(Color.BLUE);
        		}
        		sp(rowSix/N,5);
        		rowSix = rowSix-N;	
        		}
         		whoWin();
        	}
        	
        	if(e.getSource()==cmdSeven)
        	{
         		if (rowSeven>0 || rowSeven ==0)
        		{
        		tor +=1;
        		if (whoTor()==1)
        		{
        	     upPanel.getComponent(rowSeven).setBackground(Color.RED);
        		}
        		else
        		{
       			 upPanel.getComponent(rowSeven).setBackground(Color.BLUE);
        		}
        		sp(rowSeven/N,6);
        		rowSeven = rowSeven-N;
        		}
         		whoWin();
        	}
        	
        	if(e.getSource()==clear)
        	{
        		int z = (N*M);
        		for (int i=0; i <z; i++)
        		{
        			upPanel.getComponent(i).setBackground(Color.GRAY); 
        			
        		}
        		setB();
        	}          	
        }
     }
        
        
 //===========================Positioning the disc


        
        public void sp(int i,int j)
    	{
     	  if(tor %2==0)
    	    {
    	     gameBoard[i][j]= 2;
    	    }
    	   else
    	    {
    	     gameBoard[i][j]=1;
    	    }
    	}
        
        
//===========================winner
        
        public int winner()
    	{
        	
        	
        for (int y=M-1; y>(-1); y--)	
           { 
        	
         	 if(y>M/2 || y==M/2)
        	 {
             	
             	for (int z=0 ; z<N ; z++)
             	{    
             	  if(z<(N/2) && gameBoard[y][z]!=0)
                	{        		
             		  if(up(1,y-1,z,gameBoard[y][z])==4 || left(1,y,z+1,gameBoard[y][z])==4 || slantR(1,y-1,z+1,gameBoard[y][z])==4)
        	        	{
        		           return gameBoard[y][z];
        	        	} 	
                	}
        	
        	    else if (z==(N/2) && gameBoard[y][z]!=0)
        	      {
        			if(up(1,y-1,z,gameBoard[y][z])==4 || left(1,y,z+1,gameBoard[y][z])==4 || slantR(1,y-1,z+1,gameBoard[y][z])==4 || slantL(1,y-1,z-1,gameBoard[y][z])==4)
        	       	{
        		    	return gameBoard[y][z];
             		}
        	      }  
        		
            	else if ( z>(N/2) &&z<N && gameBoard[y][z]!=0)
            	 {   		
            	   if(up(1,y-1,z,gameBoard[y][z])==4 || slantL(1,y-1,z-1,gameBoard[y][z])==4)
       		        {
       			      return gameBoard[y][z];
       		        }
            	 }
        	
             	}
        	        	
        	 }

         	 else if (y<M)
         	 {
         	  for (int z=0 ; z<N/2 ; z++)
             {    
         		if(left(0,y,z,gameBoard[y][z])==4) 
         		 {
      			   return gameBoard[y][z]; 
         		 }
         	 }
        }
        
      }
    return 0;
  }
        
        public int up(int n,int i, int j,int x)
        {
        	if (gameBoard[i][j]==x)
        	{
        	if (n==3)
        	{
        		return 4;
        	}
        	else if(gameBoard[i-1][j]==x)
        	{
        		return up(n+1,i-1,j,x);
        	}
        	}
        	return 0;
        }
        
        public int left(int n,int i, int j,int x)
        {  
        	if (gameBoard[i][j]==x)
        	{
        	if (n==3)
        	{	  
        		return 4;
        	}
        	else if(gameBoard[i][j+1]==x)
        	{ 
        		return left(n+1,i,j+1,x);
        		
        	}
        	}
        	return 0;
        }
        
        public int slantL(int n,int i, int j,int x)
        {	
        	if (gameBoard[i][j]==x)
        	{
        	if (n==3)
        	{
        		return 4;
        	}
        	else if(gameBoard[i-1][j-1]==x)
        	{
        		return slantL(n+1,i-1,j-1,x);
        	}
        	}
        	return 0;
        }
        
        public int slantR(int n,int i, int j,int x)
        { 
        	if (gameBoard[i][j]==x)
        	{
        	if (n==3)
        	{
        		return 4;
        	}
        	else if(gameBoard[i-1][j+1]==x)
        	{
        		return slantR(n+1,i-1,j+1,x);
        	}
        	}
        	return 0;
        }

        
//===========================who turn is it    
        
        private  int whoTor()
        {

        	  if(tor %2==0)
        	  {
        		  return 2;
        	  }
        	  
        	  else
        		  return 1;
         }
        
        
        private  void whoWin()
        {
        	if (tor>6)
        	{
        		int t = winner();
        		if (t!=0)
        		{
        			JOptionPane.showMessageDialog(null,"player " + t + "  win  WINNER WINNER CHICKEN DINNER!!!","YOU ARE WINNER!!!",JOptionPane.INFORMATION_MESSAGE);
        		}	
        	}
        }
        
//===========================returns the values to the start state after the "clear"
        
        private  void setB()
        {
     	   rowOne = (M*N)-7;
    	   rowTwo = (M*N)-6;
    	   rowThree = (M*N)-5;
    	   rowFour = (M*N)-4;
    	   rowFive = (M*N)-3;
    	   rowSix = (M*N)-2;
    	   rowSeven = (M*N)-1;
    	   tor=0; 
    	   
           for (int i = 0; i < M; i++) 
           {
               for (int j = 0; j < N; j++) 
               {
            	   gameBoard[i][j]= 0;
               }
           }
        }
      
        
//===========================Graphics    
        
       public void paintComponent(Graphics g)
  	   {
  	      
  		   super.paintComponent(g);
  		 
  		   
  	   }
        
        
       class DrawCanvas extends JPanel {
           @Override
            public void paintComponent(Graphics g) {
               super.paintComponent(g);
 
               {
            	   g.setColor(Color.GRAY); 
            	       	  
            	   g.fillPolygon(new int[] {0,65,40,30,20,10,5,0}, new int[] {1,1,5,10,20,30,40,50}, 8);
            	   g.fillPolygon(new int[] {0,0,65,30,20,10,5,0}, new int[] {50,83,83,73,63,53,43,33}, 8);
            	   g.fillPolygon(new int[] {140,70,90,100,115,125,135,140}, new int[] {0,0,5,10,20,30,40,50}, 8);
            	   g.fillPolygon(new int[] {140,70,90,100,110,120,130,140}, new int[] {83,83,75,70,65,60,50,45}, 8);

            }           
        }
               
       }
       
//=====================================  
       
}