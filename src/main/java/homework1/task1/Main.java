package homework1.task1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("my-config.xml");

        OutClass outClass = (OutClass) context.getBean("outClass");
        outClass.printMessage();
    }
}
