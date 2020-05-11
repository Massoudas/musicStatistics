package com.company;

import java.util.HashMap;

public class Artist {
    private String artistName;
    private HashMap<Track , Integer> artistTrackStInner = new HashMap<>();
    private HashMap<Artist , HashMap<Track, Integer>> artistTrackSt = new HashMap<>();
    private HashMap<User , Integer> artistUserStInner = new HashMap<>();
    private HashMap<Artist , HashMap<User, Integer>> artistUserSt = new HashMap<>();

    public HashMap<Track, Integer> getArtistTrackStInner() {
        return artistTrackStInner;
    }

    public HashMap<Artist, HashMap<Track, Integer>> getArtistTrackSt() {
        return artistTrackSt;
    }

    public HashMap<User, Integer> getArtistUserStInner() {
        return artistUserStInner;
    }

    public HashMap<Artist, HashMap<User, Integer>> getArtistUserSt() {
        return artistUserSt;
    }

    public Artist(String artistName) {
        this.artistName = artistName;
    }

    public Artist() {
    }

    public String getArtistName() {
        return artistName;
    }
    public void updateArtistSt(Track track, User user){
        int trackListened=artistTrackStInner.getOrDefault(track, 0)+1;
        artistTrackStInner.put(track, trackListened);
        artistTrackSt.put(this, artistTrackStInner);
        int artistListened=artistUserStInner.getOrDefault(user, 0)+1;
        artistUserStInner.put( user, artistListened);
        artistUserSt.put(this, artistUserStInner);

    }
}
