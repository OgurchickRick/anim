import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
    MyPanel panel;
    String login = " ";
    String password1;
    String password2;

    MyFrame() {
        panel = new MyPanel();

        this.setTitle("Game");
        this.add(panel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(500, 300));
        this.pack();

        this.setLocation(600, 300);
        this.setVisible(true);

        int otw = JOptionPane.showConfirmDialog(null, "Хотитете зарегистрироваться?");
        System.out.println(otw);
        if (otw == 0){
            while (true){
                login = JOptionPane.showInputDialog(null, "Введите логин", "Username");
                if (login == null){
                    this.dispose();
                    break;
                }
                if (login.length() > 5 && !login.contains(" ")){
                    break;
                }
            }
            while (true){
                password1 = JOptionPane.showInputDialog(null, "Введите пароль");
                if (password1 == null){
                    this.dispose();
                    break;
                }
                if (password1.toString().length() > 8){
                    char[] mas = password1.toString().toCharArray();
                    boolean isD = false;
                    boolean isC = false;
                    for (char c:mas){
                        if (Character.isDigit(c)){
                            isD = true;
                        }
                        if (Character.isAlphabetic(c)){
                            isC = true;
                        }
                    }
                    if (isC && isD){
                        break;
                    }
                }
            }
            while (true){
                password2 = JOptionPane.showInputDialog(null, "Подтвердите пароль");
                if (password2 == null){
                    this.dispose();
                    break;
                }
                if (password1.equals(password2)){
                    break;
                }
            }
            JOptionPane.showMessageDialog(null, "Добро пожаловать " + login);
        }else {
            this.dispose();
        }
    }
}
