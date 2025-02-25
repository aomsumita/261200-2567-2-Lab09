package DIP;

public class SMSNotifier implements NotificationService{

    public SMSNotifier(){
    }

    @Override
    public void notify(String message) {
        System.out.println("Sending sms with message: " + message);
    }

}