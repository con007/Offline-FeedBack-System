package Faculty;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import Update.FcultyUpdateId;
import View.FacultyId;

@SuppressWarnings("serial")
public class FacultyHome extends JDialog implements ActionListener
{
	private JMenuItem Detail;
	private JMenuItem Feedback;
	private JButton Update;
	int id;
	public FacultyHome(final int id)
	{
		this.id=id;
		getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 484, 21);
		getContentPane().add(menuBar);
		
		JMenu mnView = new JMenu("View");
		mnView.setBackground(Color.LIGHT_GRAY);
		mnView.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnView);
		
		Detail = new JMenuItem("Detail");
		Detail.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				new FacultyId(id);
			}
		});
		mnView.add(Detail);
		
		Feedback = new JMenuItem("Feedback");
		Feedback.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				
				
			}
		});
		mnView.add(Feedback);
		
		Update = new JButton(" Update");
		Update.setBackground(Color.WHITE);
		Update.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				new FcultyUpdateId(id);
			}
		});
		menuBar.add(Update);
		setLocationRelativeTo(null);
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) 
	{
		

	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		
	}
}
