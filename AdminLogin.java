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

public class AdminLogin extends JDialog implements ActionListener
{
	private JTextField aid;
	private JButton Submit;
	private JButton Cancel;
	private JPasswordField apass;

	public AdminLogin() 
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\hp\\Downloads\\Login.png"));
		setTitle("Admin... Login......");
		getContentPane().setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		getContentPane().setLayout(null);
		
		JLabel lblAdministratorLogin = new JLabel(" Administrator Login");
		lblAdministratorLogin.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblAdministratorLogin.setBounds(101, 11, 190, 42);
		getContentPane().add(lblAdministratorLogin);
		
		JLabel lblId = new JLabel("  ID");
		lblId.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		lblId.setBounds(24, 85, 46, 14);
		getContentPane().add(lblId);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		lblPassword.setBounds(24, 135, 80, 14);
		getContentPane().add(lblPassword);
		
		aid = new JTextField();
		aid.setBounds(148, 82, 197, 20);
		getContentPane().add(aid);
		aid.setColumns(10);
		
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
		
		apass = new JPasswordField();
		apass.setBounds(148, 132, 197, 20);
		getContentPane().add(apass);
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
		new AdminLogin();

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object ob = e.getSource();
		if(ob==Cancel)
		{
			dispose();
		}
		if(ob==Submit)
		{
			int id= Integer.parseInt(aid.getText());
			long pass = apass.getEchoChar();
			String s = "select * from adminlogin where ID=? AND Password=?";
			Connection con = MyConnection.connect1();
			try
			{
				PreparedStatement ps = con.prepareStatement(s);
				ps.setString(1, aid.getText());
				ps.setString(2, apass.getText());
				
				ResultSet rs=ps.executeQuery();
				int count=0;
				while(rs.next())
				{
					count+=1;
					
				}
				if(count==1)
				{
					new Admin();
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

 