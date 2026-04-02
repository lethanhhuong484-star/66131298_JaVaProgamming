package huong.ntu;

import java.util.Scanner;

public class ChayHS {

	public static void main(String[] args) {
		ClassHS hs=new ClassHS("bảo",2006);
		System.out.println("Thông tin học sinh là: "+hs.getTenHS());
		System.out.println("Thông tin học sinh là: "+hs.getNamSinh());
		System.out.println(" tuổi học sinh là: "+hs.Tuoi(2006));
		
	Scanner sc=new Scanner(System.in);	
	System.out.print("nhập tên học sinh:");
	String TenHS=sc.nextLine();
	System.out.print("nhập năm học sinh:");
	int NS=sc.nextInt();
	System.out.print(" tuổi học sinh là: "+hs.Tuoi(2006));
	}
}
