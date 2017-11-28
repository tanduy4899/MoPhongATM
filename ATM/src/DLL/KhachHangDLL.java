package DLL;

import java.util.ArrayList;

import DAL.KhachHangDAL;
import Emtity.KhachHang;

public class KhachHangDLL {
	KhachHangDAL dal = new KhachHangDAL();
	
	 public boolean  getLogin(String t,String k){
	        return dal.getLogin(t,k);
	 }

	 public boolean RutTien(KhachHang kh,float tien){
		 return dal.RutTien(kh,tien);
	 } 
	 public boolean NhapSoTien(KhachHang kh,float sotien){
		 return dal.NhapSoTien(kh,sotien);
	 } 
	 public boolean DoiPin(KhachHang kh,String pin){
		 return dal.DoiPin(kh, pin);
	 }
	 public KhachHang InThongTin(KhachHang kh){
		 return dal.InThongTin(kh);
	 }
}
