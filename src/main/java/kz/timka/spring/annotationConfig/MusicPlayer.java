package kz.timka.spring.annotationConfig;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private Music classicalMusic;
    private Music rockMusic;

    private Random random;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    @PostConstruct
    public void init() {
        System.out.println("doing my init");
    }
    @Autowired
    public MusicPlayer(
            @Qualifier(value = "classicBean") Music classicalMusic,
            @Qualifier(value = "rockBean") Music rockMusic
    ) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.random = new Random();
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroying bean");
    }


    public void playMusic(Genre genre) {
        if(genre.equals(Genre.CLASSICAL)) {
            int i = random.nextInt(2);
            System.out.println(classicalMusic.getSong().get(i));
        } else if(genre.equals(Genre.ROCK)) {
            int i = random.nextInt(2);
            System.out.println(rockMusic.getSong().get(i));
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
