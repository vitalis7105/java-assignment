 class Vehicle {
    String brand;
    int year;

   
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

   
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}


class Car extends Vehicle {
    int seats;

    
    public Car(String brand, int year, int seats) {
        super(brand, year); // Call the constructor of Vehicle
        this.seats = seats;
    }

    
  
    public void displayDetails() {
        super.displayDetails(); // Display details from Vehicle
        System.out.println("Seats: " + seats);
    }
}


public class Main {
    public static void main(String[] args) {
     
        Car myCar = new Car("Toyota", 2022, 5);
        
      
        myCar.displayDetails();
    }
}