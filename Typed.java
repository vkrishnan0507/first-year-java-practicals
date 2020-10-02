import java.awt.*;
import java.awt.event.*;


public class Typed extends Frame
{
String msg="";
	
	public Typed()
	{
		addKeyListener(new MyKeyAdapter(this));
		addWindowListener(new MyWindowAdapter6());
	}
    public void paint(Graphics g)
    {
    	g.drawString(msg, 130, 100);
    }
    
    public static void main (String args[])
    {
    	Typed obj=new Typed();
    	obj.setSize(new Dimension(500,500));
    	obj.setTitle("Characters you type");
    	obj.setVisible(true);
    	
    }
}

class MyWindowAdapter6 extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}
class MyKeyAdapter extends KeyAdapter
{
	Typed help;
	public MyKeyAdapter(Typed help)
	{
		this.help=help;
	}
	
	public void keyTyped(KeyEvent ke)
	{
		help.msg="Typed charecter is: <" +ke.getKeyChar()+" >";
		help.repaint();
	}
}