package m14b;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;



public class dictionaryPanel  extends JPanel
{
	
     private final JFileChooser fc = new JFileChooser();
	 private JButton cmdAdd,cmdDel,cmdUpdate,cmdSearch,cmdOpen,cmdSave;
	 private  String[] columns = {"Term","Meaning"};
	 private Dictionary dictionary = new Dictionary(); 
 	 private File file; 
	 
	 JTable table = new JTable(); 
	 JTextField textId = new JTextField();
     JTextField textFname = new JTextField();
     JFrame frame = new JFrame();
     Object[] row = new Object[2];
     DefaultTableModel model = new DefaultTableModel();


   
 	
 	
	 public  dictionaryPanel()
	 {
		 
		 this.setLayout(new BorderLayout(10,20));

//=========================================================		 
		 
		 JPanel buttonPanel = new JPanel();
	     buttonPanel.setLayout(new GridLayout(3, 1));
	     
	     
	     cmdAdd =  new JButton("Add");
	     cmdDel =  new JButton("Delete");
	     cmdUpdate =  new JButton("Update");
	     cmdSearch =  new JButton("Search");

	     
	     buttonPanel.add(cmdAdd);
	     buttonPanel.add(cmdDel);
	     buttonPanel.add(cmdUpdate);
	     buttonPanel.add(cmdSearch);

	     
//******************************************************************************************  
	     
	     
	     JPanel fileButtonPanel = new JPanel(new GridBagLayout());
	     fileButtonPanel.setLayout(new GridLayout(1, 2));
	     
	     cmdOpen =  new JButton("Open File");
	     cmdSave =  new JButton("Save File");
	          
	     
	     fileButtonPanel.add(cmdOpen);
	     fileButtonPanel.add(cmdSave);
	     
	     
//******************************************************************************************

	     
	       model.setColumnIdentifiers(columns);
	       table.setModel(model);

	       JTableHeader Theader = table.getTableHeader();
	       Theader.setBackground(Color.yellow); 
	       Theader.setFont(new Font("Serif", Font.BOLD, 18)); 
   
	       table.setFont(new Font("Tahome", Font.BOLD, 12));
	       table.getTableHeader().setReorderingAllowed(false);

	       JScrollPane pane = new JScrollPane(table);

 //******************************************************************************************       
	        	     
	       this.add(fileButtonPanel,BorderLayout.NORTH);
	       this.add(buttonPanel,BorderLayout.SOUTH);
	       this.add(pane,BorderLayout.CENTER);

//******************************************************************************************     	     
	     
	     Listener lis = new Listener();
	     
	     cmdAdd.addActionListener(lis);
	     cmdDel.addActionListener(lis);
	     cmdUpdate.addActionListener(lis);
	     cmdSearch.addActionListener(lis);
	     cmdOpen.addActionListener(lis);
	     cmdSave.addActionListener(lis);

	     
//******************************************************************************************     	     
	     
	     
	 }
	 
	 private class Listener implements ActionListener 
     { 
		 public void actionPerformed(ActionEvent e)
     	{ 
			 
//******************************************************************************************     				 
			 
			 
			 if(e.getSource()==cmdAdd)
	        	{

				 
				 String team = JOptionPane.showInputDialog(dictionaryPanel.this, "Please enter the team:");
				 
				 while (team.isEmpty())
				 {
					 team = JOptionPane.showInputDialog(dictionaryPanel.this, "Please Re-enter the team:");
				 }
				 
				 
				 String meaning = JOptionPane.showInputDialog(dictionaryPanel.this, "Please enter the meaning of the team:");
				 
				 
				 while (meaning.isEmpty())
				 {
					 meaning = JOptionPane.showInputDialog(dictionaryPanel.this, "Please Re-enter the meaning of the team:");
				 }
				 
				 
				 dictionary.add(team, meaning);
				 Display();
				 
				 
	        	}
			 
			 
//******************************************************************************************     
			 
			 if(e.getSource()==cmdDel)
	        	{

					String val = JOptionPane.showInputDialog(null, "Please enter a value to delete:", "Delete Value", 1);
					if (val != null && !val.equals("") )
					{
						dictionary.remove(val);
						Display();
					}
					else if (dictionary.search(val) == null || val.equals("")	   )
					{
						JOptionPane.showMessageDialog(null,"The term does not exist, please try again","oops!",JOptionPane.INFORMATION_MESSAGE);
					}
				 
	        	}
			 
//******************************************************************************************     		
			 
			 
			 if(e.getSource()==cmdUpdate)
	        	{

					String desc = "";
					String val = JOptionPane.showInputDialog(null, "Please enter a value to edit:", "Edit Value", 1);
					if (val != null && !val.equals("") && dictionary.search(val) != null )
					{
						desc = JOptionPane.showInputDialog(null, "Please enter the new Description:", "Edit Value", 1);
					if (desc != null && !desc.equals("") )
					{
						dictionary.update(val, desc);
						Display();
					}
					}
					else
					{
						JOptionPane.showMessageDialog(null,"The term does not exist, please try again","oops!",JOptionPane.INFORMATION_MESSAGE);
					}
	        	}
			 
//******************************************************************************************     					 
			 
			 if(e.getSource()==cmdSearch)
	        	{

				 
				 String val = JOptionPane.showInputDialog(null, "Please enter a value to search for:", "Search Value", 1);
					if (val != null && !val.equals("") )
					{
						if (dictionary.search(val) != null)
							JOptionPane.showMessageDialog(null, dictionary.search(val), val ,1,null);
						else
							JOptionPane.showMessageDialog(null, "No such value", val ,1,null);
					}
	        	}
			 
//******************************************************************************************     				 

			 
			 if(e.getSource()==cmdOpen)
	        	{
				

					int returnVal = fc.showOpenDialog(dictionaryPanel.this);
					if (returnVal == JFileChooser.APPROVE_OPTION) {
						file = fc.getSelectedFile();
						try
						{		
							  dictionary = new Dictionary(file); 
							  Display() ;
						}
						catch (FileNotFoundException i)
						{	
							JOptionPane.showMessageDialog(null, "This file does not exist,Please try again", " file  not exist" ,1,null);
						}

						catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				
	        	}
			 
//******************************************************************************************     		 
			 
			 if(e.getSource()==cmdSave)
	        	{
				 
					int returnVal = fc.showSaveDialog(dictionaryPanel.this);
					if (returnVal == JFileChooser.APPROVE_OPTION) 
					{
						 
						file = fc.getSelectedFile();
						 
						 try 
						 {
							file.createNewFile();
							dictionary.toString();
							saveingFile(file);							
						}
						 
						 catch (IOException e1) 
						 {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
	        	}
			 
//******************************************************************************************     				 
		 
			 
			 
		}
	}
	 
	 
	 
//******************************************************************************************     	 
	 
	 
	 
	 public void saveingFile(File f) throws IOException
	 {
		 
		FileOutputStream fo = new FileOutputStream(f);
		DataOutputStream out = new DataOutputStream(fo);

		for (int i=0 ; i< dictionary.dictionary.size(); i++)
			  {
			
				String key = dictionary.getk(i);
				String value = dictionary.getv(i);

				out.writeUTF(key);
				out.writeUTF(value);
			
			  }
	 }
	 
//******************************************************************************************     
	 
	 
	 
	 public void Display() 
	 {	
		  DefaultTableModel model = (DefaultTableModel) table.getModel();
		  model.setRowCount(0);
		 
		  for (int i=0 ; i< dictionary.dictionary.size(); i++)
		  {

			  row[0]= dictionary.getk(i);
			  row[1] = dictionary.getv(i);
			  model.addRow(row);
		  }
	 }
	 
//******************************************************************************************      
	 
	 
}



