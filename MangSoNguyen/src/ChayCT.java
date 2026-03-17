import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ChayCT {

	public static void main(String[] args) {
		
ArrayList<Integer>dsSoNguyen=new ArrayList<Integer>();
Scanner banPham=new Scanner(System.in);
for(int i=0;i<10;i++) {
	System.out.print("Nhập phần tử thứ "+i+":");
	Integer tam=banPham.nextInt();
	dsSoNguyen.add(tam);
}
System.out.print("DANH SÁCH VỪA NHẬP LÀ :");
for(int i=0;i<dsSoNguyen.size();i++) {
	Integer tam=dsSoNguyen.get(i);
	System.out.print(tam+" ");
}
int soluongPTChan=0;
for(int i=0;i<dsSoNguyen.size();i++) {
	Integer tam=dsSoNguyen.get(i);
	if(tam %2 ==0) soluongPTChan=soluongPTChan+1;
}
System.out.println("\nsố chẳn là:"+soluongPTChan);

int TongAll=0;
for(Integer x :dsSoNguyen) {
	TongAll=TongAll+x;

}	
System.out.print("tổng danh sách là: "+TongAll);
	}

}
