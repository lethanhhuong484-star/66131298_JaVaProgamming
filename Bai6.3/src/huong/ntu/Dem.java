package huong.ntu;

import java.io.*;

public class Dem {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("D:\\66131298_JaVaProgamming\\DocGhiFile.txt"));

        String line;
        int soDong = 0;
        int soTu = 0;
        int soKyTu = 0;

        while ((line = br.readLine()) != null) {
            soDong++;

        
            soKyTu += line.length();

       
            String[] words = line.trim().split("\\s+");
            if (!line.trim().isEmpty()) {
                soTu += words.length;
            }
        }

        br.close();

    
        System.out.println("So dong: " + soDong);
        System.out.println("So tu: " + soTu);
        System.out.println("So ky tu: " + soKyTu);
    }
}