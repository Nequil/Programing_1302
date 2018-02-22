import javax.swing.*;

public class SwingFrame{
  public static void main(String[] args) {
    JFrame window = new JFrame ("My First GUI Program");

    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setSize(400, 200);
    window.setLocation(600,400);

    JLabel label = new JLabel("Hello World!");
    
    JButton button1 = new JButton("Continue");
    JButton button2 = new JButton("Exit"); 
    window.add(label);
    window.add(button1);
    window.setVisible(true);
  }
  }