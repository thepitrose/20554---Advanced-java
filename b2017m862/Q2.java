package b2017m862;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;

import javax.swing.*;



public class Q2 extends JFrame{

	private ArrayList<String> listCheck = new ArrayList<String>();
	private ArrayList<String> list = new ArrayList<String>();
	private JButton start,check;
	private JLabel[] lword;
	private JLabel[] rword;
	WorldRepository words;
	
	public Q2()
	{
		 words = new WorldRepository();
		this.setLayout(new BorderLayout());
		Listener lis = new Listener();
		
		lword = new JLabel[10];
		rword = new JLabel[10];

		JPanel left = new JPanel();
		left.setLayout(new GridLayout(10,0));
		
		JPanel right  = new JPanel();
		right.setLayout(new GridLayout(10,0));
		
		for(int i=0;i<10;i++)
		{
			String str=words.getRandomWord();
			list.add(str);
			lword[i]=new JLabel();
			rword[i]=new JLabel();
			lword[i].setText(str);
			lword[i].addMouseListener(lis);
			left.add(lword[i]);
			right.add(rword[i]);
		}
		
		
		JPanel down  = new JPanel();
		start= new JButton("start");
		check= new JButton("check");
		
		start.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				 words = new WorldRepository();
				list.clear();
				listCheck.clear();
				right.removeAll();
				left.removeAll();
				for(int i=0;i<10;i++)
				{
					String str=words.getRandomWord();
					list.add(str);
					lword[i]=new JLabel();
					rword[i]=new JLabel();
					lword[i].setText(str);
					lword[i].addMouseListener(lis);
					left.add(lword[i]);
					right.add(rword[i]);
				}
				validate();
				repaint();		
			}
		});
		
		check.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				
				ArrayList<String> testlist = new ArrayList<String>();
				for(int i=0;i<listCheck.size();i++) 
					{
						testlist.add(listCheck.get(i));
					}
				
				Collections.sort(testlist);
				int good=0;
				
				for(int i=0;i<listCheck.size();i++) {
					
					if(listCheck.get(i).equals(testlist.get(i)))
					{
						good++;
					}

				}
				
				 JOptionPane.showMessageDialog(null,"good " + good ,"no more trivia for you",JOptionPane.INFORMATION_MESSAGE);
				}});
		
		JPanel up  = new JPanel();
		up.setLayout(new GridLayout(0,2));
		up.add(left);
		up.add(right);
		
		down.setLayout(new FlowLayout());
		down.add(start);
		down.add(check);

		this.add(up,BorderLayout.CENTER);
		this.add(down,BorderLayout.PAGE_END);
		this.setSize(600,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		 
	}
	
    private class Listener implements MouseListener 
    { 
 

	@Override
	public void mouseClicked(MouseEvent e) {
		
		for(int i=0;i<10;i++) {
		if (lword[i]==e.getSource())
		{
			lword[i].setText("");
			lword[i]=new JLabel();
			listCheck.add(list.get(i));
			rword[listCheck.size()-1].setText(list.get(i));
			
		}
		}

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
    }
	
	 public static void main(String[] args)
	 {
		 new Q2();
	 }
}
