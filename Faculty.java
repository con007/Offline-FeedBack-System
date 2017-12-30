package form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

public class Faculty extends JDialog implements ActionListener
{

	public Faculty()
	{
		setTitle("Faculty");
		getContentPane().setLayout(null);
		
		
		setSize(getMaximumSize());
		setVisible(true);
	}

	public static void main(String[] args)
	{
		new Faculty();

	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
	}
}
