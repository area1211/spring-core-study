package me.inojng.demospring51;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerfAspect {


//    @Around("execution(* me.inojng..*.EventService.*(..))") // 포인트컷 정의
//    @Around("@annotation(PerfLogging)")
    @Around("bean(simpleEventService)")
    public Object logPerf(ProceedingJoinPoint pjp) throws Throwable{
        // ProceedingJoinPoint: advice가 적용되는 대상이라고 보면 된다.

        long begin = System.currentTimeMillis(); // 메소드 호출 이전
        Object retVal = pjp.proceed(); // 메소드 호출 자체를 감싼다.
        System.out.println(System.currentTimeMillis() - begin); //메소드 호출 이후
        return retVal;
    }

    @Before("bean(simpleEventService)")
    public void hello() {
        System.out.println("hello");
    }
}
