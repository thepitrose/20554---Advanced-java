package m13;

import javax.swing.*;



public class triviaRun {
    public static void main(String[]args){
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(1000,700);
        window.setResizable(false);
        triviaGame panel=new triviaGame();
        window.add(panel);
        window.setVisible(true);
    }
}
   