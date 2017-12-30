package form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

public class Studentpage extends JDialog implements ActionListener
{

	public Studentpage() 
	{
		setTitle("Student.......Page......");
		getContentPane().setLayout(null);
		
		
		
		setSize(getMaximumSize());
		setVisible(true);
	}

	public static void main(String[] args)
	{
		new Studentpage();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
				
	}
}
