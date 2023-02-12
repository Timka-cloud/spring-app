package kz.timka.spring.annotationConfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    // Для бинов со scope prototype spring не вызывает destroy method
    // spring не берет на себя полный жизненный цикл бинов со scope prototype. Spring отдает prototype бины клиенту и больше о них не заботится

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationConfig.xml");
        Music music = context.getBean("classicBean", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();
        context.close();
    }
}
