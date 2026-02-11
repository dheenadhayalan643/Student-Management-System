package main;

import java.util.*;
import service.StudentService;

public class Main {

    public static void main(String[] args) {

        StudentService service = new StudentService();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Student Management System");

        while (true) {

            System.out.println("\n1.Add Student");
            System.out.println("2.View Students");
            System.out.println("3.Search Student");
            System.out.println("4.Delete Student");
            System.out.println("5.Exit");

            System.out.println("Choose the number:");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    service.addStudent();
                    break;

                case 2:
                    service.viewStudent();
                    break;

                case 3:
                    service.searchStudent();
                    break;

                case 4:
                    service.deleteStudent();
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
