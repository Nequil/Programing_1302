import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JPizza extends JFrame implements ItemListener {
  int sizeIndex;
  int toppingsIndex;
  double totalPrice;
  String s = String.valueOf(totalPrice);

  String [] sizeArray = {"Small - $7", "Medium - $9", "Large - $11", "Extra Large - $14"};
  double [] priceArray = {7.0, 9.0, 11.0, 14.0};
  String [] toppingsArray = {"Pepperoni", "Sausage", "Pineapple", "Mushrooms", "Cheese"};

  FlowLayout flow = new FlowLayout();
  JLabel pizzaLabel = new JLabel("Select a size:");
  JLabel toppingLabel = new JLabel("Select a topping ($0.50 extra except for extra cheese):");
  JTextField totalPriceText = new JTextField(25);
  JComboBox size = new JComboBox();
  JComboBox toppings = new JComboBox();

  public static void main(String[] args) {
    JPizza frame = new JPizza();
    frame.setSize(400, 150);
    frame.setLocation(600, 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public JPizza() {
    super("Pizza Order");
    setLayout(flow);

    for(int i = 0; i < sizeArray.length; i++){
      size.addItem(sizeArray[i]);
    }

    for(int j = 0; j < toppingsArray.length; j++){
      toppings.addItem(toppingsArray[j]);
    }

    add(pizzaLabel);
    add(size);
    add(toppingLabel);
    add(toppings);
    add(totalPriceText);
    size.addItemListener(this);
    toppings.addItemListener(this);
  }

  public void itemStateChanged(ItemEvent e){
    Object source = e.getSource();
    if (source == size){
      sizeIndex = size.getSelectedIndex();
    } else if (source == toppings){
      toppingsIndex = toppings.getSelectedIndex();
    }
    if (toppingsIndex == 4){
      totalPrice = priceArray[sizeIndex];
    } else {
      totalPrice = (priceArray[sizeIndex]) + .5;
    }
    s = String.valueOf(totalPrice);
    totalPriceText.setText(s);
  }
}
