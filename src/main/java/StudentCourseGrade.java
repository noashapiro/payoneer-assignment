public class StudentCourseGrade{
    public int studentId;
    public int courseId;
    public int grade;

    public StudentCourseGrade (int studentId, int courseId, int grade){
        this.studentId = studentId;
        this.courseId = courseId;
        this.grade = grade;
    }
     public int getStudentId(){
        return studentId;
     }
    public int getCourseId(){
        return courseId;
    }
    public int getGrade(){
        return grade;
    }
}
