package OvO.IOAPI;

import java.io.*;


public class ReadAndWriteSymbol {

    public static void main(String[] args) {
        int count = 0;
        File file = new File("test.txt");

        try (FileReader fileReader = new FileReader(file)
        ) {
            while (fileReader.ready()) {
                int symbol = fileReader.read();
                if (symbol == 'a') {
                    count++;
                }
            }

        } catch (FileNotFoundException e) {
            System.out.printf("File \"%s\" does not exist\n", file.getName());
        } catch (IOException e) {
            System.out.println("Data input/output exception");

        }

        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(String.valueOf(count));
        } catch (IOException e) {
            System.out.println("Data input/output exception");
        }
    }
}

