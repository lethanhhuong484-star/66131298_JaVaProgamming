import java.util.Scanner;

public class ArraySCP {
	 static boolean isPerfectSquare(int n) {
	        int can = (int) Math.sqrt(n);
	        return can * can == n;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Nhập số lượng phần tử n: ");
	        int n = sc.nextInt();
	        int[] a = new int[n];

	        for (int i = 0; i < n; i++) {
	            System.out.print("n" + (i + 1) + ": ");
	            a[i] = sc.nextInt();
	        }

	        System.out.print("Các số chính phương: ");
	        for (int i = 0; i < n; i++) {
	            if (isPerfectSquare(a[i])) {
	                System.out.print(a[i] + " ");
	            }
	        }

            }
      
	
}
