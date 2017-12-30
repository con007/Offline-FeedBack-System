package form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JPasswordField;

import student.StudentHome;

public class StudentLogin extends JDialog implements ActionListener
{
	private JTextField er;
	private JButton Submit;
	private JButton Cancel;
	private JPasswordField spass;

	public StudentLogin() 
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\hp\\Downloads\\Login.png"));
		setTitle("Stud... Login......");
		getContentPane().setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		getContentPane().setLayout(null);
		
		JLabel lblAdministratorLogin = new JLabel(" Student Login");
		lblAdministratorLogin.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblAdministratorLogin.setBounds(118, 11, 190, 42);
		getContentPane().add(lblAdministratorLogin);
		
		JLabel lblId = new JLabel("ER. NO.");
		lblId.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		lblId.setBounds(24, 85, 46, 14);
		getContentPane().add(lblId);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		lblPassword.setBounds(24, 135, 80, 14);
		getContentPane().add(lblPassword);
		
		er = new JTextField();
		er.setBounds(148, 82, 197, 20);
		getContentPane().add(er);
		er.setColumns(10);
		
		Submit = new JButton("SUBMIT");
		Submit.setMnemonic('S');
		Submit.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Submit.setBounds(83, 197, 89, 23);
		getContentPane().add(Submit);
		
		Cancel = new JButton("CANCEL");
		Cancel.setMnemonic('C');
		Cancel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cancel.setBounds(256, 197, 89, 23);
		getContentPane().add(Cancel);
		
		spass = new JPasswordField();
		spass.setBounds(148, 132, 197, 20);
		getContentPane().add(spass);
		Submit.addActionListener(this);
		Cancel.addActionListener(this);
		setSize(400,310);
		setModal(true);
		getRootPane().setDefaultButton(Submit);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) 
	{
		new StudentLogin();

	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object ob = e.getSource();
		if(ob==Cancel)
		{
			dispose();
		}
		else if(ob==Submit)
		{
			String id= er.getText();
			long pass = spass.getEchoChar();
			String s = "Select * from studentlogin where Er_No=? AND Password=?";
			Connection con = MyConnection.connect1();
			try
			{
				PreparedStatement ps = con.prepareStatement(s);
				ps.setString(1, er.getText());
				ps.setString(2, spass.getText());
				
				ResultSet rs=ps.executeQuery();
				int count=0;
				while(rs.next())
				{
					count+=1;
					
				}
				if(count==1)
				{
					new StudentHome(id);
					dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid Credentials");
				}
				rs.close();
				ps.close();
				
			}
			catch(SQLException se)
			{
				se.printStackTrace();
			}
		}

	}		
}
