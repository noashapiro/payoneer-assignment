import java.util.List;

public class StudentCourses
{
    public int studentId;
    public List<Integer> courses;

    public StudentCourses(int StudentId, List<Integer> Courses){
        this.studentId = studentId;
        this.courses = courses;
    }
    public int getStudentId(){
        return studentId;
    }
    public void setCourses(List<Integer> courses) {
        courses = courses;
    }

}