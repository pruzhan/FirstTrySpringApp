package ru.pruzhan.springcourse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
@Scope("prototype")
public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    @Value("${musicPlayer.volume}")
    private int volume = 0;
    @Value("${musicPlayer.name}")
    private String name;

    public MusicPlayer() {
    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }
    @PostConstruct
    public void doInitMethod() {
        System.out.println("Player initialized");
    }
    @PreDestroy
    public void doDestroyMethod() {
        System.out.println("Player destroyed");
    }

    public void addMusic(Music music) {
        musicList.add(music);
    }

    public String playMusic() {
        if (musicList.isEmpty()) return "Empty playlist\n";
        else {
            StringBuilder playMusic = new StringBuilder();
            Iterator<Music> iterator = musicList.iterator();
            iterator.forEachRemaining(p -> playMusic.append("Playing: ").append(p.getSong()).append('\n'));
            return playMusic.toString();
        }
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
