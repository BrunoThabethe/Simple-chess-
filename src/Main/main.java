package Main;
import javax.swing.JFrame;

public class main {

 public static void main (String[]args){
    // creating a window
 JFrame window = new JFrame("Simple Chess Game");

 //whwn closing the window it also shut down the program 
 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 //can not resize the window
 window.setResizable(false);

 //adding the Game Panel to the window
 GamePanel gp = new GamePanel();
 window.add (gp);
 window.pack();

 //window will show up only in the center 
 window.setLocationRelativeTo(null);
 // so we can see the Jframe window 
 window.setVisible(true);

 gp.LaunchGame();


 }
}
