package jukebox;

import java.util.List;
import java.util.Random;

public class Playlist {

    private int songIndex = 0;
    private Song song;
    private final List<Song> songs; // or Queue

    public Playlist(List<Song> songs) {
        this.songs = songs;
    }

    public Playlist(Song song, List<Song> songs) {
        this.song = song;
        this.songs = songs;
    }

    protected void addSong(Song song) {
        this.songs.add(song);
    }

    protected void removeSong(Song song) {
        this.songs.remove(song);
    }

    protected void shuffle() {
        Random r = new Random();
        r.nextInt(songs.size());
    }

    protected Song getNextSong() {
        return songs.get(++songIndex);
    }

    protected Song getPrevSong() {
        return songs.get(--songIndex);
    }

    protected Song getSong() {
        return song;
    }

    protected void setSong(Song song) {
        this.song = song;
    }

    protected List<Song> getSongs() {
        return songs;
    }
}
