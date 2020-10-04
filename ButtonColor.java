import java.awt.*;
import java.awt.event.*;

public class awtButton extends Frame implements ActionListener
{
	Button b1,b2;
	public awtButton()
	{
		setLayout(new FlowLayout());
		b1=new Button("Red");
		b2=new Button("Blue");
		b1.addActionListener(this);
		b2.addActionListener(this);
		addWindowListener(new MyWindowAdapter6(this));
		add(b1);
		add(b2);
		
		setTitle("Button");
		setSize(400,400);
		setVisible(true);

	}
	
	public void actionPerformed(ActionEvent e)
	{
		String str=e.getActionCommand();
		if(str.equals("Red"))
		{
			setBackground(Color.red);
		}
		if(str.equals("Blue"))
		{
			setBackground(Color.blue);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      awtButton a=new awtButton();
 
	}

}
class MyWindowAdapter6 extends WindowAdapter
{
	awtButton a;
	MyWindowAdapter6(awtButton a)
	{
		this.a=a;
	}
	public void windowClosing(WindowEvent ae)
	{
		a.setVisible(false);
	}
}
