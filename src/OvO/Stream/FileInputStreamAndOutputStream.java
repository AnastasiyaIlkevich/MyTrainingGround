package OvO.Stream;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
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
