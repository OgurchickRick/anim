import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyForm extends JFrame implements ActionListener{
    public JLabel wopr;
    public JButton button1;
    public JButton button2;
    public JButton button3;
    public JButton button4;
    public JPanel frame1;
    private JLabel cou;

    int count = 1;
    int countTrue = 0;

    MyForm() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        wopr.setText("Когда была впервые выпущена Windows?");
        button1.setText("В 1985 году");
        button2.setText("В 1990 году");
        button3.setText("В 1981 году");
        button4.setText("В 1986 году");
        cou.setText(count + "/10");
        setContentPane(frame1);
        setVisible(true);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (count) {
                    case 1, 3, 4, 6, 8, 10 ->{
                        countTrue++;
                    }
                }
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (count) {
                    case 2, 5, 7, 9->{
                        countTrue++;
                    }
                }
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (count) {
                    case 1 ->{
                        countTrue++;
                    }
                }
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (count) {
                    case 1 ->{
                        countTrue++;
                    }
                }
            }
        });

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        cou.setText(count + "/10");
        switch (count) {
            case 2 -> {
                wopr.setText("Когда выпущена 10-я версия Windows?");
                button1.setText("В 2016 году");
                button2.setText("В 2018 году");
                button3.setText("В 2015 году");
                button4.setText("В 2010 году");
            }
            case 3 -> {
                wopr.setText("Какой тип ядра Windows?");
                button1.setText("Гибридное");
                button2.setText("Бинарное");
                button3.setText("Жесткое");
                button4.setText("Смешанное");
            }
            case 4 -> {
                wopr.setText("Как Windows переводится на русский язык?");
                button1.setText("Окна");
                button2.setText("Двери");
                button3.setText("Горизонт");
                button4.setText("Обновления");
            }
            case 5 -> {
                wopr.setText("Чем была Windows изначально?");
                button1.setText("Сервером");
                button2.setText("Графической программой-надстройкой");
                button3.setText("Файловым содержанием");
                button4.setText("Операционной системой");
            }
            case 6 -> {
                wopr.setText("Какой была одна из отличительных особенностей системы Windows 95?");
                button1.setText("Поддержка длинных имён файлов");
                button2.setText("Жесткий диск");
                button3.setText("Наличие сервера");
                button4.setText("InternetExplorer");
            }
            case 7 -> {
                wopr.setText("Что присутствовало в составе Windows 95?");
                button1.setText("GS-DOS 8.0");
                button2.setText("MS-DOS 7.0");
                button3.setText("LS-DOS 4.8");
                button4.setText("QE_DOS 3.6");
            }
            case 8 -> {
                wopr.setText("Кто изобрел Windows");
                button1.setText("GS-DOS 8.0");
                button2.setText("MS-DOS 7.0");
                button3.setText("LS-DOS 4.8");
                button4.setText("QE_DOS 3.6");
            }
            case 9 -> {
                wopr.setText("К чему относится семейство Windows NT?");
                button1.setText("К операционным системам с базой данных");
                button2.setText("К операционным системам с вытесняющей многозадачностью");
                button3.setText("К операционным системам с программой проверки");
                button4.setText("К операционным системам с кучей доната");
            }
            case 10 -> {
                wopr.setText("Когда была выпущена первая версия Microsoft Windows CE?");
                button1.setText("В 1996 году");
                button2.setText("В 1998 году");
                button3.setText("В 2000 году");
                button4.setText("В 2004 году");
            }
        }
        if (count > 10){
            JOptionPane.showMessageDialog(this, "Ваш результат: " + countTrue);
            System.exit(0);
        }
    }
}
