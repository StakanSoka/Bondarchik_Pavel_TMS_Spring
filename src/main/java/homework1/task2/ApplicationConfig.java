package homework1.task2;

import org.springframework.context.annotation.Bean;

public class ApplicationConfig {

    @Bean(name="message")
    public Message getMessage() {
        return new Message();
    }

    @Bean(name="str")
    public String getStr() {
        String str = "Dima kak dela?";
        return str;
    }

}
