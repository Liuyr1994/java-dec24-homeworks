package ru.otus.java.basic.homeworks.homework4.playlistmanager;

public class MainApplication {
    public static void main(String[] args) {
        Playlist playlist = new Playlist("The top", 10);
        playlist.addSongs(new Song("Du Hast", "Rammstein", 300, 9));
        playlist.addSongs(new Song("Sonne", "Rammstein", 350, 7));
        playlist.addSongs(new Song("Striped", "Rammstein", 500, 8));
        playlist.addSongs(new Song("Links 2 3 4", "Rammstein", 280, 9));
        playlist.addSongs(new Song("Dream On", "Aerosmith", 600, 10));
        playlist.addSongs(new Song("Amerika", "Rammstein", 320, 6));
        playlist.addSongs(new Song("This Fire In Me", "Nando Fortunato", 650, 10));
        playlist.addSongs(new Song("Lose yourself", "Eminem", 311, 10));
        playlist.addSongs(new Song("Mockingbird", "Eminem", 322, 10));
        playlist.addSongs(new Song("Beautiful", "Eminem", 333, 10));
        System.out.println("Cуммарная длительность всех песен: " + playlist.totalDuration());
        for (int i = 0; i < playlist.getCount(); i++) {
            if (playlist.getSongs()[i].isHit()) {
                System.out.println("У этой песни рейтинг выше 8: " + playlist.getSongs()[i].toString());
            }
        }

        System.out.println("Это лучшая песня: " + playlist.bestSong().toString());

        Song maxSongDuration = playlist.getSongs()[0];

        for (int i = 1; i < playlist.getCount(); i++) {
            if (playlist.getSongs()[i].getDurationSec() > maxSongDuration.getDurationSec()) {
                maxSongDuration = playlist.getSongs()[i];
            }
        }
        System.out.println("Самая длинная песня: " + maxSongDuration.toString());
    }
}
