package kz.timka.spring.annotationConfig;

import kz.timka.spring.annotationConfig.Music;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("rockBean")
public class RockMusic implements Music {
    @Override
    public List<String> getSong() {
        return List.of("rock music1", "rock music2", "rock music3");
    }
}
