import java.awt.*;
import javax.swing.*;
public class DrawingPanel extends JPanel {
public static void main(String[] args) {
JFrame frame = new JFrame();
frame.setSize(400,400);
frame.setVisible(true);
frame.setLocation(250,500);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.add(new DrawingPanel()); // add panel
}
// continued on next slide
public void paintComponent (Graphics g) {
g.drawRect (50, 50, 20, 20); // square
g.drawRect (100, 50, 40, 20); // rectangle
g.drawOval (200, 50, 20, 20); // circle
g.drawOval (250, 50, 40, 20); // oval
g.drawString ("Square", 50, 90);
g.drawString ("Rectangle", 100, 90);
g.drawString ("Circle", 200, 90);
g.drawString ("Oval", 250, 90);
g.fillRect (50, 100, 20, 20); // square
g.fillRect (100, 100, 40, 20); // rectangle
g.fillOval (200, 100, 20, 20); // circle
g.fillOval (250, 100, 40, 20); // oval
g.drawLine (50, 150, 300, 150); // line
g.drawArc (50, 150, 250, 100, 0, 180); // arc
g.fillArc (100, 175, 200, 75, 90, 45); // arc
} // end paintComponent
} // end DrawingPanel
