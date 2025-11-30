public class FitnessTracker {
    
    
    public static String getFitnessLevel(int steps) {
        if (steps >= 10000) {
            return "Excellent";
        } else if (steps >= 7000) {
            return "Good";
        } else if (steps >= 4000) {
            return "Average";
        } else {
            return "Poor";
        }
    }
    

    public static void main(String[] args) {
        // Test cases with different step counts
        int[] testSteps = {3500, 5000, 7500, 12000, 2500, 8500, 10000};
        
        System.out.println("Fitness Level Analysis:");
        System.out.println("======================");
        
        for (int steps : testSteps) {
            String fitnessLevel = getFitnessLevel(steps);
            System.out.println(steps + " steps: " + fitnessLevel + " fitness level");
        }
        
        
        System.out.println("\nSample User Progress:");
        System.out.println("====================");
        
        
        int mondaySteps = 8500;
        int tuesdaySteps = 11000;
        int wednesdaySteps = 3500;
        int thursdaySteps = 6000;
        int fridaySteps = 9500;
        
        System.out.println("Monday: " + mondaySteps + " steps - " + getFitnessLevel(mondaySteps));
        System.out.println("Tuesday: " + tuesdaySteps + " steps - " + getFitnessLevel(tuesdaySteps));
        System.out.println("Wednesday: " + wednesdaySteps + " steps - " + getFitnessLevel(wednesdaySteps));
        System.out.println("Thursday: " + thursdaySteps + " steps - " + getFitnessLevel(thursdaySteps));
        System.out.println("Friday: " + fridaySteps + " steps - " + getFitnessLevel(fridaySteps));
    }
}