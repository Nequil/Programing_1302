import javax.swing.*;
import javax.swing.UIManager;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public class Jdsc extends JFrame implements MouseListener, ActionListener{
   
   private int counter = 0;
   private final int SIZE = 400;
  // private GridBagLayout layout = new GridBagLayout();
  // private GridBagConstraints gbc = new GridBagConstraints();
   private JMenuBar mainMenu = new JMenuBar();
   private JMenu liberal = new JMenu("Liberal Arts");
   private JMenu business = new JMenu("Business");
   private JMenu math = new JMenu("STEM");
   private JMenuItem english = new JMenuItem("English");
   private JMenuItem hist = new JMenuItem("History");
   private JMenuItem psych = new JMenuItem("Psychology");
   private JMenuItem genStudies = new JMenuItem("General Studies");
   private JMenuItem acc = new JMenuItem("Accounting");
   private JMenuItem manage = new JMenuItem("Management");
   private JMenuItem market = new JMenuItem("Marketing");
   private JMenuItem bio = new JMenuItem("Biology");
   private JMenuItem chem = new JMenuItem("Chemistry");
   private JMenuItem mathematic = new JMenuItem("Mathematics");
   private JMenuItem info = new JMenuItem("Information Technology");
   private JLabel label = new JLabel("Welcome to Dalton State!");
   private JButton button = new JButton("Welcome to the Dalton State website!");
     
   public Jdsc() {
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(SIZE, SIZE);
      setLocation(750, 350);
      setVisible(true);
      addMouseListener(this);
      setJMenuBar(mainMenu);
      mainMenu.add(liberal);
      mainMenu.add(business);
      mainMenu.add(math);
      liberal.add(english);
      liberal.add(hist);
      liberal.add(psych);
      liberal.add(genStudies);
      business.add(acc);
      business.add(manage);
      business.add(market);
      math.add(bio);
      math.add(chem);
      math.add(mathematic);
      math.add(info);
      button.addActionListener(this);
   }
   
   public void mouseClicked(MouseEvent e) {
   
   }
   
   public void mouseEntered(MouseEvent e) {
      
      button.setBackground(Color.GRAY);
      button.setForeground(Color.BLUE);
      if(counter == 0) {
         add(button);
         counter++;
      }
         
      validate();
      repaint();
   }
   
  public void mouseExited(MouseEvent e) {
   
   }
   
   public void mousePressed(MouseEvent e) {
   
   }
   
   public void mouseReleased(MouseEvent e) {
   
   }
   
   public void actionPerformed(ActionEvent e) {
      
      remove(button);
      counter++;
      validate();
      repaint();
   }
   
   public static void main(String [] args) {
      
      Jdsc frame = new Jdsc();
   }
}