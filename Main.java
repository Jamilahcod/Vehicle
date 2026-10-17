import java.util.Scanner;

interface Vehicle {
    void speed(int gear, boolean brakes);
}

class Car implements Vehicle {
    public void speed(int gear, boolean brakes) {
        int s = gear * 20;
        if (brakes)
            s = 0;
        System.out.println("Car speed: " + s);
    }
}

class Bicycle implements Vehicle {
    public void speed(int gear, boolean brakes) {
        int s = gear * 5;
        if (brakes)
            s = 0;
        System.out.println("Bicycle speed: " + s);
    }
}

class Truck implements Vehicle {
    public void speed(int gear, boolean brakes) {
        int s = gear * 10;
        if (brakes)
            s = 0;
        System.out.println("Truck speed: " + s);
    }
}

class Bike implements Vehicle {
    public void speed(int gear, boolean brakes) {
        int s = gear * 15;
        if (brakes)
            s = 0;
        System.out.println("Bike speed: " + s);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter gear: ");
        int gear = sc.nextInt();

        System.out.print("Apply brakes? (true/false): ");
        boolean brakes = sc.nextBoolean();

        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();
        Vehicle truck = new Truck();
        Vehicle bike = new Bike();

        car.speed(gear, brakes);
        bicycle.speed(gear, brakes);
        truck.speed(gear, brakes);
        bike.speed(gear, brakes);

        sc.close();
    }
}