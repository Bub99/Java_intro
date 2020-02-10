package Files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {

        try
        {
            FileWriter file = new FileWriter("castravete.txt");
            file.write("Ie cretz.");
            file.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }






    }





}
