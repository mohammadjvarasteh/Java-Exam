public class main {
    public static void main(String[] args) {
        Professor prof = new Professor("Dr. Alireza Sazgar", "Computer Science");
        Course course = new Course("Java Programming", prof);

        Student s1 = new Student("Ali", 1001);
        Student s2 = new Student("Mohammad Javad", 1002);

        
        course.addStudent(s1);
        course.addStudent(s2);

        course.printCourseInfo();
    }
}