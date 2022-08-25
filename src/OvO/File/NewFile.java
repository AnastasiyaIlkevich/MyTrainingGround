package OvO.File;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class NewFile {

    public static void main(String[] args) throws IOException {

/*        // 1 способ
        try {
            Files.createFile(Path.of("test.txt"));//создание файла
        } catch (IOException e) {
            System.out.println("файл уже создан!");
        }

        try {
            Files.delete(Path.of("test.txt"));// удаляем
        } catch (IOException e) {
            System.out.println("нельзя удалить файл которого и так нет!");
        }*/

        //2способ

        if (!Files.exists(Path.of("test.txt"))){
            Files.createFile(Path.of("test.txt"));//создание файла
        }

   //     String text = "I like Java!!!!";
        File file = new File("test.txt");
    //    FileWriter fileWriter = new FileWriter(file);
    //    fileWriter.write(text);
    //    fileWriter.close();

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String str = null;
        while ( (str = bufferedReader.readLine())!=null){
            System.out.println(str);
        }


/*        if (Files.exists(Path.of("test.txt"))){
            Files.delete(Path.of("test.txt"));// удаляем
        }*/
    }
}
