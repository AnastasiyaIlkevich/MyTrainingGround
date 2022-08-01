package FreeIt.Journal;

import java.util.Arrays;

public class RunnerJournal {
    public static void main(String[] args) {
        String strName = "Шабалин Порфирий\n" +
                "Досаев Семен\n" +
                "Ломадуров Иосиф\n" +
//                "Яковиченко Антип\n" +
//                "Сюсин Тарас\n" +
//                "Хлопонин Олег\n" +
//                "Колосов Радион\n" +
//                "Кузарин Артур\n" +
//                "Рыбьяков Емельян\n" +
//                "Нустров Радислав\n" +
//                "Форофонтов Федосий\n" +
//                "Ячменев Макар\n" +
//                "Кочубей Геннадий\n" +
//                "Беленков Данила\n" +
                "Шурьев Якуб";
        JournalImpl journal = new JournalImpl("7Б","Иванов Иван Иванович");
        System.out.println(journal);
     //   Subject subject = new Subject();
      //  System.out.println(subject);
        journal.addSubject(SubjectList.MATHS.name());
        journal.addSubject(SubjectList.CHEMISTRY.name());
        System.out.println(journal);
        System.out.println(journal.size(journal.subject));
        System.out.println(Arrays.toString(journal.allSubject()));

        String []arrayName = strName.split("\n");
        System.out.println(Arrays.toString(arrayName));
        System.out.println(arrayName.length);

        journal.addStudent(arrayName);
        System.out.println(journal);
        System.out.println(Arrays.toString(journal.student));
        journal.deleteStudent("Шабалин Порфирий", journal.allStudent());
        System.out.println(Arrays.toString(journal.student));
        System.out.println(journal);

    }
}
