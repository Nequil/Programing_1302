import javax.swing.*;
import java.awt.*;
public class LayOut {
public static void main( String args[] ) {
JFrame window = new JFrame( "Layout Program" );
JLabel title = new JLabel( "Layout Example" );
JLabel name = new JLabel( "Enter your name" );
JTextField textInput = new JTextField( 12 );
JButton button = new JButton( "Enter your name" );

window.setSize(200, 150);
window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
window.setVisible(true);

window.setLayout( new FlowLayout() );
window.add( title );
window.add( name );
window.add( textInput );
window.add( button );
}
}
