package elons.toy.car;

public class ElonsToyCarMain {
    public static void main(String[] args) {

        ElonsToyCarClass car = new ElonsToyCarClass();
        for (int i = 0; i < 100; i++) {
            car.drive();
        }
        // Attempt to drive one more time (should not work)
        car.drive();
        System.out.println(car.batteryDisplay());

    }
}
