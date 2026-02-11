package model;

public class Student {

    private int id;
    private String name;
    private int age;
    private String dept;
    private double marks;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public double getMarks() {
        return marks;
    }
    public String toString() {
        return "ID: " + id + " Name: " + name + " Age: " + age + "Dept:" + dept + "Marks: " +marks;
    }
}
