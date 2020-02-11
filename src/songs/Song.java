package songs;

import java.util.Objects;

public class Song implements Comparable<Song> {
    protected String title;
    protected String artist;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(title, song.title) &&
                Objects.equals(artist, song.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist);
    }

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
