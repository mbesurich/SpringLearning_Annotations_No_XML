package AliChief;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    String name;
    @Value("${musicPlayer.volume}")
    int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    //    @Autowired
//    @Qualifier("classicalMusic")
    private Music music;
//    @Autowired
//    @Qualifier("rockMusic")
    private Music music1;

    public MusicPlayer(@Qualifier("classicalMusic") Music music,
                       @Qualifier("rockMusic") Music music1) {
        this.music = music;
        this.music1 = music1;
    }

    public void playMusic(MusicGenre musicGenre) {
        Random random = new Random();
        int ran = random.nextInt(3);
        String randomSong = null;
        if (musicGenre == MusicGenre.CLASSICAL){
            randomSong = music.getSong().get(ran);
        } else if (musicGenre == MusicGenre.ROCK){
            randomSong = music1.getSong().get(ran);
        }
        System.out.println("Playing: " + randomSong);
    }
}
