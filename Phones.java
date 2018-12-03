package Phone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Phones {
	String tendt;
	String hangdt;
	String hedieuhanh;
	float gia;
	
	
	
	public Phones(String tendt2, String hangdt2, String hedieuhanh2, float gia2) {
		// TODO Auto-generated constructor stub
	}



	public String getTendt() {
		return tendt;
	}



	public void setTendt(String tendt) {
		this.tendt = tendt;
	}



	public String getHangdt() {
		return hangdt;
	}



	public void setHangdt(String hangdt) {
		this.hangdt = hangdt;
	}



	public String getHedieuhanh() {
		return hedieuhanh;
	}



	public void setHedieuhanh(String hedieuhanh) {
		this.hedieuhanh = hedieuhanh;
	}



	public float getGia() {
		return gia;
	}



	public void setGia(float gia) {
		this.gia = gia;
	}



	{
		this.tendt = tendt;
		this.hangdt = hangdt;
		this.hedieuhanh = hedieuhanh;
		this.gia = gia;
	}
}
