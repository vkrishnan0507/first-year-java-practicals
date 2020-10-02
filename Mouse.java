
import java.awt.*;
import java.awt.event.*;
class Mouse extends Frame
{	
	String msg="";
	Mouse()
	{
		addMouseListener(new MyMouseAdapter(this));
		addWindowListener(new windowclose());
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,20,80);
	}
	public static void main(String args[])
	{
		Mouse a = new Mouse();
		a.setSize(new Dimension (400,400));
		a.setTitle("Mouse Events");
		a.setVisible(true);
	}
}
class MyMouseAdapter extends MouseAdapter
{
	Mouse ad;
	public MyMouseAdapter(Mouse ad)
	{
		this.ad=ad;
	}
	public void mouseClicked(MouseEvent me)
	{
		ad.msg="Mouse Clicked";
		ad.setBackground(Color.pink);
		ad.setForeground(Color.black);
		ad.setSize(400,400);
		ad.repaint();
	}
	public void mouseEntered (MouseEvent me)
	{
		ad.msg="Mouse Entered";
		ad.setSize(3*400,3*400);
		ad.repaint();
	}
	public void mouseExited(MouseEvent me)
	{
		System.exit(0);
	}
}

class windowclose extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{	
		System.exit(0);
	}
}



