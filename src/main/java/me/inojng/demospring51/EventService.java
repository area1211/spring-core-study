package me.inojng.demospring51;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    @NonNull
    public String createEvent(@NonNull String name) {
//        return "Hello " + name;
        return null;
    }

}
