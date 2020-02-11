package songs;

public class Song implements Comparable<Song> {
    protected String title;
    protected String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public String toString() {
        return artist + "/" + title;

    }

    @Override
    public int compareTo(Song o) {
        return o.artist.compareTo(artist);

    }
}
