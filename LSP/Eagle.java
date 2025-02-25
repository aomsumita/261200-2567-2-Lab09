package LSP;

public class Eagle implements Flyable{

    public Eagle(){
    }

    @Override
    public void move() {
        System.out.println("Eagle is moving");
    }

    @Override
    public void fly() {
        System.out.println("Eagle is Flying");
    }
}