package GUI;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import DLL.KhachHangDLL;





public class Login extends JFrame implements ActionListener {
	
	KhachHangDLL dll = new KhachHangDLL();
	

	JButton dangnhap,Adim;
	JLabel lbdangnhap;
	JTextField tf1;
	Container con;
	JPanel  panel1, panel2,panel3;
	JLabel taikhoan, matkhau,moi;
	JPasswordField pass;
	

	public Login() {
		super("Giao Dien ");

		con = this.getContentPane();
		moi = new JLabel("Mời Bạn Nhập Tài Khoản và Mật Khẩu");
		panel3 = new JPanel();
		panel3.add(moi);
		taikhoan = new JLabel("Tài Khoản:");
		tf1 = new JTextField();
		matkhau = new JLabel("Mật Khẩu:");
		pass = new JPasswordField();

		panel1 = new JPanel();
		panel1.setLayout(new GridLayout(2, 2));

		panel1.add(taikhoan);
		panel1.add(tf1);
		panel1.add(matkhau);
		panel1.add(pass);

		dangnhap = new JButton("LOGIN");
		Adim = new JButton("ADIM");
		panel2 = new JPanel();
		panel2.add(dangnhap);
		panel2.add(Adim);

		con.add(panel1);
		con.add(panel2, "South");
		con.add(panel3,"North");
		

		dangnhap.addActionListener(this);
		Adim.addActionListener(this);
		this.setVisible(true);
		this.setSize(250,150);
		this.setLocation(500, 300);
	
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String t =tf1.getText();
        String p = new String(pass.getPassword());
        boolean check = true;
        if(check&t.isEmpty()){
            check = false;
        }
        
        
        if(check&p.isEmpty()){
            check = false;
        }
        
        if(check){
            if(dll.getLogin(t, p)){
            	SauKhiDangNhap formgiaodich = new SauKhiDangNhap(t);
                formgiaodich.setVisible(true);
                formgiaodich.lbxinchao.setText(t);
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(this, "login fail");
            }
        }
//        if(e.getSource()==Adim){
//        	LoginADIMIN formLoginadmin = new LoginADIMIN();
//        	formLoginadmin.setVisible(true);
//        	this.setVisible(false);
//        }

	}
	public static void main(String [] agrs){
		new Login();
	}

}
