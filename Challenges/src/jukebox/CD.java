package jukebox;

import java.util.List;

public class CD {

    private String author;
    private List<Song> songs;

    public String getAuthor() { return author; }

    public void setAuthor(String author) { this.author = author; }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }


}
