package darts;

import java.util.HashMap;
import java.util.Map;
import java.lang.Math;
class Darts {
        public Darts() {
        }

        int score(double xOfDart, double yOfDart) {
                double r =  Math.sqrt(xOfDart * xOfDart + yOfDart * yOfDart);
                if(r > 10 ) return 0;
                else if(r > 5) return 1;
                else if(r > 1) return 5;
                else return 10;
        }
}
