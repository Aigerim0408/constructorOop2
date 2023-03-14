public class Main {
    public static void main(String[] args) {
        Course course = new Course("Java",2,
                "Azamat Muratov","01.02.2023");
        Student student = new Student("Aigerim","04.08.1990",-32);
        System.out.println(course + "\n"+ student);
    }
}