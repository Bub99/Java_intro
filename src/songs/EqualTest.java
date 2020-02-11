package songs;

public class EqualTest {
    public static void main(String[] args) {
        Song first = new Song("come as you are", "Nirvana");
        Song second = new Song("come as you are", "Nirvana");

        second = first;

        if(first.equals(second))
        {
            System.out.println("Sunt egale");
        }else{
            System.out.println("nu sunt egale");
        }

    }
}
