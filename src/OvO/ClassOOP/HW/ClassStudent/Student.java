package OvO.ClassOOP.HW.ClassStudent;



public class Student {
    private String surname;
    private String name;
    private byte[] grade;


    public Student(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public void setGrade(String strGrades) {
        String[] arrayGrades = strGrades.split(" ");
        byte[] grade = new byte[arrayGrades.length];


        for (int i = 0; i < arrayGrades.length; i++) {
            grade[i] = Byte.parseByte(arrayGrades[i]);
        }
         this.grade = grade;
    }

    public double averageScore() {
        int sum = 0;
        for (int i = 0; i <this.grade.length ; i++) {
           sum=sum + this.grade[i];
        }
        return (double)sum/this.grade.length;
    }
}
