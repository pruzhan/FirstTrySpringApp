package ru.pruzhan.springcourse;

import java.util.List;

public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    public Computer(MusicPlayer musicPlayer) {
        this.id = (int) (Math.random()*10000);
        this.musicPlayer = musicPlayer;
    }

    public void setMusicPlayerList(List<Music> musicList) {
        musicPlayer.setMusicList(musicList);
    }

    public void addMusicPlayerSong(Music music) {
        musicPlayer.addMusic(music);
    }

    @Override
    public String toString() {
        return "Computer " + id + '\n' + musicPlayer.playMusic() + "\nPlayer name: " + musicPlayer.getName() +
                "\nVolume: " + musicPlayer.getVolume() + '\n';
    }
}
