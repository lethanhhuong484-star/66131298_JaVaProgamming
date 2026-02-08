package baitap3;

public class BaiTap_3 {

	public static void main(String[] args) {
		double N= 60;
		double H= 1.80;
		
		double BMI= N / ( H * H );
		
		System.out.println("cân nặng:"+N );
		System.out.println("chiều cao:"+H);
		System.out.println("chỉ số BMI:"+BMI);
		
		if(BMI<18.5){
			System.out.println("ốm");	
		}else if(BMI<25){
			System.out.println("đủ");
		}else if(BMI<30){
			System.out.println("béo");
		}
	}
}		
