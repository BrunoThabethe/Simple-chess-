package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable {

    // Game screen size
    public static final int WIDTH = 1100;
    public static final int HEIGHT = 800; // Fixed typo

    final int FPS = 60;
    Thread gameThread;
    Board board = new Board(); // Ensure this class exists

    public GamePanel() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT)); // Fixed typo here too
        setBackground(Color.BLACK);
    }

    public void LaunchGame() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        double drawInterval = 1000000000.0 / FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;

        while (gameThread != null) {
            currentTime = System.nanoTime();
            delta += (currentTime - lastTime) / drawInterval; // Fixed delta calculation
            lastTime = currentTime;

            if (delta >= 1) {
                update();
                repaint();
                delta--; // Properly decrement delta
            }
        }
    }

    // Updating game logic
    private void update() {
        // Add game update logic here
    }

    // Drawing game elements
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        board.draw(g2); // Ensure Board class has a draw(Graphics2D) method
    }
}
