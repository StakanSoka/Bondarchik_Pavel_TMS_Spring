package homework1.task2;

import org.springframework.beans.factory.annotation.Autowired;

public class OutClass {

    @Autowired
    private Message message;

    public void printMessage() {
        message.printMessage();
    }
}
