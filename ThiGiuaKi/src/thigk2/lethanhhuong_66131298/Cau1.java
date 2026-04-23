package thigk2.lethanhhuong_66131298;

import java.util.Scanner;

public class Cau1 {

	public static void main(String[] args) {
		// dùng lớp Scanner để nhập chiều cao và cân nặng của người dùng
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập chiều cao số m : ");
		double CC = sc.nextDouble();
		System.out.print("Nhập cân nặng số kg : ");
		double CN = sc.nextDouble();
		
		// tính chỉ số BMI
		double BMI = CN / (CC * CC);
		System.out.println("Chỉ số BMI của bạn là : " + BMI);
		
		// dùng if else để phân loại chỉ số BMI
		if (BMI < 18.5) {
			System.out.println("Bạn bị thiếu cân");
		} else if (BMI >= 18.5 && BMI < 25) {
			System.out.println("Bạn có cân nặng bình thường");
		} else if (BMI >= 25 && BMI < 30) {
			System.out.println("Bạn bị thừa cân");
		} else {
			System.out.println("Bạn bị béo phì");
		}
		sc.close();
	}

}
