package OCP;

public class Rectangle extends Shape {

    private double width;
    private double height;


    public Rectangle(double width, double height ){
        if(width > 0 && height > 0){
            this.width = width;
            this.height = height;
        }else{
            throw new IllegalArgumentException("Width and Height must be greater than zero.");
        }

    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    @Override
    public double calculateArea() {
        return this.width * this.height;
    }
}