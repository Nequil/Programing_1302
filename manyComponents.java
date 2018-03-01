import javax.swing.*;
import java.awt.*;
public class manyComponents{
  public static void main(String[] args) {
    JFrame window = new JFrame("Many Components");
    window.setSize(400,200);
    window.setLocation(600,500);
    JLabel header = new JLabel("This Frame has many components");
    JLabel namePrompt = new JLabel("Enter your name");
    JTextField nameField = new JTextField(12);
    JButton button = new JButton("Click to continue");
    Font font1 = new Font("Ariel", Font.BOLD, 20);
    Font font2 = new Font("Century", Font.ITALIC, 16);
    header.setFont(font1);
    namePrompt.setFont(font2);
    button.setToolTipText("CLick this button after you type name");

    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);
    window.setLayout(new FlowLayout());
    window.add(header);
    window.add(namePrompt);
    window.add(nameField);
    window.add(button);
  }
}
