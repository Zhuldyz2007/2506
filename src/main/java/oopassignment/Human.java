package oopassignment;

public abstract class Human {

    protected int age;
    protected String name;
    protected boolean married;

    public Human(int age, String name, boolean married) {
        this.age = age;
        this.name = name;
        this.married = married;
    }

    public void introduce() {
        System.out.println("My name is " + name + ", I am " + age + " years old.");
    }

    // abstract method (НОВОЕ ТРЕБОВАНИЕ)
    public abstract String getRole();
}
