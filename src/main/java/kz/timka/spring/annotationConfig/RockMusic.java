package kz.timka.spring.annotationConfig;

import kz.timka.spring.annotationConfig.Music;
import org.springframework.stereotype.Component;

@Component("rockBean")
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Rock Music";
    }
}
