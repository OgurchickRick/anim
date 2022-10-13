import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel{

    String value;

    JLabel label;

    JButton but;

    JComboBox <String> combo;
    JCheckBox check;

    JTextField input;

    String[] colors = {"Красный", "Черный", "Белый", "Синий", "Зелёный"};

    MyPanel() {
        this.setPreferredSize(new Dimension(100, 300));
        label = new JLabel("Ответ: ");
        but = new JButton("Ответить");
        combo = new JComboBox<String>(colors);
        check = new JCheckBox("Свой вариант");
        input = new JTextField("Placeholder");


        but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (check.isSelected()){
                    value = input.getText();
                }else {
                    value = combo.getItemAt(combo.getSelectedIndex());
                }
                label.setText("Ответ: " + value);
            }
        });
        this.add(combo);
        this.add(check);
        this.add(input);
        this.add(but);
        this.add(label);
    }
}
