package m14b;


import javax.swing.*;



public class dictionaryRun
{
    public static void main(String[]args)
    {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(600,800);
        dictionaryPanel panel=new dictionaryPanel();
        window.add(panel);
        window.setVisible(true);
    }
}
   