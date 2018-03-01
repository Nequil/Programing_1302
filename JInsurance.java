import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JInsurance extends JFrame implements ItemListener{
  FlowLayout flow = new FlowLayout();
  JLabel label = new JLabel("Insurance options");
  JCheckBox hmo = new JCheckBox("HMO");
  JCheckBox ppo = new JCheckBox("PPO");
  JCheckBox dental = new JCheckBox("Dental");
  JCheckBox vision = new JCheckBox("Vision");
  JTextField choice = new JTextField(20);
  ButtonGroup grp = new ButtonGroup();

  String output,insChosen;

  public static void main(String[] args) {
    JInsurance frame = new JInsurance();
    frame.setSize(400,150);
    frame.setLocation(600,500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

  }
public JInsurance() {
  super("Insurance option for you to choose");

    setLayout(flow);
    grp.add(hmo);
    grp.add(ppo);
    add(hmo);
    add(ppo);
    add(dental);
    add(vision);
    add(choice);
    hmo.addItemListener(this);
    ppo.addItemListener(this);
    dental.addItemListener(this);
    vision.addItemListener(this);



  }
  public void itemStateChanged(ItemEvent e){
    Object source = e.getSource();
    int HMOPRICE = 200;
    int PPOPRICE = 600;
    int DENTALPRICE = 75;
    int VISIONPRICE = 20;
    if(source == hmo){
      int select = e.getStateChange();
      if(select == ItemEvent.SELECTED){
        insChosen = "hmo $" + HMOPRICE;
      }
      else if(select == ItemEvent.DESELECTED){
      insChosen = "";
      output = "" + insChosen;
      choice.setText(output);

        }
      }
    }
  }  
