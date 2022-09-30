package annotations.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

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
}
