import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class MyPanel extends JPanel implements MouseListener, ActionListener {
    private int x = 0;
    private int y = 0;
    private int w = 50;
    private int h = 50;

    ArrayList <Rectangle> list = new ArrayList <Rectangle>();


    final int panel_width = 800;
    final int panel_height = 600;

    MyPanel() throws IOException {
        this.setPreferredSize(new Dimension(panel_width, panel_height));
        this.addMouseListener(this);
        }

    public void paint(Graphics g){

        super.paint(g);

        Graphics2D g2D = (Graphics2D) g;
        for (Rectangle rec:list){
            g2D.fill(rec);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Point pos = getMousePosition();
        x = (int)pos.getX();
        y = (int)pos.getY();
        Rectangle rectangle = new Rectangle((int)pos.getX(), (int)pos.getY(), w, h);
        list.add(rectangle);
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
