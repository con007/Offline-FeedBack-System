package student;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import Update.StudentUpdateId;
import View.StudentId;

public class StudentHome extends JDialog implements ActionListener
{
	private JMenuItem Detail;
	private JMenuItem Feedback;
	private JButton Update;
	String er;
	public StudentHome(final String er)
	{
		this.er=er;
		getContentPane().setLayout(null);
		setSize(700, 700);
		
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
				new StudentId(er);
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
				new StudentUpdateId(er);
			}
		});
		menuBar.add(Update);
		
		JButton feed = new JButton("FEEDBACK");
		feed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String semester = JOptionPane.showInputDialog(null,"Enter Semester");
				new feedback(semester);
			}
		});
		feed.setToolTipText("Click Here to give Feedback");
		feed.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		feed.setBounds(178, 125, 152, 49);
		getContentPane().add(feed);
		setModal(true);
		setVisible(true);
	}

	public static void main(String[] args) 
	{
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
