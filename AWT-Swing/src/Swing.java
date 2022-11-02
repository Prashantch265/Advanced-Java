import javax.swing.*;

public class Swing extends JFrame {
    Swing(){
        JLabel l1 = new JLabel("Hello! This window is created by Swing");
        l1.setBounds(50, 50, 300, 50);

        add(l1);
        setSize(500, 300);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args){
        new Swing();
    }
}
