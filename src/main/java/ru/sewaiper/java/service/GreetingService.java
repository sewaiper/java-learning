package ru.sewaiper.java.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Service;

@Service
public class GreetingService implements DisposableBean {
    public void sayHello() {
        System.out.println("Hello from " + GreetingService.class.getSimpleName());
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bye, Bye!");
    }
}
