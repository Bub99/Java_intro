package songs;

import Files.FileRead;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;
import java.util.TreeSet;

public class OrderSongs {
    public static void main(String[] args) {

        try {
            BufferedReader file = new BufferedReader(new FileReader("Songs.txt"));

            String line;
            /*ArrayList <String> songs = new ArrayList<>();*/
            TreeSet<String> songs = new TreeSet<>();


            while((line = file.readLine()) != null)
            {
                songs.add(line);

            }
            System.out.println(songs.size());
            System.out.println(songs);

          Optional<Integer> o = songs.stream().filter(song -> song.charAt(0) == 'Z')
                  .map(song -> song.length())
                  .sorted()
                  .findFirst();
            System.out.println(o.get());
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


    }
}
