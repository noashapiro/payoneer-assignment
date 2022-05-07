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
        List<Integer> doneStudents = new ArrayList<>();
        List<Integer> courses = new ArrayList<>();

        for (int i = 0; i < studentList.size(); i++) {
            courses.clear();
            int studentID = studentList.get(i).getStudentId();

            if (!doneStudents.contains(studentID)){
                for (int j = 0; j < studentList.size(); j++) {
                    int courseID = studentList.get(j).getCourseId();
                    if (studentList.get(j).getStudentId() == studentID) {
                        courses.add(courseID);
                    }
                }
                StudentCourses studentCourseList = new StudentCourses(studentID, courses);
                doneStudents.add(studentID);
            }

        }
    }

    public static void avgGradePerCourse(List<StudentCourseGrade> studentList) {
        List<Integer> avgGradePerCourse = new ArrayList<>();
        List<Integer> doneCourses = new ArrayList<>();
        for (int i = 0; i < studentList.size(); i++) {
            int countCourse=0;
            int sumGradesOfCourse=0;
            int courseID = studentList.get(i).getCourseId();
            if (!doneCourses.contains(courseID)){
                for (int j=0;j<studentList.size();j++){
                    int grade=studentList.get(j).getGrade();
                    if (studentList.get(j).getCourseId()==courseID){
                        countCourse++;
                        sumGradesOfCourse+=grade;
                    }
                }
                int avg = getAvg(countCourse,sumGradesOfCourse);
                avgGradePerCourse.add(avg);
                doneCourses.add(courseID);
            }
        }
        System.out.println(avgGradePerCourse);
    }

    public static int getAvg(int countCourse, int sumGradesOfCourse){
        return sumGradesOfCourse/countCourse;
    }
}