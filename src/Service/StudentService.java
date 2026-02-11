package Service;

import java.util.*;
import model.Student;

public class StudentService {

    ArrayList<Student> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addStudent() {

        Student s = new Student();

        System.out.println("Enter Id:");
        s.setId(sc.nextInt());
        sc.nextLine();

        System.out.println("Enter Name:");
        s.setName(sc.nextLine());

        System.out.println("Enter Age:");
        s.setAge(sc.nextInt());
        sc.nextLine();

        System.out.println("Enter Department:");
        s.setDept(sc.nextLine());

        System.out.println("Enter Marks:");
        s.setMarks(sc.nextDouble());

        list.add(s);

        System.out.println("Student Added Successfully");
    }

    public void viewStudent() {

        if (list.isEmpty()) {
            System.out.println("No student found");
            return;
        }

        for (Student s : list) {
            System.out.println(
                s.getId() + " " +
                s.getName() + " " +
                s.getAge() + " " +
                s.getDept() + " " +
                s.getMarks()
            );
        }
    }

    public void searchStudent() {

        System.out.println("Enter Id:");
        int id = sc.nextInt();

        for (Student s : list) {
            if (s.getId() == id) {
                System.out.println("Found:");
                System.out.println(s.getName());
                return;
            }
        }

        System.out.println("Student not found");
    }

    public void deleteStudent() {

        System.out.println("Enter Id:");
        int id = sc.nextInt();

        Iterator<Student> it = list.iterator();

        while (it.hasNext()) {
            Student s = it.next();
            if (s.getId() == id) {
                it.remove();
                System.out.println("Deleted Successfully");
                return;
            }
        }

        System.out.println("Student not found");
    }
}
