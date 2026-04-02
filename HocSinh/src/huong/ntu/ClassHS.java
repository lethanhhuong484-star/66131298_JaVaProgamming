package huong.ntu;

import java.security.PublicKey;

public class ClassHS {
 private String TenHS;
 private Integer NamSinh;
 
 public String getTenHS() {
	return TenHS;	
}
 public ClassHS(String tenHS, Integer namSinh) {
	super();
	TenHS = tenHS;
	NamSinh = namSinh;
}
 
 public Integer getNamSinh() {
	return NamSinh;
 }
 public void setNamSinh(Integer namSinh) {
	NamSinh = namSinh;
 }
 public void setTenHS(String tenHS) {
	TenHS = tenHS;

 }
	public int Tuoi(int T) {
		return T= 2026-NamSinh;
	}

}
