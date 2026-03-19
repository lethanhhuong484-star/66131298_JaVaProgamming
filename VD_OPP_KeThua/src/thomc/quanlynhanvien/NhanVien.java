package thomc.quanlynhanvien;

public class NhanVien {
    private String maNV;
    private String hoTen;
    private double luongCoBan;
    
    public NhanVien(String maNV, String hoTen, double luongCoBan) {
    	super();
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
    }
public NhanVien() {
	super(); 
	}
public double tinhLuong() {
        return luongCoBan ;
    }
    @Override
public String toString() {
    	String ChuoiXuat="";
    	ChuoiXuat = ChuoiXuat +"\nMã Nhân Viên  " + this.maNV ;
    	ChuoiXuat = ChuoiXuat +"\nHọ Tên " + this.hoTen;
    	ChuoiXuat = ChuoiXuat +"\nLương cơ bản " + this.luongCoBan;
	return ChuoiXuat;
}

	public void hienthithongtin() {
        System.out.println("Nhập mã NV: "+maNV);
       System .out.println("Nhập họ tên: "+hoTen);
        System.out.println("Nhập lương cơ bản: "+luongCoBan);
    }
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public double getLuongCoBan() {
		return luongCoBan;
	}
	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}
	
}