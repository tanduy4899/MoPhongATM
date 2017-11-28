//package GUI;
//
//import java.awt.Container;
//import java.awt.GridLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JPanel;
//import javax.swing.JPasswordField;
//import javax.swing.JTextField;
//
//import DLL.KhachHangDLL;
//
//public class LoginADIMIN extends JFrame implements ActionListener {
//KhachHangDLL dll = new KhachHangDLL();
//	
//
//	JButton dangnhapadmin;
//	JLabel lbdangnhap;
//	JTextField tf1;
//	Container con;
//	JPanel  panel1, panel2;
//	JLabel taikhoan, matkhau;
//	JPasswordField pass;
//	
//
//	public LoginADIMIN() {
//		super("Giao Dien ADMIN ");
//		con = this.getContentPane();
//		
//
//		taikhoan = new JLabel("Tài Khoản:");
//		tf1 = new JTextField();
//		matkhau = new JLabel("Mật Khẩu:");
//		pass = new JPasswordField();
//
//		panel1 = new JPanel();
//		panel1.setLayout(new GridLayout(2, 2));
//
//		panel1.add(taikhoan);
//		panel1.add(tf1);
//		panel1.add(matkhau);
//		panel1.add(pass);
//
//		dangnhapadmin = new JButton("LOGIN");
//		
//		panel2 = new JPanel();
//		panel2.add(dangnhapadmin);
//
//		con.add(panel1);
//		con.add(panel2, "South");
//		
//		
//
//		dangnhapadmin.addActionListener(this);
//		this.setSize(250,150);
//		this.setLocation(500, 300);
//		
//	}
//
//
//	@Override
//	public void actionPerformed(ActionEvent arg0) {
//		// TODO Auto-generated method stub
//		String t =tf1.getText();
//        String p = new String(pass.getPassword());
//        boolean check = true;
//        if(check&t.isEmpty()){
//            check = false;
//        }
//        
//        
//        if(check&p.isEmpty()){
//            check = false;
//        }
//        
//        if(check){
//            if(dll.getLogin(t, p)){
//            	GDADIM formchinhADMIn = new GDADIM();
//            	formchinhADMIn.setVisible(true);
//              
//            }else{
//                JOptionPane.showMessageDialog(this, "login fail");
//            }
//	}
//        
//	}
//}
