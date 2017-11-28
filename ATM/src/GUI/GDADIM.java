//package GUI;
//
//import java.awt.Container;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.ArrayList;
//import java.util.Vector;
//
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.JScrollPane;
//import javax.swing.JTable;
//import javax.swing.table.DefaultTableModel;
//
//import DLL.KhachHangDLL;
//import Emtity.KhachHang;
//
//public class GDADIM extends JFrame implements ActionListener {
//	KhachHangDLL khDll = new KhachHangDLL();
//	ArrayList<KhachHang> listKH = new ArrayList<>();
//	
//	Vector clums = new Vector();
//	Vector data = new Vector();
//	DefaultTableModel  model;
//	JScrollPane jScrollPane;
//	JButton them,sua,xoa;
//	JPanel p;
//	Container con;
//	JTable table ;
//	public GDADIM(){
//		
//		GiaoDien();
//		
//	}
//	
//	public void GiaoDien(){
//		con = this.getContentPane();
//		them = new JButton("Add New");
//		them.addActionListener(this);
//		sua = new JButton("UpDate");
//		sua.addActionListener(this);
//		xoa = new JButton("Delete");
//		xoa.addActionListener(this);
//		
//		p = new JPanel();
//		p.add(them);
//		p.add(sua);
//		p.add(xoa);
//		con.add(p,"South");
//		
//		Biding();	
//		model = new DefaultTableModel(data,clums);
//		table = new JTable(model);
//		jScrollPane = new JScrollPane(table);
//		con.add(jScrollPane, "North");
//		
//		
//		
//		this.setSize(500,400);
//		this.setLocation(200, 100);
//		
//	}
//	
//	public void Biding(){
//		clums.clear();
//		data.clear();
//		listKH = khDll.getALL();
////		Vector clums = new Vector();
//		
//		
//		clums.add("SoTaiKhoan");
//		clums.add("Pin");
//		clums.add("HoTen");
//		clums.add("GioiTinh");
//		clums.add("Tien");
//		
////		Vector data = new Vector();
//		
//		for(KhachHang khachhang : listKH){
//			Vector row = new Vector();
//			row.add(khachhang.getSoTaiKhoan());
//			row.add(khachhang.getPin());
//			row.add(khachhang.getHoten());
//			row.add(khachhang.getGioiTinh());
//			row.add(khachhang.getTien());
//			data.add(row);
//		}
////		model = new DefaultTableModel(data,clums);
////		table.setModel(model);
//	}
//	@Override	
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//	
//
//}
