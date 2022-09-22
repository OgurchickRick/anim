import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImagePanel extends JPanel{

    private BufferedImage image;

    public ImagePanel() {
        try {
            image = ImageIO.read(new File("image name and path"));
        } catch (IOException ex) {
            // handle exception...
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this); // see javadoc for more info on the parameters
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Окно");

        frame.add(new ImagePanel());

        frame.setPreferredSize(new Dimension(720, 720));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();

        frame.setVisible(true);


    }
}