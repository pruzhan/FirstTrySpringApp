package ru.pruzhan.springcourse;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class RapMusic implements Music {

    private RapMusic() {}

    public static RapMusic getRapMusic() {
        return new RapMusic();
    }

    @Override
    public String getSong() {
        return "Eminem";
    }
}
