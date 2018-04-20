import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class JHouse extends JPanel {

  Color roof = new Color(255, 10, 10);
  Color wall = new Color(230, 230, 230);
  Color wood = new Color(205, 133, 63);
  Color sky = new Color(10, 10, 255);

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setSize(400, 400);
    frame.setVisible(true);
    frame.setLocation(400, 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.add(new JHouse());
  }

  public void paint(Graphics g){
    super.paintComponent(g);

//background
    g.setColor(sky);
    g.fillRect(0, 0, 400, 400);

//Sun
    g.setColor(Color.YELLOW);
    g.fillOval(0, 0, 75, 75);

//Cloud
    g.setColor(Color.WHITE);
    g.fillOval(60, 10, 125, 50);


//roof
    g.setColor(Color.GRAY);
    int [] x = {100, 200, 300};
    int [] y = {100, 25, 100};
    Polygon poly = new Polygon(x,y,3);
    g.fillPolygon(poly);

//walls
    g.setColor(wall);
    g.fillRect(100, 100, 200, 100);

//door
    g.setColor(wood);
    g.fillRect(175, 150, 50, 50);

//windows
    g.setColor(Color.WHITE);
    g.fillRect(125, 150, 10, 10);
    g.fillRect(140, 150, 10, 10);
    g.fillRect(125, 135, 10, 10);
    g.fillRect(140, 135, 10, 10);
    g.fillRect(250, 150, 10, 10);
    g.fillRect(265, 150, 10, 10);
    g.fillRect(250, 135, 10, 10);
    g.fillRect(265, 135, 10, 10);

//chimney
    g.setColor(Color.GRAY);
    int [] chimneyx = {100, 100, 125, 125};
    int [] chimneyy = {100, 50, 50, 90};
    Polygon chimney = new Polygon(chimneyx,chimneyy,4);
    g.fillPolygon(chimney);

//grass
    g.setColor(Color.GREEN);
    g.fillRect(0, 200, 400, 400);

//sidewalk
    g.setColor(Color.GRAY);
    g.fillRect(175, 200, 50, 225);


  }
}
