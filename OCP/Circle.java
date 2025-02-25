package OCP;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius){
        if(radius > 0) {
            this.radius = radius;
        }else {
            throw new IllegalArgumentException("Radius must be greater than zero.");
        }
    }
    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * this.radius * this.radius;


    }
}