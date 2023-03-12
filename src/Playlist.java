/**
 This program builds a new playlist. It can also remove songs from the playlist and swap songs position.
 */

import java.util.ArrayList;

class Playlist {

    public static void main(String[] args) {
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
        desertIslandPlaylist.add("Desert");
        desertIslandPlaylist.add("Sand");
        desertIslandPlaylist.add("Sun");
        desertIslandPlaylist.add("Wind");
        desertIslandPlaylist.add("Rays");
        desertIslandPlaylist.add("Burnt");

        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());

        desertIslandPlaylist.remove("Desert");
        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());

        int indexA = desertIslandPlaylist.indexOf("Rays");
        int indexB = desertIslandPlaylist.indexOf("Sun");

        String tempA = "Rays";
        String tempB = "Sun";

        desertIslandPlaylist.set(indexA,"Sun");
        desertIslandPlaylist.set(indexB,"Rays");

        System.out.println(desertIslandPlaylist);


    }

}