package thigk2.lethanhhuong_66131298;

import java.util.ArrayList;

public class ChayCau2 {
 public static void main(String[] args) {
	 
	 
	 Cau2.sinhvien sv1 = new Cau2().new sinhvien("Nguyễn Văn Thức", 19, 2007);
	 Cau2.sinhvien sv2 = new Cau2().new sinhvien("Trần Hữu Lượng", 20, 2006);
	 Cau2.sinhvien sv3 = new Cau2().new sinhvien("Lê Thanh Huong", 20, 2006);
	 
	 System.out.println("Thông tin sinh viên 1:");
	 System.out.println("Tên: " + sv1.getTen());
	 System.out.println("Tuổi: " + sv1.getTuoi());
	 System.out.println("Năm sinh: " + sv1.getNamsinh());
	 
	 System.out.println("\nThông tin sinh viên 2:");
	 System.out.println("Tên: " + sv2.getTen());
	 System.out.println("Tuổi: " + sv2.getTuoi());
	 System.out.println("Năm sinh: " + sv2.getNamsinh());
	 
	 System.out.println("\nThông tin sinh viên 3:");
	 System.out.println("Tên: " + sv3.getTen());
	 System.out.println("Tuổi: " + sv3.getTuoi());
	 System.out.println("Năm sinh: " + sv3.getNamsinh());
	 
	 ArrayList<Cau2.sinhvien> sinhvienList = new ArrayList<>();
	  int N = 1;
	  for (int i = 0; i < N; i++) {
		  Cau2.sinhvien sv = new Cau2().new sinhvien();
		  System.out.print("Nhập tên sinh viên thêm: ");
		  String tensv = System.console().readLine();
		  sv.setTen(tensv);
		  System.out.print("Nhập tuổi sinh viên thêm: ");
		  int tuoisv = Integer.parseInt(System.console().readLine());
		  sv.setTuoi(tuoisv);
		  System.out.print("Nhập năm sinh sinh viên thêm: ");
		  double namsinhsv = Double.parseDouble(System.console().readLine());
		  sv.setNamsinh(namsinhsv);
		  sinhvienList.add(sv);
		  
		  
	  }
 }
}
