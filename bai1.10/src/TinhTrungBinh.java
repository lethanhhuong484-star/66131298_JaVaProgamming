import java.util.Scanner;

public class TinhTrungBinh {

	public static void main(String[] args) {
		Scanner dt=new Scanner(System.in);
		System.out.print("nhập số nguyên a:");
		int a=dt.nextInt();
		System.out.print("nhập số nguyên b:");
		int b=dt.nextInt();
		System.out.print("nhập số nguyên c:");
		int c=dt.nextInt();
		double trungbinh=(a+b+c)/3;
		System.out.print("trung bình của 3 số nguyên:"+trungbinh);
		
		
	}
}
