public class Switch {
    public static void main(String[] args) {
        int dayOfWeek = 4;
        switch (dayOfWeek) {
            case 1:
                System.out.println("luni");
                break;
            case 2:
                System.out.println("marti");
               // break;
            case 3:
                System.out.println("miercuri");
                break;
            case 4:
            case 5:
                System.out.println("joi/vineri");
                break;
            default:
                System.out.println("nustiu");

        }
    }
}