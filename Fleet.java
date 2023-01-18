class Fleet {
    private List<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle v) {
        vehicles.add(v);
    }

    public void startAllEngines() {
        for (Vehicle v : vehicles) {
            v.startEngine();
        }
    }
}
