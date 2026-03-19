package thomc.quanlynhanvien;

public class NhanVienVanPHong extends NhanVien{
private double sogioLT;
private double luongLT;
public NhanVienVanPHong(String maNV, String hoTen, double luongCoBan, double sogioLT, double luongLT) {
	super(maNV, hoTen, luongCoBan);
	this.sogioLT = sogioLT;
	this.luongLT = luongLT;
}
@Override
public double tinhLuong() {
    return super.getLuongCoBan() + sogioLT*luongLT;
}
@Override
public void hienthithongtin() {
	super.hienthithongtin();
    System.out.println("Số giờ làm thêm : "+sogioLT);
   System .out.println("Lương thêm mỗi giờ: "+luongLT);
    System.out.println("Tổng lương: "+tinhLuong());
}
public String toString() {
	String ChuoiXuat=super.toString();
	ChuoiXuat = ChuoiXuat+"Số giờ làm thêm : "+sogioLT;
	ChuoiXuat = ChuoiXuat+"Lương thêm mỗi giờ: "+luongLT;
	ChuoiXuat = ChuoiXuat+"Tổng lương: "+tinhLuong();
	return ChuoiXuat;
			
}
}
