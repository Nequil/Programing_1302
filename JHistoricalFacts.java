import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JHistoricalFacts extends JFrame implements ActionListener{
  FlowLayout flow = new FlowLayout();
  JButton b = new JButton("Press to change fact");
  JLabel f1 = new JLabel("Winston Churchill served as MP for 64 years. He served under both Queen Victoria and Queen Elizabeth.");
  JLabel f2 = new JLabel("It took 36 hours for the first local radio station to reoirt on the meltdown at Chernobly.");
  JLabel f3 = new JLabel("U-Boats sunk 3,000 ships with torpedoes in WWII.");
  JLabel f4 = new JLabel("June 22 1941 Germany invaded the USSR ending their truce.");
  JLabel f5 = new JLabel("The first spy planes were used during WWI");
  JLabel f6 = new JLabel("975,000 casualties occured in one battle during WWI");
  int counter = 0;

  public JHistoricalFacts() {
      super("Historical Facts");
      setLayout(flow);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      add(b);
      add(f1);
      b.addActionListener(this);

  }
  public static void main(String[] args) {
    JHistoricalFacts frame = new JHistoricalFacts();
    frame.setSize(800,200);
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
