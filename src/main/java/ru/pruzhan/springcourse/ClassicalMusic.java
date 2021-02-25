package ru.pruzhan.springcourse;

public class ClassicalMusic implements Music {

    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }
    @Override
    public String getSong() {
        return "Bethoven";
    }
}
