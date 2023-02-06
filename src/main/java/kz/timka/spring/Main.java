package kz.timka.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    // Для бинов со scope prototype spring не вызывает destroy method
    // spring не берет на себя полный жизненный цикл бинов со scope prototype. Spring отдает prototype бины клиенту и больше о них не заботится

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       Music music1 = context.getBean("classicalMusic", Music.class); // the first parameter is "id" of bean in xml file
       Music music2 = context.getBean("classicalMusic", Music.class); // the first parameter is "id" of bean in xml file


        //MusicPlayer musicPlayer = new MusicPlayer(music);
//        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
//        musicPlayer.playMusic();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//
//        MusicPlayer musicPlayer1 = context.getBean(MusicPlayer.class);
//        musicPlayer1.playMusic();
        context.close();
    }
}
