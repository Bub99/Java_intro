package songs;

import Files.FileRead;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class OrderSongs {
    public static void main(String[] args) {

        try {
            BufferedReader file = new BufferedReader(new FileReader("Songs.txt"));

            String line;
            ArrayList <String> songs = new ArrayList<>();

            while((line = file.readLine()) != null)
            {
                songs.add(line);

            }
            System.out.println(songs.size());
            System.out.println(songs);

            Collections.sort(songs);
            System.out.println(songs);

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
