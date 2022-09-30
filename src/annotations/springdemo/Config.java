package annotations.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:fortune.properties")
public class Config {

    @Bean
    public FortuneService randomFortuneService(){
        return new RandomFortuneService();
    }

    @Bean Coach tennisCoach(){
        return new TennisCoach(randomFortuneService());
    }
}
