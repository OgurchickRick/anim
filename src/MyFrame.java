import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
    MyPanel panel;

    MyFrame() {
        panel = new MyPanel();
        this.setTitle("Калькулятор");
        this.add(panel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.pack();

        this.setLocation(100, 50);
        this.setVisible(true);

    }
}
