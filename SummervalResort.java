import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SummervalResort extends JFrame implements ActionListener {
  JMenuBar mainBar = new JMenuBar();
  JMenu menu1 = new JMenu("File");
  JMenu menu2 = new JMenu("Rooms");
  JMenu menu3 = new JMenu("Dining");
  JMenu menu4 = new JMenu("Activities");
  JMenuItem exit = new JMenuItem("Exit");
  JMenuItem suite = new JMenuItem("Suite");
  JMenuItem single = new JMenuItem("Single");
  JMenuItem lunch = new JMenuItem("lunch");
  JMenuItem swimming = new JMenuItem("swimming");

  JLabel label1 = new JLabel("    SummervalResort   ");
  JLabel label2 = new JLabel("----------------------");
  JLabel label3 = new JLabel();




  public static void main(String[] args) {
  SummervalResort frame = new SummervalResort();
    frame.setSize(370,400);
    frame.setLocation(500,400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  public SummervalResort(){
    super("SummervalResort");
    setLayout(new FlowLayout());
    setJMenuBar(mainBar);
    mainBar.add(menu1);
    mainBar.add(menu2);
    mainBar.add(menu3);
    mainBar.add(menu4);
    menu1.add(exit);
    menu2.add(single);
    menu2.add(suite);
    menu3.add(lunch);
    menu4.add(swimming);
    exit.addActionListener(this);
    suite.addActionListener(this);
    single.addActionListener(this);
    lunch.addActionListener(this);
    swimming.addActionListener(this);

    label1.setFont(new Font("Arial", Font.BOLD,20));
    label2.setFont(new Font("Arial", Font.PLAIN,20));
    label3.setFont(new Font("Arial", Font.ITALIC,20));
    add(label1);
    add(label2);
    add(label3);

  }
  public void actionPerformed(ActionEvent e) {
    Object source = e.getSource();
    String text = " ";

    if(source == exit)
      System.exit(0);
      else if(source == single)
        text = "Single rooms with private bat for $99";
        else if(source == suite)
          text = "Suite rooms with private bat for $200";
          else if(source == lunch)
            text = "Lunch served from 12:00 to 2:00PM";
            else if(source == swimming)
              text = "The swimming pool is open from 8:00AM to 11:30PM";
      
  }
}
