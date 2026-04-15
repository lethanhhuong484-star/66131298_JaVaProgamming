package huong.ntu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DocFile {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
            new FileReader("DocGhiFile.txt")
        );

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}