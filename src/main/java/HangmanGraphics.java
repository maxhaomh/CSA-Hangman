import java.awt.*;
import javax.swing.*;

public class HangmanGraphics extends JFrame {
    private Game test;

    public HangmanGraphics(Game test) {
        this.test = test;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.setStroke(new BasicStroke(3)); // Makes the lines thicker
        g2D.drawLine(200, 50, 200, 125);
        g2D.drawLine(200, 50, 325, 50);
        g2D.drawLine(325, 50, 325, 350);
        g2D.drawLine(250, 350, 400, 350);
        int incorrectGuesses = test.getIncorrectGuesses();
        int difficulty = test.getLevel();
        int maxTries = test.getMaxTries();
        int tries=test.getTries();

        if (difficulty==1) {
          if (tries==5) {
            g2D.drawLine(200, 225, 220, 275); // head
          } if (tries == 4) {
            g2D.drawLine(200, 155, 200, 225); // body
          } if (tries == 3) {
            g2D.drawLine(200, 170, 170, 200); // left arm
          } if (tries == 2) {
            g2D.drawLine(200, 170, 230, 200); // right arm
          } if (tries == 1) {
            g2D.drawLine(200, 225, 180, 275); // left leg
          } if (tries == 0) {
            g2D.drawLine(200, 225, 220, 275); // right leg
          }
        }

       else if (difficulty==2) {
         g2D.drawLine(200, 225, 220, 275);
         } if (tries == 4) {
           g2D.drawLine(200, 155, 200, 225); // body
         } if (tries == 3) {
           g2D.drawLine(200, 170, 170, 200); // left arm
         } if (tries == 1) {
           g2D.drawLine(200, 170, 230, 200); // right arm
         } if (tries == 0) {
           g2D.drawLine(200, 225, 180, 275); // left leg
       }
      else if (difficulty==3) {
         g2D.drawLine(200, 225, 220, 275); //head
         g2D.drawLine(200, 155, 200, 225); // body
         } if (tries == 2) {
           g2D.drawLine(200, 170, 170, 200); // left arm
         } if (tries == 1) {
           g2D.drawLine(200, 170, 230, 200); // right arm
         } if (tries == 0) {
           g2D.drawLine(200, 225, 180, 275); // left leg
       }
    }
    }

    
        
        
  
        
 
 
