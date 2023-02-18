package kz.timka.spring.javaCodeConfig;

import org.springframework.stereotype.Component;

import java.util.List;

public class RapMusic implements Music {
    @Override
    public String getSong() {
        return "rap music";
    }
}
