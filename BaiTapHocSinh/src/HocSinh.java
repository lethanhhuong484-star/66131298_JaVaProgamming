
public class HocSinh {
private String tenHS;
private short tuoiHS;
private String lopHS;
 
public HocSinh() {
	
}


public HocSinh(String ten,short tuoi,String lop) {
	this.tenHS=ten;
	this.tuoiHS=tuoi;
	this.lopHS=lop;
}

public String getTenHS() {
	return tenHS;
}

public void setTenHS(String tenHS) {
	this.tenHS = tenHS;
}

public int getTuoiHS() {
	return tuoiHS;
}

public void setTuoiHS(short tuoiHS) {
	this.tuoiHS = tuoiHS;
}

public String getLopHS() {
	return lopHS;
}

public void setLopHS(String lopHS) {
	this.lopHS = lopHS;
}


@Override
public String toString() {
	return "HocSinh [tenHS= " + tenHS + ", tuoiHS= " + tuoiHS + ", lopHS= " + lopHS + "]";
}


}
