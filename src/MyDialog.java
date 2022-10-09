import javax.swing.*;
import java.io.IOException;

public class MyDialog {

    MyFrame f;
    MyDialog() throws IOException {
        f = new MyFrame();
        int a = JOptionPane.showConfirmDialog(f, "Ты тупой?");
        int b = JOptionPane.showConfirmDialog(f, "Уверен?");
        if (a == 0 && b == 0){
            JOptionPane.showMessageDialog(f, "Я же говорил");
        }else if (a == 0 && b == 1){
            JOptionPane.showMessageDialog(f, "Определился бы уже");
        }else if (a == 1 && b == 0){
            JOptionPane.showMessageDialog(f, "Какой самоуверенный");
        }else if (a == 1 && b == 1){
            JOptionPane.showMessageDialog(f, "Биполярка?");
        }

    }
}
