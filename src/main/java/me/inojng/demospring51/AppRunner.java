package me.inojng.demospring51;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Locale;

@Component
public class AppRunner implements ApplicationRunner {


    @Autowired
    MessageSource messageSource;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        while(true) {
            String krMsg = messageSource.getMessage("greeting", new String[]{"inho"}, Locale.KOREA);
            String enMsg = messageSource.getMessage("greeting", new String[]{"inho"}, Locale.JAPAN);

            System.out.println(krMsg);
            System.out.println(enMsg);

            Thread.sleep(1000l);
        }

    }
}
