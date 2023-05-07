package homework1.task1;

public class OutClass {

    private Message message;

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public void printMessage() {
        message.printMessage();
    }
}
