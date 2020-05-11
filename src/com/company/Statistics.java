package com.company;

import sun.awt.util.IdentityLinkedList;

import java.util.*;

public class Statistics {


    private static HashMap<Artist, HashMap<Track, Integer>> artistTrackStatistic= new HashMap<>();
    private static HashMap<Artist, HashMap<User, Integer>> artistUserStatistic= new HashMap<>();
    private static HashMap<User, HashMap<Track, Integer>> userTrackStatistics = new HashMap<>();
    private static HashMap<User, HashMap<Artist, Integer>> userArtistStatistics = new HashMap<>();
    private int numberPlayed = 0;



    public void recordTheStream(){
        this.numberPlayed=this.numberPlayed+1;
    }

    public int getNumberPlayed() {
        return numberPlayed;
    }

    void updateStatistics(User user, Track track){
        user.updateUserTrackSt(track);
        track.getArtist().updateArtistSt(track,user);
    }

    public void topArtist(User user){
        HashMap<Artist, Integer> innerHashMap = user.getUserArtistStInner();
        int maxValueInMap=(Collections.max(innerHashMap.values()));
        for (Map.Entry<Artist, Integer> entry : innerHashMap.entrySet()) {  // Itrate through hashmap
            if (entry.getValue()==maxValueInMap) {
                System.out.println("top artist of "+user.getName()+ " is "+ entry.getKey().getArtistName());
            }
        }
    }
    public void favoriteTrackOfThisUserIs(User user){
        HashMap<Track, Integer> innerHashMap = user.getUserTrackSt().get(user);
        int maxValueInMap=(Collections.max(innerHashMap.values()));
        for (Map.Entry<Track, Integer> entry : innerHashMap.entrySet()) {  // Itrate through hashmap
            if (entry.getValue()==maxValueInMap) {
                System.out.println(entry.getKey().getTrackName());
            }
        }
    }


    public  void artistTopFanIs(Artist artist) {
        int max=0;
        User topFanUser = null;
        HashMap <User,Integer> innerHashMap = new HashMap<>();
        innerHashMap = artist.getArtistUserSt().get(artist);

        for (Map.Entry<User, Integer> entry : innerHashMap.entrySet()){
            if (entry.getValue() > max) {
                max = entry.getValue();
                topFanUser = entry.getKey();
//                private static HashMap<User, HashMap<Artist, Integer>> userArtistStatistics = new HashMap<>();
            }
        }
        System.out.println("The "+ artist.getArtistName() +" top fan is: "+ topFanUser.getName());

    }

    public void howManyUserPlayedTheArtist(Artist artist){
        HashMap<User,Integer> innerHashMap = artist.getArtistUserSt().get(artist);
        int size1 = innerHashMap.keySet().size();
        System.out.println(size1 + " have listened to "+ artist.getArtistName());
    }


//    private static HashMap<User, HashMap<Artist, Integer>> userArtistStatistics;

}
