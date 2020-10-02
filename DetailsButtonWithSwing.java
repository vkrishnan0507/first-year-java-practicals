import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class DetailsButtonWithSwing
{
	
	public DetailsButtonWithSwing()
	{
	JFrame F=new JFrame();
	F.setVisible(true);
	F.setSize(400,400);
	F.setLayout(new FlowLayout());
	F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JLabel l=new JLabel();
	F.add(l);
	JButton b1,b2;
	b1=new JButton("A");
	ActionListener a1=new ActionListener()
			{
		       public void actionPerformed(ActionEvent ae)
		       {
		    	   l.setText("Name-Shrutika Shaw   Course-CS   Rollno-2019345  College-SRCASW ");
		       }
			};
			
	b1.addActionListener(a1);
	F.add(b1);
	
	b2=new JButton("B");
	ActionListener a2=new ActionListener()
	{
       public void actionPerformed(ActionEvent ae)
       {
    	   l.setText("CGPA-8.27");
       }
	};
	
b2.addActionListener(a2);
F.add(b2);
	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(
				 new Runnable()
				 {
					public void run()
					{
						new DetailsButtonWithSwing();
				    }
				 
	});

	}

}
