import java.util.Scanner;

public class BaiTap_DoiTien {

	public static void main(String[] args) {
		Scanner doitien=new Scanner(System.in);
		
		System.out.print("số tiền USD:");
		double USD=doitien.nextDouble();
		System.out.print("số tiền EUR:");
		double EUR=doitien.nextDouble();
		double VND=USD*23500;
		double VND1=EUR*27000;
	System.out.println("đổi tiền USD sang VNĐ:"+VND);
	System.out.print("đổi tiền EUR sang VNĐ:"+VND1);
	}
	

}
