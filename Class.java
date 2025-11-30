import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        
        double marks = 0;
        boolean validInput = false;
        
        while (!validInput) {
            System.out.print("Enter student marks (0-100): ");
            if (scanner.hasNextDouble()) {
                marks = scanner.nextDouble();
                if (marks >= 0 && marks <= 100) {
                    validInput = true;
                } else {
                    System.out.println("Please enter marks between 0 and 100.");
                }
            } else {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next(); // Clear invalid input
            }
        }
        
       
        Student student = new Student(name, marks);
        
       
        GradeCalculator gradeCalculator = new GradeCalculator();
        
        
        String grade = gradeCalculator.calculateGrade(marks);
        
       
        System.out.println("\n--- Student Report ---");
        student.displayDetails();
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
}