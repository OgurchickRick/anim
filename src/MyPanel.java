import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class MyPanel extends JPanel implements KeyListener, ActionListener {
    private int x = 0;
    private int y = 0;
    private int w = 50;
    private int h = 50;

    Timer timer;

    final int panel_width = 800;
    final int panel_height = 600;
    Rectangle rectangle = new Rectangle(x, y, w, h);

    MyPanel() throws IOException {
        this.setPreferredSize(new Dimension(panel_width, panel_height));
        timer = new Timer(10, this);
        this.addKeyListener(this);
        }

    public void paint(Graphics g){

        super.paint(g);

        Graphics2D g2D = (Graphics2D) g;
        g2D.fill(rectangle);
        timer.start();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_RIGHT:
                rectangle.setLocation(rectangle.x+50, rectangle.y);
                break;
            case KeyEvent.VK_LEFT:
                rectangle.setLocation(rectangle.x-50, rectangle.y);
                break;
            case KeyEvent.VK_DOWN:
                rectangle.setLocation(rectangle.x, rectangle.y+50);
                break;
            case KeyEvent.VK_UP:
                rectangle.setLocation(rectangle.x, rectangle.y-50);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (rectangle.x > panel_width-w){
            rectangle.x = 0;
        } else if (rectangle.x < 0) {
            rectangle.x = panel_width-w;
        }
        if (rectangle.y > panel_height-h){
            rectangle.y = 0;
        } else if (rectangle.y < 0) {
            rectangle.y = panel_height-h;
        }
        repaint();
    }
}
