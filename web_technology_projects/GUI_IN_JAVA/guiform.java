
package GUI_IN_JAVA;
import javax.swing.*;
public class guiform {
     public static void main(String[] args) {
    JFrame f= new JFrame("Hacker");
    JLabel n= new JLabel("Name:-");
    n.setBounds(50,50,100,30);
    JTextField t1=new JTextField();
    t1.setBounds(160,50,100,30);
 
    JLabel r= new JLabel("Roll:-");
    r.setBounds(50,100,100,30);
    JTextField t2=new JTextField();
    t2.setBounds(160,100,100,30);
    JLabel e= new JLabel("Email:-");
    e.setBounds(50,150,100,30);
    JTextField t3=new JTextField();
    t3.setBounds(160,150,100,30);
    
    
    
    f.add(n);
    f.add(t1);
    f.add(r);
    f.add(t2);
    f.add(e);
    f.add(t3);
    
    
    f.setLayout(null);
    f.setSize(300,300);
    f.setVisible(true);
    
    }
}
