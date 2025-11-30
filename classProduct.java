import java.util.Scanner;

public class Product {

    private String name;
    private double price;
    
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    
    public void applyDiscount(double percentage) {
        if (percentage >= 0 && percentage <= 100) {
            double discountAmount = this.price * (percentage / 100);
            this.price = this.price - discountAmount;
        } else {
            System.out.println("Invalid discount percentage! Please enter between 0-100.");
        }
    }
    
   
    public double getPrice() {
        return this.price;
    }
    
    
    public String getName() {
        return this.name;
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        Product laptop = new Product("Gaming Laptop", 1200.00);
        
        System.out.println("Online Store - Discount Calculator");
        System.out.println("==================================");
        System.out.println("Product: " + laptop.getName());
        System.out.println("Original Price: $" + laptop.getPrice());
        
        
        System.out.print("\nEnter discount percentage (0-100): ");
        double discountPercentage = scanner.nextDouble();
        
        
        laptop.applyDiscount(discountPercentage);
        
        
        System.out.println("\nAfter applying " + discountPercentage + "% discount:");
        System.out.println("New Price: $" + String.format("%.2f", laptop.getPrice()));
        
        scanner.close();
    }
}