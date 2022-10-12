import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
    MyPanel panel;
    String login = " ";
    String password1;
    String password2;
    Font font = new Font("Verdana", Font.ITALIC, 50);
    JLabel label;



    MyFrame() {
        panel = new MyPanel();
        label = new JLabel("Моя первая надпись!");
        label.setFont(font);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        this.setTitle("Game");
        this.add(label);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(1000, 500));
        this.pack();

        this.setLocation(100, 50);
        this.setVisible(true);

    }
}
