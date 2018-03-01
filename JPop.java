import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JPop extends JFrame implements ItemListener{
  FlowLayout flow = new FlowLayout();
  JLabel cityLabel = new JLabel("Select a city");
  JTextField cityPop = new JTextField(25);
  String [] city = {"Atlanta","Chicago","Detroit","Jefferson"};
  String [] pop = {"500,000","1,432,000","10","434,000"};
  JComboBox cityBox = new JComboBox();
  String myCity, output;
  int cityNum;

  public static void main(String[] args) {
    JPop frame = new JPop();
    frame.setSize(400,150);
    frame.setLocation(600,500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

  }
public JPop() {
  super("City Populations");

    setLayout(flow);
    add(cityLabel);
    add(cityBox);
    add(cityPop);
    cityBox.addItemListener(this);

  }
  public void itemStateChanged(ItemEvent e){
    Object source = e.getSource();
    if(source == cityBox){
      cityNum = cityBox.getSelectedIndex();
      myCity = city[cityNum];
      output = "The Population of "+myCity+" is "+ pop[cityNum];
      cityPop.setText(output);
    }
  }
}
