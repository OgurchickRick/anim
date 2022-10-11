import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class MyFrame extends JFrame{
    MyPanel panel;

    MyFrame() throws IOException {
        panel = new MyPanel();

        this.setTitle("Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocation(700, 400);
        this.setVisible(true);
    }
}
