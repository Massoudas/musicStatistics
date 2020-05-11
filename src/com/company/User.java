package com.company;

import java.util.HashMap;

public class User {
    private String name;
    private HashMap<Track , Integer> userTrackStInner = new HashMap<>();
    private HashMap<User , HashMap<Track, Integer>> userTrackSt = new HashMap<>();
    private HashMap<Artist , Integer> userArtistStInner = new HashMap<>();
    private HashMap<User , HashMap<Artist, Integer>> userArtistSt = new HashMap<>();

    public HashMap<Track, Integer> getUserTrackStInner() {
        return userTrackStInner;
    }

    public HashMap<User, HashMap<Track, Integer>> getUserTrackSt() {
        return userTrackSt;
    }

    public HashMap<Artist, Integer> getUserArtistStInner() {
        return userArtistStInner;
    }

    public HashMap<User, HashMap<Artist, Integer>> getUserArtistSt() {
        return userArtistSt;
    }

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void updateUserTrackSt(Track track){
        int trackListened=userTrackStInner.getOrDefault(track, 0)+1;
        userTrackStInner.put(track, trackListened);
        userTrackSt.put(this, userTrackStInner);
        int artistListened=userArtistStInner.getOrDefault(track.getArtist(), 0)+1;
        userArtistStInner.put(track.getArtist(), artistListened);
        userArtistSt.put(this, userArtistStInner);
    }

}
