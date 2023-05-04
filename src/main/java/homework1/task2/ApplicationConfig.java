package homework1.task2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public OutClass outClass() {
        return new OutClass();
    }

    @Bean
    public Message message() {
        return new Message();
    }

    @Bean
    public String str() {
        return "Dima kak dela?";
    }

}
