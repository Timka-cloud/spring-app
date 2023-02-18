package kz.timka.spring.annotationConfig;

import org.springframework.stereotype.Component;

import java.util.List;

@Component("classicBean")
public class ClassicalMusic implements Music {

    private ClassicalMusic() {

    }


    @Override
    public List<String> getSong() {
        return List.of("Classical music1", "Classical music2", "Classical music3");
    }

}
