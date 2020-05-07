package com.company;

import sun.awt.util.IdentityLinkedList;

import java.util.*;

public class Statistics {

    private static HashMap<Artist, HashMap<Track, Integer>> artistTrackStatistic= new HashMap<>();
    private static HashMap<Artist, HashMap<User, Integer>> artistUserStatistic= new HashMap<>();
    private static HashMap<User, HashMap<Track, Integer>> userTrackStatistics = new HashMap<>();
    private static HashMap<User, HashMap<Artist, Integer>> userArtistStatistics = new HashMap<>();

//    Today will be all about music. We're going to build a streaming service. The feature our users want most, is to gather listening statistics per track, per artist, per album and per user.
//
//    Our base entity is therefore the track. A track can belong to an album, but doesn't have to. It has an id, a name, an artist and it might appear on an album. An album is a list of tracks. Our streaming service should be called "redi - streaming". It has one player, that, once it is invoked with a track, will print "Now playing: <artist_name> - <track_name>".
//
//    Our users are interested in:
//
//    Who was their top artist?
//    Which was their favorite track?
//    Our artists are interested in:
//
//    Who is my top fan? (Most played tracks)
//    How many different users have streamed my music?
//How many streams have there been in total?
//            #Let's start with structures


    public static HashMap<Artist, HashMap<Track, Integer>> getArtistTrackStatistic() {
        return artistTrackStatistic;
    }

    public static HashMap<Artist, HashMap<User, Integer>> getArtistUserStatistic() {
        return artistUserStatistic;
    }

    public static HashMap<User, HashMap<Track, Integer>> getUserTrackStatistics() {
        return userTrackStatistics;
    }

    public static HashMap<User, HashMap<Artist, Integer>> getUserArtistStatistics() {
        return userArtistStatistics;
    }

    public static void setUserArtistStatistics(HashMap<User, HashMap<Artist, Integer>> userArtistStatistics) {
        Statistics.userArtistStatistics = userArtistStatistics;
    }

    public static HashMap<Artist, HashMap<Track, Integer>> getArtistStatistic() {
        return artistTrackStatistic;
    }

    public void topArtist(User user){
        HashMap<Artist, Integer> innerHashMap = new HashMap<>();
        innerHashMap = userArtistStatistics.get(user);
        int maxValueInMap=(Collections.max(innerHashMap.values()));
        for (Map.Entry<Artist, Integer> entry : innerHashMap.entrySet()) {  // Itrate through hashmap
            if (entry.getValue()==maxValueInMap) {
                System.out.println(entry.getKey().artistName);
                Artist top = entry.getKey();
            }
        }
    }
    public void favoriteTrackOfThisUserIs(User user){
        HashMap<Track, Integer> innerHashMap = userTrackStatistics.get(user);
        int maxValueInMap=(Collections.max(innerHashMap.values()));
        for (Map.Entry<Track, Integer> entry : innerHashMap.entrySet()) {  // Itrate through hashmap
            if (entry.getValue()==maxValueInMap) {
                System.out.println(entry.getKey().trackName);
//                Track topTrack = entry.getKey();
            }
        }
    }


    public  void artistTopFanIs(Artist artist) {
        int max=0;
        User topFanUser = null;
        HashMap <User,Integer> innerHashMap = new HashMap<>();
        innerHashMap = artistUserStatistic.get(artist);
        for (Map.Entry<User, Integer> entry : innerHashMap.entrySet()){
            if (entry.getValue() > max) {
                max = entry.getValue();
                topFanUser = entry.getKey();
//                private static HashMap<User, HashMap<Artist, Integer>> userArtistStatistics = new HashMap<>();
            }
        }
        System.out.println("The "+ artist.artistName +" top fan is: "+ topFanUser.name);

    }

    public void howManyUserPlayedTheArtist(Artist artist){

        System.out.println(artistUserStatistic.get(artist).values().size() + " have listened to "+ artist.artistName);
    }

    public void numberOfStreamsInTotalIs(){
        int numberOfTotalStreams = 0;

        for (Map.Entry<User, HashMap<Track, Integer>> entry : userTrackStatistics.entrySet()) {
            HashMap<Track, Integer> innerHashMap = entry.getValue();
            for(Map.Entry<Track, Integer> entry1 : innerHashMap.entrySet()){
               numberOfTotalStreams+=entry1.getValue();
            }
        }
        System.out.println("The total number of streams is: "+ numberOfTotalStreams);
    }
//    private static HashMap<User, HashMap<Artist, Integer>> userArtistStatistics;

}
