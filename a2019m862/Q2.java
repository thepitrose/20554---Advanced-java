package a2019m862;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class Q2 extends JFrame{

	private Dictionary dictionary;
	private JButton end;
	private JButton[] lett = new  JButton[7];
	private String[]  letts = new  String[7];
	private int n;
	private String word;
	private JTextField input;
	
	public Q2()
	{
		Listener lis = new Listener();
		dictionary = new Dictionary();
		word="";
		n=0;
		
		JPanel up = new JPanel();
		
		for (int i=0;i<7;i++)
		{
			
			letts[i]=dictionary.getRandomLetter();
			lett[i] = new JButton(letts[i]);
			lett[i].addActionListener(lis);
			up.add(lett[i]);
		}
		
		
		input = new JTextField();
		input.setPreferredSize(new Dimension  (150,25));
		input.setEditable(false);
		
		end=new JButton();
		end.setText("end");
		end.addActionListener(lis);
		
		
		JPanel down = new JPanel();
		down.setLayout(new FlowLayout());
		
		down.add(input);
		down.add(end);
		
		
		this.add(up,BorderLayout.CENTER);
		this.add(down,BorderLayout.PAGE_END);


		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	 private class Listener implements ActionListener 
	    { public void actionPerformed(ActionEvent e)
		 {
	    	if (e.getSource()==end)
	    	{
	    		if (dictionary.isLegal(word))
	    		{
	    			n++;
	    			JOptionPane.showMessageDialog(null,"good!!! Your score is " + n ,"good",JOptionPane.INFORMATION_MESSAGE);
	    			word="";
	    			input.setText(word);
	    		}
	    		else
	    		{
	    			n--;
	    			JOptionPane.showMessageDialog(null,"bad!!! Your score is " + n ,"good",JOptionPane.INFORMATION_MESSAGE);
	    			word="";
	    			input.setText(word);
	    		}
	    	}
	    	else
	    	{
	    		for (int i=0;i<7;i++)
	    		{
	    			if (e.getSource()==lett[i])
	    			{
	    				word+=letts[i];
	    				input.setText(word);
	    				letts[i]=dictionary.getRandomLetter();
	    				lett[i].setText(letts[i]);
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
