import javax.swing.*;
import java.io.IOException;

public class MyDialog {

    MyFrame f;
    MyDialog() throws IOException {
        f = new MyFrame();
        JOptionPane.showMessageDialog(f, "Тёмка Дербин");
    }
}
