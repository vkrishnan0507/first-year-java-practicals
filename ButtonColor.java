
import java.awt.*;
import java.awt.event.*;

public class ButtonColor extends Frame implements ActionListener
{
  Button redb, blueb;		
public ButtonColor()	
  {
FlowLayout fl = new FlowLayout();	
setLayout(fl);

redb = new Button("Red");		
blueb = new Button("Blue");

redb.addActionListener(this);		
blueb.addActionListener(this);

add(redb);			
add(blueb);   

setTitle("Button in Action");
setSize(300, 350);                      
setVisible(true);
 }
			
public void actionPerformed(ActionEvent e)  {
    String str = e.getActionCommand();	
System.out.println("You clicked " + str + " button");  

if(str.equals("Red"))
    {
setBackground(Color.red);
    }
else if(str.equals("Blue"))
    {
setBackground(Color.blue);
    }
  }
public static void main(String args[])
  {
new ButtonColor();                      
  }			
}
