package m13a;

import javax.swing.*;



public class FiRRun {
    public static void main(String[]args){
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(1000,600);
        window.setResizable(false);
        FiR panel=new FiR();
        window.add(panel);
        window.setVisible(true);
    }
}
   