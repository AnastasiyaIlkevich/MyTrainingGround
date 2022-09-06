package OvO.IOAPI.Ex;

import java.io.IOException;
import java.io.InputStreamReader;

public class ISR {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = null;

        try {
            isr = new InputStreamReader(System.in);
            System.out.println("type something...");
            char ch;
            do {
                ch = (char) isr.read();
                System.out.print(ch + " ");
            } while (ch != 'q');
        }finally {
            if(isr != null) {
                isr.close();
                System.out.println("Program finished!");
            }
        }

    }
}
