package kz.timka.spring.annotationConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("kz.timka.spring.annotationConfig")
@PropertySource("classpath:musicPlayer.properties")
public class Config {
}
