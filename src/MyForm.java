import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyForm extends JFrame implements ActionListener{
    private JLabel title;
    private JTextField surnameInput;
    private JLabel surname;
    private JRadioButton RadioButton1;
    private JRadioButton RadioButton2;
    private JLabel gender;
    private JSpinner spinner1;
    private JLabel age;
    private JPanel pane1;
    private JTextArea textArea;
    private JLabel comment;
    private JSlider slider1;
    private JLabel growth;
    private JButton submit;
    private JLabel lastname;

    private JLabel name;
    private JTextField growthInput;
    private JTextField nameInput;
    private JTextField lastnameInput;


    MyForm(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        setContentPane(pane1);
        setVisible(true);
        growthInput.setEnabled(false);
        slider1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                growthInput.setText(String.valueOf(slider1.getValue()));
            }
        });

        ButtonGroup bg = new ButtonGroup();
        bg.add(RadioButton1);
        bg.add(RadioButton2);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "ФИО: " + surnameInput.getText() + " " +
                        nameInput.getText() + " " + lastnameInput.getText() + "\n" +
                        "Пол: " + ((RadioButton1.isSelected())?"Мужской":"Женский") + "\n" +
                        "О себе: " + textArea.getText() + "\n" +
                        "Возраст: " + spinner1.getValue() + "\n" +
                        "Рост: " + slider1.getValue() + "\n");
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
