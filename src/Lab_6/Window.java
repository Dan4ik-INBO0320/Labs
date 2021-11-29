package Lab_6;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Window extends JFrame {

    JTextArea text = new JTextArea(10,20);
    JScrollPane jScroll = new JScrollPane(text);

    JMenuBar bar = new JMenuBar();
    JMenu menu1 = new JMenu("Цвет");
    JMenu menu2 = new JMenu("Шрифт");
    JMenuItem item1 = new JMenuItem("Синий");
    JMenuItem item2 = new JMenuItem("Красный");
    JMenuItem item3 = new JMenuItem("Черный");
    JMenuItem item4 = new JMenuItem("Times new roman");
    JMenuItem item5 = new JMenuItem("MS Sans Serif");
    JMenuItem item6 = new JMenuItem("Courier New");



    public Window() {

        super("Text redactor");

        setSize(400, 400);
        setLayout(new BorderLayout());

        jScroll.setForeground(Color.PINK);

        add(bar,BorderLayout.NORTH);

        bar.add(menu1);
        bar.add(menu2);

        item1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                text.setForeground(Color.BLUE);
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
        item2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                text.setForeground(Color.RED);
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
        item3.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                text.setForeground(Color.black);
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

        item4.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                text.setFont(new Font("Times new roman", Font.BOLD, 20));
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
        item5.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                text.setFont(new Font("MS Sans Serif", Font.BOLD, 20));
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
        item6.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                text.setFont(new Font("Courier New", Font.BOLD, 20));
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

        menu1.add(item1);
        menu1.add(item2);
        menu1.add(item3);

        menu2.add(item4);
        menu2.add(item5);
        menu2.add(item6);

        add(jScroll, BorderLayout.CENTER);

        text.setFont(new Font("Times new roman", Font.BOLD, 20));

        add(new JMenuItem(), BorderLayout.EAST);
        add(new JMenuItem(), BorderLayout.WEST);
        add(new JMenuItem(), BorderLayout.SOUTH);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


    public static void main(String[] args) {

        new Window();

    }

}
