package OvO.StremAPI;

import java.util.stream.Stream;

public class StreamApiEx1 {
    public static void main(String[] args) {

//        streamIterate();
//        streamIterate2();
//        streamGenerate();


    }

    private static void streamIterate2() {
        Stream.iterate(1, x -> x * 2)
                .limit(3)
                .forEach(System.out::println);
    }

    private static void streamGenerate() {
        Stream.generate(() -> 5)
                .limit(5)
                .forEach(System.out::println);
    }

    private static void streamIterate() {
        Stream.iterate(2, x -> x + 10)
                .limit(3)
                .forEach(System.out::println);
    }


}
