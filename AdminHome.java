package Library;
import javax.swing.*;

import java.awt.Font.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionEvent.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionListener.*;
public class AdminHome 
{
	JFrame f;
	AdminHome()
	{
		f=new JFrame("Admin Home Page");
		JLabel l1,l2,l3;
		final JTextField a1;
		final JPasswordField a2;
		JButton b1,b2;
		l1=new JLabel("Admin Login Here");
		l1.setFont(new Font("Algerian",Font.BOLD,40));
		//l1.setForeground(Color.Green);
		l2=new JLabel("Username");
		l3=new JLabel("Password");
		l2.setFont(new Font("Algerian",Font.BOLD,29));
		l3.setFont(new Font("Algerian",Font.BOLD,29));
		l1.setBounds(100,150,450,90);
		l2.setBounds(100,250,200,30);
		l3.setBounds(100,320,200,30);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		a1=new JTextField();
		a2=new JPasswordField();
		a1.setBounds(270,250,210,30);
		a2.setBounds(270,320,210,30);
		f.add(a1);
		f.add(a2);
		b1=new JButton("Login");
		b2=new JButton("Back");
		b1.setForeground(Color.white);
		b2.setForeground(Color.white);
		b1.setBackground(Color.black);
		b2.setBackground(Color.black);
		b1.setFont(new Font ("Algerian",Font.BOLD,26));
		b2.setFont(new Font ("Algerian",Font.BOLD,26));
		b1.setBounds(150,400,150,50);
		b2.setBounds(320,400,150,50);
		f.add(b1);f.add(b2);
		JLabel ll=new JLabel();

		f.add(ll);
		f.setSize(700,700);
		f.setLayout(null);
		f.setVisible(true);
		//f.setResizable(false);
		//System.out.println("afasf");
		l1.setVisible(true);

		ll.setIcon(new ImageIcon("IMG_20200113_183124_718.jpg"));
		ll.setBounds(0,0,700,700);
		b1.addActionListener(new ActionListener()
		{		
			public void actionPerformed1(ActionEvent e)
		     {
				System.out.println("button clicked");

		    	 String user=a1.getText();
				String pw=a2.getText();
		    	 if(a1.getText().equals("")&& a2.getText().equals(""))
		    	 {
		    		 JOptionPane.showMessageDialog(null,"Enter thhe Username & Password");
		    	 }
		    	 else if(user.equals("Admin")&&pw.equals("27102000"))
		    	 {
		    		 JOptionPane.showMessageDialog(null,"Thank U");
		    		 //new Adminsection();
		    	 }
		    	 else
		    	 {
		    		 JOptionPane.showMessageDialog(null,"Enter the Correct Username & Password");
		    	 }
		         f.dispose();
			}

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}

		
		});
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
			    //new Adminstart();
				f.dispose();
			}
		});
	}
	public static void main(String[] args)
	{
		new AdminHome();
	}
}
	
