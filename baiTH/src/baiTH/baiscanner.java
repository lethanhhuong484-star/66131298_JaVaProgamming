package baiTH;

import java.util.Scanner;

public class baiscanner {

	public static void main(String[] args) {
		// khai bai 
		double num1,num2,sum;
		//khai báo scanner
        Scanner scanner= new Scanner(System.in);
		//in thông tin cần thiết
        System.out.print("nhập số num1:");
        num1=scanner.nextDouble();
        		
        System.out.print("nhập số num2:");
        num2=scanner.nextDouble();
        
        sum = num1 + num2;
        // xuất
        System.out .println ("Tổng của" + num1+"và"+num2+"là "+sum );
       
        
	}

}
