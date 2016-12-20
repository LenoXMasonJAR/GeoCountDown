package project1;
import javax.swing.*;

public class MyTimer {

    public static void main(String[] args) {

        JFrame
        frame = new JFrame("GEO Count Down Timer!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyTimerPanel panel = new MyTimerPanel();
        frame.getContentPane().add(panel);

        frame.setSize(500, 500);
        frame.setVisible(true);
    }

}