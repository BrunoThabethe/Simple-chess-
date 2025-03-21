package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;


import javax.swing.JPanel;

// in order for us to be customizable 
public class GamePanel extends JPanel implements Runnable{

    // game screen size
    public static final int WIDTH = 1100;
    public static final int HIGHT = 800;
    final int FPS = 60;
    Thread gameThread;
    Board board = new Board();

    public GamePanel() {
        setPreferredSize(new Dimension(WIDTH,HIGHT));
        setBackground(Color.BLACK);
    }

    public void LaunchGame() {
        gameThread = new Thread(this);
        gameThread.start(); 
    }

    @Override
    public void run() {
        
        double drawInterval = 1000000000/FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime; 
        
        while (gameThread != null) {

            currentTime = System.nanoTime();
            delta = (currentTime - lastTime)/drawInterval;
            lastTime = currentTime;

            if (delta >= 1){
                update();
                repaint();
                delta --;
            }
            
        }

    }



    // upding stuff
    private void update(){

    }

    //all the drawing stuff
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        board.draw(g2);
    }

 
}
