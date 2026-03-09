import java.util.Scanner;

public class hinhchunhat {
	public static void main(String[] args) {
		Scanner dt= new Scanner(System.in);
		System.out.print("chiều dài a :");
		double a=dt.nextDouble();
		System.out.print("chiều rộng b :");
		double b=dt.nextDouble();
	   double chuvi=(a+b)*2;
	   double dientich=a*b;
	   System.out.println("chu vi hình chữ nhật :"+chuvi);
	   System.out.print("diện tích hình chữ nhật :"+dientich);
} 
}
