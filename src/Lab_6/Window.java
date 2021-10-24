package Lab_6;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    JTextArea text = new JTextArea(10,20);
    JScrollPane jScroll = new JScrollPane(text);

    JMenuBar bar = new JMenuBar();
    JMenu menu1 = new JMenu("Шрифт");
    JMenu menu2 = new JMenu("Цвет");

    public Window() {

    super("Text redactor");



    setSize(400, 400);
    setLayout(new FlowLayout());

    jScroll.setForeground(Color.PINK);

    add(menu1);
    add(menu2);

    add(jScroll);

    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


    public static void main(String[] args) {

        new Window();

    }

}
