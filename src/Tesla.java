public class Tesla extends ElectricCar{
    private boolean isAutoPilotEnabled;
    private boolean isFullSelfDrivingEnabled;
    private boolean isTeslaTheatreEnabled;

    protected Tesla(){
        this("unknown","unknown",new Manufacturer(),false,false,false);
    }
    protected Tesla(String carID, String carModel, Manufacturer carManufacturer,
                    boolean isAutoPilotEnabled, boolean isFullSelfDrivingEnabled, boolean isTeslaTheatreEnabled){
        super(carID, carModel, carManufacturer);
        this.isAutoPilotEnabled = isAutoPilotEnabled;
        this.isFullSelfDrivingEnabled = isFullSelfDrivingEnabled;
        this.isTeslaTheatreEnabled = isTeslaTheatreEnabled;
    }

    public void setAutoPilotEnabled(boolean autoPilotEnabled) {
        isAutoPilotEnabled = autoPilotEnabled;
    }

    public void setFullSelfDrivingEnabled(boolean fullSelfDrivingEnabled) {
        isFullSelfDrivingEnabled = fullSelfDrivingEnabled;
    }

    public void setTeslaTheatreEnabled(boolean teslaTheatreEnabled) {
        isTeslaTheatreEnabled = teslaTheatreEnabled;
    }

    public boolean getAutoPilotEnabled() {
        return isAutoPilotEnabled;
    }

    public boolean getFullSelfDrivingEnabled() {
        return isFullSelfDrivingEnabled;
    }

    public boolean getTeslaTheatreEnabled() {
        return isTeslaTheatreEnabled;
    }

    @Override
    public String toString() {
        return "\n\nTesla" + super.toString() +
                "\nAuto Pilot Enabled: " + isAutoPilotEnabled +
                "\nFull Self DrivingEnabled: " + isFullSelfDrivingEnabled +
                "\nTesla Theatre Enabled: " + isTeslaTheatreEnabled;
    }
}
