package ru.pruzhan.springcourse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    private int volume;
    private String name;

    public MusicPlayer() {
    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void doInitMethod() {
        System.out.println("Player initialised");
    }

    public void doDestroyMethod() {
        System.out.println("Player destroyed");
    }

    public void playMusic() {
        Iterator<Music> iterator = musicList.iterator();
        iterator.forEachRemaining(p -> System.out.println(p.getSong()));
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }
}
