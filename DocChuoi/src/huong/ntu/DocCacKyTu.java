package huong.ntu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DocCacKyTu {

	public static void main(String[] args) throws IOException {
		InputStreamReader inr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(inr);
		System.out.println("Nhập môt chuỗi bất kì ! ");
	String	lineDocDuoc = br.readLine();
	System.out.println("Chuỗi bạn vừa nhập là : " + lineDocDuoc);
	}

}
