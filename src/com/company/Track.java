package com.company;

public class Track {
    String id;
    String trackName;
    Artist artist;
    Album album;

    public Track(String id, String trackName, Artist artist, Album album) {
        this.id = id;
        this.trackName = trackName;
        this.artist = artist;
        this.album = album;
    }

    public Track(String id, String trackName, Artist artist) {
        this.id = id;
        this.trackName = trackName;
        this.artist = artist;
    }
}
