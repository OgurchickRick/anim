import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel{

    int value;

    JLabel label;

    JButton but;

    JSpinner spinner;

    MyPanel() {
        this.setPreferredSize(new Dimension(1000, 500));
        label = new JLabel("Ответ: ");
        but = new JButton("Ответить");
        SpinnerModel numbers = new SpinnerNumberModel(0, 0, 10, 1);
        spinner = new JSpinner(numbers);
        but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = (int) spinner.getValue();
                label.setText("Ответ: " + value);
            }
        });
        this.add(spinner);
        this.add(label);
        this.add(but);
    }
}
