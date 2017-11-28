package GUI;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GDChuyenTien extends JFrame implements ActionListener{
	JLabel lbctsotaikhoan,lbctsotienchuyen;
	JTextField txtctsotaikhoan,txtsotienchuyen;
	JButton btctenter,btctclear,btctcancel,btctgiaodichkhac;
	JPanel panel;
	Container con;
	String stk;
	public GDChuyenTien(String stk){
		super("Giao Diện Chuyển Tiền");
		this.stk = stk;
		con = this.getContentPane();
		
		
		lbctsotaikhoan = new JLabel("Số Tài Khoản:");
		txtctsotaikhoan = new JTextField();
		lbctsotienchuyen= new JLabel("Số Tiền:");
		txtsotienchuyen = new JTextField();
		
		btctenter = new JButton("Enter");
		btctclear = new JButton("Clear");
		btctgiaodichkhac = new JButton("Giao Dịch Khác");
		btctcancel = new JButton("Cancel");
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(4, 4));
		panel.add(lbctsotaikhoan);
		panel.add(txtctsotaikhoan);
		panel.add(lbctsotienchuyen);
		panel.add(txtsotienchuyen);
		panel.add(btctenter);
		panel.add(btctclear);
		panel.add(btctgiaodichkhac);
		panel.add(btctcancel);
		
		con.add(panel);
		
		btctenter.addActionListener(this);
		btctclear.addActionListener(this);
		btctgiaodichkhac.addActionListener(this);
		btctcancel.addActionListener(this);
		
		
		this.setSize(350,250);
		this.setLocation(500,300);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btctgiaodichkhac ){
			SauKhiDangNhap btsaukhichuyentien = new SauKhiDangNhap(stk);
			btsaukhichuyentien.setVisible(true);
			this.setVisible(false);
		}else if(e.getSource()==btctcancel){
			this.dispose();
		}
	}
	

}
