package elons.toy.car;

public class ElonsToyCarClass {

    public int distanceDriven = 0 ;
    public double batteryCharger = 100;

    public ElonsToyCarClass() {
        distanceDriven = 0 ;
        batteryCharger = 100;
    }

    public static ElonsToyCarClass buy() {
        return new ElonsToyCarClass();

    }

    public String distanceDisplay() {

        return "Driven "+ this.distanceDriven + " meters";
    }

    public String batteryDisplay() {

        if(this.batteryCharger != 0)
            return "Battery at "+ batteryCharger + "%";
        else return "Battery empty";
    }

    public void drive() {
        if(this.batteryCharger != 0)
        {
            this.batteryCharger--;
            this.distanceDriven += 20;

        }

    }
}
