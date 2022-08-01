package FreeIt.Journal;

public interface Journal {

    void addSubject(String name);
    void addStudent(String[] name);
    String[] allStudent();
    Subject[] allSubject();
    void deleteStudent(String name, String[] allStudent);


}
