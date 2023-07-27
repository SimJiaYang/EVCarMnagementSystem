public class ElectricCar {
    private String carID;
    private String carModel;
    private Manufacturer carManufacturer;
    private ChargingStation chargingStation;
    private double batteryCapacity;
    protected ElectricCar(){
        this("unknown","unknown",0,new Manufacturer());
    }
    protected ElectricCar(String carID, String carModel, double batteryCapacity,Manufacturer carManufacturer){
        this.carID = carID;
        this.carModel = carModel;
        this.carManufacturer = carManufacturer;
        this.batteryCapacity = batteryCapacity;
        // When an electric car is charging, it should be linked to a specific charging station.
        // Default is not charging
        this.chargingStation = new ChargingStation();
    }

    public void setCarID(String carID) {
        this.carID = carID;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setCarManufacturer(Manufacturer carManufacturer) {
        this.carManufacturer = carManufacturer;
    }

    public void setChargingStation(ChargingStation chargingStation) {
        this.chargingStation = chargingStation;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getCarID() {
        return carID;
    }

    public String getCarModel() {
        return carModel;
    }

    public ChargingStation getChargingStation() {
        return chargingStation;
    }

    public Manufacturer getCarManufacturer() {
        return carManufacturer;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    @Override
    public String toString() {
        return  "\nCar ID: " + carID +
                "\nCar Model: " + carModel +
                "\nCar Battery Capacity " + batteryCapacity + "kWh" +
                "\nCar Manufacturer: " + carManufacturer.getCarManufacturerName();
    }
}
