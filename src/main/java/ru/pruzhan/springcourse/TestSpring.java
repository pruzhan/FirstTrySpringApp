package ru.pruzhan.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        Music classical = context.getBean("classicalMusic", ClassicalMusic.class);
        Music rap = context.getBean("rapMusic", RapMusic.class);
        List<Music> musicList = new ArrayList<>();
        musicList.add(classical);
        musicList.add(context.getBean("rockMusic", RockMusic.class));
        player.setMusicList(musicList);
        player.addMusic(rap);
        System.out.println(player.playMusic());
        Computer computer1 = context.getBean("computer", Computer.class);
        Computer computer2 = context.getBean("computer", Computer.class);
        System.out.println(computer1.toString());
        System.out.println(computer2.toString());
        computer1.setMusicPlayerList(musicList);
        computer1.addMusicPlayerSong(classical);
        System.out.println(computer1.toString());
        System.out.println(computer2.toString());
        context.close();
    }
}

