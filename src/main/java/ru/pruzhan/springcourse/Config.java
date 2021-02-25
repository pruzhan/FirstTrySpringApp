package ru.pruzhan.springcourse;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class Config {

    @Bean
    public ClassicalMusic classicalMusic() {
        return ClassicalMusic.getClassicalMusic();
    }
    @Bean
    public RockMusic rockMusic() {
        return RockMusic.getRockMusic();
    }

    @Bean
    public RapMusic rapMusic() {
        return RapMusic.getRapMusic();
    }

    @Bean
    @Scope("prototype")
    public MusicPlayer musicPlayer() {
        return new MusicPlayer();
    }

    @Bean
    @Scope("prototype")
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
