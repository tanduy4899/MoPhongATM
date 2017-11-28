package DAL;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

public class DataAceessHelper {
	
	
	private static String today;
	private static String thoiGian;
	private static String mkh;
	
	
	protected static Connection con;
	
    String HostName = "localhost";
    String port ="1433";
    String dbName= "ATM";
    String use = "sa";
    String pass= "tanduy899";
    String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String URL =  "jdbc:sqlserver://"+HostName+ ":"+ port +";database=" +dbName;
    
    public DataAceessHelper(){
    	
    }
    public DataAceessHelper(String path){
    	try {
			con = DriverManager.getConnection("jdbc:sqlserver://"+path);
			Calendar cal = Calendar.getInstance();
	    	today = cal.get(Calendar.DATE) +"/"+ (cal.get(Calendar.MONTH)+1)+ "/" +cal.get(Calendar.YEAR);
	    	thoiGian = cal.get(Calendar.HOUR_OF_DAY) +" giờ "+ cal.get(Calendar.MINUTE)+ " phút ";
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
    }
    
	
	public void getConnect(){
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(URL, use, pass);
			
			 Calendar cal = Calendar.getInstance();
	    	 today = cal.get(Calendar.DATE) +"/"+ (cal.get(Calendar.MONTH)+1)+ "/" +cal.get(Calendar.YEAR);
	    	 thoiGian = cal.get(Calendar.HOUR_OF_DAY) +" giờ "+ cal.get(Calendar.MINUTE)+ " phút ";
	    	 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void getClose(){
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
      }

