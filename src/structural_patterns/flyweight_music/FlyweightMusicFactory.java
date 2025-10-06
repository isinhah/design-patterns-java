package structural_patterns.flyweight_music;

import java.util.HashMap;
import java.util.Map;

public class FlyweightMusicFactory {

    public static final Map<String, FlyweightMusic> CACHE = new HashMap<>();

    public static FlyweightMusic getMusic(String name, String artist, int duration) {
        String key = name + "-" + artist + "-" + duration;

        if (!CACHE.containsKey(key)) {
            CACHE.put(key, new FlyweightMusic(name, artist, duration));
        }

        return CACHE.get(key);
    }

    public static int getCacheSize() {
        return CACHE.size();
    }
}
