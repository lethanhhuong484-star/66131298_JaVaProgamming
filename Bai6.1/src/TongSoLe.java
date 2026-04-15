
import java.io.*;

public class TongSoLe {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("DATA.INP"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("DATA.OUT"));

        String line;
        int tong = 0;

        // Đọc từng dòng
        while ((line = br.readLine()) != null) {
            // Tách các số trong dòng
            String[] arr = line.split("\\s+");

            for (String s : arr) {
                int n = Integer.parseInt(s);

                // Kiểm tra số lẻ
                if (n % 2 != 0) {
                    tong += n;
                }
            }
        }

        // Ghi kết quả ra file
        bw.write("Tong so le = " + tong);

        br.close();
        bw.close();
    }
}