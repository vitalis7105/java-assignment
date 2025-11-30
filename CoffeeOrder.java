public class CoffeeOrder {
  
    private String size;
    private double price;
    
    
    public CoffeeOrder(String size, double price) {
        this.size = size;
        this.price = price;
    }
    
    
    public String getSize() {
        return size;
    }
    
    public double getPrice() {
        return price;
    }
    
    
    public void displayOrder() {
        System.out.println("Size: " + size + ", Price: $" + price);
    }
    
    
    public static void main(String[] args) {
        
        CoffeeOrder order1 = new CoffeeOrder("Large", 4.50);
        CoffeeOrder order2 = new CoffeeOrder("Medium", 3.25);
        
       
        System.out.println("Coffee Shop Orders:");
        System.out.println("===================");
        System.out.print("Order 1: ");
        order1.displayOrder();
        
        System.out.print("Order 2: ");
        order2.displayOrder();
        
        
        System.out.println("\nAlternative Display:");
        System.out.println("Order 1 - Size: " + order1.getSize() + ", Price: $" + order1.getPrice());
        System.out.println("Order 2 - Size: " + order2.getSize() + ", Price: $" + order2.getPrice());
    }
}