package homework1.task2;

import org.springframework.beans.factory.annotation.Autowired;

class Message {

    @Autowired
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void printMessage() {
        System.out.println(str);
    }
}
