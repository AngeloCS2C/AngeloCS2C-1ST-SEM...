class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String make, String model, boolean hasSidecar) {
        super(make, model);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void startEngine() {
        System.out.println("The motorcycle's engine is starting.");
    }

    public boolean hasSidecar() {
        return hasSidecar;
    }
}
