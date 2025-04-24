public class Car extends Vehicle {
    private int numberOfSeats;

    public Car(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public void start() {
        System.out.println("The car engine is starting. Buckle up!");
    }

    @Override
    public void stop() {
        System.out.println("The car engine is stopping. You can unbuckle your seatbelt now.");
    }
}

