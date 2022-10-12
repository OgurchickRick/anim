import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel{

    int count;

    JLabel label;

    JButton but;

    MyPanel() {
        this.setPreferredSize(new Dimension(1000, 500));
        label = new JLabel(String.valueOf(count));
        but = new JButton("Press");
        but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                label.setText(String.valueOf(count));
            }
        });
        this.add(label);
        this.add(but);
    }
}
