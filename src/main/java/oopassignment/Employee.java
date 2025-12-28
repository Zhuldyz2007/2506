package oopassignment;

public class Employee extends Human implements IWork, IStudy {

    private String position;
    private float salary;

    public static int employeeCount = 0;

    public Employee(int age, String name, boolean married, String position, float salary) {
        super(age, name, married);
        this.position = position;
        this.salary = salary;
        employeeCount++;
    }

    public String getPosition() {
        return position;
    }

    public float getSalaryValue() {
        return salary;
    }

    @Override
    public void work() {
        System.out.println("Employee is working");
    }

    @Override
    public void getSalary() {
        System.out.println("Salary: " + salary);
    }

    @Override
    public void study() {
        System.out.println("Employee is studying");
    }

    @Override
    public void passExam() {
        System.out.println("Employee passed exam");
    }

    @Override
    public String getRole() {
        return "Employee";
    }
}
