package thigk2.lethanhhuong_66131298;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Cau3 {

	public static void main(String[] args) throws IOException {
		
BufferedReader br = new BufferedReader(
			new FileReader("File100SN.txt")
		);

		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}

		br.close();
		// Kiểm tra xem số 8 có trong văn bản hay không
		int X=8;
		if(line.contains(Integer.toString(X))) {
			System.out.println("\nSố " + X + " có trong văn bản.");
		} else {
			System.out.println("\nSố " + X + " không có trong văn bản.");
		}
	}

}
