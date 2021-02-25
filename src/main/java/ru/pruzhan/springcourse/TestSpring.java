package ru.pruzhan.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        Music classical = context.getBean("classicalMusic", ClassicalMusic.class);
        Music rap = context.getBean("rapMusic", RapMusic.class);
        List<Music> musicList = new ArrayList<>();
        musicList.add(classical);
        musicList.add(context.getBean("rockMusic", RockMusic.class));
        player.setMusicList(musicList);
        player.addMusic(rap);
        System.out.println(player.playMusic());
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer.toString());
        computer.setMusicPlayerList(musicList);
        computer.addMusicPlayerSong(classical);
        System.out.println(computer.toString());
        context.close();
    }
}

