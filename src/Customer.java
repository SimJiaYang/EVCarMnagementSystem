import java.util.ArrayList;

public class Customer {
    private String customerID;
    private String customerName;
    private ArrayList<ElectricCar> electricCars;
    protected Customer(){
        this("unknown", "unknown");
    }
    protected Customer(String customerID, String customerName){
        this.customerID = customerID;
        this.customerName = customerName;
        electricCars = new ArrayList<ElectricCar>();
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void addElectricCar(ElectricCar electricCar){
        electricCars.add(electricCar);
    }

    public String getElectricCars() {
        String models = "\n";
        for(ElectricCar car: electricCars){
            models += car.getCarModel() + "\n";
        }
        return models;
    }

    @Override
    public String toString() {
        return "\nCustomer" +
                "\nCustomer ID: '" + customerID +
                "\nCustomer Name: '" + customerName +
                "\nOwned Car List:" + getElectricCars();
    }
}
