import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFriends extends JFrame implements ActionListener{
  FlowLayout flow = new FlowLayout();
  JButton b = new JButton("Press to change friends");
  JLabel f1 = new JLabel("Kappa");
  JLabel f2 = new JLabel("happy");
  JLabel f3 = new JLabel("dummy");
  JLabel f4 = new JLabel("beth");
  JLabel f5 = new JLabel("EDD");
  JLabel f6 = new JLabel("DOM");
  int counter = 0;

  public JFriends() {
      super("Friends");
      setLayout(flow);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      add(b);
      add(f1);
      b.addActionListener(this);

  }
  public static void main(String[] args) {
    JFriends frame = new JFriends();
    frame.setSize(400,200);
    frame.setLocation(600,500);
    frame.setVisible(true);

  }
  public void actionPerformed(ActionEvent e){
    if(counter == 5)
      counter = 0;
    if(counter == 0){
      remove(f1);
      add(f2);
    }else if (counter == 1){
      remove(f2);
      add(f3);
    }else if (counter == 2){
      remove(f3);
      add(f4);
    }else if (counter == 3){
      remove(f4);
      add(f5);
    }else{
      remove(f5);
      add(f1);
    }
    counter ++;
    validate();
    repaint();
  }
}
