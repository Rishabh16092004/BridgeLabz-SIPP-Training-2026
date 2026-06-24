class Person1 {
    String name;
    int age;

    Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
class Students extends Person1 {
    final int studentId;
    double gpa;

    Students(String name, int age, int studentId, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Student ID: " + studentId +
                ", GPA: " + gpa;
    }
}
class GradStudent extends Students {
    String thesis;

    GradStudent(String name, int age, int studentId,
                double gpa, String thesis) {
        super(name, age, studentId, gpa);
        this.thesis = thesis;
    }
    @Override
    public String toString() {
        return super.toString() +
                ", Thesis: " + thesis;
    }
}

public class UniversitySystem {
    public static void main(String[] args) {

        GradStudent gs = new GradStudent("Rishabh", 22, 101, 8.9, "Machine Learning");

        System.out.println(gs);
        Person1 p = gs;
        Students s = gs;
        System.out.println("\nIS-A Relationship Demonstrated:");
        System.out.println("GradStudent IS-A Student: " + (s instanceof Students));
        System.out.println("GradStudent IS-A Person: " + (p instanceof Person1));
    }
}