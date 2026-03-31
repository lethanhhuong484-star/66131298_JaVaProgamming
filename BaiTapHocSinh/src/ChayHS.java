

import java.util.ArrayList;
import java.util.Scanner;

public class ChayHS {

	public static void main(String[] args) {
		
	HocSinh hs1=new HocSinh();
	String  tenHS1="Lê Thanh Hướng";
	hs1.setTenHS(tenHS1);

	short tuoiHS1=20;
	hs1.setTuoiHS(tuoiHS1);

	String lopHS1="66.CNTT-1";
	hs1.setLopHS(lopHS1);
	
   HocSinh hs2 = new HocSinh("Nguyễn Văn Thức",(short)20,"66.DDT-2");
   
   System.out.println(hs1.toString());
   //System.out.println(hs2.toString());
   
   System.out.println("Nhập tên học sinh số 2:"+hs2.getTenHS());
   System.out.println("Nhập tuổi học sinh số 2:"+hs2.getTuoiHS());
   System.out.println("Nhập lớp học sinh số 2:"+hs2.getLopHS());
   
   Scanner sc =new Scanner(System.in);
   HocSinh hs3=new HocSinh();
  
   System.out.print("Nhập tên học sinh số 3:");
   String tenhs3=sc.nextLine();
   hs3.setTenHS(tenhs3);
   
   System.out.print("Nhập tuổi học sinh số 3:");
  short tuoihs3=sc.nextShort(); 
  sc.nextLine();
   hs3.setTuoiHS(tuoihs3);
   
   System.out.print("Nhập lớp học sinh số 3:");
   String lophs3=sc.nextLine();
   hs3.setLopHS(lophs3);
   
  System.out.println(hs3.toString());
   
  ArrayList<HocSinh> dsHocSinh=new ArrayList<HocSinh>();
  
  int N=3;
  for(int i=0;i<N;i++) {
	  HocSinh hsi=new HocSinh();
	  
	  System.out.print("Nhập tên học sinh số thêm:");
	   String tenhsi=sc.nextLine();
	   hsi.setTenHS(tenhsi);
	   
	   System.out.print("Nhập tuổi học sinh số thêm:");
	   short tuoihsi=sc.nextShort();
	  sc.nextLine();
	   hsi.setTuoiHS(tuoihsi);
	   
	   System.out.print("Nhập lớp học sinh số thêm:");
	   String lophsi=sc.nextLine();
	   hsi.setLopHS(lophsi);
	   
	   dsHocSinh.add(hsi);
  }
   for(int i=0;i<N;i++) {
	   System.out.println(dsHocSinh.get(i).toString());
   }
   HocSinh hsThem=new HocSinh();
  
	String  tenHSthem="Trần Hữu Lượng";
	hsThem.setTenHS(tenHSthem);

	short tuoiHSthem=20;
	hsThem.setTuoiHS(tuoiHSthem);

	String lopHSthem="Hệ thốn thôn tin";
	hsThem.setLopHS(lopHSthem);
   
  dsHocSinh.add(hsThem);
  
  for(int i=0;i<N;i++) {
	  System.out.println(dsHocSinh.get(i).toString());
  }
  for(int i=0;i<N;i++) {
  HocSinh hsTim=dsHocSinh.get(i);
  if(hsTim.getTenHS()=="Khôi") {
	  dsHocSinh.remove(hsTim);
	  break;
  }
  }
  for(int i=0;i<N;i++) {
	   System.out.println(dsHocSinh.get(i).toString());
  }
  
}
}
