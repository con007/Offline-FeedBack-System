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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

import form.MyConnection;

public class FacultyUpdate extends JDialog implements ActionListener
{
	private JTextField tid;
	private JTextField tname;
	private JTextField tsalary;
	private JTextField tAdhar;
	private JButton tsubmit;
	private JButton tcancel;
	private ButtonGroup bg= new ButtonGroup();
	private JRadioButton m;
	private JRadioButton f;
	private JComboBox tcity;
    int id;
    private JTextField tDepartment;
    private JTextField tEmail;
    private JTextField tFname;
    private JTextField tMobile;
    private JTextField Designation;
    private JComboBox Salutation;
	public FacultyUpdate(int id)
	{
		this.id=id;
		setTitle("LoginScreen.........");
		getContentPane().setLayout(null);
		
		JLabel mnId = new JLabel("    I D");
		mnId.setFont(new Font("Times New Roman", Font.BOLD, 14));
		mnId.setBounds(10, 11, 51, 17);
		getContentPane().add(mnId);
		
		JLabel mnname = new JLabel("Name");
		mnname.setFont(new Font("Times New Roman", Font.BOLD, 14));
		mnname.setBounds(25, 51, 51, 17);
		getContentPane().add(mnname);
		
		JLabel mnsalary = new JLabel("Salary");
		mnsalary.setFont(new Font("Times New Roman", Font.BOLD, 14));
		mnsalary.setBounds(25, 467, 51, 17);
		getContentPane().add(mnsalary);
		
		JLabel Adhar = new JLabel("Adhar_No");
		Adhar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Adhar.setBounds(25, 527, 70, 17);
		getContentPane().add(Adhar);
		
		JLabel tgender = new JLabel("Gender");
		tgender.setFont(new Font("Times New Roman", Font.BOLD, 14));
		tgender.setBounds(25, 99, 51, 17);
		getContentPane().add(tgender);
		
		JLabel mncity = new JLabel("City");
		mncity.setFont(new Font("Times New Roman", Font.BOLD, 14));
		mncity.setBounds(25, 145, 51, 17);
		getContentPane().add(mncity);
		
		tid = new JTextField(String.valueOf(id));
		tid.setBackground(Color.WHITE);
		tid.setEditable(false);
		tid.setBounds(129, 10, 228, 20);
		getContentPane().add(tid);
		tid.setColumns(10);
		
		tname = new JTextField();
		tname.setBackground(Color.WHITE);
		tname.setEditable(false);
		tname.setColumns(10);
		tname.setBounds(178, 50, 179, 20);
		getContentPane().add(tname);
		
		tsalary = new JTextField();
		tsalary.setColumns(10);
		tsalary.setBounds(129, 466, 228, 20);
		getContentPane().add(tsalary);
		
		tAdhar = new JTextField();
		tAdhar.setColumns(10);
		tAdhar.setBounds(129, 526, 228, 20);
		getContentPane().add(tAdhar);
		
		m = new JRadioButton("MALE");
		m.setEnabled(false);
		m.setMnemonic('m');
		m.setFont(new Font("Times New Roman", Font.BOLD, 14));
		m.setForeground(Color.BLACK);
		m.setBounds(129, 96, 82, 23);
		getContentPane().add(m);
		m.addActionListener(this);
		
		f = new JRadioButton("FEMALE");
		f.setForeground(Color.BLACK);
		f.setEnabled(false);
		f.setMnemonic('f');
		f.setFont(new Font("Times New Roman", Font.BOLD, 14));
		f.setBounds(239, 96, 109, 23);
		getContentPane().add(f);
		f.addActionListener(this);
		bg.add(m);
		bg.add(f);
		
		tcity = new JComboBox();
		tcity.setFont(new Font("Times New Roman", Font.BOLD, 13));
		tcity.setModel(new DefaultComboBoxModel(new String[] {"SELECT CITY", "LUCKNOW", "DELHI", "MUMBAI", "BANGLORE", "NOIDA", "VELLORE", "KANPUR", "UNNAO", "RAIBAREILY", "BHOPAL", "INDORE", "GWALIOR"}));
		tcity.setBounds(129, 144, 228, 20);
		getContentPane().add(tcity);
		
		tsubmit = new JButton("Submit");
		tsubmit.setMnemonic('s');
		tsubmit.setBounds(47, 587, 89, 23);
		getContentPane().add(tsubmit);
		
		tcancel = new JButton("Cancel");
		tcancel.setMnemonic('c');
		tcancel.setBounds(222, 587, 89, 23);
		getContentPane().add(tcancel);
		tsubmit.addActionListener(this);
		tcancel.addActionListener(this);
		setSize(500,700);
		setLocationRelativeTo(null);
		getRootPane().setDefaultButton(tsubmit);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblDepartment.setBounds(25, 199, 82, 17);
		getContentPane().add(lblDepartment);
		
		tDepartment = new JTextField();
		tDepartment.setEditable(false);
		tDepartment.setColumns(10);
		tDepartment.setBackground(Color.WHITE);
		tDepartment.setBounds(129, 198, 228, 20);
		getContentPane().add(tDepartment);
		
		JLabel lblDepartment_1 = new JLabel("Mobile");
		lblDepartment_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblDepartment_1.setBounds(25, 301, 82, 17);
		getContentPane().add(lblDepartment_1);
		
		tMobile = new JTextField();
		tMobile.setColumns(10);
		tMobile.setBackground(Color.WHITE);
		tMobile.setBounds(129, 300, 228, 20);
		getContentPane().add(tMobile);
		
		JLabel lblEmail = new JLabel("E-Mail");
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblEmail.setBounds(25, 359, 82, 17);
		getContentPane().add(lblEmail);
		
		tEmail = new JTextField();
		tEmail.setColumns(10);
		tEmail.setBackground(Color.WHITE);
		tEmail.setBounds(129, 358, 228, 20);
		getContentPane().add(tEmail);
		
		JLabel lblEmail_1 = new JLabel("FName");
		lblEmail_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblEmail_1.setBounds(25, 411, 82, 17);
		getContentPane().add(lblEmail_1);
		
		tFname = new JTextField();
		tFname.setEditable(false);
		tFname.setColumns(10);
		tFname.setBackground(Color.WHITE);
		tFname.setBounds(129, 410, 228, 20);
		getContentPane().add(tFname);
		
		Salutation = new JComboBox();
		Salutation.setModel(new DefaultComboBoxModel(new String[] {"Prof.", "Dr.", "Mr."}));
		Salutation.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Salutation.setEditable(true);
		Salutation.setBounds(129, 50, 51, 20);
		getContentPane().add(Salutation);
		
		JLabel lblDesignation = new JLabel("Designation");
		lblDesignation.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblDesignation.setBounds(25, 250, 82, 17);
		getContentPane().add(lblDesignation);
		
		Designation = new JTextField();
		Designation.setColumns(10);
		Designation.setBackground(Color.WHITE);
		Designation.setBounds(129, 249, 228, 20);
		getContentPane().add(Designation);
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
			String city= tcity.getSelectedItem().toString();
			int salary= Integer.parseInt(tsalary.getText());
			String Adhar= tAdhar.getText();
			String salu=Salutation.getSelectedItem().toString();
			String Mob=tMobile.getText();
			
			String s= "update facultydetail set City=?, Salary=?, Adhar_No=?, Salutation=?, Mobile=? where FID=?";
			Connection con = MyConnection.connect1();
			try
			{
				PreparedStatement ps= con.prepareStatement(s);
		        ps.setString(1,city);
		        ps.setInt(2, salary);
		        ps.setString(3, Adhar);
		        ps.setString(4, salu);
		        ps.setString(5, Mob);
		        ps.setInt(6, id);
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
		String s= "select * from facultydetail where FID=?";
		Connection con= MyConnection.connect1();
		try
		{
			PreparedStatement ps= con.prepareStatement(s);
			ps.setInt(1, id);
			ResultSet rs= ps.executeQuery();
			while(rs.next())
			{
				Salutation.setSelectedItem(rs.getString("Salutation"));
				tname.setText(rs.getString("Name"));
				if(rs.getString("Gender").equals("Male")||rs.getString("Gender").equals("M"))
				{
					m.setSelected(true);
				}
				else
				{
					f.setSelected(true);
				}
				tcity.setSelectedItem(rs.getString("City"));
				tDepartment.setText(rs.getString("Department"));
				Designation.setText(rs.getString("Designation"));
				tMobile.setText(rs.getString("Mobile"));
				tEmail.setText(rs.getString("Email"));
				tFname.setText(String.valueOf("FName"));				
				tsalary.setText(String.valueOf(rs.getInt("Salary")));
				tAdhar.setText(rs.getString("Adhar_No"));
			}
			
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
}
