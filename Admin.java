package form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import Update.FacultyUpdate;
import Update.StudentUpdate;
import View.FacultyAll;
import View.FacultyId;
import View.StudentAll;
import View.StudentId;

public class Admin implements ActionListener
{
	JFrame frame;
	JMenuItem UpdateDetail,UpdateDetail_1,Byid,All,Byid_1,All_1;
	
    public Admin() 
	{
    	frame = new JFrame("AdminHomePage");
    	frame.setTitle("Admin Home Page");
    	frame.setSize(500, 500);
    	
    	frame.getContentPane().setLayout(null);
    	
    	JMenuBar menuBar = new JMenuBar();
    	menuBar.setBounds(0, 0, 484, 21);
    	frame.getContentPane().add(menuBar);
    	
    	JMenu Faculty = new JMenu("Faculty");
    	menuBar.add(Faculty);
    	
    	UpdateDetail = new JMenuItem("Update Detail");
    	UpdateDetail.addActionListener(this);
    	Faculty.add(UpdateDetail);
    	
    	JMenu View = new JMenu("View");
    	Faculty.add(View);
    	
    	Byid = new JMenuItem("ById");
    	Byid.addActionListener(this);
    	View.add(Byid);
    	
    	All = new JMenuItem("All");
    	All.addActionListener(this);
    	View.add(All);
    	
    	JMenu Student = new JMenu("Student");
    	menuBar.add(Student);
    	
    	UpdateDetail_1 = new JMenuItem("Update Detail");
    	UpdateDetail_1.addActionListener(this);
    	Student.add(UpdateDetail_1);
    	
    	JMenu ViewDetail = new JMenu("View Detail");
    	Student.add(ViewDetail);
    	
    	Byid_1 = new JMenuItem("ById");
    	Byid_1.addActionListener(this);
    	ViewDetail.add(Byid_1);
    	
    	All_1 = new JMenuItem("All");
    	All_1.addActionListener(this);
    	ViewDetail.add(All_1);
    	
    	JMenu Feedback = new JMenu("Feedback");
    	menuBar.add(Feedback);
    	
    	JMenuItem Fid = new JMenuItem("By FId");
    	Fid.addActionListener(this);
    	Feedback.add(Fid);
    	
    	JMenuItem fAll = new JMenuItem("All");
    	fAll.addActionListener(this);
    	Feedback.add(fAll);
    	frame.setLocationRelativeTo(null);
    	frame.setVisible(true);
	}
    
	public static void main(String[] args)
	{
		new Admin();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object ob= e.getSource();
		if(ob==Byid)
		{
			String st = JOptionPane.showInputDialog(null,"Enter ID");
			int q = Integer.parseInt(st);
			new FacultyId(q);
		}
		else if(ob == All)
		{
			new FacultyAll();
		}
		else if(ob==Byid_1)
		{
			String er = JOptionPane.showInputDialog(null,"Enter Er. No.");
			new StudentId(er);
		}
		else if (ob==All_1)
		{
			new StudentAll();
		}
		else if(ob==UpdateDetail)
		{
			String id = JOptionPane.showInputDialog(null,"Enter FID");
			int q = Integer.parseInt(id);
			new FacultyUpdate(q);
		}
		else if(ob==UpdateDetail_1)
		{
			String id = JOptionPane.showInputDialog(null,"Enter Er. No.");
			new StudentUpdate(id);
		}
		
	}
}
