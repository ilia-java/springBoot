package autoConfguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean public Integer score(){
        return new MyConfiguration().score();
    }
}
