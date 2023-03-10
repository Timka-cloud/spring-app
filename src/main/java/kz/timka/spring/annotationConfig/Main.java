package kz.timka.spring.annotationConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {

    // Для бинов со scope prototype spring не вызывает destroy method
    // spring не берет на себя полный жизненный цикл бинов со scope prototype. Spring отдает prototype бины клиенту и больше о них не заботится

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);


        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
        musicPlayer.playMusic(Genre.CLASSICAL);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
