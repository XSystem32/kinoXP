package scrum.kinoxp.model;

import java.util.List;

public class Movie {

    private int id;
    private String title;
    private String description;
    private String cover;
    private String trailer;
    private String duration;
    private List<Show> shows;


    public Movie() {
    }

    public Movie(int id, String title, String description, String cover, String trailer, String duration, List<Show> shows) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.cover = cover;
        this.trailer = trailer;
        this.duration = duration;
        this.shows = shows;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }


    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", cover='" + cover + '\'' +
                ", trailer='" + trailer + '\'' +
                ", duration='" + duration + '\'' +
                ", shows=" + shows +
                '}';
    }
}
