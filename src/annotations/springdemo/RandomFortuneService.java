package annotations.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Random;

@Component
public class RandomFortuneService implements  FortuneService{

    @Value("${fortunes}")
    private String[] fortunes;
    private Random myRandom = new Random();
    @Override
    public String getFortune() {
        int index = myRandom.nextInt(fortunes.length);
        return fortunes[index];
    }

    @PostConstruct
    private void postConstruct(){
        System.out.println("The object was constructed");
    }

    @PreDestroy
    private void preDestroy(){
        System.out.println("The object is going to be deleted");
    }
}
