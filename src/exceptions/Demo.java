package exceptions;

public class Demo {
    public static void main(String[] args) {
        int y = 10 ;
        try {
            int a = 1 / 0;
            y = 5;
            System.out.println(a);
        } catch(Exception e){
            System.out.println("Nu se puede bro");
        }
        System.out.println(y);
    }
}
