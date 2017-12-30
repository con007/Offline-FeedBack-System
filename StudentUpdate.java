package Update;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import form.MyConnection;

public class StudentUpdate extends JDialog implements ActionListener
{
	private JTextField tid;
	private JTextField tname;
	private JTextField tFMobile;
	private JTextField tAdhar;
	private JButton tsubmit;
	private JButton tcancel;
	private ButtonGroup bg= new ButtonGroup();
	private JRadioButton m;
	private JRadioButton f;
    String id;
    private JTextField tBranch;
    private JTextField tEmail;
    private JTextField tFname;
    private JTextField tMobile;
    private JTextField course;
    private JTextField Address;
    private JLabel label;
    private JTextField FEmail;
    private JLabel lblSem;
    private JTextField Sem;
	public StudentUpdate(String id)
	{
		this.id=id;
		setTitle("LoginScreen.........");
		getContentPane().setLayout(null);
		
		JLabel mnId = new JLabel("Er_No");
		mnId.setFont(new Font("Times New Roman", Font.BOLD, 14));
		mnId.setBounds(25, 11, 51, 17);
		getContentPane().add(mnId);
		
		JLabel mnname = new JLabel("Name");
		mnname.setFont(new Font("Times New Roman", Font.BOLD, 14));
		mnname.setBounds(25, 51, 51, 17);
		getContentPane().add(mnname);
		
		JLabel mnsalary = new JLabel("FMobile");
		mnsalary.setFont(new Font("Times New Roman", Font.BOLD, 14));
		mnsalary.setBounds(25, 551, 51, 17);
		getContentPane().add(mnsalary);
		
		JLabel Adhar = new JLabel("Student Adhar_No");
		Adhar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Adhar.setBounds(25, 606, 124, 17);
		getContentPane().add(Adhar);
		
		JLabel tgender = new JLabel("Gender");
		tgender.setFont(new Font("Times New Roman", Font.BOLD, 14));
		tgender.setBounds(25, 99, 51, 17);
		getContentPane().add(tgender);
		
		JLabel mncity = new JLabel("Address");
		mncity.setFont(new Font("Times New Roman", Font.BOLD, 14));
		mncity.setBounds(25, 145, 51, 17);
		getContentPane().add(mncity);
		
		tid = new JTextField(String.valueOf(id));
		tid.setBackground(Color.WHITE);
		tid.setEditable(false);
		tid.setBounds(179, 10, 228, 20);
		getContentPane().add(tid);
		tid.setColumns(10);
		
		tname = new JTextField();
		tname.setBackground(Color.WHITE);
		tname.setEditable(false);
		tname.setColumns(10);
		tname.setBounds(179, 50, 228, 20);
		getContentPane().add(tname);
		
		tFMobile = new JTextField();
		tFMobile.setColumns(10);
		tFMobile.setBounds(179, 550, 228, 20);
		getContentPane().add(tFMobile);
		
		tAdhar = new JTextField();
		tAdhar.setColumns(10);
		tAdhar.setBounds(179, 605, 228, 20);
		getContentPane().add(tAdhar);
		
		m = new JRadioButton("MALE");
		m.setEnabled(false);
		m.setMnemonic('m');
		m.setFont(new Font("Times New Roman", Font.BOLD, 14));
		m.setForeground(Color.BLACK);
		m.setBounds(179, 96, 82, 23);
		getContentPane().add(m);
		m.addActionListener(this);
		
		f = new JRadioButton("FEMALE");
		f.setForeground(Color.BLACK);
		f.setEnabled(false);
		f.setMnemonic('f');
		f.setFont(new Font("Times New Roman", Font.BOLD, 14));
		f.setBounds(298, 96, 109, 23);
		getContentPane().add(f);
		f.addActionListener(this);
		bg.add(m);
		bg.add(f);
		
		tsubmit = new JButton("Submit");
		tsubmit.setMnemonic('s');
		tsubmit.setBounds(47, 680, 89, 23);
		getContentPane().add(tsubmit);
		
		tcancel = new JButton("Cancel");
		tcancel.setMnemonic('c');
		tcancel.setBounds(218, 680, 89, 23);
		getContentPane().add(tcancel);
		tsubmit.addActionListener(this);
		tcancel.addActionListener(this);
		setSize(600,1000);
		setLocationRelativeTo(null);
		getRootPane().setDefaultButton(tsubmit);
		
		JLabel lblDepartment = new JLabel("Branch");
		lblDepartment.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblDepartment.setBounds(25, 199, 82, 17);
		getContentPane().add(lblDepartment);
		
		tBranch = new JTextField();
		tBranch.setEditable(false);
		tBranch.setColumns(10);
		tBranch.setBackground(Color.WHITE);
		tBranch.setBounds(179, 198, 228, 20);
		getContentPane().add(tBranch);
		
		JLabel lblDepartment_1 = new JLabel("Mobile");
		lblDepartment_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblDepartment_1.setBounds(25, 353, 82, 17);
		getContentPane().add(lblDepartment_1);
		
		tMobile = new JTextField();
		tMobile.setColumns(10);
		tMobile.setBackground(Color.WHITE);
		tMobile.setBounds(179, 352, 228, 20);
		getContentPane().add(tMobile);
		
		JLabel lblEmail = new JLabel("E-Mail");
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblEmail.setBounds(25, 404, 82, 17);
		getContentPane().add(lblEmail);
		
		tEmail = new JTextField();
		tEmail.setColumns(10);
		tEmail.setBackground(Color.WHITE);
		tEmail.setBounds(179, 403, 228, 20);
		getContentPane().add(tEmail);
		
		JLabel lblEmail_1 = new JLabel("FName");
		lblEmail_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblEmail_1.setBounds(25, 460, 82, 17);
		getContentPane().add(lblEmail_1);
		
		tFname = new JTextField();
		tFname.setEditable(false);
		tFname.setColumns(10);
		tFname.setBackground(Color.WHITE);
		tFname.setBounds(179, 459, 228, 20);
		getContentPane().add(tFname);
		
		JLabel lblDesignation = new JLabel("Course");
		lblDesignation.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblDesignation.setBounds(25, 250, 82, 17);
		getContentPane().add(lblDesignation);
		
		course = new JTextField();
		course.setColumns(10);
		course.setBackground(Color.WHITE);
		course.setBounds(179, 249, 228, 20);
		getContentPane().add(course);
		
		Address = new JTextField();
		Address.setBounds(179, 144, 228, 20);
		getContentPane().add(Address);
		Address.setColumns(10);
		
		label = new JLabel("FEmail");
		label.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label.setBounds(25, 505, 51, 17);
		getContentPane().add(label);
		
		FEmail = new JTextField();
		FEmail.setColumns(10);
		FEmail.setBounds(179, 504, 228, 20);
		getContentPane().add(FEmail);
		
		lblSem = new JLabel("Sem");
		lblSem.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblSem.setBounds(25, 301, 82, 17);
		getContentPane().add(lblSem);
		
		Sem = new JTextField();
		Sem.setColumns(10);
		Sem.setBackground(Color.WHITE);
		Sem.setBounds(179, 300, 228, 20);
		getContentPane().add(Sem);
		getInfo();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object ob = e.getSource();
		if(ob==tcancel)
		{
			dispose();
		}
		if(ob==tsubmit)
		{
			String city= Address.getText();

			String Adhar= tAdhar.getText();
			String email=tEmail.getText();
			String Mob=tMobile.getText();
			
			String s= "update stacademicdetail set Address=?, Adhar_No=?, EMail=?, Mobile=? where Er_No=?";
			Connection con = MyConnection.connect1();
			try
			{
				PreparedStatement ps= con.prepareStatement(s);
		        ps.setString(1,city);
		        ps.setString(2, Adhar);
		        ps.setString(3, email);
		        ps.setString(4, Mob);
		        ps.setString(5, id);
		        ps.executeUpdate();
		        JOptionPane.showMessageDialog(null, "Updated");
		        dispose();
			}
			catch(SQLException se)
			{
				se.printStackTrace();
			}
		}
	}
	void getInfo()
	{
		String s= "select * from stacademicdetail where Er_No=?";
		Connection con= MyConnection.connect1();
		try
		{
			PreparedStatement ps= con.prepareStatement(s);
			ps.setString(1, id);
			ResultSet rs= ps.executeQuery();
			while(rs.next())
			{
				tname.setText(rs.getString("Name"));
				if(rs.getString("Gender").equals("Male")||rs.getString("Gender").equals("M"))
				{
					m.setSelected(true);
				}
				else
				{
					f.setSelected(true);
				}
				Address.setText(rs.getString("Address"));
				tBranch.setText(rs.getString("Branch"));
				course.setText(rs.getString("Course"));
				Sem.setText(rs.getString("Semester"));
				tMobile.setText(rs.getString("Mobile"));
				tEmail.setText(rs.getString("EMail"));
				tFname.setText(rs.getString("F_Name"));	
				FEmail.setText(rs.getString("PEmail"));
				tFMobile.setText(rs.getString("PMobile"));
				tAdhar.setText(rs.getString("Adhar_No"));
			}
			
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
}
