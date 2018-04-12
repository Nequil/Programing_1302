import javax.swing.*;
import java.awt.*;
public class JNestedBoxes extends JFrame{
  public static void main(String[] args) {
    JNestedBoxes frame = new JNestedBoxes();
    frame.setLocation(500,400);
    frame.setSize(400,400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
  public void paint(Graphics g){
    super.paint(g);
    final int countBox = 8;
    final int incSize = 20;
    int x = 40, y = 40;
    int width = 300, height = 300;

    for(int i = 0; i < countBox; ++i){
      g.drawReact(x,y,width,height);
      x += incSize;
      y += incSize;
      width += incSize * 2;
      height += incSize *2;
    }
  }
}
