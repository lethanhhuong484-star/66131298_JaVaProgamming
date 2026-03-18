import java.util.Scanner;

public class KTra {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhập số kiểm tra :");
        int n = sc.nextInt();
      
        if (n % 2 == 0)
            System.out.println("là số chẵn");
        else
            System.out.println("la số lẻ");
	}

}
