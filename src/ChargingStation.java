public class ChargingStation {
    private String chargingStationID;
    private String chargeStationLocation;
    private double availableChargingCapacity;

    protected ChargingStation(){
        this("unknown","unknown",0);
    }
    protected ChargingStation(String chargingStationID, String chargeStationLocation, double availableChargingCapacity){
        this.chargingStationID = chargingStationID;
        this.chargeStationLocation = chargeStationLocation;
        this.availableChargingCapacity = availableChargingCapacity;
    }

    public void setChargingStationID(String chargingStationID) {
        this.chargingStationID = chargingStationID;
    }

    public void setChargeStationLocation(String chargeStationLocation) {
        this.chargeStationLocation = chargeStationLocation;
    }

    public void setAvailableChargingCapacity(double availableChargingCapacity) {
        this.availableChargingCapacity = availableChargingCapacity;
    }

    public String getChargingStationID() {
        return chargingStationID;
    }

    public String getChargeStationLocation() {
        return chargeStationLocation;
    }

    public double getAvailableChargingCapacity() {
        return availableChargingCapacity;
    }

    @Override
    public String toString() {
        return "\nCharging Station" +
                "\nCharging Station ID: " + chargingStationID +
                "\nCharge Station Location: " + chargeStationLocation +
                "\nAvailable Charging Capacity: " + availableChargingCapacity + "kWh";
    }
}
