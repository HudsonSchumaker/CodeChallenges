package jukebox;

import java.util.Set;

public class CdPlayer implements Player {

    private CD cd;

    private final Set<CD> cds;
    private final Playlist playlist;

    public CdPlayer(Playlist playlist, Set<CD> cds) {
        this.playlist = playlist;
        this.cds = cds;
    }

    protected void addCD(CD cd) {
        cds.add(cd);
    }

    protected void removeCD(CD cd) {
        cds.remove(cd);
    }

    protected Playlist getPlaylist() {
        return playlist;
    }

    @Override
    public void playNextSong() {

    }

    @Override
    public void playPrevSong() {

    }

    protected CD getCd() {
        return cd;
    }

    protected Set<CD> getCds() {
        return cds;
    }

}
