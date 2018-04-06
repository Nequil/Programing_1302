import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Jemail extends JFrame implements ActionListener {
  JLabel toLabel = new JLabel("To ");
  JTextField toField = new JTextField(24);
  JLabel subjectLabel = new JLabel("Subject ");
  JTextField subjectField = new JTextField(24);
  JLabel messageLabel = new JLabel("Message ");
  JTextArea message = new JTextArea(4,22);
  JScrollPane scroll = new JScrollPane(message,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
  JButton sendButton = new JButton("send");
  JButton clearButton = new JButton("Clear");

  public static void main(String[] args) {
    Jemail frame = new Jemail();
    email.setSize(370,400);
    email.setLocation(500,400);
    email.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  public Jemail(){
    super("WebBuy Company e-mail");
    setLayout(new FlowLayout(FlowLayout.RIGHT));
    add(toLabel);
    add(subjectLabel);
    add(subjectField);
    add(messageLabel);
      message.setLineWrap(true);
      message.setWrapStyleWord(true);
    add(scroll);
    add(clearButton);

  sendButton.addActionListener(this);
  clearButton.addActionListener(this);
  }
  public void actionPerformed(ActionEvent e) {
    Object source = e.getSource();
    if(source == sendButton)
      message.append("\nMail has been sent!");
      else {
        toField.setText("");
        subjectField.setText("");
        message.setText("");
      }
  }
}
