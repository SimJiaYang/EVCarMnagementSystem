import java.util.ArrayList;

public class Manufacturer {
    private String carManufacturerID;
    private String carManufacturerName;
    private ArrayList<ElectricCar> carModels;
    protected  Manufacturer(){
        this("unknown","unknown");
    }
    protected Manufacturer(String carManufacturerID, String carManufacturerName){
        this.carManufacturerID = carManufacturerID;
        this.carManufacturerName = carManufacturerName;
        carModels = new ArrayList<ElectricCar>();
    }

    public void setCarManufacturerID(String carManufacturerID) {
        this.carManufacturerID = carManufacturerID;
    }

    public void setCarManufacturerName(String carManufacturerName) {
        this.carManufacturerName = carManufacturerName;
    }

    public String getCarManufacturerID() {
        return carManufacturerID;
    }

    public String getCarManufacturerName() {
        return carManufacturerName;
    }

    public void addElectronicCar(ElectricCar electricCar){
        carModels.add(electricCar);
    }

    public String getElectronicCarModel(){
        String models = "";
        for(ElectricCar car: carModels){
            models += "\nCar Name: " +car.getCarModel() + " , " + "Car ID: " + car.getCarID();
        }
        return models;
    }

    @Override
    public String toString() {
        return "\nManufacturer ID: " + carManufacturerID +
                "\nManufacturer Name: " + carManufacturerName +
                "\nCarModels: " + getElectronicCarModel();
    }
}
