package DIP;

public class EmailNotifier implements NotificationService{

    public EmailNotifier(){
    }

    @Override
    public void notify(String message) {
        System.out.println("Sending email with message: " + message);
    }

}