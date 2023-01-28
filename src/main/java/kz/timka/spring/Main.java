package kz.timka.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Music music = context.getBean("classicalMusic", Music.class); // the first parameter is "id" of bean in xml file

        //MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
        musicPlayer.playMusic();
        context.close();
    }
}
