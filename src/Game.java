import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        int maxTries = 3;

        int max = 100;
        int randomNumber = (int) (Math.random() * max);
        System.out.println(randomNumber);


        System.out.println("Ai 3 incercari. Care este numarul?");
        do {
            Scanner reader = new Scanner(System.in);

            int i = reader.nextInt();

            if (i > randomNumber) {
                if (maxTries > 1) {
                    maxTries--;
                    System.out.println("nr este mai mic, mai ai " + maxTries + " incercari.");
                } else {
                    System.out.println("nu mai ai incercari");
                }
            }
            if (i < randomNumber) {
                if (maxTries > 1) {
                    maxTries--;
                    System.out.println("nr este mai mare, mai  mai ai " + maxTries + " incercari.");
                } else {
                    System.out.println("nu mai ai incercari");

                }


            }



        } while (maxTries != 0) ;
    }
}



