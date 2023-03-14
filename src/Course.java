public class Course {
    String courseName;
    int courseNumber;
    String teacherName;
    String courseStartDate;

    public Course(String courseName,int courseNumber, String teacherName, String courseStartDate){
        this.courseName = courseName;
        this.courseNumber =courseNumber;
        this.teacherName =teacherName;
        this.courseStartDate =courseStartDate;
    }
    public Course(){

    }

    @Override
    public String toString() {
        return "Course: " +
                "courseName: " + courseName + "\n" +
                "courseNumber: " + courseNumber + "\n"+
                "teacherName: " + teacherName + "\n" +
                "courseStartDate: " + courseStartDate;
    }
}
