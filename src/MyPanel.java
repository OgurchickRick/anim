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
    int x = (int) ( Math.random() * 720 );
    int y = (int) ( Math.random() * 720 );

    Color color = new Color((int) ( Math.random() * 255 ), (int) ( Math.random() * 255 ), (int) ( Math.random() * 255 ));

    MyPanel(){
        this.setPreferredSize(new Dimension(panel_width, panel_height));
        image = new ImageIcon("C:\\Folders\\Учебка\\Java\\anim\\src\\logo-dvd.png").getImage();
        timer = new Timer(10, this);
        timer.start();
    }
    public void paint(Graphics g){

        super.paint(g);

        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(image, x, y, color, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (x >= panel_width-image.getWidth(null) || x < 0){
            x_v *= -1;
            color = new Color((int) ( Math.random() * 255 ), (int) ( Math.random() * 255 ), (int) ( Math.random() * 255 ));
        }
        if (y >= panel_height-image.getHeight(null) || y < 0){
            y_v *= -1;
            color = new Color((int) ( Math.random() * 255 ), (int) ( Math.random() * 255 ), (int) ( Math.random() * 255 ));
        }
        x += x_v;
        y += y_v;
        repaint();
    }
}
