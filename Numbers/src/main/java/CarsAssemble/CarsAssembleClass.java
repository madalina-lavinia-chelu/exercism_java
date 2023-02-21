package CarsAssemble;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CarsAssembleClass {
    public Map <Integer, Double> speedMap = new HashMap <>(){
        {
            put(0, 1.0);
            put(1, 1.0);
            put(2, 1.0);
            put(3, 1.0);
            put(4, 1.0);
            put(5, 0.9);
            put(6, 0.9);
            put(7, 0.9);
            put(8, 0.9);
            put(9, 0.8);
            put(10, 0.77);
        }
    };
    public double productionRatePerHour(int speed) {

        return speedMap.get(speed) * speed * 221;
    }

    public int workingItemsPerMinute(int speed) {

        return (int)(221 * speed * speedMap.get(speed)) / 60;
    }
}
