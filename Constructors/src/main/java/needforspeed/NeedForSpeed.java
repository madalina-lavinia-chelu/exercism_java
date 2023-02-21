package needforspeed;

class NeedForSpeed {
    // TODO: define the constructor for the 'NeedForSpeed' class

    private int speed;
    private int batteryD;
    private int battery = 100;
    private int distance;

    public NeedForSpeed(int speed, int batteryD) {
        this.speed = speed;
        this.batteryD = batteryD;
    }

    public boolean batteryDrained() {
        return battery == 0;
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive() {
        if(battery > 0){
            distance += speed;
            battery -=batteryD;
        }

    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }
}

class RaceTrack {
    // TODO: define the constructor for the 'RaceTrack' class

    private int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        while(!car.batteryDrained()){
            car.drive();
        }
        return car.distanceDriven() >= distance;


    }
}
