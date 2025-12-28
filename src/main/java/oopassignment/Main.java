package oopassignment;

public class Main {
    public static void main(String[] args) {

        // reference as superclass
        Human h1 = new Student(20, "Zhuldyz", false, "Computer Science", 3.5f);
        Human h2 = new Employee(28, "Aray", false, "Manager", 2500.0f);

        // reference as interface
        IStudy s1 = new Student(19, "Aruzhan", false, "IT", 3.8f);
        IWork w1 = new Employee(40, "Daryn", true, "Director", 5000.0f);

        h1.introduce();
        System.out.println("Role: " + h1.getRole());
        ((Student) h1).showGpa();

        h2.introduce();
        System.out.println("Role: " + h2.getRole());

        s1.study();
        s1.passExam();

        w1.work();
        w1.getSalary();

        System.out.println("Total employees: " + Employee.employeeCount);
    }
}
