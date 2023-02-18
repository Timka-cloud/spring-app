package kz.timka.spring.javaCodeConfig;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
    private List<Music> musicList;

    private Random random;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    @PostConstruct
    public void init() {
        System.out.println("doing my init");
    }
    public MusicPlayer(List<Music> musicList) {
        this.random = new Random();
        this.musicList = musicList;
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroying bean");
    }


    public void playMusic() {
        int i = random.nextInt(musicList.size() - 1);
        System.out.println(musicList.get(i).getSong());
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
