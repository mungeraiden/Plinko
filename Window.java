import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.util.Arrays;

public class Window implements ActionListener {

    JFrame frame = new JFrame();
    JLabel title = new JLabel("Plinko");


    Window() {
        frame.add(title);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(820, 700);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

}