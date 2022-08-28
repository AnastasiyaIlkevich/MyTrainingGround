package OvO.IOAPI;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileInputStreamAndOutputStream {

    public static void main(String[] args) {
        int n = 10;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             FileOutputStream outputStream = new FileOutputStream("test.txt");) {
            for (int i = 0; i < n; i++) {
                String str = bufferedReader.readLine()+"\n";
                if (n <= str.length()) {
                    outputStream.write(str.getBytes(StandardCharsets.UTF_8));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
