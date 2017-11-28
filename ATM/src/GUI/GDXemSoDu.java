package GUI;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class GDXemSoDu extends JFrame implements ActionListener {
	JTextArea textaresodu;
	JButton khacsodu;
	JPanel panel,panel2;
	Container con;
	String stk;
	public GDXemSoDu(String stk) {
		super("Giao Diện Xem Số Dư");
		this.stk = stk;
		con=this.getContentPane();
		textaresodu = new JTextArea(10,20);
		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(textaresodu);
		
		khacsodu = new JButton("Giao Dịch Khác");
		panel2 = new JPanel();
		panel2.add(khacsodu);
		
		con.add(panel);
		con.add(panel2,"South");
		
		khacsodu.addActionListener(this);
		this.pack();
		this.setLocation(400, 200);
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==khacsodu){
			SauKhiDangNhap formsaukhixemsodu = new SauKhiDangNhap(stk);
			formsaukhixemsodu.setVisible(true);
			this.dispose();
		}
	}
}
