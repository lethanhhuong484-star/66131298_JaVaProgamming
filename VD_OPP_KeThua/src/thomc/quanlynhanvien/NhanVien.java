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
	return "NhanVien [maNV = " + maNV + ", hoTen = " + hoTen + ", luongCoBan = " + luongCoBan + "]";
}

	public void hienthithongtin() {
        System.out.println("Nhập mã NV: "+maNV);
       System .out.println("Nhập họ tên: "+hoTen);
        System.out.println("Nhập lương cơ bản: "+luongCoBan);
    }
}