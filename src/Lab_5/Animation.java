package Lab_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Animation extends JFrame {

    private int k = 0;

    JLabel znach = new JLabel("Значение k: " + k);
    JButton button = new JButton("Прибавить 1 к k");

    Animation()
    {

        super("Example");
        setLayout(new BorderLayout());
        setSize(500,450);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                kPlus();
                znach.setText("Значение k: " + k);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        add(znach, BorderLayout.WEST);
        znach.setText("Значение k: " + k);
        add(button, BorderLayout.EAST);

    }

    public void kPlus() {
        k++;
    }

    public void setK(int k) {
        this.k = k;
    }





    public static void main(String[]args)
    {
        new Animation();
    }
}