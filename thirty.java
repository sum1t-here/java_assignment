// Write a program to demonstrate the use of push buttons

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class thirty {
    private JLabel statusLabel;

    public thirty() {
        try {
            JFrame frame = new JFrame("Push Button Demo");
            frame.setSize(300, 200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new FlowLayout());

            // Create a label to display the button status
            statusLabel = new JLabel("No button clicked.");
            frame.add(statusLabel);

            // Create a push button
            JButton button = new JButton("Click Me!");

            // Add an action listener to the button
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    statusLabel.setText("Button clicked!");
                }
            });

            // Add the button to the frame
            frame.add(button);

            frame.setVisible(true);
        } catch (HeadlessException e) {
            System.out.println("Headless environment detected. GUI components are not supported.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new thirty();
            }
        });
    }
}
