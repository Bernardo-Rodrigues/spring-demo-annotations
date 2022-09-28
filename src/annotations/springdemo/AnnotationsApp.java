package annotations.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach coach = context.getBean("tennisCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());

        context.close();
    }
}
