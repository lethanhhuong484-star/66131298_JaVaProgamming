package thomc.quanlynhanvien;

public class ChayCT {

	public static void main(String[] args) {
		NhanVien nv1 = new NhanVien("001", "Mai Cương Thọ", 2300000);
		nv1.hienthithongtin();
        System.out.print(nv1.toString());
	}

}
