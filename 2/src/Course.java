import java.util.ArrayList;

public class Course {
    private String courseName;
    private Professor professor;
    private ArrayList<Student> students;

    public Course(String courseName, Professor professor) {
        this.courseName = courseName;
        this.professor = professor;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printCourseInfo() {
        System.out.println("Course: " + courseName);
        System.out.println("Professor:");
        professor.printInfo();
        System.out.println("Students:");
        for (Student s : students) {
            s.printInfo();
        }
    }
}
