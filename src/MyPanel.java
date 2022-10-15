import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener{

    String value;

    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bp, bm, bu, bd, br, bc;

    JTextField input;

    float a, b;

    boolean isP = false, isM = false, isD = false, isU = false, isS = false;

    String snack = "f";

    int sim;




    MyPanel() {
        this.setPreferredSize(new Dimension(200, 200));
        input = new JTextField(18);
        input.setEnabled(false);
        input.setHorizontalAlignment(SwingConstants.RIGHT);
        b0 = new JButton("0");
        b1  = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        bp = new JButton("+");
        bm = new JButton("-");
        bu = new JButton("*");
        bd = new JButton(":");
        br = new JButton("=");
        bc = new JButton("c");

        br.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sim = input.getText().lastIndexOf(snack);
                b = Float.parseFloat(input.getText().substring(sim + 1));
                a = Float.parseFloat(input.getText().substring(0, sim));
                if (isP){
                    value = String.valueOf((a + b));
                    input.setText(value);
                    isP = false;
                } else if (isM) {
                    value = String.valueOf((a - b));
                    input.setText(value);
                    isM = false;
                } else if (isU) {
                    value = String.valueOf((a * b));
                    input.setText(value);
                    isU = false;
                } else if (isD) {
                    if (b != 0){
                        value = String.valueOf((a / b));
                    }else {
                        value = "";
                    }
                    input.setText(value);
                    isD = false;
                }
                isS = false;
                snack = null;
            }
        });

        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = b0.getText();
                if (!input.getText().equals("0")){
                    input.setText(input.getText() + value);
                }
            }
        });

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = b1.getText();
                input.setText(input.getText() + value);

            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = b2.getText();
                input.setText(input.getText() + value);

            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = b3.getText();
                input.setText(input.getText() + value);

            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = b4.getText();
                input.setText(input.getText() + value);

            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = b5.getText();
                input.setText(input.getText() + value);

            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = b6.getText();
                input.setText(input.getText() + value);

            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = b7.getText();
                input.setText(input.getText() + value);

            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = b8.getText();
                input.setText(input.getText() + value);

            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = b9.getText();
                input.setText(input.getText() + value);

            }
        });
        bp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = bp.getText();
                if (!isS && input.getText().length() != 0){
                    input.setText(input.getText() + value);
                    snack = bp.getText();
                    isP = true;
                    isS = true;
                    isM = false;
                    isD = false;
                    isU = false;
                }
            }
        });
        bm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = bm.getText();
                if (!isS && input.getText().length() != 0){
                    input.setText(input.getText() + value);
                    snack = bm.getText();
                    isP = false;
                    isS = true;
                    isM = true;
                    isD = false;
                    isU = false;
                }
            }
        });
        bu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = bu.getText();
                if (!isS && input.getText().length() != 0){
                    input.setText(input.getText() + value);
                    snack = bu.getText();
                    isP = false;
                    isS = true;
                    isM = false;
                    isD = false;
                    isU = true;
                }
            }
        });
        bd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = bd.getText();
                if (!isS && input.getText().length() != 0){
                    input.setText(input.getText() + value);
                    snack = bd.getText();
                    isP = false;
                    isS = true;
                    isM = false;
                    isD = true;
                    isU = false;
                }
            }
        });
        bc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = input.getText();
                if (!value.endsWith("\\d")){
                    isP = false;
                    isS = false;
                    isM = false;
                    isD = false;
                    isU = false;
                }
                if (!value.equals("")){
                    input.setText(value.substring(0, value.length()-1));
                }
            }
        });

        this.add(input);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(bp);
        this.add(b4);
        this.add(b5);
        this.add(b6);
        this.add(bm);
        this.add(b7);
        this.add(b8);
        this.add(b9);
        this.add(bu);
        this.add(b0);
        this.add(bd);
        this.add(br);
        this.add(bc);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
