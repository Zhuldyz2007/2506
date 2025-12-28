package oopassignment;

public final class Student extends Human implements IStudy {

    private String major;
    private final float gpa;   // final field

    public Student(int age, String name, boolean married, String major, float gpa) {
        super(age, name, married);
        this.major = major;
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    // final method
    public final void showGpa() {
        System.out.println("GPA: " + gpa);
    }

    @Override
    public void study() {
        System.out.println("Student is studying");
    }

    @Override
    public void passExam() {
        System.out.println("Student passed exam");
    }

    @Override
    public String getRole() {
        return "Student";
    }
}
