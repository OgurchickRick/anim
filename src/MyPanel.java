import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener{

    JButton b1, b2, b3, b4;

    int c = 1;

    int count = 0;

    JLabel wopr, cou;

    MyPanel() {
        this.setPreferredSize(new Dimension(800, 600));
        wopr = new JLabel("Когда была впервые выпущена Windows?");
        b1 = new JButton("В 1985 году");
        b2 = new JButton("В 1990 году");
        b3 = new JButton("В 1981 году");
        b4 = new JButton("В 1986 году");
        cou = new JLabel(c + "/" + 10);


        this.add(wopr);
        this.add(cou);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cou.setText(c + "/" + 10);
        switch (c) {
            case 1 -> {
                wopr.setText("Когда была впервые выпущена Windows?");
                b1.setText("В 1985 году");
                b2.setText("В 1990 году");
                b3.setText("В 1981 году");
                b4.setText("В 1986 году");
                repaint();
            }
            case 2 -> {
                wopr.setText("Когда выпущена 10-я версия Windows?");
                b1.setText("В 2016 году");
                b2.setText("В 2018 году");
                b3.setText("В 2015 году");
                b4.setText("В 2010 году");
                repaint();
            }
            case 3 -> {
                wopr.setText("Какой тип ядра Windows?");
                b1.setText("Гибридное");
                b2.setText("Бинарное");
                b3.setText("Жесткое");
                b4.setText("Смешанное");
            }
            case 4 -> {
                wopr.setText("Как Windows переводится на русский язык?");
                b1.setText("Окна");
                b2.setText("Двери");
                b3.setText("Горизонт");
                b4.setText("Обновления");
            }
            case 5 -> {
                wopr.setText("Чем была Windows изначально?");
                b1.setText("Сервером");
                b2.setText("Графической программой-надстройкой");
                b3.setText("Файловым содержанием");
                b4.setText("Операционной системой");
            }
            case 6 -> {
                wopr.setText("Какой была одна из отличительных особенностей системы Windows 95?");
                b1.setText("Поддержка длинных имён файлов");
                b2.setText("Жесткий диск");
                b3.setText("Наличие сервера");
                b4.setText("InternetExplorer");
            }
            case 7 -> {
                wopr.setText("Что присутствовало в составе Windows 95?");
                b1.setText("GS-DOS 8.0");
                b2.setText("MS-DOS 7.0");
                b3.setText("LS-DOS 4.8");
                b4.setText("QE_DOS 3.6");
            }
            case 8 -> {
                wopr.setText("Кто изобрел Windows");
                b1.setText("GS-DOS 8.0");
                b2.setText("MS-DOS 7.0");
                b3.setText("LS-DOS 4.8");
                b4.setText("QE_DOS 3.6");
            }
            case 9 -> {
                wopr.setText("К чему относится семейство Windows NT?");
                b1.setText("К операционным системам с базой данных");
                b2.setText("К операционным системам с вытесняющей многозадачностью");
                b3.setText("К операционным системам с программой проверки");
                b4.setText("К операционным системам с кучей доната");
            }
            case 10 -> {
                wopr.setText("Когда была выпущена первая версия Microsoft Windows CE?");
                b1.setText("В 1996 году");
                b2.setText("В 1998 году");
                b3.setText("В 2000 году");
                b4.setText("В 2004 году");
            }
        }

        if (b1.isSelected()){
            c++;
        }

    }

}
