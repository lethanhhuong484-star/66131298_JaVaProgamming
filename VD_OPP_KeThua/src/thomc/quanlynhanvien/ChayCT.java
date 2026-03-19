package thomc.quanlynhanvien;

public class ChayCT {

	public static void main(String[] args) {
		NhanVien nv1 = new NhanVien("001", "Mai Cương Thọ", 2300000);
		nv1.hienthithongtin();
        System.out.print(nv1.toString());
        
       NhanVienVanPHong nvVP1 = new NhanVienVanPHong("002","Lê Thanh Hướng",2300000,2,200000);
        nvVP1.hienthithongtin();
        
	}

}
