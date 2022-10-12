import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class MyPanel extends JPanel{

    Font font;
    JLabel label;
    JSlider slider;

    String FontFam = "Verdana";
    int i = Font.ITALIC;

    MyPanel() {
        this.setPreferredSize(new Dimension(1000, 500));
        slider = new JSlider(5, 100, 50);
        slider.setPaintLabels(true);
        slider.setMajorTickSpacing(10);
        label = new JLabel("Моя первая надпись!");
        font = new Font(FontFam, i, slider.getValue());
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setFont(font);
        slider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                // меняем надпись
                int value = ((JSlider)e.getSource()).getValue();
                font = new Font(FontFam, i, value);
                label.setFont(font);
            }
        });
        this.add(slider);
        this.add(label);
    }
}
