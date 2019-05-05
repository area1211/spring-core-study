package me.inojng.demospring51;

import java.lang.annotation.*;

// RetentionPolicy? 어노테이션 정보를 어디까지 유지할 것인가. 디폴트는 클래스

/**
 * 이 어노테이션을 사용하면 성능을 로깅해 줍니다.
 */
@Retention(RetentionPolicy.CLASS)
@Documented
@Target(ElementType.METHOD)
public @interface PerfLogging {

}
