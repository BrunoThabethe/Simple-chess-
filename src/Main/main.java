package Main;

import javax.swing.JFrame;

public class main {
    public static void main(String[] args) {
        // Creating a window
        JFrame window = new JFrame("Simple Chess Game");

        // When closing the window, it also shuts down the program
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cannot resize the window
        window.setResizable(false);

        // Adding the Game Panel to the window
        GamePanel gp = new GamePanel();  // Ensure this class is properly defined
        window.add(gp);
        window.pack();

        // Window will show up in the center
        window.setLocationRelativeTo(null);

        // So we can see the JFrame window
        window.setVisible(true);

        // Launch the game (Ensure GamePanel has this method)
        gp.LaunchGame();
    }
}
