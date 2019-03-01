package scrum.kinoxp.model;

public class Movie {

    private int id;
    private String title;
    private String description;
    private String cover;
    private String trailer;
    private String duration;


    public Movie() {
    }

    public Movie(int id, String title, String description, String cover, String trailer, String duration) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.cover = cover;
        this.trailer = trailer;
        this.duration = duration;
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

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", cover='" + cover + '\'' +
                ", trailer='" + trailer + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
