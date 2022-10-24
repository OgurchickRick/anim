import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class MyForm extends JFrame{
    private JButton open;
    private JLabel openFile;
    private JPanel frame1;
    private JButton save;
    private JButton saveHow;
    JTextArea input;
    private JScrollBar scrollBar1;

    static File file;
    JFileChooser fileChooser;

    MyForm(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        setContentPane(frame1);
        setVisible(true);
        fileChooser = new JFileChooser();
        file = new File("C:\\Рабочий стол\\Новый текстовый файл.txt");
        openFile.setText("Открыт файл: " + file.getName());

        open.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                fileChooser.setDialogTitle("Выбор директории");
                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                int result = fileChooser.showOpenDialog(null);
                if (result == JFileChooser.APPROVE_OPTION ){
                    file = fileChooser.getSelectedFile();
                    openFile.setText("Открыт файл: " + file.getName());
                    StringBuilder sb = new StringBuilder();
                    BufferedReader in;
                    {
                        try {
                            in = new BufferedReader(new FileReader( file.getAbsoluteFile()));
                        } catch (FileNotFoundException ev) {
                            throw new RuntimeException(ev);
                        }
                        try {
                            String s;
                            while ((s = in.readLine()) != null) {
                                sb.append(s);
                                sb.append("\n");
                            }
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        } finally {
                            try {
                                in.close();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        input.setText(String.valueOf(sb));
                    }
                }

            }
        });

        saveHow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fileChooser.setDialogTitle("Выбор директории");
                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                int result = fileChooser.showOpenDialog(null);
                if (result == JFileChooser.APPROVE_OPTION ){
                    file = fileChooser.getSelectedFile();
                    openFile.setText("Открыт файл: " + file.getName());
                    try {
                        if (!file.exists()){
                            file.createNewFile();
                        } else {
                            file.delete();
                        }
                        PrintWriter out = new PrintWriter(file.getAbsoluteFile());
                        try {
                            out.print(input.getText());
                        } finally {
                            out.close();
                        }
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        });

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openFile.setText("Открыт файл: " + file.getName());
                try {
                    if (!file.exists()){
                        fileChooser.setDialogTitle("Выбор директории");
                        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                        int result = fileChooser.showOpenDialog(null);
                        if (result == JFileChooser.APPROVE_OPTION ){
                            file = fileChooser.getSelectedFile();
                            openFile.setText("Открыт файл: " + file.getName());
                            try {
                                if (!file.exists()){
                                    file.createNewFile();
                                } else {
                                    file.delete();
                                }
                                PrintWriter out = new PrintWriter(file.getAbsoluteFile());
                                try {
                                    out.print(input.getText());
                                } finally {
                                    out.close();
                                }
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                    } else {
                        file.delete();
                    }
                    PrintWriter out = new PrintWriter(file.getAbsoluteFile());
                    try {
                        out.print(input.getText());
                    } finally {
                        out.close();
                    }
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }

}
