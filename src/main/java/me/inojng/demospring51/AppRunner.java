package me.inojng.demospring51;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    @Value("#{1 + 1}")
    int value;

    @Value("#{'hello' + 'world'}")
    String greeting;

    @Value("#{1 eq 1}")
    boolean trueOrFalse;

    @Value("hell")
    String hello;

    @Value("${my.value}") // $: 프로퍼티를 참고하는 방법
    int myValue;

    @Value("#{${my.value} eq 100}") // 표현식 안에 프로퍼티를 넣어서 비교할 수도 있다.
    boolean isMyValue100;

    @Value("#{'spring'}")
    String spring;

    @Value("#{sample.data}") // 빈에 있는 값을 가져올 수도 있다.
    int sampleData;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("==================");
        System.out.println(value);
        System.out.println(greeting);
        System.out.println(trueOrFalse);
        System.out.println(myValue);
        System.out.println(isMyValue100);
        System.out.println(sampleData);

        ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("2 + 100");
        Integer value = expression.getValue(Integer.class);
        System.out.println(value);


    }

}
