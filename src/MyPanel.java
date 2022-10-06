import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;

public class MyPanel extends JPanel implements MouseListener, ActionListener, MouseMotionListener {
    private int x = 0;
    private int y = 0;
    private int w = 50;
    private int h = 50;

    ArrayList <Rectangle> list = new ArrayList <Rectangle>();

    Cursor cursor = new Cursor(Cursor.CROSSHAIR_CURSOR);


    final int panel_width = 800;
    final int panel_height = 600;

    MyPanel() throws IOException {
        this.setPreferredSize(new Dimension(panel_width, panel_height));
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        this.setCursor(cursor);
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
        if (e.getButton() == 1){
            Point pos = getMousePosition();
            x = (int)pos.getX();
            y = (int)pos.getY();
            Rectangle rectangle = new Rectangle((int)pos.getX(), (int)pos.getY(), w, h);
            list.add(rectangle);
            repaint();}
        else if (e.getButton() == 3){
            Point pos = getMousePosition();
            x = (int)pos.getX();
            y = (int)pos.getY();
            for (Rectangle rec:list){
                if ((x >= rec.x && x <= rec.x + w) && (y >= rec.y && y <= rec.y + h)){
                    list.remove(rec);
                    repaint();
                }
            }

        }
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


    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
