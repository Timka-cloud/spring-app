package kz.timka.spring.annotationConfig;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RapMusic implements Music {
    @Override
    public List<String> getSong() {
        return List.of("rap music") ;
    }
}
