package b2017m922;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener{

	private int port;
	private String ip;
	private DrowPonel drowPonel;
	private JPanel bPonel;
	private JButton getB;
	private PointGetter poinGett;
	
	public MyPanel(String ip,int port)
	{
		this.ip=ip;
		this.port=port;
		getB = new JButton("Get");
		bPonel = new JPanel();
		bPonel.add(getB);
		drowPonel = new DrowPonel();
		
		setLayout(new BorderLayout());
		add(drowPonel,BorderLayout.CENTER);
		add(bPonel,BorderLayout.SOUTH);
		getB.addActionListener(this);
		poinGett = new PointGetter(ip,port,this);
		
	}
	
	public void addPolygon(Point[] p)
	{
		drowPonel.addPolygon(new Polygon(p));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		 poinGett.execute();
	}
	
}
