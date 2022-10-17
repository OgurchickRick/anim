import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
    MyForm form;

    MyFrame() {
        form = new MyForm();
        this.setTitle("Калькулятор");
        this.add(form);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();

        this.setLocation(400, 100);
        this.setVisible(true);

    }
}
