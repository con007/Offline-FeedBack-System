package student;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollBar;

import java.awt.Dimension;
import java.awt.Cursor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JComboBox;

import form.MyConnection;

public class feedback extends JDialog implements ActionListener,ItemListener
{
	private JTextField textField;
	private JTextField txtExcellent;
	private JTextField txtVeryGood;
	private JTextField txtGood;
	private JTextField txtSatisfied;
	private JTextField txtUnstatisfied;
	private JTextField txtSrno;
	
	private TextField textField_2;
	private TextField textField_3;
	private TextField textField_4;
	private TextField textField_5;
	private TextField textField_6;
	private TextField textField_7;
	private TextField textField_8;
	private TextField textField_9;
	private TextField textField_10;
	private TextField textField_11;
	private TextField textField_12;
	private TextField textField_13;
	private TextField textField_14;
	private TextField textField_15;
	private TextField textField_16;
	private TextField textField_17;
	private TextField textField_18;
	private TextField textField_19;
	private TextField textField_20;
	private TextField textField_21;
	private Label label_1;
	private Label label_2;
	private JProgressBar pp;
	private JProgressBar np;
	private JRadioButton a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,s,t,u,v,w,x,a1,a2,a3,a4,a5,a6,b1,b2,b3,b4,b5,b6,c1,d1,e1;
	private JRadioButton y;
	private JRadioButton r;
	private JScrollPane jsp;
	String sem;
	private JTextField sem1;
	private Button submit;
	private JComboBox cb;
	private JLabel lblSubject;
	private JTextField scode;

	public feedback(String sem)
	{
		this.sem=sem;
		getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
		getContentPane().setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		setTitle("Feedback Form");
		setSize(900,900);
		getContentPane().setLayout(null);
		
		JRadioButton b1 = new JRadioButton("");
		b1.setBounds(528, 242, 21, 14);
		getContentPane().add(b1);
		
		Label label = new Label(" COMMENT");
		label.setBounds(9, 331, 95, 22);
		getContentPane().add(label);
		
		q = new JRadioButton("");
		q.setBounds(649, 194, 21, 14);
		q.addItemListener(this);
		getContentPane().add(q);
		
		a6 = new JRadioButton("");
		a6.setBounds(723, 268, 21, 14);
		a6.addItemListener(this);
		getContentPane().add(a6);
		
		w = new JRadioButton("");
		w.setBounds(587, 218, 21, 14);
		w.addItemListener(this);
		getContentPane().add(w);
		
		c1 = new JRadioButton("");
		c1.setBounds(587, 242, 21, 14);
		c1.addItemListener(this);
		getContentPane().add(c1);
		
		a4 = new JRadioButton("");
		a4.setBounds(587, 268, 21, 14);
		a4.addItemListener(this);
		getContentPane().add(a4);
		
		b4 = new JRadioButton("");
		b4.setBounds(587, 294, 21, 14);
		b4.addItemListener(this);
		getContentPane().add(b4);
		
		x = new JRadioButton("");
		x.setBounds(649, 218, 21, 14);
		x.addItemListener(this);
		getContentPane().add(x);
		
		d1 = new JRadioButton("");
		d1.setBounds(649, 242, 21, 14);
		d1.addItemListener(this);
		getContentPane().add(d1);
		
		a5 = new JRadioButton("");
		a5.setBounds(649, 268, 21, 14);
		a5.addItemListener(this);
		getContentPane().add(a5);
		
		b5 = new JRadioButton("");
		b5.setBounds(649, 294, 21, 14);
		b5.addItemListener(this);
		getContentPane().add(b5);
		
		i = new JRadioButton("");
		i.setBounds(528, 143, 21, 14);
		i.addItemListener(this);
		getContentPane().add(i);
		
		p = new JRadioButton("");
		p.setBounds(723, 194, 21, 14);
		p.addItemListener(this);
		getContentPane().add(p);
		
		b6 = new JRadioButton("");
		b6.setBounds(723, 294, 21, 14);
		b6.addItemListener(this);
		getContentPane().add(b6);
		
		y = new JRadioButton("");
		y.setBounds(723, 218, 21, 14);
		y.addItemListener(this);
		getContentPane().add(y);
		
		e1 = new JRadioButton("");
		e1.setBounds(723, 242, 21, 14);
		e1.addItemListener(this);
		getContentPane().add(e1);
		
		s = new JRadioButton("");
		s.setBounds(528, 194, 21, 14);
		s.addItemListener(this);
		getContentPane().add(s);
		
		v = new JRadioButton("");
		v.setBounds(528, 218, 21, 14);
		v.addItemListener(this);
		getContentPane().add(v);
		
		a3 = new JRadioButton("");
		a3.setBounds(528, 268, 21, 14);
		a3.addItemListener(this);
		getContentPane().add(a3);
		
		b3 = new JRadioButton("");
		b3.setBounds(528, 294, 21, 14);
		b3.addItemListener(this);
		getContentPane().add(b3);
		
		l = new JRadioButton("");
		l.setBounds(528, 168, 21, 14);
		l.addItemListener(this);
		getContentPane().add(l);
		
		m = new JRadioButton("");
		m.setBounds(587, 168, 21, 14);
		m.addItemListener(this);
		getContentPane().add(m);
		
		n = new JRadioButton("");
		n.setBounds(649, 168, 21, 14);
		n.addItemListener(this);
		getContentPane().add(n);
		
		o = new JRadioButton("");
		o.setBounds(723, 168, 21, 14);
		o.addItemListener(this);
		getContentPane().add(o);
		
		f = new JRadioButton("");
		f.setBounds(723, 143, 21, 14);
		f.addItemListener(this);
		getContentPane().add(f);
		
		g = new JRadioButton("");
		g.setBounds(649, 143, 21, 14);
		g.addItemListener(this);
		getContentPane().add(g);
		
		h = new JRadioButton("");
		h.setBounds(587, 143, 21, 14);
		h.addItemListener(this);
		getContentPane().add(h);
		
		c = new JRadioButton("");
		c.setBounds(587, 117, 21, 14);
		c.addItemListener(this);
		getContentPane().add(c);
		
		
		
		d = new JRadioButton("");
		d.setBounds(649, 117, 21, 14);
		d.addItemListener(this);
		getContentPane().add(d);
		
		e = new JRadioButton("");
		e.setBounds(723, 117, 21, 14);
		e.addItemListener(this);
		getContentPane().add(e);
		
		b = new JRadioButton("");
		b.setBounds(528, 117, 21, 14);
		b.addItemListener(this);
		getContentPane().add(b);
		
		b2 = new JRadioButton("");
		b2.setBounds(461, 294, 21, 14);
		b2.addItemListener(this);
		getContentPane().add(b2);
		
		a2 = new JRadioButton("");
		a2.setBounds(461, 268, 21, 14);
		a2.addItemListener(this);
		getContentPane().add(a2);
		
		a1 = new JRadioButton("");
		a1.setBounds(461, 242, 21, 14);
		a1.addItemListener(this);
		getContentPane().add(a1);
		
		u = new JRadioButton("");
		u.setBounds(461, 218, 21, 14);
		u.addItemListener(this);
		getContentPane().add(u);
		
		t = new JRadioButton("");
		t.setBounds(461, 194, 21, 14);
		t.addItemListener(this);
		getContentPane().add(t);
		
		k = new JRadioButton("");
		k.setBounds(461, 168, 21, 14);
		k.addItemListener(this);
		getContentPane().add(k);
		
		j = new JRadioButton("");
		j.setBounds(461, 143, 21, 14);
		j.addItemListener(this);
		getContentPane().add(j);
		
		JRadioButton a = new JRadioButton("");
		a.setBounds(461, 117, 21, 14);
		a.addItemListener(this);
		getContentPane().add(a);
		
		JLabel lblQuestions = new JLabel(" QUESTIONS");
		lblQuestions.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblQuestions.setForeground(Color.BLACK);
		lblQuestions.setBackground(Color.WHITE);
		lblQuestions.setBounds(205, 93, 112, 14);
		getContentPane().add(lblQuestions);
		
		textField = new JTextField();
		textField.setBounds(113, 91, 318, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		txtExcellent = new JTextField();
		txtExcellent.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		txtExcellent.setText("Excellent");
		txtExcellent.setBounds(427, 91, 70, 20);
		getContentPane().add(txtExcellent);
		txtExcellent.setColumns(10);
		
		txtVeryGood = new JTextField();
		txtVeryGood.setText("Very Good");
		txtVeryGood.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		txtVeryGood.setColumns(10);
		txtVeryGood.setBounds(497, 91, 70, 20);
		getContentPane().add(txtVeryGood);
		
		txtGood = new JTextField();
		txtGood.setText("Good");
		txtGood.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		txtGood.setColumns(10);
		txtGood.setBounds(567, 90, 53, 20);
		getContentPane().add(txtGood);
		
		txtSatisfied = new JTextField();
		txtSatisfied.setText("Satisfied");
		txtSatisfied.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		txtSatisfied.setColumns(10);
		txtSatisfied.setBounds(619, 90, 70, 20);
		getContentPane().add(txtSatisfied);
		
		txtUnstatisfied = new JTextField();
		txtUnstatisfied.setText("Unstatisfied");
		txtUnstatisfied.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		txtUnstatisfied.setColumns(10);
		txtUnstatisfied.setBounds(688, 90, 81, 20);
		getContentPane().add(txtUnstatisfied);
		
		txtSrno = new JTextField();
		txtSrno.setText("Sr.No.");
		txtSrno.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		txtSrno.setColumns(10);
		txtSrno.setBounds(66, 92, 46, 20);
		getContentPane().add(txtSrno);
		
		TextField textField_1 = new TextField();
		textField_1.setBounds(431, 111, 66, 204);
		getContentPane().add(textField_1);
		
		textField_4 = new TextField();
		textField_4.setBounds(619, 110, 70, 204);
		getContentPane().add(textField_4);
		
		textField_6 = new TextField();
		textField_6.setText("      1");
		textField_6.setBounds(66, 109, 46, 30);
		getContentPane().add(textField_6);
		
		textField_7 = new TextField();
		textField_7.setText("      2");
		textField_7.setBounds(66, 136, 46, 30);
		getContentPane().add(textField_7);
		
		textField_8 = new TextField();
		textField_8.setText("      3");
		textField_8.setBounds(66, 162, 46, 26);
		getContentPane().add(textField_8);
		
		textField_9 = new TextField();
		textField_9.setText("      4");
		textField_9.setBounds(66, 188, 46, 24);
		getContentPane().add(textField_9);
		
		textField_10 = new TextField();
		textField_10.setText("      5");
		textField_10.setBounds(66, 212, 46, 24);
		getContentPane().add(textField_10);
		
		textField_11 = new TextField();
		textField_11.setText("      6");
		textField_11.setBounds(66, 234, 46, 28);
		getContentPane().add(textField_11);
		
		textField_12 = new TextField();
		textField_12.setText("      8");
		textField_12.setBounds(66, 285, 46, 30);
		getContentPane().add(textField_12);
		
		textField_13 = new TextField();
		textField_13.setText("      7");
		textField_13.setBounds(66, 262, 46, 24);
		getContentPane().add(textField_13);
		
		textField_14 = new TextField();
		textField_14.setBackground(Color.WHITE);
		textField_14.setText("Coverage of the syllabus");
		textField_14.setEditable(false);
		textField_14.setBounds(113, 111, 318, 26);
		getContentPane().add(textField_14);
		
		textField_15 = new TextField();
		textField_15.setBackground(Color.WHITE);
		textField_15.setEditable(false);
		textField_15.setText("Clarity of expression");
		textField_15.setBounds(113, 137, 318, 26);
		getContentPane().add(textField_15);
		
		textField_16 = new TextField();
		textField_16.setBackground(Color.WHITE);
		textField_16.setEditable(false);
		textField_16.setText("Overall rating of the Course");
		textField_16.setBounds(113, 162, 318, 26);
		getContentPane().add(textField_16);
		
		textField_17 = new TextField();
		textField_17.setBackground(Color.WHITE);
		textField_17.setEditable(false);
		textField_17.setText("Usefulness of subject in your career");
		textField_17.setBounds(113, 188, 318, 26);
		getContentPane().add(textField_17);
		
		textField_18 = new TextField();
		textField_18.setBackground(Color.WHITE);
		textField_18.setEditable(false);
		textField_18.setText("Level of interaction");
		textField_18.setBounds(113, 212, 318, 26);
		getContentPane().add(textField_18);
		
		textField_19 = new TextField();
		textField_19.setBackground(Color.WHITE);
		textField_19.setEditable(false);
		textField_19.setText("Level of Assignments and Lectures");
		textField_19.setBounds(113, 236, 318, 26);
		getContentPane().add(textField_19);
		
		textField_20 = new TextField();
		textField_20.setBackground(Color.WHITE);
		textField_20.setEditable(false);
		textField_20.setText("Punctuality Behaviour");
		textField_20.setBounds(113, 260, 318, 26);
		getContentPane().add(textField_20);
		
		textField_21 = new TextField();
		textField_21.setBackground(Color.WHITE);
		textField_21.setEditable(false);
		textField_21.setText("What benefit you derived from the course?");
		textField_21.setBounds(113, 286, 318, 26);
		getContentPane().add(textField_21);
		
		textField_5 = new TextField();
		textField_5.setBounds(688, 110, 81, 204);
		getContentPane().add(textField_5);
		
		textField_2 = new TextField();
		textField_2.setBounds(497, 111, 70, 204);
		getContentPane().add(textField_2);
		
		label_1 = new Label("POSITIVE");
		label_1.setBounds(147, 362, 81, 22);
		getContentPane().add(label_1);
		
		label_2 = new Label("NEGATIVE");
		label_2.setBounds(590, 369, 81, 22);
		getContentPane().add(label_2);
		
		pp = new JProgressBar();
		pp.setBounds(10, 546, 385, 26);
		getContentPane().add(pp);
		
		np = new JProgressBar();
		np.setBounds(446, 547, 385, 26);
		getContentPane().add(np);
		
		submit = new Button("SUBMIT");
		submit.setBounds(234, 631, 70, 22);
		submit.addActionListener(this);
		getContentPane().add(submit);
		
		Button cancel = new Button("CANCEL");
		cancel.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
		cancel.setBounds(543, 632, 70, 22);
		 
		getContentPane().add(cancel);
		
		r = new JRadioButton("");
		r.setBounds(587, 194, 21, 16);
		getContentPane().add(r);
		
		textField_3 = new TextField();
		textField_3.setBounds(567, 110, 53, 204);
		getContentPane().add(textField_3);
		ButtonGroup bg1 = new ButtonGroup();
		ButtonGroup bg2 = new ButtonGroup();
		ButtonGroup bg3 = new ButtonGroup();
		ButtonGroup bg4 = new ButtonGroup();
		ButtonGroup bg5 = new ButtonGroup();
		ButtonGroup bg6 = new ButtonGroup();
		ButtonGroup bg7 = new ButtonGroup();
		ButtonGroup bg8 = new ButtonGroup();
		bg1.add(a);
		bg1.add(b);
		bg1.add(c);
		bg1.add(d);
		bg1.add(e);
		bg2.add(f);
		bg2.add(g);
		bg2.add(h);
		bg2.add(i);
		bg2.add(j);
		bg3.add(k);
		bg3.add(l);
		bg3.add(m);
		bg3.add(n);
		bg3.add(o);
		bg4.add(p);
		bg4.add(q);
		bg4.add(r);
		bg4.add(s);
		bg4.add(t);
		bg5.add(u);
		bg5.add(v);
		bg5.add(w);
		bg5.add(x);
		bg5.add(y);
		bg6.add(a1);
		bg6.add(b1);
		bg6.add(c1);
		bg6.add(d1);
		bg6.add(e1);
		bg7.add(a2);
		bg7.add(a3);
		bg7.add(a4);
		bg7.add(a5);
		bg7.add(a6);
		bg8.add(b2);
		bg8.add(b3);
		bg8.add(b4);
		bg8.add(b5);
		bg8.add(b6);
		jsp= new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		jsp.setBounds(444, 428, 385, 112);
		getContentPane().add(jsp);
		
		JTextArea negative = new JTextArea();
		jsp.setViewportView(negative);
		negative.setLineWrap(true);
		
		JTextArea positive = new JTextArea();
		positive.setDragEnabled(true);
		positive.setLineWrap(true);
		positive.setBounds(10, 346, 385, 112);
		jsp= new JScrollPane(positive, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		jsp.setBounds(10,428,385,112);
		getContentPane().add(jsp);
		
		JLabel lblFaculty = new JLabel("Faculty");
		lblFaculty.setBounds(214, 7, 46, 14);
		getContentPane().add(lblFaculty);
		
		JLabel Semester = new JLabel(" Semester");
		Semester.setBounds(25, 6, 53, 14);
		getContentPane().add(Semester);
		
		cb = new JComboBox();
		cb.setBounds(265, 3, 210, 20);
		getContentPane().add(cb);
		
		sem1 = new JTextField();
		sem1.setBackground(Color.WHITE);
		sem1.setEditable(false);
		sem1.setBounds(85, 2, 53, 20);
		sem1.setText(sem);
		getContentPane().add(sem1);
		sem1.setColumns(10);
		
		lblSubject = new JLabel("Subject");
		lblSubject.setBounds(539, 4, 46, 14);
		getContentPane().add(lblSubject);
		
		JComboBox subject = new JComboBox();
		subject.setBounds(592, 4, 177, 20);
		getContentPane().add(subject);
		
		JLabel lblSubjectCode = new JLabel("Subject code");
		lblSubjectCode.setBounds(515, 46, 70, 14);
		getContentPane().add(lblSubjectCode);
		
		scode = new JTextField();
		scode.setBounds(592, 43, 177, 20);
		getContentPane().add(scode);
		scode.setColumns(10);
		
		setModal(true);
		getNames();
		setVisible(true);
	}

	public static void main(String[] args) 
	{
	
		new feedback("1");

	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		Object ob = e.getSource();
		if(ob==submit)
		{
			
			   
       }
	}
	void getNames()
	{
		String s = "select fname,fid,subject,subject_code from sem where semester=?";
		Connection con = MyConnection.connect1();
		try
		{
			PreparedStatement ps = con.prepareStatement(s);
			ps.setString(1, sem);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				cb.addItem(rs.getString("fname"));
			}
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}
}