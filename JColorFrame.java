

import javax.swing.*;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;

public class JColorFrame extends JFrame implements ActionListener {
   
   private int WIDTH = 400;
   private int HEIGHT = 500;
   private JButton cb, nb, eb, sb, wb;
   
   public JColorFrame() {
      
      setSize(WIDTH, HEIGHT);
      setLayout(new BorderLayout());
      
      cb = new JButton("COLORS!!!");
      add(cb, "Center");
      
      nb = new JButton();
      add(nb, "North");
      
      eb = new JButton();
      add(eb, "East");
      
      sb = new JButton();
      add(sb, "South");
      
      wb = new JButton();
      add(wb, "West");
      
      cb.addActionListener(this);
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
   }
   
   public void actionPerformed(ActionEvent event) {
      
      int number = (int) (Math.random() * 5);
      int R = (int)(Math.random() * 256);
      int G = (int)(Math.random() * 256);
      int B = (int)(Math.random() * 256);
      int R2 = (int)(Math.random() * 256);
      int G2 = (int)(Math.random() * 256);
      int B2 = (int)(Math.random() * 256);
      
      Color color = new Color(R, G, B);
      Color color2 = new Color(R2, G2, B2);
      
      String RGB = "(" + color.getRed() + ", " + color.getGreen() + ", " + color.getBlue() + ")";
      
      if(number == 1) {
         nb.setBackground(color);
         nb.setText(RGB);
         nb.setForeground(Color.WHITE);
      }
         
      else if(number == 2) {
         eb.setBackground(color);
         eb.setText(RGB);
         eb.setForeground(Color.WHITE);
      }
      else if(number == 3) {
         sb.setBackground(color);
         sb.setText(RGB);
         sb.setForeground(Color.WHITE);
      }
      else {
         wb.setBackground(color); 
         wb.setText(RGB);
         wb.setForeground(Color.WHITE);
      }
      
      RGB = "(" + color2.getRed() + ", " + color2.getGreen() + ", " + color2.getBlue() + ")";  
         
      cb.setBackground(color2);
      cb.setText(RGB);
      cb.setForeground(Color.WHITE);
         
      validate();
      repaint();
   }
   
   public static void main(String [] args) {
      
      JColorFrame frame = new JColorFrame();
      frame.setVisible(true);
   }
   
}