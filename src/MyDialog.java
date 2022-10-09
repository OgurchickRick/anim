import javax.swing.*;
import java.io.IOException;

public class MyDialog {

    String name;

    MyFrame f;
    MyDialog() throws IOException {
        f = new MyFrame();
        name = JOptionPane.showInputDialog(f, "Введите ваше имя");
        JOptionPane.showMessageDialog(f, name);
    }
}
