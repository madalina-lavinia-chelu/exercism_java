package triangle;

public class TriangleMain {
    public static void main(String[] args) throws TriangleException {
        Triangle triangle = new Triangle(2, 2, 2);
        System.out.println(triangle.isEquilateral());

    }

}
