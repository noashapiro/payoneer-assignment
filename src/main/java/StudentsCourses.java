import java.util.ArrayList;
import java.util.List;

public class StudentsCourses {

    public static void main(String[] args) {
        ArrayList<StudentCourseGrade> studentsList = new ArrayList<>();
        StudentCourseGrade student1 = new StudentCourseGrade(1, 1123, 34);
        StudentCourseGrade student2 = new StudentCourseGrade(1, 1124, 88);
        StudentCourseGrade student3 = new StudentCourseGrade(2, 1123, 65);
        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);

        AddCoursesByStudent(studentsList);
        avgGradePerCourse(studentsList);

    }

    public static void AddCoursesByStudent(List<StudentCourseGrade> studentList) {
        for (int i = 0; i < studentList.size(); i++) {
            List<Integer> courses = new ArrayList<>();
            courses.clear();
            int studentID = studentList.get(i).getStudentId();
            for (int j = 0; j < studentList.size(); j++) {
                int courseID = studentList.get(j).getCourseId();
                if (studentList.get(j).getStudentId() == studentID) {
                    courses.add(courseID);
                }
            }
            StudentCourses studentCourseList = new StudentCourses(studentID, courses);
        }
    }

    public static void avgGradePerCourse(List<StudentCourseGrade> studentList) {
        List<Integer> avgGradePerCourse = new ArrayList<>();

        for (int i = 0; i < studentList.size(); i++) {
            int countCourse=0;
            int sumGradesOfCourse=0;
            int courseID = studentList.get(i).getCourseId();
            for (int j=0;j<studentList.size();j++){
                int grade=studentList.get(j).getGrade();
                if (studentList.get(j).getCourseId()==courseID){
                    countCourse++;
                    sumGradesOfCourse+=grade;
                }
            }
            int avg = getAvg(countCourse,sumGradesOfCourse);
             avgGradePerCourse.add(avg);
        }
    }

    public static int getAvg(int countCourse, int sumGradesOfCourse){
        return sumGradesOfCourse/countCourse;
    }
}