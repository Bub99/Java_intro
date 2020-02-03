import java.util.Scanner;
public class game02 {
    public static void main(String[] args) {
        int maxTries = 3;
        int count = 0;
        int max = 100;
        int randomNumber = (int)(Math.random() * max );
        System.out.println(randomNumber);

        while(count <= 2 && maxTries != 0) {


            Scanner reader = new Scanner(System.in);
            System.out.println("Ai 3 incercari. Care este numarul?");
            int i = reader.nextInt();
            count++;
            maxTries--;

            if (i > randomNumber) {
                System.out.println("nr este mai mic, mai ai " + maxTries  +" incercari.");

            }
            if (i < randomNumber) {
                System.out.println("nr este mai mare, mai  mai ai " + maxTries  +" incercari.");
            }else if (count == 3  && maxTries == 0) {
                System.out.println("nu mai ai incercari");


            }
        }
    }
    }

