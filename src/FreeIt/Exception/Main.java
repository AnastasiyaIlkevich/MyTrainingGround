package FreeIt.Exception;

public class Main {
    public static void main(String[] args){

        System.out.println("Start");

/*        int a = 12 / 0;
        System.out.println(a);*/

        String string = null;
        string.length();

/*        int []arrays = new int[10];
        for (int i = 0; i <= arrays.length; i++) {
            arrays[i] = i;
        }*/

/*        String str = "qwerty";
        System.out.println(str.substring(3,12));*/

/*        ArrayList <Long>list = new ArrayList<>();
        long b = 0;
        while (true){
            list.add(b);
            b++;
            System.out.println(b);
        }*/



//        registration();

/*             FileReader fileReader = null;
        try {
            fileReader = new FileReader("test2.json");
            System.out.println("read file");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileReader!=null){
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

//        try (FileReader fileReader1 = new FileReader("test2.json")){
//        } catch (Exception e) {
//            e.printStackTrace();
//
//            System.out.println("toString() " + e.toString());
//            System.out.println("getMessage() " + e.getMessage());
//
//
//
//        }

        System.out.println("finish");


    }

/*    private static void registration() {
        String username = null;
        int password = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите ник");
            username = scanner.nextLine();
            System.out.println("Введите числовой пароль");
            password = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException ex) {
            String message = ex.getMessage();
            System.out.println(message);
            registration();
        }
//        }finally {
//            if (username!=null&&password!=0){
//                registration();
//            }
//        }
        scanner.close();*//*
    System.out.println(username);
        System.out.println(password);
}*/

}



