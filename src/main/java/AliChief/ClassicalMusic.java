package AliChief;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class ClassicalMusic implements Music{


    private List<String> songs = new ArrayList<>();

    {
        songs.add("ClassicalSong1");
        songs.add("ClassicalSong2");
        songs.add("ClassicalSong3");
    }

    @PostConstruct
    public void doMyInit(){
        System.out.println("doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("doing my Destruction");
    }

    public static ClassicalMusic getClassicalMusic() {
        System.out.println("doing my factory method");
        return new ClassicalMusic();
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
