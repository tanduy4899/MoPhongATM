package GUI;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import DLL.KhachHangDLL;
import Emtity.KhachHang;

public class GDRutTien extends JFrame implements ActionListener {
	KhachHangDLL dll = new KhachHangDLL();
	
	
	
	JButton bt1tram, bt5tram, bt1trieu, bt2trieu, bt3trieu, bt5trieu, btnhapsokhac, btgiaodichkhac;
	JLabel lbsaudangnhap;
	GridBagLayout gb;
	Container con;
	GridBagConstraints gbc = new GridBagConstraints();
	String stk;
	public GDRutTien(String stk ) {
		super("Giao Diện Rút Tiền");
		this.stk = stk;
		gb = new GridBagLayout();
		con = this.getContentPane();
		con.setLayout(new GridBagLayout());
		con.setLayout(gb);

		bt1tram = new JButton("100.00");
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = 0;
		gbc.ipadx = 41;
		gbc.ipady = 40;
		gbc.anchor = GridBagConstraints.NORTHWEST;
		con.add(bt1tram, gbc);

		bt1trieu = new JButton("1.000.000");
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.gridwidth = 0;
		gbc.ipadx = 24;
		gbc.ipady = 45;
		gbc.anchor = GridBagConstraints.NORTHWEST;
		add(bt1trieu, gbc);

		bt2trieu = new JButton("2.000.000");
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.gridwidth = 0;
		gbc.ipadx = 24;
		gbc.ipady = 45;
		gbc.anchor = GridBagConstraints.NORTHWEST;
		add(bt2trieu, gbc);

		btnhapsokhac = new JButton("Nhập Số Khác");
		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.gridwidth = 0;
		gbc.ipadx = 0;
		gbc.ipady = 45;
		gbc.anchor = GridBagConstraints.NORTHWEST;
		add(btnhapsokhac, gbc);

		lbsaudangnhap = new JLabel();
		lbsaudangnhap.setText("Mời Bạn Chọn Số Tiền");
		gbc.gridx = 2;
		gbc.gridy = 2;
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.gridheight = 0;
		gbc.gridwidth = 0;
		con.add(lbsaudangnhap, gbc);

		bt5tram = new JButton("500.000");
		gbc.gridx = 3;
		gbc.gridy = 0;
		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.gridwidth = 0;
		gbc.gridheight = 0;
		gbc.ipadx = 41;
		gbc.ipady = 40;
		gbc.anchor = GridBagConstraints.NORTHEAST;
		add(bt5tram, gbc);

		bt3trieu = new JButton("3.000.000");
		gbc.gridx = 3;
		gbc.gridy = 2;
		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.gridwidth = 0;
		gbc.gridheight = 0;
		gbc.ipadx = 31;
		gbc.ipady = 45;
		gbc.anchor = GridBagConstraints.NORTHEAST;
		add(bt3trieu, gbc);

		bt5trieu = new JButton("5.000.000");
		gbc.gridx = 3;
		gbc.gridy = 3;
		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.gridwidth = 0;
		gbc.gridheight = 0;
		gbc.ipadx =31;
		gbc.ipady = 45;
		gbc.anchor = GridBagConstraints.NORTHEAST;
		add(bt5trieu, gbc);

		btgiaodichkhac = new JButton("Giao Dich Khac");
		gbc.gridx = 3;
		gbc.gridy = 4;
		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.gridwidth = 0;
		gbc.gridheight = 0;
		gbc.ipadx = 1;
		gbc.ipady = 45;
		gbc.anchor = GridBagConstraints.NORTHEAST;
		add(btgiaodichkhac, gbc);

		bt1tram.addActionListener(this);
		bt5tram.addActionListener(this);
		bt1trieu.addActionListener(this);
		bt2trieu.addActionListener(this);
		bt3trieu.addActionListener(this);
		bt5trieu.addActionListener(this);
		btnhapsokhac.addActionListener(this);
		btgiaodichkhac.addActionListener(this);
		
		
		

		this.setSize(400, 305);
		this.setLocation(400, 200);
		this.setResizable(false);
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btgiaodichkhac){
			SauKhiDangNhap bamnutgiaodichkhac = new SauKhiDangNhap(stk);
			bamnutgiaodichkhac.setVisible(true);
			this.setVisible(false);
		}else if(e.getSource()==bt1tram){
			KhachHang kh = new KhachHang();
			kh.setSoTaiKhoan(stk);
			if(dll.RutTien(kh,100000)){
				JOptionPane.showMessageDialog(this, "Bạn Đã Rút Thành Công 100.000 nghìn");
			}else {
				JOptionPane.showMessageDialog(this, "Rút Tiền Không Thành Công");
			}
			
		}else if(e.getSource()==bt5tram){
			KhachHang kh = new KhachHang();
			kh.setSoTaiKhoan(stk);
			if(dll.RutTien(kh,500000)){
				JOptionPane.showMessageDialog(this, "Bạn Đã Rút Thành Công 500.000 nghìn");
			}else {
				JOptionPane.showMessageDialog(this, "Rút Tiền Không Thành Công");
			}
			
		}else if(e.getSource()==bt1trieu){
			KhachHang kh = new KhachHang();
			kh.setSoTaiKhoan(stk);
			if(dll.RutTien(kh,1000000)){
				JOptionPane.showMessageDialog(this, "Bạn Đã Rút Thành Công 1.000.000 nghìn");
			}else {
				JOptionPane.showMessageDialog(this, "Rút Tiền Không Thành Công");
			}
		}else if(e.getSource()==bt2trieu){
			KhachHang kh = new KhachHang();
			kh.setSoTaiKhoan(stk);
			if(dll.RutTien(kh,2000000)){
				JOptionPane.showMessageDialog(this, "Bạn Đã Rút Thành Công 2.00.000 nghìn");
			}else {
				JOptionPane.showMessageDialog(this, "Rút Tiền Không Thành Công");
			}
			
		}else if(e.getSource()==bt3trieu){
			KhachHang kh = new KhachHang();
			kh.setSoTaiKhoan(stk);
			if(dll.RutTien(kh,3000000)){
				JOptionPane.showMessageDialog(this, "Bạn Đã Rút Thành Công 3.000.000 nghìn");
			}else {
				JOptionPane.showMessageDialog(this, "Rút Tiền Không Thành Công");
			}
			
		}else if(e.getSource()==bt5trieu){
			KhachHang kh = new KhachHang();
			kh.setSoTaiKhoan(stk);
			if(dll.RutTien(kh,5000000)){
				JOptionPane.showMessageDialog(this, "Bạn Đã Rút Thành Công 5.000.000 nghìn");
			}else {
				JOptionPane.showMessageDialog(this, "Rút Tiền Không Thành Công");
			}
		}
 		else if(e.getSource()==btnhapsokhac){
			GDNhapSoTienKhac bamnutnhapsokhac = new GDNhapSoTienKhac(stk);
			bamnutnhapsokhac.setVisible(true);
			this.setVisible(false);
		}
		
			
	}
	

}