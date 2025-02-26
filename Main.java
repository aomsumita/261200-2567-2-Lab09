import DIP.EmailNotifier;
import DIP.Order;
import DIP.OrderProcessor;
import DIP.SMSNotifier;
import LSP.Eagle;
import LSP.Ostrich;
import LSP.Penguin;
import LSP.Sparrow;
import OCP.Circle;
import OCP.Ellipse;
import OCP.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle R1 = new Rectangle(10,10);
        System.out.println(R1.calculateArea());
        Circle R2 = new Circle(5);
        System.out.println(R2.calculateArea());
        Ellipse R3 = new Ellipse(300,200);
        System.out.println(R3.calculateArea());


        Penguin pengu = new Penguin();
        Sparrow sparro = new Sparrow();
        Ostrich ostri = new Ostrich();
        Eagle eag = new Eagle();

        pengu.move();
        sparro.move();
        ostri.move();
        eag.move();

        sparro.fly();
        eag.fly();

        Order order = new Order();
        OrderProcessor orderProcessor = new OrderProcessor(new EmailNotifier());
        OrderProcessor orderProcessor2 = new OrderProcessor(new SMSNotifier());

        orderProcessor.processOrder(order);
        orderProcessor2.processOrder(order);

    }
}