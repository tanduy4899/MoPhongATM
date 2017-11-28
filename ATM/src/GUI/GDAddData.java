package GUI;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GDAddData extends JFrame implements ActionListener {
	JTextField sotaikhoan,hoten,giotinh,tien;
	JLabel lbstk,lbhoten,lbgiotinh,lbtien;
	JPasswordField pin;
	JButton ok,cancel;
	JPanel panel1,panel2;
	Container con;
	public GDAddData() {
		con = this.getContentPane();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
