import java.util.Scanner;

public class DienTichHinhThang {

	public static void main(String[] args) {
		Scanner dt= new Scanner(System.in);
		System.out.print("nhap day be :");
		double daybe=dt.nextDouble();
		System.out.print("nhap day lon :");
		double daylon=dt.nextDouble();
		System.out.print("nhap day chieu cao :");
		double chieucao=dt.nextDouble();
		double dientich=((daybe+daylon)*chieucao)/2;
		System.out.print("dien tich hinh thang:"+dientich);
	}

}
 