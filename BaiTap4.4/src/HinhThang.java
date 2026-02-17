import java.util.Scanner;

public class HinhThang {

	public static void main(String[] args) {
		Scanner HT= new Scanner(System.in);
		System.out.print("đáy lớn:");
		double a=HT.nextDouble();
		System.out.print("đáy bé:");
		double b=HT.nextDouble();
		System.out.print("chiều cao :");
	    double h=HT.nextDouble();
		
	   double S=(a+b)/h*2;
	   
	   System.out.print("diện tích hình thang:"+S);
	   

	}

}
