import java.util.Scanner;

class TamGiac {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("nhập cạnh a:");
		double a=sc.nextDouble();
		System.out.print("nhập cạnh b:");
		double b=sc.nextDouble();
		System.out.print("nhập cạnh c:");
		double c=sc.nextDouble();
		double chuvi=a+b+c;
		double p=chuvi/2;
		double dientich=Math.sqrt(p*(p-a)*(p-b)*(p-c));
		System.out.println("chu vi hình tam giác:"+chuvi);
		System.out.print("diện tích hình tam giác:"+dientich);
		
	}

}
