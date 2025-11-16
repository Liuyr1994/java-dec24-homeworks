package ru.otus.java.basic.homeworks.homework4.playlistmanager;

public class Song {
    private String title;
    private String artist;
    private int durationSec;
    private int rating;

    public int getRating() {
        return rating;
    }

    public int getDurationSec() {
        return durationSec;
    }

    public Song(String title, String artist, int durationSec, int rating) {
        this.title = title;
        this.artist = artist;
        this.durationSec = durationSec;
        this.rating = rating;
    }

    public boolean isHit() {
        return rating >= 8;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", durationSec=" + durationSec +
                ", rating=" + rating +
                '}';
    }
}
