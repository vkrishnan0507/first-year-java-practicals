import java.awt.*;
import java.awt.event.*;
public class ButtonAB extends Frame implements ActionListener
{
	Button A,B;
	Label details,cgpa;
	
	public ButtonAB()
	{
		FlowLayout f=new FlowLayout(3);
		setLayout(f);
		A=new Button("A");
		B=new Button("B");
		
		A.addActionListener(this);
		B.addActionListener(this);
		
		add(A);
		add(B);
		
		details=new Label("Shrutika Shaw,CS,2019345,SRCASW");
		cgpa=new Label("CGPA:8.27");
		
		add(details);
		add(cgpa);
		
		setTitle("Details");
		setSize(400,400);
		setVisible(true);
		setBackground(Color.yellow);
		
		details.setVisible(false);
		cgpa.setVisible(false);
		
		
	}
	
	public void actionPerformed(ActionEvent a)
	{
		String s=a.getActionCommand();
				
				if(s.equals("A"))
				{
					details.setVisible(true);
					cgpa.setVisible(false);
				}
				else if(s.equals("B"))
				{
					details.setVisible(false);
					cgpa.setVisible(true);
				}
	}
	
	public static void main(String args[])
	{
		new ButtonAB();
	}
}
