import java.util.Scanner;

public class Bordura {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("nr de lunii: ");
        int h = reader.nextInt();

        System.out.println("nu de coloane: ");
        int w = reader.nextInt();
        for(int k = 0; k < w + 2; k++){
            System.out.print("#");//bordura sus
        }
        System.out.println("#");//bordura jos
        // linii si coloane + borduri
        for(int i = 0; i <h; i++){
            System.out.print("#");//bordura stanga
            for(int j = 0; j < w; j++){
                System.out.print("0");
            }
            System.out.println("#");//bordura dreapta

        }



    }
}
