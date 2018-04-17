import javax.swing.*;
import java.awt.*;

public class JSign extends JFrame {
  String str = new String("Charles is garbage at CHESS");
  Font font = new Font("Serif", Font.BOLD, 50);
  int leading, ascent, desent, height, width, border;
  int x = 100, y = 150;
  public static void main(String[] args) {
    JBorder frame = new JBorder();
    frame.setSize(400,400);
    frame.setLocation(500,400);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

  }
  public void paint(Graphics g){
    super.paint(g);
  int [] xOut = {56, 107 , 143,143,107,56,20,20};
  int [] yOut = {40, 40 , 76, 127,163,163,127,127};
  int [] xIn = {57, 106 , 138,138,1106,57,25,25};
  int [] yIn = {45, 45 , 77,126,158,158,126,77};

  g.setColor(Color.BLACK);
  g.drawPolygon(xOut,yOut,xOut.length);

  g.setColor(Color.RED);
  g.fillPolygon(xIn,yIn,xIn.length);

  g.setColor(Color.WHITE);
  g.setFont(new Font("SansSerif", Font.BOLD, 36));
  g.drawString("STOP",33,116);
  
  }
  }
  
