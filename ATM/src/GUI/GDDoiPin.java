package GUI;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import DLL.KhachHangDLL;
import Emtity.KhachHang;

public class GDDoiPin extends JFrame implements ActionListener {
	KhachHangDLL dll = new KhachHangDLL();
	String stk;
	JLabel lbdpsopincu,lbdpsopinmoi;
	JTextField txtdpsopincu;
	JButton btOk,btback,btcancel;
	JPasswordField txtdpsopinmoi;
	Container con;
	JPanel panel1,panel2;
	
	
	
	public GDDoiPin(String stk){
		super("Giao Diện Đổi Pin");
		this.stk = stk;
		con= this.getContentPane();
		
		lbdpsopincu = new JLabel("Số Pin Cũ:");
		txtdpsopincu = new JTextField();
		lbdpsopinmoi = new JLabel("Số Pin Mới:");
		txtdpsopinmoi = new JPasswordField();
		panel1 = new JPanel();
		panel1.setLayout(new GridLayout(2,2));
		
		
		panel1.add(lbdpsopincu);
		panel1.add(txtdpsopincu);
		panel1.add(lbdpsopinmoi);
		panel1.add(txtdpsopinmoi);
		
		
		btOk = new JButton("OK");
		btcancel = new JButton("Cancel");
		btback = new JButton("Back");
		panel2 = new JPanel();
		panel2.add(btOk);
		panel2.add(btback);
		panel2.add(btcancel);
		
		
		con.add(panel1);
		con.add(panel2,"South");
		
		btOk.addActionListener(this);
		btcancel.addActionListener(this);
		btback.addActionListener(this);
		
		this.setSize(250,150);
		this.setLocation(500,300);
		
		
		
	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btback){
			SauKhiDangNhap bamnutbackdoipin = new SauKhiDangNhap(stk);
			bamnutbackdoipin.setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==btOk){
			KhachHang kh = new KhachHang();
			kh.setSoTaiKhoan(stk);
			if(dll.DoiPin(kh, txtdpsopinmoi.getText())){
				JOptionPane.showMessageDialog(this, "Bạn Đã Đổi Pin Thành Công ");
			}else {
				JOptionPane.showMessageDialog(this, "Bạn Đã Đổi Pin không Thành Công");
			}
			
		}

		
	}

}
