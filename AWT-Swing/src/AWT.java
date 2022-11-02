import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWT extends Frame {
    AWT(){
        Label l1 = new Label("Hello! This window is created by AWT");
        //this sets where and what size the label should be displayed in frame
        l1.setBounds(50, 50, 300, 50);

        // this adds label to the frame
        add(l1);

        setSize(500, 300);
        setLayout(null);

        // if false frame is not displayed
        setVisible(true);
    }

    // closes the frame when the X is clicked
    private class WindowEvent extends WindowAdapter {
        @Override
        public void windowClosing(java.awt.event.WindowEvent e) {
            super.windowClosing(e);
            dispose();
        }
    }
    public static void main(String[] args){
        new AWT();
    }
}
