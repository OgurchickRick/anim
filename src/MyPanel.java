import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class MyPanel extends JPanel {

    String otwet;

    String[] var = {"800x600", "1024x768", "1920x1080"};

    MyPanel(){
        otwet = (String)JOptionPane.showInputDialog(null, "Выберите разрешение", "Выбор разрешения", JOptionPane.QUESTION_MESSAGE, null, var, var[0]);
        this.setPreferredSize(new Dimension(Integer.parseInt(otwet.split("x")[0]), Integer.parseInt(otwet.split("x")[1])));
    }


}
