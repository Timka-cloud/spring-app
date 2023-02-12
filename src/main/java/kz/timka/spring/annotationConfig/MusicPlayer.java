package kz.timka.spring.annotationConfig;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MusicPlayer {
    private List<Music> music;

    @Autowired
    public MusicPlayer(/*@Qualifier(value = "classicBean")*/ List<Music> music) {
        this.music = music;
    }



    public void playMusic() {
//        System.out.println(music);
//        System.out.println(music.getSong());

        music.forEach(m -> System.out.println(m.getSong()));
    }



}
