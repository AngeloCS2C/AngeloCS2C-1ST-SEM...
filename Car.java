class Car extends Vehicle {
    private int numWheels;

    public Car(String make, String model, int numWheels) {
        super(make, model);
        this.numWheels = numWheels;
    }

    @Override
    public void startEngine() {
        System.out.println("The car's engine is starting.");
    }

    public int getNumWheels() {
        return numWheels;
    }
}
