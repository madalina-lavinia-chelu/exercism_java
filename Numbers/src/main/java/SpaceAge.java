import java.util.HashMap;
import java.util.Map;

public class SpaceAge {
     double seconds;
     double earthYear = 31557600;
     public Map <String, Double> map = Map.of(
             "Mercury",0.2408467 * earthYear,
             "Venus",0.61519726 * earthYear,
             "Earth",365.25 * earthYear,
             "Mars",1.8808158 * earthYear,
             "Jupiter", 11.862615 * earthYear,
             "Saturn", 29.447498 * earthYear,
             "Uranus",84.016846 * earthYear,
             "Neptune",164.79132 * earthYear
     );


    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return this.seconds;
    }

    double onEarth() {
        return this.seconds /earthYear ;
    }

    double onMercury() {
        return this.seconds / map.get("Mercury");
    }

    double onVenus() {
        return this.seconds / map.get("Venus");
    }

    double onMars() {
        return this.seconds / map.get("Mars");
    }

    double onJupiter() {
        return this.seconds / map.get("Jupiter");
    }

    double onSaturn() {
        return this.seconds / map.get("Saturn");
    }

    double onUranus() {
        return this.seconds / map.get("Uranus");
    }

    double onNeptune() {
        return this.seconds / map.get("Neptune");
    }
}
