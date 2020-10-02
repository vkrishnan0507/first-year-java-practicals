
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MouseWithSwing
{
	JLabel l;
	MouseWithSwing()
	{
		JFrame f=new JFrame(" ");
		f.setSize(300,300);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l=new JLabel();
		f.add(l);
		f.addMouseListener(new MouseAdapter()
				{
	public void mouseClicked(MouseEvent a)
	{
		f.setSize(300,300);
		l.setText("Mouse Clicked");
	}
	public void mouseEntered(MouseEvent a)
	{
		f.setSize(900,900);
		l.setText("Mouse Entered");
		
	}
	public void mouseExited(MouseEvent a)
	{
		l.setText("Mouse Exited");

	}
	
				});f.setVisible(true);
				}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				new MouseWithSwing();
			}
		});

	}

}
