import java.util.Scanner;

public class SanPham {
	private String tenSP;
	private double donGia;
	private double giamGia;
	

public SanPham() {
	
}
public SanPham(String ten,double gia,double giam) {
	this.tenSP=ten;
    this.donGia=gia;
    this.giamGia=giam;
}
public double GetThueNhapKhau() {
	return donGia*0.1;
	
}
public void Nhap() {
	Scanner sp= new Scanner(System.in);
	System.out.print("Nhập tên sản phẩm:");
	tenSP=sp.nextLine();
	System.out.print("Nhập đơn sản phẩm:");
	donGia=sp.nextDouble();
	System.out.print("Nhập giảm giá sản phẩm:");
	giamGia=sp.nextDouble();
}
public void Xuat() {
	System.out.println("Tên sản phẩm:"+tenSP);
	System.out.println("Đơn sản phẩm:"+donGia);
	System.out.println("Giảm giá sản phẩm:"+giamGia);
	System.out.println("Thuế sản phảm:"+GetThueNhapKhau());
}
} 