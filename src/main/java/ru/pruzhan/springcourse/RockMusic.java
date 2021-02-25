package ru.pruzhan.springcourse;

public class RockMusic implements Music {

    private RockMusic() {}

    public static RockMusic getRockMusic() {
        return new RockMusic();
    }

    @Override
    public String getSong() {
        return "Skillet";
    }
}
