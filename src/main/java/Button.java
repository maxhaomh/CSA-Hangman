/*import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Dimension;

public class Button {
    private static JButton difficultyButton;
    
    public static void createWindow() {
        JFrame frame = new JFrame("Hangman Difficulty Level");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        difficultyButton = new JButton("Select Difficulty Level");

        difficultyButton.setBounds(100, 100, 200, 50);
        difficultyButton.addActionListener(e -> showDifficultyLevelDialog(frame));

        frame.add(difficultyButton);
        frame.setVisible(true);
    }

    private static void showDifficultyLevelDialog(JFrame frame) {
        String[] options = {"Easy", "Medium", "Hard"};

        Dimension frameSize = frame.getSize(); // Get the size of the frame

        int choice = JOptionPane.showOptionDialog(frame, "Select difficulty level:", "Difficulty Level",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        switch (choice) {
            case 0: // Easy level
                
                Main.level = 6;
                break;
            case 1: // Medium level
                
                Main.level = 5;
                break;
            default:
            case 2: // Hard level
              Main.level = 4;
                break;
        }
        difficultyButton.setText("Allowed guesses: " + Main.level);
    }
}*/