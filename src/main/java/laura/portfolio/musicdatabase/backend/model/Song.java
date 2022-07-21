package laura.portfolio.musicdatabase.backend.model;

import java.util.Date;

public class Song {

    private String ismn;
    private String title;
    private Date releaseDate;
    private Artist artist;
    private Compositor compositor;
    private Genre genre;
    private boolean explicit;
    private boolean instrumental;
    private int duration;

    public Song(){

    }

    public String getIsmn() {
        return ismn;
    }

    public void setIsmn(String ismn) {
        this.ismn = ismn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Compositor getCompositor() {
        return compositor;
    }

    public void setCompositor(Compositor compositor) {
        this.compositor = compositor;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public boolean isExplicit() {
        return explicit;
    }

    public void setExplicit(boolean explicit) {
        this.explicit = explicit;
    }

    public boolean isInstrumental() {
        return instrumental;
    }

    public void setInstrumental(boolean instrumental) {
        this.instrumental = instrumental;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "ismn='" + ismn + '\'' +
                ", title='" + title + '\'' +
                ", releaseDate=" + releaseDate +
                ", artist=" + artist +
                ", compositor=" + compositor +
                ", genre=" + genre +
                ", explicit=" + explicit +
                ", instrumental=" + instrumental +
                ", duration=" + duration +
                '}';
    }
}
