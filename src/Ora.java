public class Ora extends ElectricCar{
    private boolean hasPanaromicSunroof;
    private boolean hasWirelessCharging;

    protected Ora(){
        this("unknown","unknown",new Manufacturer(),false,false);
    }
    protected Ora(String carID, String carModel, Manufacturer carManufacturer
            , boolean hasPanaromicSunroof, boolean hasWirelessCharging){
        super(carID, carModel, carManufacturer);
        this.hasPanaromicSunroof = hasPanaromicSunroof;
        this.hasWirelessCharging = hasWirelessCharging;
    }

    public void setHasPanaromicSunroof(boolean hasPanaromicSunroof) {
        this.hasPanaromicSunroof = hasPanaromicSunroof;
    }

    public void setHasWirelessCharging(boolean hasWirelessCharging) {
        this.hasWirelessCharging = hasWirelessCharging;
    }

    public boolean getPanaromicSunroof() {
        return hasPanaromicSunroof;
    }

    public boolean getHasWirelessCharging() {
        return hasWirelessCharging;
    }

    @Override
    public String toString() {
        return "\n\nOra" + super.toString() +
                "\nPanaromic Sunroof: " + hasPanaromicSunroof +
                "\nWireless Charging: " + hasWirelessCharging;
    }
}
