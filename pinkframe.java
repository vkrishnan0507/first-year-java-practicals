import java.awt.*;
public class pinkframe extends Frame
{
	pinkframe()
	{
		Frame f=new Frame();
		Label l=new Label("Hello There");
	
		f.add(l);
		f.setSize(300, 300);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		f.setBackground(Color.pink);
		
	}
	
	public static void main(String args[])
	{
		pinkframe d = new pinkframe();
	}

}
