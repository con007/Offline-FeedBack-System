package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import form.MyConnection;

public class FacultyId
{
	JTable table;
	JScrollPane jsp;
	JDialog dialog;
	String []columns;
	String data[][];
	int cnt,c,r;
	int id;

	public FacultyId(int id)
	{
		this.id=id;
		String s = "select * from facultydetail where FID=?";
		Connection con = MyConnection.connect1();
		try
		{
			PreparedStatement ps = con.prepareStatement(s);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			rs.last();
			cnt=rs.getRow();
			rs.beforeFirst();
			columns = new String[]{"FID","Name","Department","Mobile","Email"};
			data = new String[cnt][5];
			while(rs.next())
			{
				data[r][c]=String.valueOf(rs.getInt("FID"));
				++c;
				data[r][c]=rs.getString("Name");
				++c;
				data[r][c]=rs.getString("Department");
				++c;
				data[r][c]=rs.getString("Mobile");
				++c;
				data[r][c]=rs.getString("Email");
				c=0;
				++r;
			}
			table=new JTable(data,columns);
			//table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			jsp= new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			dialog = new JDialog();
			dialog.setModal(true);
			dialog.setTitle("Tabular Display");
			dialog.setLayout(null);
			dialog.setSize(1000,1000);
			JButton back = new JButton("back");
			back.setBounds(10, 5, 80, 30);
			jsp.setBounds(10, 50, 300, 200);
			jsp.setSize(900, 900);
			
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					dialog.dispose();			
				}
			});
			dialog.add(back);
			dialog.add(jsp);
			dialog.setLocationRelativeTo(null);
			dialog.setVisible(true);
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}

			
	}


}
