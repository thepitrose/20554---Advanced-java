package a2016m832;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;


public class Q2  extends JPanel{
	
	private JTextArea qtext;
	private LogicRepository logicrepository;
	private ArrayList<Question>list;
	
	private JRadioButton falsebu;
	private JRadioButton truebu;
	
	private int qnum,good;
	
	public Q2()
	{
		
		LogicRepository logicrepository = new LogicRepository();
		
		String tnum = JOptionPane.showInputDialog("how many question?");
		qnum = Integer.parseInt(tnum);	
		list=logicrepository.getQuestion(qnum);
		
		
		qtext = new JTextArea(80,100);
		qtext.setEditable(false);
		qtext.setText(list.get(0).getText());
		
		JPanel down = new JPanel();
		down.setLayout(new FlowLayout());
		
		
	
		
		truebu = new JRadioButton ("true",false);
		falsebu = new JRadioButton ("false",false);
		
		down.add(truebu);
		down.add(falsebu);
		
		truebu.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
		           if(list.get(0).getAnswer())
		           {
		        	   	good++;
		        	   	
		        		JOptionPane.showMessageDialog(null,"good","good",JOptionPane.INFORMATION_MESSAGE);
		           }
		           
		           else
		           {
		        	   JOptionPane.showMessageDialog(null,"bad","bad",JOptionPane.INFORMATION_MESSAGE);
		           }
		           
		           list.remove(0);
		           if(!list.isEmpty())
		           {
		           qtext.setText(list.get(0).getText());   
		           truebu.setSelected(false);
		           }
		           
		           else
		           {
		        	   double sum= ((double)good/(double)qnum)*100;
		        	   JOptionPane.showMessageDialog(null, sum+ "% of your answers are good ","noop",JOptionPane.INFORMATION_MESSAGE);
		        	   down.removeAll();
		           }
		        }
			
		    });
		
		

		falsebu.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
		           if(!list.get(0).getAnswer())
		           {
		        	   	good++;
		        	   	
		        		JOptionPane.showMessageDialog(null,"good","good",JOptionPane.INFORMATION_MESSAGE);
		           }
		           
		           else
		           {
		        	   JOptionPane.showMessageDialog(null,"bad","bad",JOptionPane.INFORMATION_MESSAGE);
		           }
		           
		           list.remove(0);
		           
		           if(!list.isEmpty())
		           {
		           qtext.setText(list.get(0).getText());   
		           falsebu.setSelected(false);
		           }
		           else
		           {
		        	   double sum= ((double)good/(double)qnum)*100;
		        	   JOptionPane.showMessageDialog(null, sum+ "% of your answers are good ","noop",JOptionPane.INFORMATION_MESSAGE);
		        	   down.removeAll();
		           }
		        }
			
		    });
		
		this.setLayout(new BorderLayout());
		this.add(qtext,BorderLayout.CENTER);
		this.add(down,BorderLayout.PAGE_END);
		
		JFrame fr = new JFrame("Q2");
		fr.add(this);
		fr.setSize(600,300);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setVisible(true);
	}
	
	
	 public static void main(String[] args)
	 {
		 new Q2();
	 }

}
