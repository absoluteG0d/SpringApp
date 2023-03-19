package david;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Music music = context.getBean("musicBean", Music.class);
        List<Music> musicList = new ArrayList<>();
        musicList.add(music);
        MusicPlayer musicPlayer = new MusicPlayer(musicList);
        musicPlayer.playMusic();
        context.close();
    }
}
