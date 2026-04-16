package huong.ntu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Doc {

	public static void main(String[] args) throws IOException {
	FileReader fr = new FileReader("input.txt");
	BufferedReader br = new BufferedReader(fr);
	String line1=br.readLine();
	int so1=Integer.parseInt(line1);
	String line2=br.readLine();
	int so2=Integer.parseInt(line2);
	int tong=so1+so2;
	System.out.println("Tong 2 so la: "+tong);
	
	}

}
