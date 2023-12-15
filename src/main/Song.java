package main;

public class Song {
    private String title;
    private String artist;
    private int durationInSeconds;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    public void setDurationInSeconds(int durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    public String convertToMinutesAndSeconds() {
        int minutes = durationInSeconds / 60;
        int seconds = durationInSeconds % 60;
        return minutes + " minutes " + seconds + " seconds";
    }
}
