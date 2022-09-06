package OvO.IOAPI.Ex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterRunner {
    public static void main(String[] args) {
        try (
                FileReader fr = new FileReader("download.html");
                FileWriter fw = new FileWriter("download.txt");
        ) {
            long start = System.currentTimeMillis();
//            int a;
//            while ((a = fr.read()) != -1) {
//				fw.write(a);
//            }
//            System.out.println(System.currentTimeMillis() - start);

//            start = System.currentTimeMillis();
            BufferedReader br = new BufferedReader(fr);
            String res = "";
            while (res != null) {
                res = br.readLine();
                if(res != null) {
                    fw.write(res);
                }
            }
            System.out.println(System.currentTimeMillis() - start);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}