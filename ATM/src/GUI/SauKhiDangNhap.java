package GUI;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SauKhiDangNhap extends JFrame implements ActionListener{
	
	 
	 
	  
	String stk;
	JButton ruttien,xemsodu,inlichsu,chuyenkhoan,doipin,huygiaodich,vantin,inthongtin;
	JLabel chongiaodich,lbchao;
	protected static JLabel lbxinchao;
	
	GridBagLayout gb;
	Container con;
	GridBagConstraints gbc = new GridBagConstraints();
	public SauKhiDangNhap(String stk) {
		super("Giao Diện Chọn Giao Dịch");
		this.stk=stk;
		gb = new GridBagLayout();
		con = this.getContentPane();
		con.setLayout(new GridBagLayout());
		con.setLayout(gb);
		
		
		
		ruttien = new JButton("RÚT TIỀN");
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = 0;
		gbc.ipadx = 35;
		gbc.ipady = 40;
		gbc.anchor = GridBagConstraints.NORTHWEST;
		con.add(ruttien, gbc);

		xemsodu = new JButton("XEM SỐ DƯ");
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.gridwidth = 0;
		gbc.ipadx = 20;
		gbc.ipady = 45;
		gbc.anchor = GridBagConstraints.NORTHWEST;
		add(xemsodu, gbc);

		inlichsu = new JButton("IN LỊCH SỬ");
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.gridwidth = 0;
		gbc.ipadx = 25;
		gbc.ipady = 45;
		gbc.anchor = GridBagConstraints.NORTHWEST;
		add(inlichsu, gbc);
		
		inthongtin = new JButton("IN THONG TIN");
		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.gridwidth = 0;
		gbc.ipadx = 11;
		gbc.ipady = 41;
		gbc.anchor = GridBagConstraints.NORTHWEST;
		con.add(inthongtin, gbc);
		
		lbchao= new JLabel();
		lbchao.setText("XIN CHÀO");
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbc.anchor = GridBagConstraints.NORTH;
		gbc.gridheight = 0;
		gbc.gridwidth = 0;
		con.add(lbchao, gbc);

		
		lbxinchao = new JLabel();
		gbc.gridx = 2;
		gbc.gridy = 2;
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbc.anchor = GridBagConstraints.NORTH;
		gbc.gridheight = 0;
		gbc.gridwidth = 0;
		con.add(lbxinchao, gbc);
		
		chongiaodich = new JLabel();
		chongiaodich.setText("MỜI BẠN CHỌN GIAO DỊCH");
		gbc.gridx = 2;
		gbc.gridy = 3;
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.gridheight = 0;
		gbc.gridwidth = 0;
		con.add(chongiaodich, gbc);

		chuyenkhoan = new JButton("CHUYỂN TIỀN");
		gbc.gridx = 3;
		gbc.gridy = 0;
		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.gridwidth = 0;
		gbc.gridheight = 0;
		gbc.ipadx = 10;
		gbc.ipady = 40;
		gbc.anchor = GridBagConstraints.NORTHEAST;
		add(chuyenkhoan, gbc);

		doipin = new JButton("ĐỔI PIN");
		gbc.gridx = 3;
		gbc.gridy = 2;
		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.gridwidth = 0;
		gbc.gridheight = 0;
		gbc.ipadx = 41;
		gbc.ipady = 45;
		gbc.anchor = GridBagConstraints.NORTHEAST;
		add(doipin, gbc);
		

		vantin = new JButton("VẤN TIN");
		gbc.gridx = 3;
		gbc.gridy = 3;
		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.gridwidth = 0;
		gbc.gridheight = 0;
		gbc.ipadx =39;
		gbc.ipady = 45;
		gbc.anchor = GridBagConstraints.NORTHEAST;
		add(vantin, gbc);

		huygiaodich = new JButton("HỦY GIAO DỊCH");
		gbc.gridx = 3;
		gbc.gridy = 4;
		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.gridwidth = 0;
		gbc.gridheight = 0;
		gbc.ipadx =0;
		gbc.ipady = 45;
		gbc.anchor = GridBagConstraints.NORTHEAST;
		add(huygiaodich, gbc);
		
		
		
		

		ruttien.addActionListener(this);
		xemsodu.addActionListener(this);
		inlichsu.addActionListener(this);
		chuyenkhoan.addActionListener(this);
		doipin.addActionListener(this);
		huygiaodich.addActionListener(this);
		vantin.addActionListener(this);
		inthongtin.addActionListener(this);

		this.setSize(450, 300);
		this.setLocation(400, 210);
		this.setResizable(false);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==ruttien){
			GDRutTien formruttien = new GDRutTien(stk); 
			formruttien.setVisible(true);
			this.setVisible(false);
		}else if(e.getSource()==chuyenkhoan){
			GDChuyenTien formchuyentien = new GDChuyenTien(stk);
			formchuyentien.setVisible(true);
			this.setVisible(false);
		}else if(e.getSource()==doipin){
			GDDoiPin formdoipin = new GDDoiPin(stk);
			 formdoipin.setVisible(true);
			 this.setVisible(false);
		}else if(e.getSource()==huygiaodich){
			this.dispose();;
		}else if(e.getSource()==inthongtin){
			GDINTHONGTIN forminthongtin = new GDINTHONGTIN(stk);
			forminthongtin.setVisible(true);
			this.dispose();
		}else if(e.getSource()==xemsodu){
			GDXemSoDu formxemsosdu = new GDXemSoDu(stk);
			formxemsosdu.setVisible(true);
			this.dispose();
		}
		
		
	}

}
