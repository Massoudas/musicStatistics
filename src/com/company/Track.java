package com.company;

public class Track {
    private String id;
    private String trackName;
    private Artist artist;
    private Album album;

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

    public String getId() {
        return id;
    }

    public String getTrackName() {
        return trackName;
    }

    public Artist getArtist() {
        return artist;
    }

    public Album getAlbum() {
        return album;
    }
}
