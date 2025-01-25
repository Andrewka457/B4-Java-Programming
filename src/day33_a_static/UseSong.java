package day33_a_static;

import java.util.ArrayList;
import java.util.Arrays;

public class UseSong {
    public static void main(String[] args) {

        Song song1 = new Song("Waka Waka");
        System.out.println(song1);

        System.out.println();

        Song song2 = new Song("Jingle Bell", 3.2);

        System.out.println(song2);

        System.out.println();

        Song song3 = new Song("Hit em up", 3.56, "2Pac", "Rap");

        System.out.println(song3);

        System.out.println("------------------------------------------------------------------------");

        String str1 = "One";
        String str2 = new String("Two");
        String [] allStr = {str1, str2};

        Song [] allSongs = {song1, song2, song3};

        System.out.println(Arrays.toString(allSongs));

        System.out.println();

        System.out.println(allSongs[1]);

        System.out.println();

        System.out.println(allSongs.length);

        System.out.println();

        for (Song each : allSongs) {

            System.out.println(each);
            System.out.println();

        }

        for (Song each : allSongs) {

            if (each.length > 3.3) {
                System.out.println(each);
            }

        }

        System.out.println("------------------------------------------------------------------------");

        ArrayList <Song> allSongsInList = new ArrayList<>();
        allSongsInList.addAll(Arrays.asList(song1, song2, song3));

        for (Song each : allSongsInList) {

            System.out.println(each);

        }

        for (Song each : allSongsInList) {

            System.out.println(each.name);

        }

    }
}
