package m13;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class triviaGame  extends JPanel 
{

	  private JButton cmdOne,cmdTwo,cmdThree,cmdFour,cmdNew,cmdEnd;
	  private JLabel qlabel,scoreLabel,tlabel;
	 
	  ArrayList<Questions> qlist = new  ArrayList<Questions>();
	  BuildTheQuestionsBase tampToCopy= new BuildTheQuestionsBase();
	  
	  private final int DELAY=1000;
	  private final int TIME_SEC=5;
	  
	  private int score=0;
	  private int qshow=0;
	  private int time=0;
	 
	  
	  private Timer timer;
	  private boolean onOnot=false;
	  

		 

	  
	public triviaGame() 
	{
		 this.setLayout(new BorderLayout());	
		 timer = new Timer(DELAY,new Listener());
		 
//===================================================================================	  		 
		 cmdOne = new JButton("");
	     cmdTwo = new JButton("");
	     cmdThree = new JButton("");
	     cmdFour = new JButton("");
	     
	      JPanel buttonPanel = new JPanel();
	      buttonPanel.setLayout(new GridLayout(2, 1));
	       
	      buttonPanel.add(cmdOne);
	      buttonPanel.add(cmdTwo);
	      buttonPanel.add(cmdThree);
	      buttonPanel.add(cmdFour);
		 
	       
	       Listener lis = new Listener();
	       
	       cmdOne.addActionListener(lis);
	       cmdTwo.addActionListener(lis);
	       cmdThree.addActionListener(lis);
	       cmdFour.addActionListener(lis);
	      
//===================================================================================	       
	       
	      JPanel upQuestion = new JPanel( new GridBagLayout());
	      upQuestion.setPreferredSize(new Dimension (500,250)); 
	      JPanel qpanel = new JPanel(new GridBagLayout());
	      qpanel.setPreferredSize(new Dimension (500,150));   
	      qpanel.setBackground(Color.WHITE);
	      qpanel.setBorder(BorderFactory.createLineBorder(Color.blue));
	      qlabel = new JLabel();
	      qlabel.setFont (qlabel.getFont ().deriveFont (14.0f));
	      qpanel.add(qlabel);

	      
	      upQuestion.add(qpanel);
	       
	       

//===================================================================================
	       
	       
	       JPanel downPane = new JPanel(new GridBagLayout());
	       downPane.setPreferredSize(new Dimension (500,170));
	       
	       cmdNew = new JButton("Start a new game");
		   cmdEnd = new JButton("End the game");
	       
		   downPane.add(cmdNew);
		   downPane.add(cmdEnd);
		     
		   cmdNew.addActionListener(lis);
		   cmdEnd.addActionListener(lis);
	       
	       JPanel lSide = new JPanel();
	       JPanel rSideEmpty = new JPanel();
	       
	       tlabel =  new JLabel("time : " + time);
	       tlabel.setFont (tlabel.getFont ().deriveFont (16.0f));
	       scoreLabel = new JLabel("score: " + score);
	       scoreLabel.setFont (scoreLabel.getFont ().deriveFont (16.0f));
	       lSide.add(scoreLabel);
	       rSideEmpty.add(tlabel);
	       lSide.setPreferredSize(new Dimension (180,10));
	       rSideEmpty.setPreferredSize(new Dimension (180,10));

//===================================================================================	  
	       
	       
	       this.add(upQuestion,BorderLayout.NORTH);
	       this.add(buttonPanel,BorderLayout.CENTER);
	       this.add(downPane,BorderLayout.SOUTH);
	       this.add(lSide,BorderLayout.WEST);
	       this.add(rSideEmpty,BorderLayout.EAST);
	       
//===================================================================================	  	       
	       

	       qlist=tampToCopy.copyList();
	       
	       
//===================================================================================	  	       


	       
	}
	
	
    private class Listener implements ActionListener 
    { public void actionPerformed(ActionEvent e)
    	{ 
    	
    	
    	if(e.getSource()==cmdNew)
    	{ 
    		if (onOnot==true)
    		{
    			newGame();
    			
    		}

    		else if (onOnot==false)
    		{	
        		onOnot=true;
        		cc();
        		timer.start();
        		time=TIME_SEC;
    		}

    	}
    	if (onOnot==true)
    	{
    	
    		if (time==0)
    		{
    			nextQtime();
    		}
    		else {	
    	if(e.getSource()==cmdEnd)
    	{
    		endGame();
    	}
    	
    	if (onOnot==true)
    	{
    	if(e.getSource()==cmdOne)
    	{
    			 nextQ(0);	
    	}
    	
    	if(e.getSource()==cmdTwo)
    	{
    		 nextQ(1);	
    		}
    		
    	}
  	
    	if(e.getSource()==cmdThree)
    	{
		 nextQ(2);	
	
    	}
  	
    	if(e.getSource()==cmdFour)
  		{	
    		nextQ(3);	
 
  		}	
    	
    	 tlabel.setText("time : " + time);
    	 time--;
    	}  	
    }
    }
    }
    

//===================================================================================	    
    
	
	public void seePanel(String q,String one,String two,String three, String four)
	{
		
		cmdOne.setText(one);
	    cmdTwo.setText(two);
	    cmdThree.setText(three);
	    cmdFour.setText(four);
	    qlabel.setText(q); 
	    scoreLabel.setText("score: " + score);
	}
	
	
//===================================================================================	  
	
	public void cc()
	{
	timer.stop();
	seePanel(qlist.get(qshow).getQuestion(),qlist.get(qshow).getAnswers().get(0).getAnswer(),qlist.get(qshow).getAnswers().get(1).getAnswer(),qlist.get(qshow).getAnswers().get(2).getAnswer(),qlist.get(qshow).getAnswers().get(3).getAnswer());
   	time=TIME_SEC;
   	timer.start();
   	 
	}
	
	
//===================================================================================	  
	
	public void clearPanel()
	{
		seePanel("","","","","");
	}
	
	
//===================================================================================	  

	public void endGame()
	{
		timer.stop();
		clearPanel();
		JOptionPane.showMessageDialog(null,"Your score is " + score ,"no more trivia for you",JOptionPane.INFORMATION_MESSAGE);
	}
	
	
//===================================================================================	  
	
	
	public void newGame()
	{
		clearPanel();
		qshow=0;
		score=0;
		qlist=tampToCopy.copyList();
		cc();
		onOnot=true;
		timer.start();
	}
	
	
//===================================================================================	  
	
	public void nextQ(int jj)
	{	

		JOptionPane.showMessageDialog(null,"Your answer is " + qlist.get(qshow).getAnswers().get(jj).rightORnot() ,"Next please",JOptionPane.INFORMATION_MESSAGE);
		if (qlist.get(qshow).getAnswers().get(jj).rightORnot()==true)
		{
			score=score+10;
		}
		else
		{
			score=score-5;
		}
		qshow++;
		if(qshow<qlist.size())
		{
		cc();
		}
		else
		{
			endGame();
		}
	}
	
	
//===================================================================================	  
	
	
	public void nextQtime()
	{
		timer.stop();
		tlabel.setText("time : " + time);
		JOptionPane.showMessageDialog(null,"You have run out of time","your time is UP",JOptionPane.INFORMATION_MESSAGE);
		score=score-5;
		qshow++;
		if(qshow<qlist.size())
		{
		cc();
		}
		else
		{
			endGame();
		}
		
	}
	
}
