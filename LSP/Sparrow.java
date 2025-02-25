package LSP;

public class Sparrow implements Flyable{

    public Sparrow(){
    }

    @Override
    public void move() {
        System.out.println("Sparrow is moving");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}