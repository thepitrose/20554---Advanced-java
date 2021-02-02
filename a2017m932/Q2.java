package a2017m932;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;


public class Q2 extends JPanel{
	
	private JComboBox formtext,totext;
	private JTextField money;
	private JLabel moneyText;
	private Converter con;
	private double newMoney;
	
	public Q2()
	{
		
		con = new Converter();
		formtext= new JComboBox();
		totext= new JComboBox();
		money = new JTextField();
		moneyText = new JLabel();
		
		newMoney=0;

		moneyText.setText(String.valueOf(newMoney));
		
		formtext.setModel(new DefaultComboBoxModel( con.getCurrency()));
		totext.setModel(new DefaultComboBoxModel( con.getCurrency()));
		
		money.setPreferredSize(new Dimension  (150,25));
		
		money.addKeyListener(new KeyListener()
		{
		public void keyPressed(KeyEvent e)
		{

					
			if (e.getKeyChar()== '\n')
			{
				double x = Double.parseDouble(money.getText());
				try {
					newMoney=con.convert(formtext.getSelectedItem().toString(), totext.getSelectedItem().toString(), x);
					moneyText.setText(String.valueOf(newMoney));
					repaint();
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				//System.out.println(formtext.getSelectedItem());
			}
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		});
		
		
		this.add(formtext);
		this.add(totext);
		this.add(money);
		this.add(moneyText);
		
		JFrame fr = new JFrame("q2");
		fr.add(this);
		fr.setSize(600,400);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setVisible(true);
	}
	
	 public static void main(String[] args)
	 {
		 new Q2();
	 }
}
