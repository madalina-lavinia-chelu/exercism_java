package triangle;

public class Triangle {
    private double a, b, c;


    Triangle(double side1, double side2, double side3) throws TriangleException {
        this.a = side1;
        this.b = side2;
        this.c = side3;
        if(!(a + b >= c) || !(b + c >= a) || !(a + c >= b))
            throw new TriangleException();
        if(side1 <= 0 || side2 <= 0 || side3 <= 0){
            throw new TriangleException();
        }



    }

    boolean isEquilateral() {
        return a == b && b == c;

    }

    boolean isIsosceles() {

        return a == b || b == c || c == a;

    }

    boolean isScalene() {

        return !isIsosceles() && !isEquilateral();
    }
}
