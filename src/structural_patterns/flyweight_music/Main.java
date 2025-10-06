package structural_patterns.flyweight_music;

public class Main {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();

        musicPlayer.addMusic("Música 1", "Artista 1", 240);
        musicPlayer.addMusic("Música 1", "Artista 1", 240);

        musicPlayer.addMusic("Música 2", "Artista 2", 200);
        musicPlayer.addMusic("Música 2", "Artista 2", 200);

        musicPlayer.addMusic("Música 3", "Artista 3", 300);
        musicPlayer.addMusic("Música 3", "Artista 3", 300);
        musicPlayer.addMusic("Música 3", "Artista 3", 300);

        musicPlayer.playAll();

        System.out.println("Tamanho do cache de flyweights: " + FlyweightMusicFactory.getCacheSize());
    }
}
