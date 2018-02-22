import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFont extends JFrame implements ActionListener{
  FlowLayout flow = new FlowLayout();
  JButton hb = new JButton("Hevetica");
  JButton tb = new JButton("Times Roman");
  JButton cb = new JButton("Courier");
  JButton ab = new JButton("Algerian");

  Font hFont = new Font("Helvetica", Font.PLAIN,24);
  Font tFont = new Font("Times Roman", Font.PLAIN,24);
  Font aFont = new Font("Algerian", Font.PLAIN,24);
  Font cFont = new Font("Courier", Font.PLAIN,24);


  JLabel f1 = new JLabel("Kappa");
  JLabel f2 = new JLabel("happy");
  JLabel f3 = new JLabel("dummy");
  JLabel f4 = new JLabel("beth");
  JLabel f5 = new JLabel("EDD");
  JLabel f6 = new JLabel("DOM");
  int counter = 0;

  public JFont() {
      super("Friends");
      setLayout(flow);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      add(hb);
      add(f1);
      add(tb);
      add(cb);
      add(ab);

      hb.addActionListener(this);
      tb.addActionListener(this);
      cb.addActionListener(this);
      ab.addActionListener(this);

  }
  public static void main(String[] args) {
    JFont frame = new JFont();
    frame.setSize(600,400);
    frame.setLocation(600,500);
    frame.setVisible(true);

  }
  public void actionPerformed(ActionEvent e){
    Font myFont;
    if(e.getSource() == hb)
    myFont = hFont;
    else if (e.getSource() == tb)
    myFont = tFont;
    else if (e.getSource() == cb)
    myFont = cFont;
    else 
      myFont = aFont;

        /*  counter = 0;
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
      add(f1); */
    label.setFont(myFont);  
    }
    //counter ++;
   
  }

