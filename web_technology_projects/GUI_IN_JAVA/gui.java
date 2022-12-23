package GUI_IN_JAVA;

import javax.swing.*;
import java.awt.event.*;

public class gui implements ActionListener {

    public static JFrame f;
    public static JTextField t1;
    public static JTextField t2;
    public static JTextField t3;
    public static JTextField t4;
    public static JTextField t5;
    public static JTextField t6;

     static JButton b;
     static JButton fb;

    public static void main(String[] args) {
        gui g = new gui();
        f = new JFrame("Calculater");
        JLabel l1 = new JLabel("Enter First Number");
        l1.setBounds(30, 30, 200, 30);
        t1 = new JTextField();
        t1.setBounds(160, 30, 100, 30);
        JLabel l2 = new JLabel("Enter Second Number");
        l2.setBounds(30, 70, 200, 30);
        t2 = new JTextField();
        t2.setBounds(160, 70, 100, 30);
        b = new JButton("Calculate");
        b.setBounds(80, 110, 100, 30);
        fb = new JButton("Factorial");
        fb.setBounds(200, 110, 100, 30);
        JLabel l3 = new JLabel("SUM:-");
        l3.setBounds(50, 150, 100, 30);
        t3 = new JTextField();
        t3.setBounds(130, 150, 100, 30);
        JLabel l4 = new JLabel("DIFF:-");
        l4.setBounds(50, 190, 200, 30);
        t4 = new JTextField();
        t4.setBounds(130, 190, 100, 30);
        JLabel l5 = new JLabel("MUL:-");
        l5.setBounds(50, 230, 200, 30);
        t5 = new JTextField();
        t5.setBounds(130, 230, 100, 30);
        JLabel l6 = new JLabel("DIV:-");
        l6.setBounds(50, 270, 200, 30);
        t6 = new JTextField();
        t6.setBounds(130, 270, 100, 30);

        JLabel l7 = new JLabel("BY:PMC BCA RIKESH_DAHAL");
        l7.setBounds(300, 250, 200, 90);

        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(t5);
        f.add(t6);
        f.add(b);
        f.add(fb);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(l7);
        b.addActionListener(g);
        fb.addActionListener(g);

        f.setLayout(null);
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        if (e.getSource() == b) {
            float sum = num1 + num2;
            t3.setText(String.valueOf(sum));
            float diff = num1 - num2;
            t4.setText(String.valueOf(diff));
            float mul = num1 * num2;
            t5.setText(String.valueOf(mul));
            float div = num1 / num2;
            t6.setText(String.valueOf(div));

        }
        if (fb == e.getSource()) {
            int fact = 1;
            for (int i = num1; i > 1; i--) {
                fact = fact * i;
            }
            t3.setText(String.valueOf(fact));
        }
        
    }
}
