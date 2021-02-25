package ru.pruzhan.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
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
