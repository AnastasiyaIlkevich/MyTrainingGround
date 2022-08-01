package FreeIt.Journal;

import java.util.Arrays;

public class JournalImpl implements Journal{
    String className;
    String classroomTeacher;
    Subject[] subject;
    String[] student;

    public JournalImpl(String className, String classroomTeacher) {
        this.className = className;
        this.classroomTeacher = classroomTeacher;
        this.subject = new Subject[SubjectList.values().length];
        this.student = new String[30];
    }

    public void addSubject(String name) {
        for (int i = 0; i < subject.length; i++) {
            if (subject[i] == null) {
                this.subject[i] = new Subject(name);
                break;
            }
        }
    }

    public void addStudent(String[] name) {
        for (int i = 0; i < student.length && i < name.length; i++) {
            if (student[i] == null) {
                student[i] = name[i];
            }
        }
    }

    int size(Object[] o) {
        int size = 0;
        for (Object value : o) {
            if (value != null)
                size++;
        }
        return size;
    }

    public String[] allStudent() {
        String[] allStudent = Arrays.copyOf(student, size(student));
        Arrays.sort(allStudent);
        return allStudent;
    }

    public Subject[] allSubject() {
        return Arrays.copyOf(subject, size(subject));
    }

    public void deleteStudent(String name, String[] allStudent) {
        boolean ifHaveStudent = false;
        int index=0;
        for (int i = 0; i <student.length ; i++) {
           if (student[i].equals(name)){
               student[i]=null;
               ifHaveStudent = true;
               break;
        }
//        int i = Arrays.binarySearch(allStudent, name);
//        if (i >= 0) {
//            allStudent[i] = null;
        }
        if (ifHaveStudent){
            for (int i = index; i <student.length-1; i++) {
                student[i] = student[i+1];
            }
        }

    }

    @Override
    public String toString() {
        return "Journal{" +
                "className='" + className + '\'' +
                ", classroomTeacher='" + classroomTeacher + '\'' +
                ", subject=" + Arrays.toString(allSubject()) +
                ", student=" + Arrays.toString(allStudent()) +
                '}';
    }
}
