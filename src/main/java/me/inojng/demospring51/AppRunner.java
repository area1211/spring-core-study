package me.inojng.demospring51;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    ApplicationEventPublisher applicationContext;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        applicationContext.publishEvent(new MyEvent(this, 100));
    }
}
