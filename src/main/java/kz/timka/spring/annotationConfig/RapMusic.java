package kz.timka.spring.annotationConfig;

import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music {
    @Override
    public String getSong() {
        return "rap music";
    }
}
