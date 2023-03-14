public class Student {
    String studentName;
    String studentBirthday;
    int age;
    public Student(String studentName, String studentBirthday, int age){
        this.studentName = studentName;
        this.studentBirthday = studentBirthday;
        if (age>=0){
        this.age = age;
        }else
            System.out.println("Wrong age");
    }
    public Student(){

    }

    @Override
    public String toString() {
        return "Student:" +
                "studentName" + studentName + "\n" +
                "studentBirthday: " + studentBirthday + "\n" +
                "age:" + age;
    }
}
