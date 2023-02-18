package kz.timka.spring.javaCodeConfig;

import org.springframework.stereotype.Component;

import java.util.List;

public class ClassicalMusic implements Music {

    public ClassicalMusic() {

    }


    @Override
    public String getSong() {
        return "Classical music";
    }

}
