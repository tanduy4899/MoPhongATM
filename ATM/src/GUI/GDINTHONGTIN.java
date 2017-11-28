package GUI;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import DLL.KhachHangDLL;
import Emtity.KhachHang;

public class GDINTHONGTIN extends JFrame implements ActionListener{
	JTextArea textare;
	JButton khac;
	JPanel panel,panel2;
	Container con;
	String stk;
	KhachHangDLL dll = new KhachHangDLL();
	ArrayList<KhachHang> liskh = new ArrayList<>();
	public GDINTHONGTIN(String stk) {
		super("Giao Diện In Thông Tin");
		this.stk = stk;
		bingding();
		
		
		this.pack();
		this.setLocation(400, 200);
		KhachHang kh = new KhachHang();
		kh = dll.InThongTin(kh);
	
		
		
		

//		kh.setHoten("AAAA");
//		kh.setPin("123");
//		kh.setSoTaiKhoan("1234567890");
//		
//		String info = "";
//		info += "Ho ten: " + kh.getHoten() + "\n";
//		info += "Pin: " + kh.getPin();
//		textare.setText(info);
	
	}
	public void bingding(){
		con=this.getContentPane();
		textare = new JTextArea(10,20);
		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(textare);
		
		khac = new JButton("Giao Dịch Khác");
		panel2 = new JPanel();
		panel2.add(khac);
		
		con.add(panel);
		con.add(panel2,"South");
		khac.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==khac){
			SauKhiDangNhap formsaukhininhongtin = new SauKhiDangNhap(stk);
			formsaukhininhongtin.setVisible(true);
			this.dispose();
		}
	}
}
