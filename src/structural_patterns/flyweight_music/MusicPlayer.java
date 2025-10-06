package structural_patterns.flyweight_music;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MusicPlayer {
    private final List<Music> playlist = new ArrayList<>();
    private final Map<String, Integer> playCounts = new HashMap<>(); // key -> contador

    public void addMusic(String name, String artist, int duration) {
        FlyweightMusic fly = FlyweightMusicFactory.getMusic(name, artist, duration);
        playlist.add(new Music(fly));
    }

    public void playAll() {
        for (Music music : playlist) {
            FlyweightMusic fly = music.getFlyweight();
            String key = fly.getName() + "-" + fly.getArtist() + "-" + fly.getDuration();
            int count = playCounts.getOrDefault(key, 0) + 1;
            playCounts.put(key, count);

            music.play(count);
            System.out.println("------------");
        }
    }

    public int getCacheSize() {
        return FlyweightMusicFactory.getCacheSize();
    }
}
