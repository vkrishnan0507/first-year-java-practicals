import java.awt.*;
import javax.swing.*;

public class PinkFrameWithSwing {
	
	public PinkFrameWithSwing()
	{
		JFrame F=new JFrame();
		F.setVisible(true);
		F.setSize(400,400);
		F.setLayout(new FlowLayout());
		F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		F.getContentPane().setBackground(Color.pink);
		
		JLabel l=new JLabel("Hello There");
		F.add(l);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SwingUtilities.invokeLater(
				 new Runnable()
				 {
					public void run()
					{
						new PinkFrameWithSwing();
				    }
				 
	});

	}

}
