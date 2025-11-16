package ru.otus.java.basic.homeworks.homework4.playlistmanager;

import java.util.Arrays;

public class Playlist {
    private String name;
    private Song[] songs;
    private int count;

    public int getCount() {
        return count;
    }

    public Song[] getSongs() {
        return songs;
    }

    public Playlist(String name, int count) {
        this.name = name;
        this.count = count;
        songs = new Song[count];
    }

    public void addSongs(Song s) {
        for (int i = 0; i < songs.length; i++) {
            if (songs[i] == null) {
                songs[i] = s;
                System.out.println("Песня успешно добавлена");
                return;
            }
        }
        songs = Arrays.copyOf(songs, songs.length * 2);
        songs[songs.length / 2 + 1] = s;
    }

    public int totalDuration() {
        int totalPlaylistDuration = 0;
        for (int i = 0; i < songs.length; i++) {
            totalPlaylistDuration += songs[i].getDurationSec();
        }
        return totalPlaylistDuration;
    }

    public Song bestSong() {
        Song theBestSong = songs[0];
        for (int i = 1; i < songs.length; i++) {
            if (songs[i].getRating() > theBestSong.getRating()) {
                theBestSong = songs[i];
            }
        }
        return theBestSong;
    }

    public void printAll() {
        System.out.println(Arrays.toString(songs));
    }
}
