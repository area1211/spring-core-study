package me.inojng.demospring51;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;


public class EventConverter {

    //상태 정보가 없어서 빈으로 등록해서 써도 된다.

    @Component
    public static class StringToEventConverter implements Converter<String, Event> {
        @Override
        public Event convert(String s) {
            return new Event(Integer.parseInt(s));
        }
    }

//    @Component
    public static class EventToStringConverter implements Converter<Event, String> {
        @Override
        public String convert(Event event) {
            return event.getId().toString();
        }
    }

}
