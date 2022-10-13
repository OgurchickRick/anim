import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel{

    String value;

    JButton but;

    JTextField input;

    JTextArea res;


    MyPanel() {
        this.setPreferredSize(new Dimension(600, 300));
        but = new JButton("Записать");
        input = new JTextField(50);
        res = new JTextArea(20, 50);
        res.setFont(new Font("Verdana", Font.BOLD, 10));
        res.setEnabled(false);

        but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = input.getText();
                res.setText(res.getText() + "\n" + value);
            }
        });
        this.add(input);
        this.add(but);
        this.add(res);
    }
}
