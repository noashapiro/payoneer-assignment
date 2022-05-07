import java.util.ArrayList;
import java.util.List;

public class StudentsCourses {

    public static void main(String[] args) {
        ArrayList<StudentCourseGrade> studentsList =new ArrayList<>();
        StudentCourseGrade student1 = new StudentCourseGrade(1,1123,34);
        StudentCourseGrade student2 = new StudentCourseGrade(1,1124,88);
        StudentCourseGrade student3 = new StudentCourseGrade(2,1123,65);
        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);

       StudentCourses studentCoursesList = studentCourse(studentsList);

    }

    public static StudentCourses studentCourse(List<StudentCourseGrade> studentList){
        int studentID = 0;
        int courseID =0;
        List<Integer> allStudents = new ArrayList<>();
        List<Integer> courses=new ArrayList<>();

        for (int i=0; i<studentList.size(); i++){
           StudentCourseGrade student = studentList.get(i);
           studentID = student.getStudentId();
           allStudents.add(studentID); //check if there is student ID
           courseID = student.getCourseId();
        }

        courses.add(courseID);


        StudentCourses student = new StudentCourses(studentID, courses);
        return student;
    }
}


