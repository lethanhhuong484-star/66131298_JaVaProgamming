import java.util.Scanner;

public class ArrayTong {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Nhập n: ");
	        int n = sc.nextInt();
	        int[] a = new int[n];

	        int tongLe = 0;

	        for (int i = 0; i < n; i++) {
	            System.out.print("Phần tử " + (i + 1) + ": ");
	            a[i] = sc.nextInt();

	            if (a[i] % 2 != 0) {
	                tongLe += a[i];
	            }
	        }

	        System.out.println("Tổng các số lẻ: " + tongLe);
	        sc.close();
	}

}
