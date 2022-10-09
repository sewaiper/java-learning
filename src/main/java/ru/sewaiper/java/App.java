package ru.sewaiper.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.sewaiper.java.service.GreetingService;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("ru.sewaiper.java");
        GreetingService bean = context.getBean(GreetingService.class);
        bean.sayHello();
        context.close();
    }
}
