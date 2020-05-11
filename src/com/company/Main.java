package com.company;

public class Main {

    public static void main(String[] args) {
        Player Player = new Player();
        User user1 = new User("Massoud");
        User user2 = new User("Shadan");
        User user3 = new User("Nazanin");
        Album album1 = new Album("album1");
        Album album2 = new Album("album2");
        Album album3 = new Album("album3");
        Artist artist1 = new Artist("artist1");
        Artist artist2 = new Artist("artist2");
        Artist artist3 = new Artist("artist3");
        Track track1 = new Track("01", "tr1", artist1, album1);
        Track track2 = new Track("02", "tr2", artist2, album2);
        Track track3 = new Track("03", "tr3", artist1, album1);
        Track track4 = new Track("04", "tr4", artist3, album3);
        Track track5 = new Track("05", "tr5", artist1, album1);
        Track track6 = new Track("06", "tr6", artist2, album2);
        Player p = new Player();
        p.play(user1, track1);
        p.play(user2, track2);
        p.play(user1, track3);
        p.play(user2, track1);
        p.play(user2, track1);
        p.play(user2, track1);
        p.play(user2, track1);
        p.play(user2, track1);
        p.play(user1, track1);
        p.play(user1, track3);
        p.play(user1, track4);
        p.play(user1, track5);
        p.play(user1, track6);
        p.play(user3, track5);
        p.play(user3, track6);
        Statistics st=new Statistics();
        st.howManyUserPlayedTheArtist(artist1);
        st.artistTopFanIs(artist3);
        st.favoriteTrackOfThisUserIs(user1);
        p.numberOfStreamsInTotalIs();
        st.topArtist(user1);



    }
}
