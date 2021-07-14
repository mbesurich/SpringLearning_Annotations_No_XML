package AliChief;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {

    private List<String> songs = new ArrayList<>();

    {
        songs.add("RockMusic1");
        songs.add("RockMusic2");
        songs.add("RockMusic3");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
