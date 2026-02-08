import java.util.Scanner;

public class GiaiPT {

	public static void main(String[] args) {
		Scanner PT=new Scanner(System.in);
		
		System.out.print("nhập hệ số a:");
		double a=PT.nextDouble();
		System.out.print("nhập hệ số b:");
		double b=PT.nextDouble();
		if(a==0) {
			if(b==0) 
				System.out.print("phương trình vô số nghiệm");
				else
				System.out.print("phương trình vô nghiệm");	
					
			}else {
				double x=-b/a;
				System.out.print("nghiệm:"+x);
			
			}
		}
	}


