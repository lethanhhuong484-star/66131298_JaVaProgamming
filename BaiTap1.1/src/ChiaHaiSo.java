import java.util.Scanner;

public class ChiaHaiSo {

	public static void main(String[] args) {
		Scanner so=new Scanner(System.in);
		System.out.print("nhập số a:");
		int a=so.nextInt();
		System.out.print("nhập số b:");
		int b=so.nextInt();
		
		int n=a/b;
		int m=a%b;
		
		System.out.println("chia lấy phần nguyên:"+n);
		System.out.print("chia lấy phần dư:"+m);

	}

}
