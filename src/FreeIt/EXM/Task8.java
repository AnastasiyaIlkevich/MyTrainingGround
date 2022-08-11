package FreeIt.EXM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split(" ");
        Integer[] num = {Integer.parseInt(s[0]), Integer.parseInt(s[1])};
        String[] domains = new String[num[0]];
        String[][] clients = new String[num[1]][2];
        for (int i = 0; i < domains.length; i++) {
            domains[i] = bufferedReader.readLine();
        }
        for (int i = 0; i < clients.length; i++) {
            clients[i] = bufferedReader.readLine().split(" ");
        }

        for (int i = 0; i < clients.length; i++) {//4
            int count =0;
            for (int j = 0; j < domains.length; j++) {//3
                if (domains[j].startsWith(clients[i][0])&&domains[j].endsWith(clients[i][1])){
                    count++;
                }
            }
            System.out.println(count);
        }
    }


}
