package huong.ntu;

import java.io.*;
import java.util.*;

public class SapXepTT {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("D:\\66131298_JaVaProgamming\\DATA.txtT"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\66131298_JaVaProgamming\\Data2.TXT"));

        ArrayList<Integer> ds = new ArrayList<>();
        String line;

        while ((line = br.readLine()) != null) {
            String[] arr = line.split("\\s+");

            for (String s : arr) {
                if (!s.isEmpty()) {
                    ds.add(Integer.parseInt(s));
                }
            }
        }

        br.close();

      
        Collections.sort(ds);

   
        for (int n : ds) {
            bw.write(n + " ");
        }

        bw.close();
    }
}