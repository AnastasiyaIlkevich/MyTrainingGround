package OvO.IOAPI.MyExp;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayInputStreamExample {
    public static void main(String[] args) throws IOException {

        byte[]byteArray = "I like Java!!!!".getBytes();

        for (int i = 0; i < byteArray.length; i++) {
            System.out.print(byteArray[i] + " ");
        }

        ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int a;
        while((a = bais.read()) != -1) {
            baos.write(a);
        }
        byte [] outputByteArray = baos.toByteArray();
        System.out.println();

        for(int i =0; i<outputByteArray.length; i++) {
            System.out.print((char)outputByteArray[i]);
        }

        bais.close();
        baos.close();

    }
}
