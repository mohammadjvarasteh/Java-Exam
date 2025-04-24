public class Professor {
    private String name;
    private String department;

    public Professor(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void printInfo() {
        System.out.println("Professor Name: " + name + ", Department: " + department);
    }
}
