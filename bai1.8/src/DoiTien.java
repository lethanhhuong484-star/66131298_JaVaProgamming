import java.util.Scanner;

public class DoiTien {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print(" nhập số tiền cần đổi:");
		int tien=sc.nextInt();
		int t500=tien/500000;
		tien%=500000;
		int t200=tien/200000;
		tien%=200000;
		int t100=tien/100000;
		tien%=100000;
		int t50=tien/50000;
		tien%=50000;
		int t20=tien/20000;
		tien%=200000;
		int t10=tien/10000;
		tien%=100000;
		System.out.println("đổi số tiền nhập vào 500000:"+t500);
		System.out.println("đổi số tiền nhập vào 200000:"+t200);
		System.out.println("đổi số tiền nhập vào 100000:"+t100);
		System.out.println("đổi số tiền nhập vào 50000:"+t50);
		System.out.println("đổi số tiền nhập vào 20000:"+t20);
		System.out.println("đổi số tiền nhập vào 10000:"+t10);

	}
}
