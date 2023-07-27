public class ElectricCar {
    private String carID;
    private String carModel;
    private Manufacturer carManufacturer;
    private ChargingStation chargingStation;
    protected ElectricCar(){
        this("unknown","unknown",new Manufacturer());
    }
    protected ElectricCar(String carID, String carModel, Manufacturer carManufacturer){
        this.carID = carID;
        this.carModel = carModel;
        this.carManufacturer = carManufacturer;
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

    @Override
    public String toString() {
        return  "\nCar ID: " + carID +
                "\nCar Model: " + carModel +
                "\nCar Manufacturer: " + carManufacturer.getCarManufacturerName();
    }
}
