package form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;

public class Home_Page implements ActionListener
{
	JFrame frame;
	private JButton Student;
	private JButton Faculty;
	private JButton Admin;
	
	public Home_Page() 
	{
		frame = new JFrame("HOME PAGE");
		frame.setSize(frame.getMaximumSize());
		frame.getContentPane().setLayout(null);
		
		Admin = new JButton("ADMINISTRATOR");
		Admin.setMnemonic('a');
		Admin.setFont(new Font("Times New Roman", Font.BOLD, 27));
		Admin.setBounds(480, 42, 312, 78);
		Admin.addActionListener(this);
		frame.getContentPane().add(Admin);
		
		Faculty = new JButton("FACULTY");
		Faculty.setMnemonic('f');
		Faculty.setFont(new Font("Times New Roman", Font.BOLD, 27));
		Faculty.setBounds(150, 356, 312, 78);
		Faculty.addActionListener(this);
		frame.getContentPane().add(Faculty);
		
		Student = new JButton("STUDENT");
		Student.setMnemonic('s');
		Student.setFont(new Font("Times New Roman", Font.BOLD, 27));
		Student.setBounds(798, 356, 312, 78);
		Student.addActionListener(this);
		frame.getContentPane().add(Student);
		frame.setLocationRelativeTo(null);
	
		frame.setVisible(true);
	}

	public static void main(String[] args) 
	{
		new Home_Page();

	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object ob= e.getSource();
		if(ob==Admin)
		{
			new AdminLogin();
			frame.dispose();
		}
		else if(ob==Faculty)
		{
			new TeacherLogin();
			frame.dispose();
 		}
		else if(ob==Student)
		{
			new StudentLogin();
			frame.dispose();
		}
		
	}
}