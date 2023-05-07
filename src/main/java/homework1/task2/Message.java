package homework1.task2;

import org.springframework.beans.factory.annotation.Autowired;

class Message {

    @Autowired
    private String str;

    public void printMessage() {
        System.out.println(str);
    }
}
