import javax.swing.*;
import java.awt.*;

public class JBorder extends JFrame {
  String str = new String("Charles is garbage at");
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
    g.setFont(font);
    g.drawString(str,x,y);
    for(int i = 1; i < 4;++i){
      border = i * 10;
      if(i==1)
        g.setColor(Color.MAGENTA);
      else if(i == 2)
        g.setColor(Color.BLUE);
      else
        g.setColor(Color.ORANGE);
        leading = g.getFontMetrics().getLeading();
        ascent = g.getFontMetrics().getAscent();
        desent = g.getFontMetrics().getDescent();
        height = g.getFontMetrics().getHeight();
        width = g.getFontMetrics().stringWidth(str);

        g.drawRect(x-border,y-(ascent+border),width+2*border,height+2*border);
    }
  }
}
