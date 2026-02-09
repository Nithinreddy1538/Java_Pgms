import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImageDisplayApp extends JFrame {

    public ImageDisplayApp() {
        // 1. Frame Setup
        setTitle("Swing Button Image Display");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 2. Prepare Icons
        // Replace these paths with actual image files on your computer
        ImageIcon buttonIcon = new ImageIcon("click me"); 
        ImageIcon displayImage = new ImageIcon("image.png");

        // 3. Create the Button with Label and Image
        JButton actionButton = new JButton("Click to See Image", buttonIcon);
        actionButton.setHorizontalTextPosition(SwingConstants.RIGHT); // Label to the right of image

        // 4. Create the Display Area (Label)
        JLabel displayLabel = new JLabel();
        displayLabel.setHorizontalAlignment(JLabel.CENTER);

        // 5. Add Event Listener
        actionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Set the image to the label when clicked
                displayLabel.setIcon(displayImage);
                // Optional: Remove text from button after click
                actionButton.setText("Image Displayed!");
                actionButton.setEnabled(false); 
            }
        });

        // 6. Add Components to Frame
        add(actionButton, BorderLayout.NORTH);
        add(displayLabel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        // Run the GUI on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() -> new ImageDisplayApp());
    }
}
