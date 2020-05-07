package com.company;

import java.util.HashMap;
import java.util.Map;

public class player {
//    private static HashMap<Track, Integer> artistTrackStatistics = new HashMap<>();
//    private static HashMap<Artist, HashMap<Track, Integer>> artistTrackStatistic= new HashMap<>();
//    private static HashMap<Artist, HashMap<User, Integer>> artistUserStatistic= new HashMap<>();
//    private static HashMap<Artist, Integer> countOfTracksFromArtistWasPlayed= new HashMap<>();
//    private static HashMap<User, HashMap<Track, Integer>> userTrackStatistics = new HashMap<>();
//    private static HashMap<User, HashMap<Artist, Integer>> userArtistStatistics = new HashMap<>();
//    private static HashMap<Artist, Integer> valueOfUserArtistStatistics = new HashMap<>() ;
//    private static HashMap<Track, Integer> valueOfUserTrackStatistics = new HashMap<>();
//    private static HashMap<Track, Integer> fanStatistic = new HashMap<>();
//    private static HashMap<Artist, Integer> howManyDifferentUserStreamedEachArtist = new HashMap<>();

     void play(User user, Track track){
        System.out.println("Now playing: " +track.artist.artistName + " - " + track.trackName);

        if(!Statistics.getArtistTrackStatistic().containsKey(track.artist) || !Statistics.getArtistTrackStatistic().values().contains(track)){
            HashMap<Track, Integer> innerHashMap = new HashMap<>();
            innerHashMap.put(track,1);
            Statistics.getArtistTrackStatistic().put(track.artist, innerHashMap);

        }else {
            HashMap<Track, Integer> innerHashMap = new HashMap<>();
            innerHashMap.put(track, Statistics.getArtistTrackStatistic().get(track.artist).get(track)+1);
            Statistics.getArtistTrackStatistic().put(track.artist, innerHashMap);
        }

        if(!Statistics.getArtistUserStatistic().containsKey(track.artist) || !Statistics.getArtistUserStatistic().values().contains(user)){
            HashMap<User, Integer> innerHashMap = new HashMap<>();
            innerHashMap.put(user,1);
            Statistics.getArtistUserStatistic().put(track.artist, innerHashMap);

        }else {
            HashMap<User, Integer> innerHashMap = new HashMap<>();
            innerHashMap.put(user, Statistics.getArtistUserStatistic().get(track.artist).get(user)+1);
            Statistics.getArtistUserStatistic().put(track.artist, innerHashMap);
        }

         if(!Statistics.getUserTrackStatistics().containsKey(user) || !Statistics.getUserTrackStatistics().values().contains(track)){
             HashMap<Track, Integer> innerHashMap = new HashMap<>();
             innerHashMap.put(track,1);
             Statistics.getUserTrackStatistics().put(user, innerHashMap);

         }else {
             HashMap<Track, Integer> innerHashMap = new HashMap<>();
             innerHashMap.put(track, Statistics.getUserTrackStatistics().get(user).get(track)+1);
             Statistics.getUserTrackStatistics().put(user, innerHashMap);
         }

         if(!Statistics.getUserArtistStatistics().containsKey(user) || !Statistics.getUserArtistStatistics().values().contains(track)){
             HashMap<Artist, Integer> innerHashMap = new HashMap<>();
             innerHashMap.put(track.artist,1);
             Statistics.getUserArtistStatistics().put(user, innerHashMap);

         }else {
             HashMap<Artist, Integer> innerHashMap = new HashMap<>();
             innerHashMap.put(track.artist, Statistics.getUserArtistStatistics().get(user).get(track.artist)+1);
             Statistics.getUserArtistStatistics().put(user, innerHashMap);
         }




//        if(Statistics.getArtistTrackStatistics().containsKey(track)){
//            Statistics.getArtistTrackStatistics().put(track , Statistics.getArtistTrackStatistics().get(track)+1);
//
//        }else{
//            Statistics.getArtistTrackStatistics().put(track,1);
//        }
//
//        Statistics.getArtistStatistic().put(track.artist, Statistics.getArtistTrackStatistics());
//        Integer value = 0;
//        for (Map.Entry<Track, Integer> entry: Statistics.getArtistTrackStatistics().entrySet()) {
//            value+=entry.getValue();
//        }
//        Statistics.getCountOfTracksFromArtistWasPlayed().put(track.artist, value );
//        HashMap<Artist, Integer> valueOfUserArtistStatistics = new HashMap<>();
//        valueOfUserArtistStatistics.put(track.artist, 1);
//        if(!Statistics.getUserArtistStatistics().containsKey(user) || !Statistics.getUserArtistStatistics().values().contains(track.artist)){
//            Statistics.getUserArtistStatistics().put(user, valueOfUserArtistStatistics);
//        }else{
//            HashMap<Artist, Integer> innerHashMap = new HashMap<>();
//            innerHashMap=Statistics.getUserArtistStatistics().get(user);
//            innerHashMap.put(track.artist, innerHashMap.get(track.artist)+1);
//            Statistics.getUserArtistStatistics().put(user, innerHashMap);
//        }
////            Statistics.getValueOfUserArtistStatistics().put(track.artist, 1);
////            Statistics.getUserArtistStatistics().put(user, Statistics.getValueOfUserArtistStatistics());
//////            private static HashMap<User, HashMap<Artist, Integer>> userArtistStatistics = new HashMap<>();
////
////        }else {
////            Statistics.getValueOfUserArtistStatistics().put(track.artist, Statistics.getValueOfUserArtistStatistics().get(track.artist)+1);
////        }
//
//        if(Statistics.getUserTrackStatistics().isEmpty() || !Statistics.getValueOfUserTrackStatistics().containsKey(track)){
//            Statistics.getValueOfUserTrackStatistics().put(track, 1);
//            Statistics.getUserTrackStatistics().put(user, Statistics.getValueOfUserTrackStatistics());
//        }else {
//            Statistics.getValueOfUserTrackStatistics().put(track, Statistics.getValueOfUserTrackStatistics().get(track)+1);
//        }
//
//
    }

}
