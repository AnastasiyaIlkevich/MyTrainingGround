package FreeIt.Journal;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Subject {
    String name;
//    Date date;
//    String topic;
//    String homeWork;




    public Subject(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
//                ", date=" + date +
//                ", topic='" + topic + '\'' +
//                ", homeWork='" + homeWork + '\'' +
                '}';
    }


}
