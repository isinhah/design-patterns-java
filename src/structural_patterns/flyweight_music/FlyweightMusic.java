package structural_patterns.flyweight_music;

// Armazena os valores intrisecos (imutaveis)
public class FlyweightMusic {

    private String name;
    private String artist;
    private int duration;

    public FlyweightMusic(String name, String artist, int duration) {
        this.name = name;
        this.artist = artist;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "FlyweightMusic{" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
