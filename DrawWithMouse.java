import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DrawWithMouse extends JFrame implements MouseListener {
  JLabel label = new JLabel("do something with the mouse");
  Container con = getContentPane();
  int x1,y1,x2,y2;
  public static void main(String[] args) {
    DrawWithMouse frame = new DrawWithMouse();
    frame.setSize(400,400);
    frame.setLocation(400,500);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }
  public DrawWithMouse(){
    super("Mouse Drawing Example");
    con.setLayout(new FlowLayout());
    con.add(label);
    addMouseListener(this);

  }
  public void mousePressed(MouseEvent e) {
    x1 = e.getX();
    y1 = e.getY();

  }
  public void mouseReleased(MouseEvent e){
    x2 = getX();
    y2 = getY();
    repaint();
  }
  public void mouseClicked(MouseEvent e){}
  public void mouseEntered(MouseEvent e){}
  public void mouseExited(MouseEvent e){}
  public void paint(Graphics g){
    super.paint(g);
    g.setColor(Color.BLUE);
    g.drawLine(x1,y1,x2,y2);
  }
}
