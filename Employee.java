import java.util.Scanner;


class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}


class Lecturer extends Employee {
    private String department;

    public Lecturer(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        sc.nextLine(); // consume newline

        System.out.print("Enter department: ");
        String department = sc.nextLine();

        
        Lecturer lecturer = new Lecturer(name, salary, department);

     
        System.out.println("\n--- Lecturer Information ---");
        lecturer.displayInfo();

        sc.close();
    }
}