package structural_patterns.flyweight_music;

// Classe completa: valores intrisecos (FlyweightMusic) e valores extrinsecos
public class Music {

    private final FlyweightMusic flyweightMusic;

    public Music(FlyweightMusic flyweightMusic) {
        this.flyweightMusic = flyweightMusic;
    }

    public FlyweightMusic getFlyweight() {
        return flyweightMusic;
    }

    public void play(int playCount) {
        System.out.println("Playing song: " + flyweightMusic.getName() + ", from " + flyweightMusic.getArtist());
        System.out.println("Amount of times the song has been played: " + playCount);
    }
}