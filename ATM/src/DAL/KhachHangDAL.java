package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JOptionPane;

import Emtity.KhachHang;

public class KhachHangDAL extends DataAceessHelper{
	 private static String today;
	 private static String thoiGian;
	private final String GET_LOGIN = "select * from KhachHang where SoTaiKhoan=? and Pin=?";

	private final String RUT_TIEN1tram =" Update KhachHang set Tien= Tien - ? where SoTaiKhoan = ? ";
	private final String NHAP_TIEN =" Update KhachHang set Tien= Tien - ? where SoTaiKhoan = ? ";
	private final String DOI_PIN = "Update KhachHang set Pin = ? where SoTaiKhoan= ?";
	
	private final String IN_THONGTIN = "select * from KhachHang where SoTaiKhoan = ?";
	private final String XEM_TIEN = "select Tien form KhachHang where SoTaiKhoan = ?";
 	public boolean getLogin(String t, String p){
		boolean check = false;
		try {
			
			getConnect();
			PreparedStatement ps =con.prepareStatement(GET_LOGIN);
			ps.setString(1,t);
			ps.setString(2, p);
			ResultSet rs = ps.executeQuery();
			if(rs !=null && rs.next()){
				check = true;
			}
			getClose();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return check;
	}	
	

	public boolean RutTien(KhachHang kh,float tien){
		boolean check = false;
		try {
				getConnect();
				PreparedStatement ps = con.prepareStatement(RUT_TIEN1tram);
				ps.setFloat(1, tien);
				ps.setString(2, kh.getSoTaiKhoan());
				int rs = ps.executeUpdate();
				if(rs > 0){
	                check = true;
	            }

				getClose();
		} catch (Exception e) {
			 e.printStackTrace();
		}
		return check;
	}
	public boolean NhapSoTien(KhachHang kh,float sotien){
		boolean check = false;
		try {
				getConnect();
				PreparedStatement ps = con.prepareStatement(NHAP_TIEN);
				ps.setFloat(1, sotien);
				ps.setString(2, kh.getSoTaiKhoan());
				int rs = ps.executeUpdate();
				if(rs > 0){
	                check = true;
	            }

				getClose();
		} catch (Exception e) {
			 e.printStackTrace();
		}
		return check;
	}
	public boolean DoiPin(KhachHang kh, String pin){
		boolean check=false;
		try {
			getConnect();
			PreparedStatement ps = con.prepareStatement(DOI_PIN);
			ps.setString(1, pin);
			ps.setString(2,kh.getSoTaiKhoan());
			int rs = ps.executeUpdate();
			if(rs >0){
				check=true;
			}
			
			getClose();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return check;
	}
	public  KhachHang InThongTin(KhachHang kh){		
		
		try {
			getConnect();
			PreparedStatement ps = con.prepareStatement(IN_THONGTIN);
			ps.setString(1,kh.getSoTaiKhoan());
			ResultSet rs = ps.executeQuery();
			while(rs !=null){
				if(rs.next()){
					
					KhachHang items = new KhachHang();
					items.setSoTaiKhoan(rs.getString("SoTaiKhoan"));
				
					items.setPin(rs.getString("Pin"));
					items.setHoten(rs.getString("HoTen"));
					
					items.setGioiTinh(rs.getString("GioiTinh"));
					System.out.println(items.getGioiTinh());
					items.setTien(rs.getFloat("Tien"));
					
					return items;
				}
		}
			getClose();
		} catch (Exception e) {
			e.getStackTrace();
			return null;
		}
		return null;
	}
}
	


