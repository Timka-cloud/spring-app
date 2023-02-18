package kz.timka.spring.javaCodeConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    // Для бинов со scope prototype spring не вызывает destroy method
    // spring не берет на себя полный жизненный цикл бинов со scope prototype. Spring отдает prototype бины клиенту и больше о них не заботится

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);


        MusicPlayer bean = context.getBean(MusicPlayer.class);
        bean.playMusic();

        context.close();
    }
}
