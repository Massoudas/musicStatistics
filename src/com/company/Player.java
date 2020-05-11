package com.company;

import java.util.HashMap;
import java.util.Map;

public class Player {
    int total=0;

    public Player() {

    }
    public void numberOfStreamsInTotalIs(){
        this.total+=1;
        System.out.println("In total, there have been: "+ total + " streams");

    }

    void play(User user, Track track){

        System.out.println("Now playing: " +track.getArtist().getArtistName() + " - " + track.getTrackName());
        user.updateUserTrackSt(track);
        track.getArtist().updateArtistSt(track,user);
        numberOfStreamsInTotalIs();

    }

}
