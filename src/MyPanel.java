import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {
    final int panel_width = 720;
    final int panel_height = 720;
    Image image;
    Timer timer;
    int x_v = 2;
    int y_v = 2;
    int x = 0;
    int y = 0;

    MyPanel(){
        this.setPreferredSize(new Dimension(panel_width, panel_height));
        image = new ImageIcon("C:\\Folders\\Учебка\\Java\\anim\\src\\logo-dvd.png").getImage();
        timer = new Timer(10, this);
        timer.start();
    }
    public void paint(Graphics g){

        super.paint(g);

        Graphics2D g2D = (Graphics2D) g;
        g2D.setColor(Color.red);
        g2D.drawImage(image, x, y , null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (x < panel_width-image.getWidth(null) && y == 0)
            x += x_v;
        if (x == panel_width-image.getWidth(null) && y < panel_height-image.getHeight(null))
            y += y_v;
        if (x > 0 && y == panel_height-image.getHeight(null))
            x -= x_v;
        if (x == 0 && y > 0)
            y -= y_v;
        repaint();
    }
}
