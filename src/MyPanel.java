import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel{

    String value;

    JLabel label;

    JButton but;
    JRadioButton rb1, rb2, rb3, rb4;

    MyPanel() {
        this.setPreferredSize(new Dimension(100, 300));
        label = new JLabel("Ответ: ");
        but = new JButton("Ответить");
        rb1 = new JRadioButton("Весна");
        rb2 = new JRadioButton("Лето");
        rb3 = new JRadioButton("Осень");
        rb4 = new JRadioButton("Зима");
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        bg.add(rb4);
        bg.add(but);



        but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (rb1.isSelected()){
                    value = rb1.getText();
                }else if (rb2.isSelected()){
                    value = rb2.getText();
                }else if (rb3.isSelected()){
                    value = rb3.getText();
                }else if (rb4.isSelected()){
                    value = rb4.getText();
                }
                label.setText("Ответ: " + value);
            }
        });
        this.add(rb1);
        this.add(rb2);
        this.add(rb3);
        this.add(rb4);
        this.add(but);
        this.add(label);
    }
}
