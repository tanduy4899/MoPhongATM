package GUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import DAL.KhachHangDAL;
import DLL.KhachHangDLL;
import Emtity.KhachHang;

public class GDNhapSoTienKhac extends JFrame implements ActionListener{
	KhachHangDLL dll = new KhachHangDLL();
	
	JLabel lbmoinhap,lbsotien;
	JTextField txttiennhap;
	JButton ok,giaodichkhacruttien;
	JPanel panel1,panel3,panel2;
	Container con;
	String stk;
	public GDNhapSoTienKhac(String stk) {
		super("Giao Diện Nhập Số Tiền Khác");
		con = this.getContentPane();
		this.stk = stk;
		
		lbmoinhap = new JLabel("Mời Bạn Nhập Số Tiền");
		panel1 =new JPanel();
		panel1.add(lbmoinhap);
		
		lbsotien = new JLabel("nhập số tiền:");
		txttiennhap = new JTextField();
		
		panel2 = new JPanel();
		panel2.setLayout(new GridLayout(1,2));
		panel2.add(lbsotien);
		panel2.add(txttiennhap);
		
		ok = new JButton("ĐỒNG Ý");
		giaodichkhacruttien = new JButton("GIAO DỊCH KHÁC");
		
		panel3 = new JPanel();
		panel3.add(ok);
		panel3.add(giaodichkhacruttien);
		
		con.add(panel1, "North");
		con.add(panel2);
		con.add(panel3,"South");
		
		
		ok.addActionListener(this);
		giaodichkhacruttien.addActionListener(this);
		
		this.setSize(250,150);
		this.setLocation(400, 200);
		this.setResizable(false);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == ok){
			KhachHang kh = new KhachHang();
			
			kh.setSoTaiKhoan(stk);
			if(dll.NhapSoTien(kh, Float.parseFloat(txttiennhap.getText()))){
				JOptionPane.showMessageDialog(this, "Bạn Đã Rút Tiền Thành Công ");
			}else {
				JOptionPane.showMessageDialog(this, "Rút Tiền Không Thành Công");
			}
		}
		else if(e.getSource()==giaodichkhacruttien){
			GDRutTien bamnutgiaodichkhac = new GDRutTien(stk);
			bamnutgiaodichkhac.setVisible(true);
			this.dispose();
		}
	}
	
}
