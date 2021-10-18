package Lab_5;

import javax.swing.*;
import java.awt.*;


public class Animation extends JFrame {

    JPanel grid = new JPanel();

    ImageIcon icon1 = new ImageIcon(getClass().getResource("1.jpg"));
    ImageIcon icon2 = new ImageIcon(getClass().getResource("2.jpg"));
    ImageIcon icon3 = new ImageIcon(getClass().getResource("3.jpg"));
    ImageIcon icon4 = new ImageIcon(getClass().getResource("4.jpg"));
    ImageIcon icon5 = new ImageIcon(getClass().getResource("5.jpg"));
    ImageIcon icon6 = new ImageIcon(getClass().getResource("6.jpg"));
    JLabel label1 = new JLabel(icon1);
    JLabel label2 = new JLabel(icon2);
    JLabel label3 = new JLabel(icon3);
    JLabel label4 = new JLabel(icon4);
    JLabel label5 = new JLabel(icon5);
    JLabel label6 = new JLabel(icon6);


    Animation() throws InterruptedException {

        super("Animation");

        setLayout(new GridLayout());
        setSize(610,470);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        GridLayout layout = new GridLayout(2, 0, 0, 0);
        grid.setLayout(layout);

        grid.add(label1);
        getContentPane().add(grid);
        revalidate();
        Thread.sleep(2000);
        grid.add(label2);
        getContentPane().add(grid);
        revalidate();
        Thread.sleep(2000);
        grid.add(label3);
        getContentPane().add(grid);
        revalidate();
        Thread.sleep(2000);
        grid.add(label4);
        getContentPane().add(grid);
        revalidate();
        Thread.sleep(2000);
        grid.add(label5);
        getContentPane().add(grid);
        revalidate();
        Thread.sleep(2000);
        grid.add(label6);
        getContentPane().add(grid);
        revalidate();

        getContentPane().add(grid);

    }


    public static void main(String[]args) throws InterruptedException {
        new Animation();
    }
}
