package me.inojng.demospring51;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demospring51Application {

//    @Autowired
//    MyService myService;
//
//    public static void main(String[] args) {
////        SpringApplication.run(Demospring51Application.class, args);
//
//        SpringApplication app = new SpringApplication(Demospring51Application.class);
//        app.addInitializers((ApplicationContextInitializer<GenericApplicationContext>)ctx -> {
//            // 프로그래밍적인 컨트롤이 가능하다는 장점이 있다.
//            // 애플리케이션 구동시 성능상의 이점이 있다. 리플렉션, CG 라이브러리 프록시 같은 것들을 안쓰니까.
//            ctx.registerBean(MyService.class);
//            ctx.registerBean(ApplicationRunner.class, () -> args1 -> System.out.println("Functional Bean Definition!"));
////            ctx.registerBean(ApplicationRunner.class, new Supplier<ApplicationRunner>() {
////                @Override
////                public ApplicationRunner get() {
////                    return new ApplicationRunner() {
////                        @Override
////                        public void run(ApplicationArguments args) throws Exception {
////                            System.out.println("Functional Bean Definition!");
////                        }
////                    };
////                }
////            });
//        });
//        app.run(args);
//    }

    public static void main(String[] args) {
        SpringApplication.run(Demospring51Application.class, args);
    }

}
