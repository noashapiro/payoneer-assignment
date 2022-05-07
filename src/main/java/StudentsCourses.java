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

        studentCourse(studentsList);
        avgGrade(studentsList);

    }

    public static void studentCourse(List<StudentCourseGrade> studentList){
        int studentID = 0;
        int courseID =0;
        List<Integer> studentIdReference = new ArrayList<>();
        studentIdReference.add(studentList.get(0).studentId);

        List<Integer> courses=new ArrayList<>();

        for (int i=0; i<studentList.size(); i++){
           studentID = studentList.get(i).getStudentId();
           courseID = studentList.get(i).getCourseId();

           if (studentIdReference.contains(studentID)){
               courses.add(courseID);
               StudentCourses studentCourseList = new StudentCourses(studentID, courses);
           } else
               studentIdReference.add(studentID);
               StudentCourses newStudentCourseList = new StudentCourses(studentID, courses);
        }

    }

    public static void avgGrade(List<StudentCourseGrade> studentList){
        int courseID = 0;
        int grade = 0;
        List<Integer> courseIdReference = new ArrayList<>();
        courseIdReference.add(studentList.get(0).courseId);

        for (int i=0; i<studentList.size(); i++){
            courseID = studentList.get(i).getCourseId();
            grade = studentList.get(i).getGrade();

            if (i=0){
                grade +=grade;
                CourseGrades course = new CourseGrades(courseID)
            }
            if (courseIdReference.contains(courseID)){
                CourseGrades course1 = new CourseGrades(courseID,)
            }
        }



    }
}


