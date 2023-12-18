/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pmuride;

/**
 *
 * @author demah55
 */
public class PmuRide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stirng driver=null; 
        Strign rider=null; 
        System.out.println("welcome to pmuRide share Application");
    }
    // Method to add a ride to the history
    public void addRide(Date date, String pickupLocation, String dropOffLocation, double cost) {
        Ride rider = new Ride(date, pickupLocation, dropOffLocation, cost);
        rideHistory.add(ride);
    }
    
}

 public static void manageUserAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an option:\n1. Sign Up\n2. Sign In");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                signUp();
                break;
            case 2:
                signIn();
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }
class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Driver class
class Driver {
    private String name;

    public Driver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void dropOff(Student student, String destination) {
        System.out.println(name + " is dropping off " + student.getName() + " at " + destination);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ali");
        Driver driver = new Driver("Mohammed");
        System.out.println("Welcome to the PMU ride!");
        System.out.println("Student: " + student.getName());
        System.out.println("Driver: " + driver.getName());
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your destination ( department registration): ");
        String destination = scanner.nextLine();
        driver.dropOff(student, destination);
        scanner.close();
    }
}
 
