package baitap_1;

import java.util.Scanner;

public class BaiTap_TienLuong {

	public static void main(String[] args) {
	Scanner tienluong= new Scanner(System.in);
	
	System.out.print("giờ làm:");
	double gio= tienluong.nextDouble();
	System.out.print("tiền lương mỗi giờ :");
	double luong= tienluong.nextDouble();
	
	double tinhluong;
	
	if(gio<=40) {
		 tinhluong = gio*luong;
		
	}else{
		double themgio=gio-40;
		tinhluong = 40*luong+themgio*1.5;
		
		
	}
 System.out.print("tiền lương:"+tinhluong);
	}

}
