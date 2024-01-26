import java.util.ArrayList;

class Playlist {

    public static void main(String[] args) {
        // creating playlist
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

        // adding songs to playlist
        desertIslandPlaylist.add("hass hass");
        desertIslandPlaylist.add("Lutt Putt");
        desertIslandPlaylist.add("Lovin On me");
        desertIslandPlaylist.add("Aria");
        desertIslandPlaylist.add("Pusu");
        desertIslandPlaylist.add("Pooram");
        desertIslandPlaylist.add("Shootout");
        desertIslandPlaylist.add("Guli Mata");
        desertIslandPlaylist.add("Check it out");
        desertIslandPlaylist.add("Popular");

        // printing playlist
        // System.out.println(desertIslandPlaylist);

        // checking playlist size
        // System.out.println(desertIslandPlaylist.size());

        // removing songs
        desertIslandPlaylist.remove("Popular");
        desertIslandPlaylist.remove("Check it out");
        desertIslandPlaylist.remove("Guli Mata");
        desertIslandPlaylist.remove("Pooram");
        desertIslandPlaylist.remove("Pusu");

        // System.out.println(desertIslandPlaylist);

        // swapping songs
        int indexA = desertIslandPlaylist.indexOf("hass hass");
        int indexB = desertIslandPlaylist.indexOf("Lutt Putt");

        String tempA = "hass hass";

        desertIslandPlaylist.set(indexA, "Lutt Putt");
        // System.out.println(desertIslandPlaylist);
        desertIslandPlaylist.set(indexB, tempA);
        System.out.println(desertIslandPlaylist);

    }

}