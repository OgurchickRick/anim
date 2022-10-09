import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;

public class MyPanel extends JPanel implements KeyListener{

    MyDialog dialog;
    final int panel_width = 0;
    final int panel_height = 0;

    MyPanel() throws IOException {
        this.setPreferredSize(new Dimension(panel_width, panel_height));
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE){
            try {
                dialog = new MyDialog();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
