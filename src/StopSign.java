import java.awt.*;
import javax.swing.*;

public class StopSign extends JPanel 
{
  public void paint(Graphics g) 
  {
   g.fillRect(50, 50, 150, 450);
   
   g.setColor(Color.red);
   g.fillOval(50, 50, 150, 150);
   
   g.setColor(Color.orange);
   g.fillOval(50, 200, 150, 150);
   
   g.setColor(Color.GREEN);
   g.fillOval(50, 350, 150, 150);
   
  }

  public static void main(String[] args) 
   {
    JFrame frame = new JFrame();
    frame.getContentPane().add(new StopSign());
    
    frame.setSize(800,600);
    frame.setVisible(true);
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle ("StopSign");
   }
}
