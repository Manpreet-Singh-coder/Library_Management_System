package Library;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Adminstart 
{
	static JFrame f=new JFrame("Library Management");
	JButton b1,b2;
	Adminstart()
	{
		b1=new JButton("Admin Login");
		b2=new JButton("Librarian Login");
		b1.setBounds(80,280,250,40);
		b2.setBounds(390,280,250,40);
		b1.setFont(new Font("FORTE",Font.BOLD,26));
		b2.setFont(new Font("FORTE",Font.BOLD,26));
		b1.setForeground(Color.black);
		b2.setForeground(Color.black);
		b1.setBackground(Color.green);
		b2.setBackground(Color.green);
		f.add(b1);f.add(b2);
		JLabel ll=new JLabel();
		ll.setIcon(new ImageIcon("\\c:\\books.jpg"));
		ll.setBounds(0,0,720,550);
		f.add(ll);
		f.setSize(720,550);
		f.setLayout(null);
		f.setVisible(true);
		f.setResizable(false);
		
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
		{
		   new Adminhome();
		   f.dispose();
		}
		});
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
		{
		   new Librarianhome();
		   f.dispose();
		}
		});
	}
	public static void main(String[] args) 
	{
		new Adminstart();
	}

}


